package ced.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import java.lang.Integer;

public final class m implements ValueAnimator$AnimatorUpdateListener	// class@00056a
{
    public final h a;

    public void m(h p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       m ta = this.a;
       ta.y.getLayoutParams().width = p0.getAnimatedValue().intValue();
       ta.y.requestLayout();
    }
}
