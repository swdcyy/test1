package com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.lang.String;
import java.util.Map;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a1
{

    public void NativeBlobModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addNetworkingHandler();
    public abstract void addWebSocketHandler(double p0);
    public abstract void createFromParts(ReadableArray p0,String p1);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void release(String p0);
    public abstract void removeWebSocketHandler(double p0);
    public abstract void sendOverSocket(ReadableMap p0,double p1);
}
