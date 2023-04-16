package m69.g$d;
import com.yxcorp.gifshow.music.utils.a$a;
import i69.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import java.util.Objects;
import java.lang.StringBuilder;
import i69.a;
import com.yxcorp.utility.Log;
import brd.g;
import kqb.b;
import java.lang.Long;

public final class g$d implements a$a	// class@002e1a
{
    public final i a;

    public void g$d(i p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, "2")) {
          return;
       }
       a.p(p0, "e");
       this.a.a(p0);
       return;
    }
    public void b(File p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, g$d.class, str)) {
          return;
       }
       g$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, i.class, str) && ta.c != null) {
          Log.g(ta.a, "onCompleted\(\) file = ["+p0+"] music="+ta.b.a());
          ta.b.e(p0);
          ta.b.d(100);
          i c = ta.c;
          if (c != null) {
             c.onNext(ta.b);
          }
          c = ta.c;
          if (c != null) {
             c.onComplete();
          }
       }
    label_005e :
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       g$d uod = g$d.class;
       String str = "3";
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, str)) {
          return;
       }
       uod = this.a;
       Objects.requireNonNull(uod);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), uod, oi, str) && uod.c != null)) {
          uod.b.d((int)(((long)100 * p0) / p1));
          i c = uod.c;
          if (c != null) {
             c.onNext(uod.b);
          }
          Log.l(uod.a, "onProgress: available="+p0+' '+"music="+uod.b.a());
       }
       return;
    }
}
