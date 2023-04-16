package com.facebook.fbreact.specs.NativeActionSheetManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeActionSheetManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109a
{

    public void NativeActionSheetManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void showActionSheetWithOptions(ReadableMap p0,Callback p1);
    public abstract void showShareActionSheetWithOptions(ReadableMap p0,Callback p1,Callback p2);
}
