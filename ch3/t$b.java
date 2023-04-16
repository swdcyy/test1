package ch3.t$b;
import zg3.c$b;
import ch3.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh3.f;
import ch3.u;
import z1.a;
import oh3.a;
import java.lang.Integer;
import ch3.v;

public class t$b implements c$b	// class@00055e
{
    public final t a;

    public void t$b(t p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, t$b.class, "2")) {
          return;
       }
       this.a.d.a("onCountDownFinished");
       this.a.U();
       this.a.Q(new u(this));
       return;
    }
    public void b(int p0,int p1){
       t$b uob = t$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.Q(new v(this, p0, p1));
       return;
    }
}
