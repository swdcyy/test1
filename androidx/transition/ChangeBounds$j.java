package androidx.transition.ChangeBounds$j;
import androidx.transition.d;
import androidx.transition.ChangeBounds;
import android.view.ViewGroup;
import androidx.transition.Transition;
import e3.s;
import androidx.transition.Transition$f;

public class ChangeBounds$j extends d	// class@0009ac
{
    public boolean a;
    public final ViewGroup b;
    public final ChangeBounds c;

    public void ChangeBounds$j(ChangeBounds p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = false;
    }
    public void b(Transition p0){
       if (this.a == null) {
          s.c(this.b, false);
       }
       p0.T(this);
       return;
    }
    public void c(Transition p0){
       s.c(this.b, false);
       this.a = true;
    }
    public void d(Transition p0){
       s.c(this.b, true);
    }
    public void e(Transition p0){
       s.c(this.b, false);
    }
}
