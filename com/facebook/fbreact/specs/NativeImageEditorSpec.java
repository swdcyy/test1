package com.facebook.fbreact.specs.NativeImageEditorSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeImageEditorSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b2
{

    public void NativeImageEditorSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void cropImage(String p0,ReadableMap p1,Callback p2,Callback p3);
}
