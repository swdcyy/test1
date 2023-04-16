package ki9.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.View;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@002c92
{
    public final FocusView a;

    public void e(FocusView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.postInvalidate();
    }
}
