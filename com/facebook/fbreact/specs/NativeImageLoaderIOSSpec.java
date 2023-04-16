package com.facebook.fbreact.specs.NativeImageLoaderIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeImageLoaderIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b4
{

    public void NativeImageLoaderIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void getSize(String p0,Promise p1);
    public abstract void getSizeWithHeaders(String p0,ReadableMap p1,Promise p2);
    public abstract void prefetchImage(String p0,Promise p1);
    public abstract void queryCache(ReadableArray p0,Promise p1);
}
