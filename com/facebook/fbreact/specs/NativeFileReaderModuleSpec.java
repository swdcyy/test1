package com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.String;

public abstract class NativeFileReaderModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ad
{

    public void NativeFileReaderModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void readAsDataURL(ReadableMap p0,Promise p1);
    public abstract void readAsText(ReadableMap p0,String p1,Promise p2);
}
