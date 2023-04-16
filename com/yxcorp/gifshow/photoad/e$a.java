package com.yxcorp.gifshow.photoad.e$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;

public class e$a extends k	// class@000f8a
{
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
    }
    public void a(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "4")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.a();
       return;
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "10")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.b();
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "5")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.c();
       return;
    }
    public void d(DownloadTask p0,String p1,boolean p2,long p3,long p4){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.d(p1, p2, p3, p4);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "8")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.e(p1);
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e$a.class, "7")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.g(p1, p2);
       return;
    }
    public void j(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e$a.class, "1")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.h(p1, p2);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e$a.class, "2")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.i(p1, p2);
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e$a.class, "11")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.k(p1, p2);
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "6")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.l();
       return;
    }
    public void p(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "9")) {
          return;
       }
       e$a tc = this.c;
       tc.d = p0;
       tc.n();
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "12")) {
          return;
       }
       DownloadManager.n().B(this.a, this);
       return;
    }
}
