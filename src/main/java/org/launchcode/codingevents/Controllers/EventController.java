package org.launchcode.codingevents.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayEvents (Model model) {
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create") //lives at /events/create
    public String renderCreateEventForm () {
        return "events/create";
    }

    @PostMapping("create") //lives at /events/create
    public String createEvent(@RequestParam String eventName, @RequestParam String eventTag) {
        events.put("Baba booey", "booey Baba");
        events.put("Yaya yooey", "yooey Yaya");
        events.put("Dada dooey", "dooey Dada");
        events.put(eventName, eventTag);
        return "redirect:/events";
    }
}
