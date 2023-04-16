package com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010d2
{

    public void NativeVibrationSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void cancel();
    public abstract void vibrate(double p0);
    public abstract void vibrateByPattern(ReadableArray p0,double p1);
}
