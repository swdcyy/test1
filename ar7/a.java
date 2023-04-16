package ar7.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000347
{
    public final View a;
    public final int b;
    public final int c;

    public void a(View p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       a tc = this.c;
       this.a.getLayoutParams().width = (int)(((float)(this.b - tc) * p0.floatValue()) + (float)tc);
       this.a.requestLayout();
       return;
    }
}
