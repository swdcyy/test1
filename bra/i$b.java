package bra.i$b;
import android.animation.AnimatorListenerAdapter;
import bra.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import lnc.a1;
import android.animation.Animator;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$f;
import java.lang.Runnable;
import ekd.k1;
import java.lang.CharSequence;
import bra.i$b$a;
import android.animation.Animator$AnimatorListener;

public final class i$b extends AnimatorListenerAdapter	// class@000436
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, i$b.class, "5")) {
          return;
       }
       this.a.b.M(0);
       UnmuteTipView b = this.a.b.B;
       if (b != null) {
          b.s();
       }
       PatchProxy.onMethodExit(i$b.class, "5");
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoidWithListener(null, this, i$b.class, "4")) {
          return;
       }
       this.a.b.K = 3;
       this.a();
       UnmuteTipView j = this.a.b.J;
       if (j != null) {
          j.setAlpha(0);
       }
       this.a.b.setBgWidth(a1.e(137.00f));
       PatchProxy.onMethodExit(i$b.class, "4");
       return;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.b();
       PatchProxy.onMethodExit(i$b.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b();
       i$b ta = this.a;
       UnmuteTipView q = ta.b.Q;
       q.b = ta.c;
       k1.r(q, 3000);
       PatchProxy.onMethodExit(i$b.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       i b = this.a.b;
       b.K = 2;
       UnmuteTipView i = b.I;
       if (i != null) {
          i.setText(a1.p(R.string.arg_RES_7f101328));
       }
       i = this.a.b.J;
       if (i != null) {
          i.setAlpha(0x3f800000);
       }
       this.a.b.M(1);
       i = this.a.b.C;
       if (i != null) {
          i.s();
       }
       i = this.a.b.C;
       if (i != null) {
          i.a(new i$b$a(this));
       }
       PatchProxy.onMethodExit(i$b.class, "1");
       return;
    }
}
