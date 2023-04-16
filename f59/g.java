package f59.g;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import lnc.y0;
import java.lang.CharSequence;
import android.widget.ImageView;

public final class g implements Animator$AnimatorListener	// class@0022a8
{
    public final AdUnionHalfFollowFragment a;

    public void g(AdUnionHalfFollowFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(g.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       AdUnionHalfFollowFragment.eh(this.a).setText(y0.m(R.string.arg_RES_7f100fb0));
       AdUnionHalfFollowFragment.fh(this.a).setVisibility(8);
       PatchProxy.onMethodExit(g.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(g.class, "4");
       return;
    }
}
