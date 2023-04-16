package me9.h$a;
import com.yxcorp.download.k;
import me9.h;
import brd.v;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import android.util.Pair;
import java.lang.Integer;
import java.io.File;
import brd.g;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import w46.b;
import java.lang.Long;
import qsd.d;

public final class h$a extends k	// class@002fef
{
    public final h c;
    public final v d;

    public void h$a(h p0,v p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicRequestDownloadHandler", "download complete", objArray);
       this.d.onNext(new Pair(Integer.valueOf(100), this.c.c.getAbsolutePath()));
       this.d.onComplete();
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "2")) {
          return;
       }
       a.p(p1, "e");
       a.D().e("MagicRequestDownloadHandler", "download error", p1);
       this.d.onError(p1);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, h$a.class, "3")) {
          return;
       }
       this.d.onNext(new Pair(Integer.valueOf(d.H0((((float)p1 * 100.00f) / (float)p2))), null));
       return;
    }
}
