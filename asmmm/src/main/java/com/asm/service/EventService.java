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

    public void save(Event event) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(event);
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
            students = session.createQuery("from Event").list();
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, String.format("Error when load events "), ex);
        }
        return students;
    }

    public Event getEventById(String id){
        Event event = null;
        Transaction transaction = null;
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



}
