package bv2.b;
import android.animation.AnimatorListenerAdapter;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b extends AnimatorListenerAdapter	// class@00046a
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.invoke();
       return;
    }
}
