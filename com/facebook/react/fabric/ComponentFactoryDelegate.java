package com.facebook.react.fabric.ComponentFactoryDelegate;
import be.b;
import java.lang.Object;
import com.facebook.jni.HybridData;

public class ComponentFactoryDelegate	// class@001261
{
    public final HybridData mHybridData;

    static {
       b.a();
    }
    public void ComponentFactoryDelegate(){
       super();
       this.mHybridData = ComponentFactoryDelegate.initHybrid();
    }
    public static native HybridData initHybrid();
}
