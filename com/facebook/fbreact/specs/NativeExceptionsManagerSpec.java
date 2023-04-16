package com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ac
{

    public void NativeExceptionsManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public void dismissRedbox(){
    }
    public void reportException(ReadableMap p0){
    }
    public abstract void reportFatalException(String p0,ReadableArray p1,double p2);
    public abstract void reportSoftException(String p0,ReadableArray p1,double p2);
    public abstract void updateExceptionMessage(String p0,ReadableArray p1,double p2);
}
