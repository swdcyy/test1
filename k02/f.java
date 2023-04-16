package k02.f;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k02.h;
import java.util.List;
import com.kuaishou.android.live.log.b;
import k02.b;
import kotlin.jvm.internal.a;
import android.widget.ImageView;

public final class f extends AnimatorListenerAdapter	// class@002c57
{
    public final LiveAudienceTreasureBoxWidgetView a;

    public void f(LiveAudienceTreasureBoxWidgetView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       LiveAudienceTreasureBoxWidgetView h;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       b.P(h.a, "updateWidgetStatus 1-1-animationEnd, to doTransferWidgetState ");
       f ta = this.a;
       h = ta.h;
       if (h != null) {
          ta.a(h);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       b.P(h.a, "updateWidgetStatus 1-1-animationStart ");
       LiveAudienceTreasureBoxWidgetView e = this.a.e;
       if (e == null) {
          a.S("treasureBoxImageView");
       }
       e.setVisibility(8);
       e = this.a.f;
       if (e == null) {
          a.S("treasureBoxBottomAnimationView");
       }
       e.setVisibility(0);
       return;
    }
}
