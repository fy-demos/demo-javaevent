package com.example.blogdemo.javeevent;

import java.util.EventObject;

/**
 * Created on Oct 12, 2021.
 *
 * @author hatakawas
 */
public class SocialEvent extends EventObject {
    private static final long serialVersionUID = -5473622737706032666L;

    public static final int WECHAT_BIND = 1;
    public static final int WECHAT_UNBIND = 2;
    public static final int WEIBO_BIND = 3;
    public static final int WEIBO_UNBIND = 4;

    private int socialType;

    public SocialEvent(Object source, int socialType) {
        super(source);
        this.socialType = socialType;
    }

    public int getSocialType() {
        return socialType;
    }

    public void setSocialType(int socialType) {
        this.socialType = socialType;
    }
}
