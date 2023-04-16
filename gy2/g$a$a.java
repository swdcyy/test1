package gy2.g$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.NullPointerException;

public final class g$a$a implements ValueAnimator$AnimatorUpdateListener	// class@002bc9
{
    public final View a;

    public void g$a$a(View p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a$a.class, "1")) {
          return;
       }
       g$a$a ta = this.a;
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          ta.scrollTo(0, p0.intValue());
          PatchProxy.onMethodExit(g$a$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(g$a$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
