package ne1.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.comments.c;
import bq5.b;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import android.view.View;
import dp3.g;
import lnc.a1;

public final class n implements ValueAnimator$AnimatorUpdateListener	// class@0032f6
{
    public final c a;
    public final int[] b;
    public final b c;

    public void n(c p0,int[] p1,b p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       n ta = this.a;
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(ta);
       if (!tb[0] && (tc.getView() != null && tc.getView().getHeight())) {
          tb[0] = tc.getView().getHeight() + a1.e((float)tc.b());
       }
    label_0032 :
       ta.a((ta.d + (int)((float)tb[0] * p0.getAnimatedFraction())));
       return;
    }
}
