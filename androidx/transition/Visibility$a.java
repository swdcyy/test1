package androidx.transition.Visibility$a;
import androidx.transition.d;
import androidx.transition.Visibility;
import android.view.ViewGroup;
import android.view.View;
import androidx.transition.Transition;
import java.lang.Object;
import e3.r;
import e3.s;
import e3.q;
import androidx.transition.Transition$f;
import android.view.ViewParent;

public class Visibility$a extends d	// class@0009dc
{
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final Visibility d;

    public void Visibility$a(Visibility p0,ViewGroup p1,View p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(Transition p0){
       this.c.setTag(R.id.save_overlay_view, null);
       s.b(this.a).a(this.b);
       p0.T(this);
    }
    public void d(Transition p0){
       if (this.b.getParent() == null) {
          s.b(this.a).c(this.b);
       }else {
          this.d.cancel();
       }
       return;
    }
    public void e(Transition p0){
       s.b(this.a).a(this.b);
    }
}
