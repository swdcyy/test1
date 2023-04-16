package androidx.transition.TransitionSet$b;
import androidx.transition.d;
import androidx.transition.TransitionSet;
import androidx.transition.Transition;
import androidx.transition.Transition$f;

public class TransitionSet$b extends d	// class@0009d8
{
    public TransitionSet a;

    public void TransitionSet$b(TransitionSet p0){
       super();
       this.a = p0;
    }
    public void a(Transition p0){
       TransitionSet$b ta = this.a;
       if (ta.O == null) {
          ta.h0();
          ta.O = true;
       }
       return;
    }
    public void b(Transition p0){
       TransitionSet$b ta = this.a;
       int i = ta.N - 1;
       ta.N = i;
       if (!i) {
          ta.O = false;
          ta.p();
       }
       p0.T(this);
       return;
    }
}
