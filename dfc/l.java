package dfc.l;
import android.animation.AnimatorListenerAdapter;
import dfc.m;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class l extends AnimatorListenerAdapter	// class@0021a9
{
    public final m a;

    public void l(m p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.R8();
       return;
    }
}
