package com.asm.service;

import com.asm.model.Event;

import java.util.List;

public interface EventDAO {

    void save(Event event);
    List<Event> findAll();
    Event getEventById(String id);
}
