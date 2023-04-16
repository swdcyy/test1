package nx0.r;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class r extends AnimatorListenerAdapter	// class@0033f9
{
    public final LiveAudienceOverRoomV2View a;

    public void r(LiveAudienceOverRoomV2View p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       r ta = this.a;
       ta.g(ta.h);
       return;
    }
}
