package ab2.f;
import android.animation.AnimatorListenerAdapter;
import ab2.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class f extends AnimatorListenerAdapter	// class@0000a0
{
    public final d a;

    public void f(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.p.setVisibility(4);
       return;
    }
}
