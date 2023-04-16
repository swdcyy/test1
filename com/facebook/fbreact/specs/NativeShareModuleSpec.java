package com.facebook.fbreact.specs.NativeShareModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.Promise;

public abstract class NativeShareModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c7
{

    public void NativeShareModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void share(ReadableMap p0,String p1,Promise p2);
}
