package com.facebook.fbreact.specs.NativeAsyncStorageSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeAsyncStorageSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a0
{

    public void NativeAsyncStorageSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void clear(Callback p0);
    public abstract void getAllKeys(Callback p0);
    public abstract void multiGet(ReadableArray p0,Callback p1);
    public abstract void multiMerge(ReadableArray p0,Callback p1);
    public abstract void multiRemove(ReadableArray p0,Callback p1);
    public abstract void multiSet(ReadableArray p0,Callback p1);
}
