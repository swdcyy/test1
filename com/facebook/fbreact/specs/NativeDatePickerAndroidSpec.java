package com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;

public abstract class NativeDatePickerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a5
{

    public void NativeDatePickerAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void open(ReadableMap p0,Promise p1);
}
