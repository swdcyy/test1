package com.kwai.sdk.eve.internal.statistics.CoverageStats;
import vn7.d;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$b;
import nsd.u;
import com.kwai.sdk.eve.internal.common.EvePreference;
import java.util.concurrent.ExecutorService;
import sm7.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$statsCache$1;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$e;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$d;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$c;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$f;
import com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.InitConfig$CoverageStatsConfig;

public final class CoverageStats implements d	// class@0015b1
{
    public final LinkedHashMap a;
    public final EvePackageManager$b b;
    public final b c;
    public final CoverageStats$c d;
    public final CoverageStats$f e;
    public final EvePreference f;
    public final ExecutorService g;
    public final o h;
    public static final CoverageStats$b i;

    static {
       CoverageStats.i = new CoverageStats$b(null);
    }
    public void CoverageStats(EvePreference p0,ExecutorService p1,o p2){
       a.p(p0, "pref");
       a.p(p1, "scheduler");
       a.p(p2, "config");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.a = new CoverageStats$statsCache$1(100);
       p1.submit(new CoverageStats$a(this));
       this.b = new CoverageStats$e(this);
       this.c = new CoverageStats$d(this);
       this.d = new CoverageStats$c();
       this.e = new CoverageStats$f(this);
    }
    public void a(String p0,String p1,DownloadState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats.class, "2")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       this.c().a(p0, p1, p2);
       return;
    }
    public void b(String p0,String p1,ExecuteState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats.class, "3")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       this.c().b(p0, p1, p2);
       return;
    }
    public final d c(){
       CoverageStats obj = PatchProxy.apply(null, this, CoverageStats.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.h.getValue().getEnabled())? this.e: this.d;
       return obj;
    }
}
