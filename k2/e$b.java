package k2.e$b;
import android.transition.Transition$TransitionListener;
import k2.e;
import android.view.View;
import java.util.ArrayList;
import java.lang.Object;
import android.transition.Transition;

public class e$b implements Transition$TransitionListener	// class@00245c
{
    public final View a;
    public final ArrayList b;
    public final e c;

    public void e$b(e p0,View p1,ArrayList p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onTransitionCancel(Transition p0){
    }
    public void onTransitionEnd(Transition p0){
       p0.removeListener(this);
       this.a.setVisibility(8);
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.b.get(i1).setVisibility(0);
       }
       return;
    }
    public void onTransitionPause(Transition p0){
    }
    public void onTransitionResume(Transition p0){
    }
    public void onTransitionStart(Transition p0){
    }
}
