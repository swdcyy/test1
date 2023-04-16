package com.yxcorp.gifshow.performance.monitor.heaptrimmer.DalvikHeapTrimmerInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.performance.monitor.heaptrimmer.b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class DalvikHeapTrimmerInitModule extends PerformanceBaseInitModule	// class@000e7f
{
    public static final int q;

    public void DalvikHeapTrimmerInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void n(){
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DalvikHeapTrimmerInitModule.class, "1")) {
          return;
       }
       e.g(b.b, "heap-trimmer");
       return;
    }
}
