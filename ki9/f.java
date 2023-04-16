package ki9.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.View;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@002c93
{
    public final FocusView a;

    public void f(FocusView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.postInvalidate();
    }
}
