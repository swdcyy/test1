package com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import fg6.a;
import mwb.b;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class FPSMonitorInitModule$execute$fpsMonitorConfig$3 extends Lambda implements a	// class@000e70
{
    public final FPSMonitorInitModule this$0;

    public void FPSMonitorInitModule$execute$fpsMonitorConfig$3(FPSMonitorInitModule p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, FPSMonitorInitModule$execute$fpsMonitorConfig$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Object obj1 = a.a.i(b.c(), this.this$0.q);
       a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­eneConfigType\n          \)");
       return obj1;
    }
}
