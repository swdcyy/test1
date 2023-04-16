package androidx.transition.b$b;
import androidx.transition.Transition$f;
import androidx.transition.b;
import android.view.View;
import java.util.ArrayList;
import java.lang.Object;
import androidx.transition.Transition;

public class b$b implements Transition$f	// class@0009e3
{
    public final View a;
    public final ArrayList b;
    public final b c;

    public void b$b(b p0,View p1,ArrayList p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Transition p0){
    }
    public void b(Transition p0){
       p0.T(this);
       this.a.setVisibility(8);
       int i = this.b.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.b.get(i1).setVisibility(0);
       }
       return;
    }
    public void c(Transition p0){
    }
    public void d(Transition p0){
    }
    public void e(Transition p0){
    }
}
