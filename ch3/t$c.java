package ch3.t$c;
import dh3.b;
import ch3.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh3.f;
import ch3.w;
import z1.a;
import oh3.a;
import jh3.a;

public class t$c implements b	// class@00055f
{
    public final t a;

    public void t$c(t p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, t$c.class, "1")) {
          return;
       }
       this.a.d.a("onPollStatusError");
       this.a.V(false);
       this.a.Q(new w(this));
       t$c ta = this.a;
       ta.g.i(ta.i, 2);
       this.a.S();
       return;
    }
}
