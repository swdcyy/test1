package com.facebook.fbreact.specs.NativeJSCSamplingProfilerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;

public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b8
{

    public void NativeJSCSamplingProfilerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void operationComplete(double p0,String p1,String p2);
}
