package fm2.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.widget.ProgressBar;

public final class g implements ValueAnimator$AnimatorUpdateListener	// class@00298b
{
    public final LiveVotePercentProgressbar a;

    public void g(LiveVotePercentProgressbar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       g ta = this.a;
       Objects.requireNonNull(ta);
       ta.setProgress((int)(p0.getAnimatedValue().floatValue() / 100.00f));
    }
}
