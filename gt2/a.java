package gt2.a;
import yx2.i;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.b;
import yt2.b;
import msd.s;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gt2.a$a;
import gt2.a$b;
import hp2.s;
import co2.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends i	// class@002ba5
{
    public boolean d;
    public final a$a e;
    public final a$b f;
    public final a g;
    public final b h;
    public final b i;

    public void a(a p0,b p1,b p2,s p3){
       a.p(p0, "manager");
       a.p(p1, "mic");
       a.p(p2, "muteDurationCalculator");
       a.p(p3, "reporter");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       a$a uoa = new a$a(this, p3);
       this.e = uoa;
       a$b uob = new a$b(this);
       this.f = uob;
       p0.a(uob);
       p1.a(uoa);
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.g.l(this.f);
       this.h.b(this.e);
       return;
    }
}
