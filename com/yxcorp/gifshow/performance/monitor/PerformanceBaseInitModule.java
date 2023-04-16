package com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.kwai.framework.init.a;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import b76.a;

public abstract class PerformanceBaseInitModule extends a	// class@00127f
{

    public void PerformanceBaseInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void l0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PerformanceBaseInitModule.class, "1")) {
          return;
       }
       a.p(p0, "application");
       return;
    }
    public void n(){
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PerformanceBaseInitModule.class, "2")) {
          return;
       }
       a.p(p0, "event");
       return;
    }
}
