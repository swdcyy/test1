package com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;

public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109f
{

    public void NativeAppearanceSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public abstract String getColorScheme();
    public abstract void removeListeners(double p0);
}
