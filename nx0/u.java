package nx0.u;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import kotlin.jvm.internal.a;
import nx0.y;
import nx0.r;
import android.animation.Animator$AnimatorListener;
import nx0.s;
import android.widget.LinearLayout;
import nx0.t;
import nx0.u$a;

public final class u extends AnimatorListenerAdapter	// class@0033fd
{
    public final LiveAudienceOverRoomV2View a;
    public final long b;
    public final float c;

    public void u(LiveAudienceOverRoomV2View p0,long p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       LiveAudienceOverRoomV2View u;
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       u ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveAudienceOverRoomV2View.class, "6")) {
          if (ta.r == null) {
             ta.g(ta.h);
             if (ta.t != null) {
                ta.l.setVisibility(0);
                ta.l.s();
             }
          }else {
             ta.g(ta.d);
             long l = 330;
             float f = 0x3f800000;
             ViewPropertyAnimator viewProperty = ta.c.animate().setDuration(l).translationY((- (float)ta.c.getHeight())).setInterpolator(a.b(0.40f, 0x3f4ccccd, 0x3f3d70a4, f));
             u = ta.u;
             if (u == null) {
                a.S("viewParam");
             }
             viewProperty.setStartDelay(u.f()).setListener(new r(ta)).start();
             float f1 = 0;
             viewProperty = ta.m.animate().setDuration(l).translationY((float)ta.m.getHeight()).setInterpolator(a.b(0.42f, f1, 0x3f147ae1, f));
             LiveAudienceOverRoomV2View u1 = ta.u;
             if (u1 == null) {
                a.S("viewParam");
             }
             viewProperty.setStartDelay((u1.f() + (long)170)).setListener(new s(ta)).start();
             viewProperty = ta.n.animate().setDuration(170).translationY(f1).setInterpolator(a.b(0.40f, f1, 0x3f2e147b, 0x3d75c28f));
             u1 = ta.u;
             if (u1 == null) {
                a.S("viewParam");
             }
             viewProperty.setStartDelay((u1.f() + (long)330)).setListener(new t(ta)).start();
          }
       }
       this.a.animate().setStartDelay(this.b).translationX(this.c).setDuration(1200).setListener(new u$a(this)).start();
       return;
    }
}
