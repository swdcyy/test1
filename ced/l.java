package ced.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import java.lang.Integer;

public final class l implements ValueAnimator$AnimatorUpdateListener	// class@000567
{
    public final h a;

    public void l(h p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.y.getBackground().mutate().setAlpha(p0.getAnimatedValue().intValue());
    }
}
