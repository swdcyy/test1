package gaa.b;
import com.yxcorp.gifshow.music.utils.a$a;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import java.io.File;
import android.util.Pair;
import java.lang.Integer;
import kqb.b;
import java.lang.Long;

public class b implements a$a	// class@002427
{
    public final v a;

    public void b(v p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a.onError(p0);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.onNext(new Pair(p0, Integer.valueOf(100)));
       this.a.onComplete();
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uob, "3")) {
          return;
       }
       int i = (int)((((double)p0 * 0x3ff0000000000000) / (double)p1) * 100.00f);
       if (i >= 100) {
          i = 99;
       }
       this.a.onNext(new Pair(null, Integer.valueOf(i)));
       return;
    }
}
