package nx0.t;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

public final class t extends AnimatorListenerAdapter	// class@0033fb
{
    public final LiveAudienceOverRoomV2View a;

    public void t(LiveAudienceOverRoomV2View p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       t ta = this.a;
       if (ta.t != null) {
          ta.l.setVisibility(0);
          this.a.l.s();
       }
       return;
    }
}
