package com.facebook.fbreact.specs.NativeKeyboardObserverSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;

public abstract class NativeKeyboardObserverSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ba
{

    public void NativeKeyboardObserverSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public abstract void removeListeners(double p0);
}
