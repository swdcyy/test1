package bh3.s$b;
import zg3.c$b;
import bh3.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh3.f;
import bh3.s$d;
import bh3.s$c;
import jh3.a;
import zg3.d;

public class s$b implements c$b	// class@0003cc
{
    public final s a;

    public void s$b(s p0){
       this.a = p0;
       super();
    }
    public void a(){
       s d;
       if (PatchProxy.applyVoid(null, this, s$b.class, "1")) {
          return;
       }
       this.a.e.a("onCountDownFinished");
       s$b ta = this.a;
       s f = ta.f;
       if (f != null) {
          d = ta.d;
          f.d(d.a, d.c, ta.i, 3);
       }
       ta = this.a;
       d = ta.d;
       ta.h.g(d.a, d.c, 3, ta.a());
       return;
    }
    public void b(int p0,int p1){
       d.b(this, p0, p1);
    }
}
