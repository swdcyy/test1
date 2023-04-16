package com.facebook.react.modules.core.TimingModule$a;
import je.b;
import com.facebook.react.modules.core.TimingModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.core.JSTimers;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;

public class TimingModule$a implements b	// class@001296
{
    public final TimingModule a;

    public void TimingModule$a(TimingModule p0){
       this.a = p0;
       super();
    }
    public void callIdleCallbacks(double p0){
       TimingModule$a uoa = TimingModule$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoa, "2")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(JSTimers.class).callIdleCallbacks(p0);
       }
       return;
    }
    public void callTimers(WritableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimingModule$a.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(JSTimers.class).callTimers(p0);
       }
       return;
    }
    public void emitTimeDriftWarning(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimingModule$a.class, "3")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(JSTimers.class).emitTimeDriftWarning(p0);
       }
       return;
    }
}
