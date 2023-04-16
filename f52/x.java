package f52.x;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.TextView;
import android.view.View;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.b;

public final class x implements g	// class@00289d
{
    public final k b;

    public void x(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, ok, "13")) {
       }else {
          int i = 300;
          if (p0.isFollowingOrFollowRequesting()) {
             int i1 = 0x7f101034;
             if (tb.B != null) {
                if (tb.P8() && tb.z != null) {
                   tb.W8(false);
                }
                tb.S8(tb.t, a1.p(i1), i);
             }else if(tb.D != null && (tb.z != null && tb.A == null)){
                boolean b = true;
                tb.F = b;
                if (!PatchProxy.applyVoid(null, tb, ok, "15")) {
                   tb.t.setVisibility(8);
                   View[] viewArray = new View[]{tb.t,tb.u};
                   tb.R8(viewArray);
                   tb.S8(tb.t, a1.p(i1), false);
                   i = a1.d(R.dimen.arg_RES_7f07032a);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   float[] uofloatArray = new float[]{(float)i,0};
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb.t, View.TRANSLATION_X, uofloatArray);
                   objectAnimat.setDuration(300);
                   float[] uofloatArray1 = new float[]{(float)(- i),0};
                   ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tb.u, View.TRANSLATION_X, uofloatArray1);
                   objectAnimat1.setDuration(300);
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.start();
                }
                b.d(tb.p.Z2.a());
             }else {
                tb.S8(tb.t, a1.p(i1), i);
             }
          }else if(tb.B != null && tb.P8()){
             tb.X8(false);
          }
          tb.S8(tb.t, tb.w, i);
          tb.D = false;
       }
       return;
    }
}
