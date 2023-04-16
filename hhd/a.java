package hhd.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.plugin.setting.widget.SlideSelector;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000f82
{
    public final SlideSelector a;
    public final boolean b;

    public void a(SlideSelector p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       ta.b(p0.getAnimatedValue().floatValue(), this.b);
       ta.postInvalidate();
    }
}
