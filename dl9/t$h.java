package dl9.t$h;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import dl9.t;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class t$h implements PopupInterface$b	// class@001fa6
{
    public final t a;

    public void t$h(t p0){
       this.a = p0;
       super();
    }
    public final Animator a(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t$h obj = PatchProxy.applyOneRefs(p0, this, t$h.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.a;
       Objects.requireNonNull(obj);
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(p0, obj, t.class, "17");
       if (uAnimatorSet != patchProxyRe) {
       }else {
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(p0, View.SCALE_X, new float[2]{0x3f800000,0x3f4ccccd}),ObjectAnimator.ofFloat(p0, View.SCALE_Y, new float[2]{0x3f800000,0x3f4ccccd})};
          uAnimatorSet1.playTogether(uAnimatorArr);
          uAnimatorSet1.setDuration(240);
          uAnimatorSet1.setInterpolator(new DecelerateInterpolator(0x3fc00000));
          uAnimatorSet = uAnimatorSet1;
       }
       return uAnimatorSet;
    }
}
