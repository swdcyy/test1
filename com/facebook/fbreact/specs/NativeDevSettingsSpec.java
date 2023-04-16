package com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a8
{

    public void NativeDevSettingsSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addMenuItem(String p0);
    public void onFastRefresh(){
    }
    public abstract void reload();
    public void reloadWithReason(String p0){
    }
    public abstract void setHotLoadingEnabled(boolean p0);
    public abstract void setIsDebuggingRemotely(boolean p0);
    public abstract void setIsShakeToShowDevMenuEnabled(boolean p0);
    public abstract void setProfilingEnabled(boolean p0);
    public abstract void toggleElementInspector();
}
