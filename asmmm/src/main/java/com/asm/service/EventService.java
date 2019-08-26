package com.asm.service;

import com.asm.model.Event;
import com.asm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventService implements EventDAO {

    private static Logger LOGGER = Logger.getLogger(EventService.class.getSimpleName());
    Transaction transaction = null;

    public void save(Event event) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(event);
            transaction.commit();
            LOGGER.log(Level.INFO, String.format("Save event success with time day %s", event.getTimeDay()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Save event error, stack trace"), e);
        }
    }

    public List<Event> findAll() {
        List<Event> students = new ArrayList<>();
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            students = session.createQuery("from Event").list();
            transaction.commit();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, String.format("Error when load events "), ex);
        }
        return students;
    }

    public Event getEventById(String id){
        Event event = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.load(Event.class, id);;
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null){
                transaction.rollback();
            }
        }
        return event;
    }

    public void delete(String id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Event event = session.get(Event.class, id);
            if (event != null) {
                session.delete(event);
                LOGGER.log(Level.INFO, String.format("Delete event success...", id));
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Can not delete event...", id), e);
        }
    }
}
