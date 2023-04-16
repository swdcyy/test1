package b77.l$c;
import android.animation.AnimatorListenerAdapter;
import b77.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class l$c extends AnimatorListenerAdapter	// class@0003e0
{
    public final l a;

    public void l$c(l p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "1")) {
          return;
       }
       this.a.a.setVisibility(8);
       return;
    }
}
