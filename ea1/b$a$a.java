package ea1.b$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class b$a$a implements ValueAnimator$AnimatorUpdateListener	// class@0020c4
{
    public final View a;

    public void b$a$a(View p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          this.a.setAlpha(p0.floatValue());
          PatchProxy.onMethodExit(b$a$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(b$a$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
