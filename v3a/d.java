package v3a.d;
import com.yxcorp.download.k;
import f4a.b0;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f4a.l;
import java.lang.Long;

public class d extends k	// class@003fbf
{
    public b0 c;

    public void d(b0 p0){
       super();
       this.c = p0;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.c.A(p0.getSoFarBytes(), p0.getTotalBytes());
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d.class, "3")) {
          return;
       }
       this.c.s((long)(int)p1, (long)(int)p2);
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d.class, "4")) {
          return;
       }
       this.c.C((long)(int)p1, (long)(int)p2);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (!p0.getSoFarBytes()) {
          this.c.f();
       }
       return;
    }
}
