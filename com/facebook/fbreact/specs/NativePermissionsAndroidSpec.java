package com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c0
{

    public void NativePermissionsAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void checkPermission(String p0,Promise p1);
    public abstract void requestMultiplePermissions(ReadableArray p0,Promise p1);
    public abstract void requestPermission(String p0,Promise p1);
    public abstract void shouldShowRequestPermissionRationale(String p0,Promise p1);
}
