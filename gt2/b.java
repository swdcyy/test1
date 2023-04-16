package gt2.b;
import yx2.i;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.b;
import yt2.b;
import msd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gt2.b$b;
import gt2.b$a;
import hp2.s;
import co2.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import java.lang.Long;
import java.lang.Integer;

public final class b extends i	// class@002ba8
{
    public int d;
    public long e;
    public int f;
    public int g;
    public final b$b h;
    public final b$a i;
    public final a j;
    public final b k;
    public final b l;
    public final u m;

    public void b(a p0,b p1,b p2,u p3){
       a.p(p0, "manager");
       a.p(p1, "mic");
       a.p(p2, "muteDurationCalculator");
       a.p(p3, "reporter");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       b$b uob = new b$b(this);
       this.h = uob;
       b$a uoa = new b$a(this);
       this.i = uoa;
       p0.a(uob);
       p1.a(uoa);
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.j.l(this.h);
       this.k.a(this.i);
       return;
    }
    public final boolean P(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.e - null && (System.currentTimeMillis() - this.e) - 50 > 0)? true: false;
       return b;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       if (this.e - null) {
          if (this.P()) {
             this.m.invoke(Long.valueOf(this.e), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.l.a()), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.d), Integer.valueOf(11));
          }
          this.e = System.currentTimeMillis();
          this.l.b();
       }
       return;
    }
}
