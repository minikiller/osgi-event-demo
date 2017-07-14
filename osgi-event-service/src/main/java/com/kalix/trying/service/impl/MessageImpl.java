package com.kalix.trying.service.impl;

import com.kalix.trying.service.IMessage;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Administrator on 2017-07-14.
 */
public class MessageImpl implements IMessage {
    private EventAdmin eventAdmin;

    public void setEventAdmin(EventAdmin eventAdmin) {
        this.eventAdmin = eventAdmin;
    }

    @Override
    public void startMsg(String str) {
        Dictionary properties = new Hashtable();
        properties.put("msg", str);
        Event event = new Event("com/kalix/trying/service/msg/start", properties);
        eventAdmin.postEvent(event);
    }

    @Override
    public void stopMsg(String str) {
        Dictionary properties = new Hashtable();
        properties.put("msg", str);
        Event event = new Event("com/kalix/trying/service/msg/stop", properties);
        eventAdmin.postEvent(event);
    }
}
