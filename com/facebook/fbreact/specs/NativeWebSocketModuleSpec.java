package com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010d3
{

    public void NativeWebSocketModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public abstract void close(double p0,String p1,double p2);
    public abstract void connect(String p0,ReadableArray p1,ReadableMap p2,double p3);
    public abstract void ping(double p0);
    public abstract void removeListeners(double p0);
    public abstract void send(String p0,double p1);
    public abstract void sendBinary(String p0,double p1);
}
