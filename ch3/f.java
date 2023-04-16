package ch3.f;
import erd.g;
import ch3.t;
import java.lang.String;
import java.lang.Object;
import ch3.x;
import oh3.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import dh3.b;
import dh3.f;
import java.util.Objects;
import java.lang.Long;
import zg3.c;
import zg3.c$b;
import ch3.k;
import z1.a;
import oh3.a;
import java.lang.Throwable;
import jh3.a;

public final class f implements g	// class@00054f
{
    public final t b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;

    public void f(t p0,int p1,String p2,String p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       f uof = this;
       f b = uof.b;
       f c = uof.c;
       f d = uof.d;
       f e = uof.e;
       f f = uof.f;
       x ox = p0;
       b.d.c("startMatch", "result", "success");
       x mMatchId = ox.mMatchId;
       b.l = mMatchId;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(t.class)) {
          Object[] objArray = new Object[i3];
          objArray[0] = Integer.valueOf(c);
          objArray[1] = d;
          objArray[i2] = e;
          objArray[i1] = mMatchId;
          objArray[i] = Integer.valueOf(f);
          if (!PatchProxy.applyVoid(objArray, b, t.class, "10")) {
          label_004a :
             b.f.a(b.q);
             t f1 = b.f;
             Objects.requireNonNull(f1);
             f uof1 = f.class;
             if (PatchProxy.isSupport(uof1)) {
                Object[] objArray1 = new Object[i3];
                objArray1[0] = Integer.valueOf(c);
                objArray1[1] = d;
                objArray1[i2] = e;
                objArray1[i1] = mMatchId;
                objArray1[4] = Integer.valueOf(f);
                if (!PatchProxy.applyVoid(objArray1, f1, uof1, "1")) {
                }
             }else if(f1.e != null){
                f1.a.a("startPollingStatus not polling");
             }else {
                f1.c();
                f1.e = true;
                f1.a.a("startPollingStatus");
                f1.b(c, d, e, mMatchId, f, 5000);
             }
          }
       }else {
          goto label_004a ;
       }
       x mTimeoutMs = ox.mTimeoutMs;
       if (!PatchProxy.isSupport(t.class) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(mTimeoutMs), b, t.class, "8") && mTimeoutMs - null > 0)) {
          c uoc = new c((int)mTimeoutMs);
          b.h = uoc;
          uoc.a(b.p);
          b.h.c();
       }
       b.Q(new k(b, c, ox));
       b.g.j(c, 1, null);
       return;
    }
}
