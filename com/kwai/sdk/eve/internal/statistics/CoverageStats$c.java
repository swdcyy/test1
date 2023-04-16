package com.kwai.sdk.eve.internal.statistics.CoverageStats$c;
import vn7.d;
import java.lang.Object;
import java.lang.String;
import com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;

public final class CoverageStats$c implements d	// class@0015aa
{

    public void CoverageStats$c(){
       super();
    }
    public void a(String p0,String p1,DownloadState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats$c.class, "2")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       return;
    }
    public void b(String p0,String p1,ExecuteState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoverageStats$c.class, "1")) {
          return;
       }
       a.p(p0, "taskId");
       a.p(p1, "version");
       a.p(p2, "target");
       return;
    }
}
