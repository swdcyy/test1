package ny1.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Integer;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@00342a
{
    public final LiveTempEnhanceView a;

    public void b(LiveTempEnhanceView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.b.getLayoutParams();
       layoutParams.width = p0.getAnimatedValue().intValue();
       ta.b.setLayoutParams(layoutParams);
    }
}
