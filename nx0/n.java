package nx0.n;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View$a;

public final class n extends AnimatorListenerAdapter	// class@0033f5
{
    public final LiveAudienceOverRoomV2View a;

    public void n(LiveAudienceOverRoomV2View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       LiveAudienceOverRoomV2View$a onDismissLis = this.a.getOnDismissListener();
       if (onDismissLis != null) {
          onDismissLis.onDismiss();
       }
       this.a.d();
       return;
    }
}
