package com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a6
{

    public void NativeDevLoadingViewSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void hide();
    public abstract void showMessage(String p0,ReadableMap p1,ReadableMap p2);
}
