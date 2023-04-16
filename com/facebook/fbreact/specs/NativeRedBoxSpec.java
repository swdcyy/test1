package com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;

public abstract class NativeRedBoxSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c4
{

    public void NativeRedBoxSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void dismiss();
    public abstract void setExtraData(ReadableMap p0,String p1);
}
