package com.kuaishou.tuna_core.plugin.TunaCodPluginReporter;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion;
import nsd.u;
import java.lang.Object;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$mPerformanceInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class TunaCodPluginReporter	// class@00110e
{
    public long a;
    public final p b;
    public static long c;
    public static boolean d;
    public static final TunaCodPluginReporter$Companion e;

    static {
       TunaCodPluginReporter.e = new TunaCodPluginReporter$Companion(null);
       TunaCodPluginReporter.d = true;
    }
    public void TunaCodPluginReporter(){
       super();
       this.b = s.c(TunaCodPluginReporter$mPerformanceInfo$2.INSTANCE);
    }
    public final TunaCodPluginReporter$a a(){
       Object obj = PatchProxy.apply(null, this, TunaCodPluginReporter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void b(int p0){
       TunaCodPluginReporter tunaCodPlugi = TunaCodPluginReporter.class;
       if (PatchProxy.isSupport(tunaCodPlugi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tunaCodPlugi, "7")) {
          return;
       }
       this.a().d = p0;
       return;
    }
}
