package c72.d;
import android.animation.AnimatorListenerAdapter;
import c72.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends AnimatorListenerAdapter	// class@0004db
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.a();
       return;
    }
}
