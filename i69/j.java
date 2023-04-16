package i69.j;
import i69.a;
import brd.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.io.File;
import java.lang.Throwable;
import java.lang.RuntimeException;

public final class j	// class@002643
{
    public final String a;
    public final a b;
    public g c;

    public void j(a p0,g p1){
       a.p(p0, "mFileTask");
       super();
       this.b = p0;
       this.c = p1;
       this.a = "StyleDownloadCallback";
    }
    public final void a(AICutStyle p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "3")) {
          return;
       }
       a.p(p0, "info");
       if (this.c == null) {
          return;
       }
       Log.g(this.a, "onCompleted: path="+p1+" style="+this.b.a());
       this.b.e(new File(p1));
       this.b.d(100);
       j tc = this.c;
       if (tc != null) {
          tc.onNext(this.b);
       }
       tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       return;
    }
    public final void b(AICutStyle p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "2")) {
          return;
       }
       a.p(p0, "info");
       if (this.c == null) {
          return;
       }
       Log.o(this.a, "onFailed: style="+this.b.a(), p1);
       j tc = this.c;
       if (tc != null) {
          if (p1 == null) {
             RuntimeException runtimeExcep = new RuntimeException("down load Filed");
          }
          tc.onError(p1);
       }
       return;
    }
}
