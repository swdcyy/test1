package com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;

public abstract class NativeCameraRollManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a3
{

    public void NativeCameraRollManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void deletePhotos(ReadableArray p0,Promise p1);
    public abstract void getPhotos(ReadableMap p0,Promise p1);
    public abstract void saveToCameraRoll(String p0,String p1,Promise p2);
}
