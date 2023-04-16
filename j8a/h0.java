package j8a.h0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class h0 implements ValueAnimator$AnimatorUpdateListener	// class@002956
{
    public final k a;

    public void h0(k p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       h0 ta = this.a;
       ta.c9(ta.L, ta.M, p0);
    }
}
