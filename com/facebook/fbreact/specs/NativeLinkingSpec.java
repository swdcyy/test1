package com.facebook.fbreact.specs.NativeLinkingSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeLinkingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010bb
{

    public void NativeLinkingSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public abstract void canOpenURL(String p0,Promise p1);
    public abstract void getInitialURL(Promise p0);
    public abstract void openSettings(Promise p0);
    public abstract void openURL(String p0,Promise p1);
    public abstract void removeListeners(double p0);
    public abstract void sendIntent(String p0,ReadableArray p1,Promise p2);
}
