package com.facebook.react.modules.core.JSTimers;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import java.lang.String;

public interface abstract JSTimers implements JavaScriptModule	// class@00128f
{

    void callIdleCallbacks(double p0);
    void callTimers(WritableArray p0);
    void emitTimeDriftWarning(String p0);
}
