package com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$mPerformanceInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaCodPluginReporter$mPerformanceInfo$2 extends Lambda implements a	// class@00110b
{
    public static final TunaCodPluginReporter$mPerformanceInfo$2 INSTANCE;

    static {
       TunaCodPluginReporter$mPerformanceInfo$2.INSTANCE = new TunaCodPluginReporter$mPerformanceInfo$2();
    }
    public void TunaCodPluginReporter$mPerformanceInfo$2(){
       super(0);
    }
    public final TunaCodPluginReporter$a invoke(){
       Object obj = PatchProxy.apply(null, this, TunaCodPluginReporter$mPerformanceInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TunaCodPluginReporter$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
