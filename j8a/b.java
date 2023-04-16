package j8a.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002942
{
    public final b a;

    public void b(b p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b.P8(this.a, p0);
    }
}
