package gaa.r;
import com.yxcorp.download.k;
import gaa.s;
import voc.i;
import java.lang.String;
import java.io.File;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import qkd.b;
import java.lang.Long;

public class r extends k	// class@002449
{
    public final i c;
    public final String d;
    public final File e;
    public final s f;

    public void r(s p0,i p1,String p2,File p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       p0.l = this.d;
       this.c.g("DOWNLOAD_SOUND_WAVE_TASK", 100, 1);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "3")) {
          return;
       }
       b.q(this.e);
       this.c.g("DOWNLOAD_SOUND_WAVE_TASK", 100, 1);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, r.class, "1")) {
          return;
       }
       int i = (int)((((double)p1 * 0x3ff0000000000000) / (double)p2) * 100.00f);
       if (i >= 100) {
          i = 99;
       }
       this.c.g("DOWNLOAD_SOUND_WAVE_TASK", i, 1);
       return;
    }
}
