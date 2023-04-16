package j8a.l0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class l0 implements ValueAnimator$AnimatorUpdateListener	// class@002962
{
    public final k a;

    public void l0(k p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       l0 ta = this.a;
       ta.c9(ta.L, ta.M, p0);
    }
}
