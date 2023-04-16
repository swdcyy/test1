package ki9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.View;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@002c91
{
    public final FocusView a;

    public void d(FocusView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.postInvalidate();
    }
}
