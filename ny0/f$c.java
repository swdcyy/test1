package ny0.f$c;
import android.animation.AnimatorListenerAdapter;
import ny0.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ng1.a;
import android.view.View;

public class f$c extends AnimatorListenerAdapter	// class@003424
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "2")) {
          return;
       }
       this.a.o9();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       this.a.s.setVisibility(0);
       return;
    }
}
