package c01.f;
import android.animation.AnimatorListenerAdapter;
import c01.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class f extends AnimatorListenerAdapter	// class@000441
{
    public final e a;

    public void f(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.a.q.setVisibility(8);
       this.a.q.setAlpha(0x3f800000);
       return;
    }
}
