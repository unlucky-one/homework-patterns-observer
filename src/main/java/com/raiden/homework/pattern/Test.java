package com.raiden.homework.pattern;

import com.google.common.eventbus.EventBus;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/18
 */
public class Test {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        Ask ask = new Ask();
        ask.register(teacher);
        ask.sendQuestion("装饰者模式和适配器模式有什么区别？");

    }
}
