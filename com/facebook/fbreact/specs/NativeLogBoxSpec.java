package com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeLogBoxSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010bc
{

    public void NativeLogBoxSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void hide();
    public abstract void show();
}
