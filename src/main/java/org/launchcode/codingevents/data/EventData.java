package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EventData {
    private static HashMap<Integer, Event> data = new HashMap<>();

    public static void add(Event event) {
        data.put(event.getId(), event);
    }

    public static void remove(int id) {
        data.remove(id);
    }

    public static Collection<Event> getAll() {
        return data.values();
    }

    public static Event getById(int id) {
        return data.get(id);
    }
}
