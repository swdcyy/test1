package com.yxcorp.gifshow.detail.plc.helper.ad.a$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import f4a.b0;
import f4a.l;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import java.lang.Long;

public class a$a extends k	// class@001671
{
    public final b0 c;
    public final a d;

    public void a$a(a p0,b0 p1){
       this.d = p0;
       super();
       this.c = p1;
       p1.h(false);
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "6")) {
          return;
       }
       p0.f = null;
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "5")) {
          return;
       }
       this.c.A(p0.getSoFarBytes(), p0.getTotalBytes());
       this.d.c.b();
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       this.c.s((long)(int)p1, (long)(int)p2);
       this.d.c.e(p1, p2, 0);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, a$a.class, "4")) {
          return;
       }
       this.d.c.c(p1, p2, 0);
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, a$a.class, "3")) {
          return;
       }
       this.c.C((long)(int)p1, (long)(int)p2);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (!p0.getSoFarBytes()) {
          this.c.f();
       }
       return;
    }
}
