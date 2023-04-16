package cc8.o$a;
import android.animation.AnimatorListenerAdapter;
import cc8.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import ma8.g;
import android.view.View;
import cc8.k;
import cc8.j;

public class o$a extends AnimatorListenerAdapter	// class@0003ef
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o b = this.a.b;
       if (b != null && (b.getContainer() != null && this.a.b.getContainer().indexOfChild(this.a.c.a()) > -1)) {
          o$a ta = this.a;
          ta.b.q1(ta.c.a());
       }
    label_003b :
       b = this.a.d;
       if (b != null) {
          b.D();
       }
       return;
    }
}
