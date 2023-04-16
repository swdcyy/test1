package com.facebook.fbreact.specs.NativeAlertManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeAlertManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109b
{

    public void NativeAlertManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void alertWithArgs(ReadableMap p0,Callback p1);
}
