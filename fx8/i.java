package fx8.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Float;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@002382
{
    public final ShareTopicGuideFragment a;

    public void i(ShareTopicGuideFragment p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       i ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.s.getLayoutParams();
       layoutParams.height = (int)((float)ta.v * p0.getAnimatedValue().floatValue());
       ta.s.setLayoutParams(layoutParams);
       ta.r.k0();
    }
}
