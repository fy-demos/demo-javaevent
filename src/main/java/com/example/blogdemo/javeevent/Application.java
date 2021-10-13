package com.example.blogdemo.javeevent;

/**
 * Created on Oct 09, 2021.
 *
 * @author hatakawas
 */
public class Application {
    public static void main(String[] args) {
        // 事件源绑定监听器
        Social social = new Social();
        social.addListener(new SocialEventListener());
        // 触发事件
        social.emitEvent(new SocialEvent(social, SocialEvent.WECHAT_UNBIND));
    }
}
