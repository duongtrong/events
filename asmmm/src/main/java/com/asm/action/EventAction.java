package com.asm.action;

import com.asm.model.Event;
import com.asm.service.EventDAO;
import com.asm.service.EventService;
import com.opensymphony.xwork2.ActionSupport;
import com.asm.model.*;

import java.util.List;

public class EventAction extends ActionSupport {

    private EventModel eventModel = new EventModel();
    private Event event;
    private EventDAO eventService = new EventService();
    private List<Event> listEvent;
    private String id;

    public String register(){
        this.event = new Event();
        return INPUT;
    }

    public String store(){
        eventService.save(event);
        return SUCCESS;
    }

    public String deleteEvent() {
        eventService.delete(getId());
        return SUCCESS;
    }

    public String list() {
        this.listEvent = eventModel.findAll();
        return SUCCESS;
    }

    public List<Event> getList(){
        return listEvent;
    }

    public void setList(List<Event> listEvent) {
        this.listEvent = listEvent;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
