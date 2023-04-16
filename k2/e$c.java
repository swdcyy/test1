package k2.e$c;
import android.transition.Transition$TransitionListener;
import k2.e;
import java.lang.Object;
import java.util.ArrayList;
import android.transition.Transition;

public class e$c implements Transition$TransitionListener	// class@00245d
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final e g;

    public void e$c(e p0,Object p1,ArrayList p2,Object p3,ArrayList p4,Object p5,ArrayList p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void onTransitionCancel(Transition p0){
    }
    public void onTransitionEnd(Transition p0){
       p0.removeListener(this);
    }
    public void onTransitionPause(Transition p0){
    }
    public void onTransitionResume(Transition p0){
    }
    public void onTransitionStart(Transition p0){
       e$c ta = this.a;
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
}
