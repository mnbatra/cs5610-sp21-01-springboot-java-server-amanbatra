package com.example.wbdvsp2101amanbatraserverjava.services;
import com.example.wbdvsp2101amanbatraserverjava.models.Widget;
import com.example.wbdvsp2101amanbatraserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.ArrayList;
import java.util.List;

@Service
public class WidgetService {

    @Autowired
    WidgetRepository repository;

    public Widget createWidgetForTopic(String tid, Widget widget){
        widget.setImgSrc("http://image_URL_missing");
        widget.setTopicId(tid);
        return repository.save(widget);
    }

    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
        //return widgets;
    }

    public Widget findWidgetById(Long id) {
        return repository.findWidgetById(id);
    }

    public List<Widget> findWidgetsForTopic(String topicId) {
        return repository.findWidgetsForTopic(topicId);
    }

    public int updateWidget(Long id, Widget newWidget) {
        Widget originalWidget = repository.findWidgetById(id);
        originalWidget.setText(newWidget.getText());
        originalWidget.setType(newWidget.getType());
        originalWidget.setSize(newWidget.getSize());
        originalWidget.setWidth(newWidget.getWidth());
        originalWidget.setHeight(newWidget.getHeight());
        originalWidget.setWidgetOrder(newWidget.getWidgetOrder());
        originalWidget.setValue(newWidget.getValue());
        if(newWidget.getImgSrc() != null) {
            originalWidget.setImgSrc(newWidget.getImgSrc());
        } else {
            return 0;
        }
        repository.save(originalWidget);

//        if (newWidget.getText() != null) {
//            originalWidget.setText(newWidget.getText());
//        }
//        if(newWidget.getHeight() != null) {
//            originalWidget.setHeight(newWidget.getHeight());
//        }
//        if(newWidget.getSize() != null){
//        originalWidget.setSize(newWidget.getSize());
//        }
//        if(newWidget.getValue() != null) {
//            originalWidget.setValue(newWidget.getValue());
//        }
//        if(newWidget.getOrdered() != null) {
//            originalWidget.setOrdered(newWidget.getOrdered());
//        }
//        if(newWidget.getImgSrc() != null) {
//            originalWidget.setImgSrc(newWidget.getImgSrc());
//        }
//        if(newWidget.getWidth() != null) {
//            originalWidget.setWidth(newWidget.getWidth());
//        }
//        if(newWidget.getWidgetOrder() != null) {
//            originalWidget.setWidgetOrder(newWidget.getWidgetOrder());
//        }

        repository.save(originalWidget);
        return 1;

    }

    public Integer deleteWidget(Long id) {
        repository.deleteById(id);
        return 1;

}


}
// import java.util.Date;
// import java.util.stream.Collectors;


//        widget.setTopicId(tid);
//        widget.setId((new Date()).getTime());
//        widgets.add(widget);
//        return widget;


//        Widget w1 = new Widget(123l, "ABC123", "HEADING", 1, "Welcome to Widgets");
//        Widget w2 = new Widget(234l, "ABC234", "PARAGRAPH", 1, "This is a paragraph");
//        Widget w3 = new Widget(345l, "ABC234", "HEADING", 2, "Welcome to WebDev");
//        Widget w4 = new Widget(456l, "ABC234", "PARAGRAPH", 1, "Lorem ipsum");
//        widgets.add(w1);
//        widgets.add(w2);
//        widgets.add(w3);
//        widgets.add(w4);


//        return repository.findById(id).get();
//        for(Widget w: widgets) {
//            if(w.getId().equals(id)) {
//                return w;
//            }
//        }
//        return null;



//        return widgets.stream().filter(widget -> widget.getTopicId().equals(tid))
//                .collect(Collectors.toList());



//        for (int i = 0; i < this.widgets.size(); i++) {
//            Widget widget = widgets.get(i);
//            if (widget.getId().equals(wid)) {
//                this.widgets.set(i, updatedWidget);
//                return 1;
//            }
//        }
//        return -1;


//        int index = -1;
//        for(int i=0; i<widgets.size(); i++) {
//            Widget w = widgets.get(i);
//            if(w.getId().equals(id)) {
//                index = i;
//            }
//        }
//        if(index >= 0) {
//            widgets.remove(index);
//            return 1;
//        }
//        return -1;
//