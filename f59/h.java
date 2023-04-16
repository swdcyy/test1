package f59.h;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class h implements Animator$AnimatorListener	// class@0022a9
{
    public final AdUnionHalfFollowFragment a;

    public void h(AdUnionHalfFollowFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(h.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       AdUnionHalfFollowFragment.dh(this.a).setEnabled(true);
       PatchProxy.onMethodExit(h.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(h.class, "4");
       return;
    }
}
