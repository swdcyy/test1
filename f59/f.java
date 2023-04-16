package f59.f;
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
import android.view.ViewGroup$LayoutParams;

public final class f implements Animator$AnimatorListener	// class@0022a7
{
    public final AdUnionHalfFollowFragment a;

    public void f(AdUnionHalfFollowFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(f.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       AdUnionHalfFollowFragment.eh(this.a).setText(y0.m(R.string.arg_RES_7f101034));
       ViewGroup$LayoutParams layoutParams = AdUnionHalfFollowFragment.eh(this.a).getLayoutParams();
       layoutParams.width = -2;
       layoutParams.height = -2;
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(f.class, "4");
       return;
    }
}
