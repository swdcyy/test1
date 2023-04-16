package nxb.i0;
import com.yxcorp.download.k;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photoad.download.h;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Throwable;
import java.lang.Long;

public class i0 extends k	// class@0037cb
{

    public void i0(){
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "3")) {
          return;
       }
       h.n().b(p0.getId()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       h.n().e(p0.getId()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0.class, "7")) {
          return;
       }
       h.n().d(p0.getId(), p0.getTotalBytes(), p1).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i0.class, "4")) {
          return;
       }
       h.n().r(p0.getId(), p0.getSoFarBytes(), p0.getTotalBytes()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i0.class, "6")) {
          return;
       }
       h.n().A(p0.getId(), p1, p2).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, i0.class, "5")) {
          return;
       }
       h.n().t(p0.getId(), p0.getSoFarBytes(), p0.getTotalBytes()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void o(DownloadTask p0){
       PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1");
    }
}
