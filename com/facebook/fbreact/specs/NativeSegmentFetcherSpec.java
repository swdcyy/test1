package com.facebook.fbreact.specs.NativeSegmentFetcherSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeSegmentFetcherSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c5
{

    public void NativeSegmentFetcherSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void fetchSegment(double p0,ReadableMap p1,Callback p2);
    public void getSegment(double p0,ReadableMap p1,Callback p2){
    }
}
