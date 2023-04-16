package com.facebook.react.fabric.events.EventEmitterWrapper;
import be.b;
import java.lang.Object;
import com.facebook.jni.HybridData;
import java.lang.String;
import com.facebook.react.bridge.NativeMap;

public class EventEmitterWrapper	// class@001265
{
    public final HybridData mHybridData;

    static {
       b.a();
    }
    public void EventEmitterWrapper(){
       super();
       this.mHybridData = EventEmitterWrapper.initHybrid();
    }
    public static native HybridData initHybrid();
    public native final void invokeEvent(String p0,NativeMap p1);
}
