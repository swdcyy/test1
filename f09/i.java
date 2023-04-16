package f09.i;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import kotlin.jvm.internal.a;
import android.view.View;

public final class i extends AnimatorListenerAdapter	// class@002278
{
    public final LottieAnimationView a;
    public final ThanosPlayMixLottieEndView b;

    public void i(LottieAnimationView p0,ThanosPlayMixLottieEndView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       ThanosPlayMixLottieEndView i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.v(this);
       i = this.b.i;
       if (i == null) {
          a.S("mPlayEndReplayBtn");
       }
       i.setVisibility(0);
       i = this.b.h;
       if (i == null) {
          a.S("mTouchContentView");
       }
       i.setVisibility(0);
       PatchProxy.onMethodExit(i.class, "1");
       return;
    }
}
