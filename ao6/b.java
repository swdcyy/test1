package ao6.b;
import com.yxcorp.download.k;
import bo6.a;
import java.lang.String;
import java.io.File;
import ao6.a$a;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fo6.a;
import com.kwai.performance.overhead.battery.jni.CpuOptimize;
import java.lang.Throwable;
import java.lang.Long;

public final class b extends k	// class@000310
{
    public final a c;
    public final String d;
    public final File e;
    public final File f;
    public final a$a g;

    public void b(a p0,String p1,File p2,File p3,a$a p4){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       a.E("download completed ");
       b tc = this.c;
       tc.b = this.d;
       tc.c = this.e.getPath();
       tc.a = CpuOptimize.a(this.e);
       this.g.c(this.c);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, b.class, "3")) {
          return;
       }
       a.C("down task error:", p1);
       this.g.a(9);
       this.e.delete();
       PatchProxy.onMethodExit(b.class, "3");
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport2(b.class, "2") && PatchProxy.applyVoidThreeRefsWithListener(p0, Long.valueOf(p1), Long.valueOf(p2), this, b.class, "2")) {
          return;
       }
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
}
