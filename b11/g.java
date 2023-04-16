package b11.g;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.i;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rm2.a;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import th0.d;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.widget.ProgressBar;
import android.view.View;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet;
import android.animation.Animator;
import b11.h;
import android.animation.Animator$AnimatorListener;

public final class g implements Runnable	// class@0002fc
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void run(){
       i a = this.b.a;
       Objects.requireNonNull(a);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, a, e.class, "17")) {
       }else {
          e q = a.q;
          if (!PatchProxy.applyVoidOneRefs(q, objArray, a.class, "2")) {
             q.setBorderWidth(0);
             q.setBorderStartColor(0);
             q.setBorderEndColor(0);
             q.setBackgroundColors(new int[2]{0,0});
          }
          a.q.invalidate();
          q = a.r;
          float[] uofloatArray = new float[]{q.getTranslationX(),(float)(- a.q.getWidth())};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(q, "TranslationX", uofloatArray);
          objectAnimat.setInterpolator(new d());
          e m = a.m;
          float[] uofloatArray1 = new float[]{m.getAlpha(),0x3f800000};
          float[] uofloatArray2 = new float[]{a.m.getAlpha(),0x3f800000};
          a.c();
          AnimatorSet uAnimatorSet = new AnimatorSet();
          a.v = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,j.a(m, uofloatArray1),j.a(a.l, uofloatArray2)};
          uAnimatorSet.playTogether(uAnimatorArr);
          a.v.addListener(new h(a));
          a.v.setDuration(500);
          a.v.start();
       }
       return;
    }
}
