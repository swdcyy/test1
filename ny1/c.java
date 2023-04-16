package ny1.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Integer;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@00342b
{
    public final LiveTempEnhanceView a;

    public void c(LiveTempEnhanceView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.b.getLayoutParams();
       layoutParams.width = p0.getAnimatedValue().intValue();
       ta.b.setLayoutParams(layoutParams);
    }
}
