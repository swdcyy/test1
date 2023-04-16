package com.facebook.react.fabric.Binding;
import be.b;
import java.lang.Object;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.fabric.ComponentFactoryDelegate;
import java.lang.String;
import com.facebook.react.bridge.NativeMap;

public class Binding	// class@001260
{
    public final HybridData mHybridData;

    static {
       b.a();
    }
    public void Binding(){
       super();
       this.mHybridData = Binding.initHybrid();
    }
    public static native HybridData initHybrid();
    public native final void installFabricUIManager(long p0,Object p1,EventBeatManager p2,MessageQueueThread p3,ComponentFactoryDelegate p4,Object p5);
    public native void renderTemplateToSurface(int p0,String p1);
    public native void setConstraints(int p0,float p1,float p2,float p3,float p4);
    public native void setPixelDensity(float p0);
    public native void startSurface(int p0,String p1,NativeMap p2);
    public native void startSurfaceWithConstraints(int p0,String p1,NativeMap p2,float p3,float p4,float p5,float p6);
    public native void stopSurface(int p0);
    public native final void uninstallFabricUIManager();
}
