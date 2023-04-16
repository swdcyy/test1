package com.facebook.fbreact.specs.NativeTimePickerAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;

public abstract class NativeTimePickerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ce
{

    public void NativeTimePickerAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void open(ReadableMap p0,Promise p1);
}
