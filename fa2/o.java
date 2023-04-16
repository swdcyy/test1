package fa2.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public final class o implements ValueAnimator$AnimatorUpdateListener	// class@00290d
{
    public final View a;

    public void o(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       o ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       layoutParams.height = p0.getAnimatedValue().intValue();
       ta.setLayoutParams(layoutParams);
    }
}
