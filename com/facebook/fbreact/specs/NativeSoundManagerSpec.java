package com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeSoundManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c8
{

    public void NativeSoundManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void playTouchSound();
}
