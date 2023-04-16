package com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeAnimationsDebugModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109d
{

    public void NativeAnimationsDebugModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void startRecordingFps();
    public abstract void stopRecordingFps(double p0);
}
