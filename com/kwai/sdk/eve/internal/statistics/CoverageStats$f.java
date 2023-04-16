package com.kwai.sdk.eve.internal.statistics.CoverageStats$f;
import vn7.d;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import java.lang.Object;
import java.lang.String;
import com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$f$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$f$b;

public final class CoverageStats$f implements d	// class@0015af
{
    public final CoverageStats a;

    public void CoverageStats$f(CoverageStats p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,DownloadState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats$f.class, "1")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       this.a.g.submit(new CoverageStats$f$a(this, p1, p0, p2));
       return;
    }
    public void b(String p0,String p1,ExecuteState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats$f.class, "2")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       this.a.g.submit(new CoverageStats$f$b(this, p1, p0, p2));
       return;
    }
}
