package ne1.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.comments.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;

public final class m implements ValueAnimator$AnimatorUpdateListener	// class@0032f5
{
    public final c a;
    public final int b;
    public final int c;

    public void m(c p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       m ta = this.a;
       Objects.requireNonNull(ta);
       ta.a((this.c + (int)((float)this.b * p0.getAnimatedFraction())));
    }
}
