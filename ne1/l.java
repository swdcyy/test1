package ne1.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.comments.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;

public final class l implements ValueAnimator$AnimatorUpdateListener	// class@0032f4
{
    public final c a;
    public final int b;

    public void l(c p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       l ta = this.a;
       Objects.requireNonNull(ta);
       float f = (float)this.b;
       ta.a((ta.d + (int)(f - (p0.getAnimatedFraction() * f))));
    }
}
