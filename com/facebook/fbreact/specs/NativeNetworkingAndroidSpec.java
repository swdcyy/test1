package com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010be
{

    public void NativeNetworkingAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void abortRequest(double p0);
    public abstract void addListener(String p0);
    public abstract void clearCookies(Callback p0);
    public abstract void removeListeners(double p0);
    public abstract void sendRequest(String p0,String p1,double p2,ReadableArray p3,ReadableMap p4,String p5,boolean p6,double p7,boolean p8);
}
