package l69.w$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import i69.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l69.w;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import o69.m1;
import l69.w$a$a;
import java.lang.Runnable;
import t45.c;
import java.lang.Throwable;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import java.util.HashMap;
import java.lang.Integer;
import java.util.List;
import java.lang.Long;
import l69.w$a$b;
import ekd.k1;

public final class w$a extends k	// class@002cb3
{
    public final long c;
    public final AICutStyle d;
    public final j e;

    public void w$a(AICutStyle p0,j p1){
       a.p(p0, "mInfo");
       a.p(p1, "styleDownloadCallback");
       super();
       this.d = p0;
       this.e = p1;
       this.c = System.currentTimeMillis();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "2")) {
          return;
       }
       a.p(p0, "task");
       return;
    }
    public void c(DownloadTask p0){
       m1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "4")) {
          return;
       }
       a.p(p0, "task");
       w e = w.e;
       e.e(this.d);
       Object[] objArray = new Object[0];
       g.D().w(w.d(e), "completed\(\) called with: task = ["+p0+']', objArray);
       a = m1.a;
       File uFile = new File(a.a()+a.c(this.d));
       String str = a.d(this.d);
       Object[] objArray1 = new Object[0];
       g.D().w(w.d(e), "completed: zipFile="+uFile+" unzipFolder"+str, objArray1);
       c.a(new w$a$a(this, uFile, str));
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       w e;
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w$a.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "e");
       int i = 0;
       if (!p0.C(a1.c())) {
          this.e.b(this.d, p1);
          e = w.e;
          objArray = new Object[i];
          g.D().A(w.d(e), "onFailed: network is not connected", objArray);
          e.e(this.d);
          return;
       }else {
          w e1 = w.e;
          if (w.c(e1).get(this.d.getId()) == null) {
             objArray = new Object[i];
             g.D().A(w.d(e1), "onFailed: resource index not found", objArray);
             e1.e(this.d);
             return;
          }else {
             Integer integer = w.c(e1).get(this.d.getId());
             if (integer != null) {
                i = integer.intValue() + 1;
             }
             if (i >= this.d.mResourceUrls.size()) {
                this.e.b(this.d, p1);
                e1.e(this.d);
             }else {
                w.c(e1).remove(this.d.getId());
                w.a(e1).remove(this.d.getId());
                e1.f(i, this.d, this.e);
             }
             return;
          }
       }
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(w$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, w$a.class, "1")) {
          return;
       }
       if (!p2 - -1) {
          return;
       }
       w$a$b uoa$b = new w$a$b(this, p1, p2);
       k1.o(p2 - -1);
       return;
    }
}
