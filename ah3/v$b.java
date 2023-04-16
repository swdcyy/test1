package ah3.v$b;
import zg3.c$b;
import ah3.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh3.f;
import ah3.w;
import z1.a;
import oh3.a;
import jh3.a;
import zg3.d;

public class v$b implements c$b	// class@0000dc
{
    public final v a;

    public void v$b(v p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "1")) {
          return;
       }
       this.a.d.a("onCountDownFinished");
       this.a.T(false);
       this.a.Q(new w(this));
       v$b ta = this.a;
       ta.g.a(ta.h, 3, ta.i);
       this.a.S();
       return;
    }
    public void b(int p0,int p1){
       d.b(this, p0, p1);
    }
}
