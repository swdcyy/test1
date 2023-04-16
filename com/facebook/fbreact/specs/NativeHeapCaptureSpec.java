package com.facebook.fbreact.specs.NativeHeapCaptureSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;

public abstract class NativeHeapCaptureSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b0
{

    public void NativeHeapCaptureSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void captureComplete(String p0,String p1);
    public abstract void captureHeap(String p0);
}
