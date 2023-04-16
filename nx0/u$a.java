package nx0.u$a;
import android.animation.AnimatorListenerAdapter;
import nx0.u;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View$a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;

public final class u$a extends AnimatorListenerAdapter	// class@0033fc
{
    public final u a;

    public void u$a(u p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       LiveAudienceOverRoomV2View$a onDismissLis = this.a.a.getOnDismissListener();
       if (onDismissLis != null) {
          onDismissLis.onDismiss();
       }
       return;
    }
}
