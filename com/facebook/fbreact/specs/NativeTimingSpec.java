package com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010cf
{

    public void NativeTimingSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void createTimer(double p0,double p1,double p2,boolean p3);
    public abstract void deleteTimer(double p0);
    public abstract void setSendIdleEvents(boolean p0);
}
