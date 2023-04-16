package com.kwai.sdk.eve.internal.statistics.CoverageStats$e;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$b;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Integer;

public final class CoverageStats$e implements EvePackageManager$b	// class@0015ac
{
    public final CoverageStats a;

    public void CoverageStats$e(CoverageStats p0){
       this.a = p0;
       super();
    }
    public void a(String p0,boolean p1,String p2,String p3,long p4){
       if (PatchProxy.isSupport(CoverageStats$e.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CoverageStats$e.class, "1")) {
             return;
          }
       }
       a.p(p0, "taskId");
       a.p(p2, "version");
       a.p(p3, "md5");
       this.a.a(p0, p2, DownloadState.STARTED);
       return;
    }
    public void b(String p0,boolean p1,String p2,String p3,long p4,long p5,int p6,String p7){
       if (PatchProxy.isSupport(CoverageStats$e.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,Long.valueOf(p4),Long.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, CoverageStats$e.class, "4")) {
             return;
          }
       }
       a.p(p0, "taskId");
       a.p(p2, "version");
       a.p(p3, "md5");
       a.p(p7, "errorMsg");
       this.a.a(p0, p2, DownloadState.FAILED);
       return;
    }
    public void c(String p0,boolean p1,String p2,String p3,long p4,long p5){
       if (PatchProxy.isSupport(CoverageStats$e.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,Long.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, CoverageStats$e.class, "2")) {
             return;
          }
       }
       a.p(p0, "taskId");
       a.p(p2, "version");
       a.p(p3, "md5");
       this.a.a(p0, p2, DownloadState.SUCCEED);
       return;
    }
    public void d(String p0,boolean p1,String p2,String p3,long p4,long p5,int p6,String p7){
       if (PatchProxy.isSupport(CoverageStats$e.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,Long.valueOf(p4),Long.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, CoverageStats$e.class, "3")) {
             return;
          }
       }
       a.p(p0, "taskId");
       a.p(p2, "version");
       a.p(p3, "md5");
       a.p(p7, "errorMsg");
       this.a.a(p0, p2, DownloadState.FAILED);
       return;
    }
}
