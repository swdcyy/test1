package com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeDeviceEventManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a9
{

    public void NativeDeviceEventManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void invokeDefaultBackPressHandler();
}
