package b79.a;
import c79.e;
import b79.c;
import com.yxcorp.gifshow.models.QMedia;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import k79.j;
import b79.a$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import o79.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class a extends e	// class@00037c
{
    public final c c;
    public final boolean d;
    public final QMedia e;

    public void a(c p0,boolean p1,QMedia p2,long p3,long p4){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super(p3, p4);
    }
    public boolean a(){
       return this.d;
    }
    public void b(Bitmap p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 != null) {
          a$a uoa1 = new a$a(j.d(p0.getWidth(), p0.getHeight(), 0), this, p0, p1);
          k1.o(uoa);
          c l = this.c.l;
          Objects.requireNonNull(l);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p1), l, uof, "1")) {
             l.a.incrementAndGet();
             l.b.addAndGet(p1);
          }
       }
       return;
    }
}
