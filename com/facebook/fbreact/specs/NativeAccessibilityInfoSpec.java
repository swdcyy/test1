package com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@001098
{

    public void NativeAccessibilityInfoSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void announceForAccessibility(String p0);
    public abstract void isReduceMotionEnabled(Callback p0);
    public abstract void isTouchExplorationEnabled(Callback p0);
    public abstract void setAccessibilityFocus(double p0);
}
