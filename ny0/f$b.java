package ny0.f$b;
import android.animation.AnimatorListenerAdapter;
import ny0.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ng1.a;
import android.view.View;

public class f$b extends AnimatorListenerAdapter	// class@003423
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       this.a.s.setVisibility(0);
       return;
    }
}
