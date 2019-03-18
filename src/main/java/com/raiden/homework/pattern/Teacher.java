package com.raiden.homework.pattern;

import com.google.common.eventbus.Subscribe;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/18
 */
@Data
public class Teacher {
    String name;

    @Subscribe
    void answer(String content) {
        System.out.println(content);
        System.out.println(name + ":自己想去。");
    }
}
