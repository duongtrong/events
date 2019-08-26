package com.asm.action;

import com.asm.model.Event;
import com.asm.service.EventDAO;
import com.asm.service.EventService;
import com.opensymphony.xwork2.ActionSupport;

public class EventAction extends ActionSupport {

    private Event event;
    private EventDAO userService = new EventService();

    public String register(){
        this.event = new Event();
        return INPUT;
    }

    public String store(){
        userService.save(event);
        return SUCCESS;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
