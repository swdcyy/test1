package b4d.e0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup;
import b4d.a0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.NullPointerException;

public final class e0 implements ValueAnimator$AnimatorUpdateListener	// class@000361
{
    public final ViewGroup a;
    public final a0 b;

    public void e0(ViewGroup p0,a0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e0.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
       a.o(p0, "anim");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          layoutParams.height = p0.intValue();
          this.a.setLayoutParams(layoutParams);
          PatchProxy.onMethodExit(e0.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(e0.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
