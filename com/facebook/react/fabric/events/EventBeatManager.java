package com.facebook.react.fabric.events.EventBeatManager;
import df.a;
import be.b;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.facebook.jni.HybridData;

public class EventBeatManager implements a	// class@001264
{
    public final ReactApplicationContext a;
    public final HybridData mHybridData;

    static {
       b.a();
    }
    public void EventBeatManager(ReactApplicationContext p0){
       super();
       this.mHybridData = EventBeatManager.initHybrid();
       this.a = p0;
    }
    public static native HybridData initHybrid();
    public void a(){
       this.tick();
    }
    public native final void tick();
}
