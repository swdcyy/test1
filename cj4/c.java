package cj4.c;
import android.animation.AnimatorListenerAdapter;
import cj4.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c extends AnimatorListenerAdapter	// class@000482
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.E = null;
       return;
    }
}
