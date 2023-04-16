package com.facebook.react.bridge.CatalystInstanceImpl$JSProfilerTraceListener;
import com.facebook.systrace.TraceListener;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.Systrace;
import com.facebook.react.bridge.JavaScriptModule;

public class CatalystInstanceImpl$JSProfilerTraceListener implements TraceListener	// class@0011b0
{
    public final WeakReference mOuter;

    public void CatalystInstanceImpl$JSProfilerTraceListener(CatalystInstanceImpl p0){
       super();
       this.mOuter = new WeakReference(p0);
    }
    public void onTraceStarted(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$JSProfilerTraceListener.class, "1")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       if (uCatalystIns != null) {
          uCatalystIns.getJSModule(Systrace.class).setEnabled(true);
       }
       return;
    }
    public void onTraceStopped(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$JSProfilerTraceListener.class, "2")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       if (uCatalystIns != null) {
          uCatalystIns.getJSModule(Systrace.class).setEnabled(false);
       }
       return;
    }
}
