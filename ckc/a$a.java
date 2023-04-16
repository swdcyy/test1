package ckc.a$a;
import tx4.o;
import ckc.a;
import to7.b;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Long;
import lnc.i3;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Integer;
import java.lang.Number;
import tkd.b;
import tkd.d;
import rx4.i;
import k2b.u1;
import ckc.a$c;
import so7.d;
import java.lang.Throwable;

public class a$a implements o	// class@0005bf
{
    public final long a;
    public final b b;
    public final a c;

    public void a$a(a p0,long p1,b p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(e p0,w p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, str)) {
          return;
       }
       long l = SystemClock.uptimeMillis() - this.a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(l), p1, null, uoa, str) && p1 != null)) {
          i3 oi3 = i3.f();
          oi3.c("phoneCommonLevel", Integer.valueOf(b.a(-404437045).c()));
          oi3.c("phoneRenderLevel", Integer.valueOf(b.a(-404437045).d()));
          oi3.c("TK_createViewTime", Long.valueOf(l));
          oi3.d("engineVersion", d.a(0x256720e1).nr());
          oi3.c("bundleVersionCode", Integer.valueOf(p1.d));
          oi3.d("bundleId", p1.b);
          oi3.d("bundleVersion", p1.c);
          u1.Q("KwaiShareTkRenderTime", oi3.e());
       }
       a$a tb = this.b;
       if (tb != null) {
          tb.b(new a$c(p0, p1));
       }
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
}
