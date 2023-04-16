package f59.d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import f59.j;
import android.view.View;
import lnc.y0;
import com.yxcorp.gifshow.ad.award.ui.ShineView;

public final class d implements Animator$AnimatorListener	// class@0022a5
{
    public final AdUnionHalfFollowFragment a;

    public void d(AdUnionHalfFollowFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(d.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       AdUnionHalfFollowFragment z = this.a.z;
       if (z == null) {
          a.S("mShineView");
       }
       if (!PatchProxy.applyVoidOneRefs(z, null, j.class, "6")) {
          a.p(z, "shineView");
          z.setVisibility(0);
          z.setRadius(y0.l(R.dimen.arg_RES_7f07042c));
          z.b();
          z.setAnimationTimes(1);
          z.setAnimationDuration(1000);
          z.c();
       }
       PatchProxy.onMethodExit(d.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(d.class, "4");
       return;
    }
}
