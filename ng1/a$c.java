package ng1.a$c;
import android.animation.AnimatorListenerAdapter;
import ng1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class a$c extends AnimatorListenerAdapter	// class@003310
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       this.a.t.setVisibility(0);
       return;
    }
}
