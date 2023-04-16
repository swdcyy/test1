package androidx.transition.b$c;
import androidx.transition.d;
import androidx.transition.b;
import java.lang.Object;
import java.util.ArrayList;
import androidx.transition.Transition;
import androidx.transition.Transition$f;

public class b$c extends d	// class@0009e4
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final b g;

    public void b$c(b p0,Object p1,ArrayList p2,Object p3,ArrayList p4,Object p5,ArrayList p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void a(Transition p0){
       b$c ta = this.a;
       if (ta != null) {
          this.g.q(ta, this.b, null);
       }
       ta = this.c;
       if (ta != null) {
          this.g.q(ta, this.d, null);
       }
       ta = this.e;
       if (ta != null) {
          this.g.q(ta, this.f, null);
       }
       return;
    }
    public void b(Transition p0){
       p0.T(this);
    }
}
