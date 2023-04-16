package d22.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.basic.widget.LiveHourlyRankAvatarRotateView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import java.util.LinkedList;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.View;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@002429
{
    public final LiveHourlyRankAvatarRotateView a;

    public void f(LiveHourlyRankAvatarRotateView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       float f1 = 0x3f19999a * f;
       ta.b.get(0).setAlpha((0.40f + f1));
       int k = LiveHourlyRankAvatarRotateView.k;
       float f2 = (float)k;
       ta.b.get(0).setTranslationX(((f * f) * f2));
       float f3 = 0.30f * f;
       ta.d(ta.b.get(0), (f3 + 0x3f800000));
       ta.b.get(1).setAlpha((0x3f800000 - f1));
       ta.b.get(1).setTranslationX((f2 * (f + 0x3f800000)));
       ta.d(ta.b.get(1), (0x3fa66666 - f3));
       ta.b.get(2).setTranslationX(((float)(k * 2) * (0x3f800000 - f)));
    }
}
