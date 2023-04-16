package i69.i;
import i69.e;
import i69.a;
import brd.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.io.File;
import java.lang.Long;

public final class i implements e	// class@002642
{
    public final String a;
    public final a b;
    public g c;

    public void i(a p0,g p1){
       a.p(p0, "mFileTask");
       super();
       this.b = p0;
       this.c = p1;
       this.a = "MusicDownloadCallback";
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "e");
       if (this.c == null) {
          return;
       }
       Log.o(this.a, "onFailed\(\) music="+this.b.a(), p0);
       i tc = this.c;
       if (tc != null) {
          tc.onError(p0);
       }
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       Log.g(this.a, "onCompleted\(\) file = ["+p0+"] music="+this.b.a());
       this.b.e(p0);
       this.b.d(100);
       i tc = this.c;
       if (tc != null) {
          tc.onNext(this.b);
       }
       tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       return;
    }
    public void onProgress(long p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oi, "3")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.b.d((int)(((long)100 * p0) / p1));
       i tc = this.c;
       if (tc != null) {
          tc.onNext(this.b);
       }
       Log.l(this.a, "onProgress: available="+p0+' '+"music="+this.b.a());
       return;
    }
}
