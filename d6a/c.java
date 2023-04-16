package d6a.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@001e97
{
    public final NestedParentRelativeLayout a;

    public void c(NestedParentRelativeLayout p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       NestedParentRelativeLayout.a(this.a, p0);
    }
}
