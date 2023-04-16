package ng1.a$f;
import android.animation.AnimatorListenerAdapter;
import ng1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$f extends AnimatorListenerAdapter	// class@003313
{
    public final a a;

    public void a$f(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       this.a.c9();
       return;
    }
}
