package l69.u$a;
import com.yxcorp.gifshow.util.resource.n$c;
import brd.g;
import i69.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import boc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Float;
import java.lang.Throwable;
import boc.e;
import com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class u$a implements n$c	// class@002cac
{
    public final g a;
    public final a b;

    public void u$a(g p0,a p1){
       a.p(p0, "mEmitter");
       a.p(p1, "fileTask");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "4")) {
          return;
       }
       a.p(p0, "category");
       Object[] objArray = new Object[0];
       g.D().s("AICutRxModeDownloader", "onReceive: SUCCESS "+p0, objArray);
       this.b.d(100);
       this.b.e(p.d(p0, p0.getResourceName()));
       this.a.onNext(this.b);
       this.a.onComplete();
       return;
    }
    public void b(b p0,float p1){
       Object[] objArray;
       u$a uoa = u$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "category");
       int i = 0;
       if (p1 - (float)i < 0) {
          objArray = new Object[i];
          g.D().A("AICutRxModeDownloader", "onReceive: get a wrong progress="+p1, objArray);
          return;
       }else {
          this.b.d((int)((float)100 * p1));
          this.a.onNext(this.b);
          objArray = new Object[i];
          g.D().y("AICutRxModeDownloader", "ycnn download progress="+p1, objArray);
          return;
       }
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "3")) {
          return;
       }
       a.p(p0, "category");
       Object[] objArray = new Object[0];
       g.D().w("AICutRxModeDownloader", "DownLoadReceiver: Status.CANCELED", objArray);
       return;
    }
    public void d(b p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u$a.class, "2")) {
          return;
       }
       a.p(p0, "category");
       Object[] objArray = new Object[0];
       g.D().A("AICutRxModeDownloader", "DownLoadReceiver: Status.FAILED", objArray);
       if (a.g(p0, e.A)) {
          this.a.onError(new AICutGeneratorException(AICutErrorCode.DOWNLOAD_YCNN_FAILED));
       }else {
          this.b.d(100);
          this.b.e(null);
          this.a.onNext(this.b);
          this.a.onComplete();
       }
       return;
    }
}
