package gaa.i0;
import com.yxcorp.gifshow.music.utils.a$a;
import gaa.h0;
import java.lang.String;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.g;
import java.io.File;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Type;
import android.util.Pair;
import java.lang.Integer;
import kqb.b;
import java.lang.Long;

public class i0 implements a$a	// class@002436
{
    public final String a;
    public final v b;
    public final h0 c;

    public void i0(h0 p0,String p1,v p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.b.onError(p0);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
          return;
       }
       b.a(0x5f2ddeb4).c(this.a, this.c.p, String.class, (a1.k() + TimeUnit.DAYS.toMillis(1)));
       this.b.onNext(new Pair(p0, Integer.valueOf(100)));
       this.b.onComplete();
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oi0, "3")) {
          return;
       }
       int i = (int)((((double)p0 * 0x3ff0000000000000) / (double)p1) * 100.00f);
       if (i >= 100) {
          i = 99;
       }
       this.b.onNext(new Pair(null, Integer.valueOf(i)));
       return;
    }
}
