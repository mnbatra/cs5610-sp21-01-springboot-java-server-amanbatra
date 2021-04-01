package com.example.wbdvsp2101amanbatraserverjava.controllers;
import java.util.List;
import com.example.wbdvsp2101amanbatraserverjava.models.Widget;
import com.example.wbdvsp2101amanbatraserverjava.services.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {
    @Autowired
    WidgetService service;// = new WidgetService();

    @PostMapping("/api/topics/{tid}/widgets")
    public Widget createWidgetForTopic(
            @PathVariable("tid") String topicId,
            @RequestBody Widget widget
    ) {
        return service.createWidgetForTopic(topicId, widget);
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(
            @PathVariable("tid") String topicId
    ) {
        return service.findWidgetsForTopic(topicId);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return service.findAllWidgets();
    }

    @GetMapping("/api/widgets/{wid}")
    public Widget findWidgetById(
            @PathVariable("wid") Long id) {
        return service.findWidgetById(id);
    }

    @DeleteMapping("/api/widgets/{wid}")
    public Integer deleteWidget(@PathVariable("wid") Long id) {
        return service.deleteWidget(id);
    }

    @PutMapping("/api/widgets/{wid}")
    public int updateWidget(
            @PathVariable("wid") Long id,
            @RequestBody Widget widget) {
        return service.updateWidget(id, widget);
    }
}