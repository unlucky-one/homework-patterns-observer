package com.raiden.homework.pattern;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/18
 */
@Data
public class Ask {
    String name;
    String content;
    EventBus eventBus = new EventBus();

    @Subscribe
    public void sendQuestion(String content) {
        this.content = content;
        eventBus.post(content);
    }

    public void register(Object obj) {
        eventBus.register(obj);
    }

    public void unregister(Object obj) {
        eventBus.unregister(obj);
    }

}
