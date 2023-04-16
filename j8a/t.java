package j8a.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class t implements ValueAnimator$AnimatorUpdateListener	// class@002977
{
    public final h a;

    public void t(h p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.Y8(p0);
    }
}
