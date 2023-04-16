package com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;

public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010af
{

    public void NativeHeadlessJsTaskSupportSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void notifyTaskFinished(double p0);
    public abstract void notifyTaskRetry(double p0,Promise p1);
}
