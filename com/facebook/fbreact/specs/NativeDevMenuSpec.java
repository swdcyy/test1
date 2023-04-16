package com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a7
{

    public void NativeDevMenuSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void debugRemotely(boolean p0);
    public abstract void reload();
    public abstract void setHotLoadingEnabled(boolean p0);
    public abstract void setProfilingEnabled(boolean p0);
    public abstract void show();
}
