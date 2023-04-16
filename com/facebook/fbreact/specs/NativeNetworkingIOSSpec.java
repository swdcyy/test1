package com.facebook.fbreact.specs.NativeNetworkingIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeNetworkingIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010bf
{

    public void NativeNetworkingIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void abortRequest(double p0);
    public abstract void addListener(String p0);
    public abstract void clearCookies(Callback p0);
    public abstract void removeListeners(double p0);
    public abstract void sendRequest(ReadableMap p0,Callback p1);
}
