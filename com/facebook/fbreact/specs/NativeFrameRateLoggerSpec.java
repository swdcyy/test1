package com.facebook.fbreact.specs.NativeFrameRateLoggerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ae
{

    public void NativeFrameRateLoggerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void beginScroll();
    public abstract void endScroll();
    public abstract void setContext(String p0);
    public abstract void setGlobalOptions(ReadableMap p0);
}
