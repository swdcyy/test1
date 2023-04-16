package com.facebook.fbreact.specs.NativeImageStoreSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;

public abstract class NativeImageStoreSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b7
{

    public void NativeImageStoreSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addImageFromBase64(String p0,Callback p1,Callback p2);
    public abstract void getBase64ForTag(String p0,Callback p1,Callback p2);
    public abstract void hasImageForTag(String p0,Callback p1);
    public abstract void removeImageForTag(String p0);
}
