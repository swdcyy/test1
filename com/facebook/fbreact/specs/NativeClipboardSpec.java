package com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import java.lang.String;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a4
{

    public void NativeClipboardSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void getString(Promise p0);
    public abstract void setString(String p0);
}
