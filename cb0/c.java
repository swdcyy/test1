package cb0.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import cb0.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@0002ff
{
    public final a a;

    public void c(a p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       this.a.G(i);
       if (i == 100) {
          this.a.F();
       }
       return;
    }
}
