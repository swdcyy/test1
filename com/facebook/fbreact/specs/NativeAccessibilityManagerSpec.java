package com.facebook.fbreact.specs.NativeAccessibilityManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@001099
{

    public void NativeAccessibilityManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void announceForAccessibility(String p0);
    public abstract void getCurrentBoldTextState(Callback p0,Callback p1);
    public abstract void getCurrentGrayscaleState(Callback p0,Callback p1);
    public abstract void getCurrentInvertColorsState(Callback p0,Callback p1);
    public abstract void getCurrentReduceMotionState(Callback p0,Callback p1);
    public abstract void getCurrentReduceTransparencyState(Callback p0,Callback p1);
    public abstract void getCurrentVoiceOverState(Callback p0,Callback p1);
    public abstract void setAccessibilityContentSizeMultipliers(ReadableMap p0);
    public abstract void setAccessibilityFocus(double p0);
}
