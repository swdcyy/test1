package ng1.a$e;
import android.animation.AnimatorListenerAdapter;
import ng1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$e extends AnimatorListenerAdapter	// class@003312
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       this.a.a9();
       return;
    }
}
