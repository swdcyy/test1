package com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;

public interface abstract RCTEventEmitter implements JavaScriptModule	// class@001341
{

    void receiveEvent(int p0,String p1,WritableMap p2);
    void receiveTouches(String p0,WritableArray p1,WritableArray p2);
}
