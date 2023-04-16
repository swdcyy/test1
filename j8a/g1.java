package j8a.g1;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class g1 implements ValueAnimator$AnimatorUpdateListener	// class@002954
{
    public final o a;

    public void g1(o p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       g1 ta = this.a;
       ta.X8(ta.D, ta.E, p0);
    }
}
