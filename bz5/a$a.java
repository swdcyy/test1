package bz5.a$a;
import android.animation.AnimatorListenerAdapter;
import bz5.a;
import bz5.a$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class a$a extends AnimatorListenerAdapter	// class@00062e
{
    public final a$c a;
    public final a b;

    public void a$a(a p0,a$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (this.b.b.getVisibility() != 8) {
          this.b.b.setVisibility(8);
       }
       a$a ta = this.a;
       if (ta != null) {
          ta.D();
       }
       return;
    }
}
