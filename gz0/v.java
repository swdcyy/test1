package gz0.v;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;

public class v extends AnimatorListenerAdapter	// class@0025d8
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void v(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.h.setAlpha(0x3f800000);
       this.a.i.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.h.setVisibility(0);
       this.a.i.setText("0");
       this.a.i.setVisibility(0);
       return;
    }
}
