package com.facebook.react.a$f;
import java.lang.Runnable;
import com.facebook.react.a;
import com.facebook.react.a$j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.facebook.base.tracing.TracingManager;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import java.lang.Boolean;
import android.os.Process;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a$f$a;
import java.lang.Enum;
import com.facebook.react.a$f$b;
import com.facebook.react.a$f$c;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Throwable;

public class a$f implements Runnable	// class@001178
{
    public final a$j b;
    public final a c;

    public void a$f(a p0,a$j p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$f.class, "1")) {
          return;
       }
       TracingManager.g("CreateReactContext:"+Thread.currentThread().getId());
       ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
       a t = this.c.t;
       _monitor_enter(t);
       while (this.c.t.booleanValue()) {
          try{
             this.c.t.wait();
          }catch(java.lang.InterruptedException e0){
          }
       }
       _monitor_exit(t);
       this.c.s = true;
       Process.setThreadPriority(-4);
       ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
       ReactApplicationContext reactApplica = this.c.h(this.b.a.create(), this.b.b);
       if (this.c.R(reactApplica)) {
          reactApplica.runOnNativeModulesQueueThread(new a$f$a(this, reactApplica));
       }
       this.c.d = objArray;
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START.name(), "", this.c.B);
       reactApplica.runOnNativeModulesQueueThread(new a$f$c(this, reactApplica));
       UiThreadUtil.runOnUiThread(new a$f$b(this));
       return;
    }
}
