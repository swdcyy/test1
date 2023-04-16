package dkd.c$a;
import com.yxcorp.download.b;
import dkd.c;
import ckd.e;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Long;

public class c$a extends b	// class@000cd3
{
    public final e c;
    public final c d;

    public void c$a(c p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(DownloadTask p0){
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "5")) {
          return;
       }
       c$a tc = this.c;
       if (tc != null) {
          tc.onCanceled();
       }
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       c$a tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       return;
    }
    public void d(DownloadTask p0,String p1,boolean p2,long p3,long p4){
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "4")) {
          return;
       }
       c$a tc = this.c;
       if (tc != null) {
          tc.onError(p1);
       }
       return;
    }
    public void g(DownloadTask p0){
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, c$a.class, "3")) {
          return;
       }
       c$a tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return;
    }
    public void j(DownloadTask p0,long p1,long p2){
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, c$a.class, "1")) {
          return;
       }
       c$a tc = this.c;
       if (tc != null) {
          tc.onProgress((int)(((double)p1 / (double)p2) * 100.00f));
       }
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
    }
    public void o(DownloadTask p0){
    }
    public void p(DownloadTask p0){
    }
}
