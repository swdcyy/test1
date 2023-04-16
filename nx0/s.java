package nx0.s;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import lnc.a1;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import d61.j0;

public final class s extends AnimatorListenerAdapter	// class@0033fa
{
    public final LiveAudienceOverRoomV2View a;

    public void s(LiveAudienceOverRoomV2View p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       s ta = this.a;
       ta.n.setTranslationY((float)ta.m.getMeasuredHeight());
       ta = this.a;
       int i = a1.d(R.dimen.arg_RES_7f0705e6);
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveAudienceOverRoomV2View.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, LiveAudienceOverRoomV2View.class, "16")) {
          ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
          layoutParams.height = i;
          ta.setLayoutParams(layoutParams);
          j0.a(ta, (float)a1.d(R.dimen.arg_RES_7f07031b));
       }
       return;
    }
}
