package go1.m;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import p91.m;
import ko1.b0;
import lo1.c;
import com.kuaishou.live.common.core.component.like.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import lnc.a1;
import java.lang.CharSequence;
import mo1.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.like.k;
import android.animation.Animator$AnimatorListener;

public class m extends AnimatorListenerAdapter	// class@00253b
{
    public final i a;

    public void m(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "16")) {
          boolean b = true;
          ta.w = b;
          i = 0;
          ta.D.setVisibility(i);
          i u = ta.U;
          if (u != null && u.e()) {
             ta.D.setText(R.string.arg_RES_7f102569);
          }else {
             ta.D.setText(k0.a(ta.W.d(), c.a).or(a1.p(R.string.arg_RES_7f102568)));
          }
          int[] ointArray = new int[2];
          ointArray[i] = i;
          ointArray[b] = ta.V8();
          ObjectAnimator objectAnimat = ObjectAnimator.ofInt(ta.P, a.b, ointArray).setDuration(670);
          objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          objectAnimat.addListener(new k(ta));
          objectAnimat.start();
       }
       return;
    }
}
