package com.yxcorp.login.bind.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b3d.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.login.bind.presenter.k$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.login.bind.presenter.j;
import w4.j;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.login.bind.presenter.k$a;
import java.lang.Runnable;

public class k extends PresenterV2	// class@001a82
{
    public LottieAnimationView p;
    public TextView q;
    public TextView r;
    public u s;

    public void k(){
       super();
       this.s = new u();
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          k tp = this.p;
          if (tp != null) {
             tp.clearAnimation();
             this.p.setAnimationFromUrl(p0);
             this.p.setRepeatCount(0);
             this.p.a(new k$b(this));
             this.p.setFailureListener(j.a);
             this.p.s();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a290e);
       this.q = m1.f(p0, 0x7f0a0a67);
       this.r = m1.f(p0, 0x7f0a0a68);
       Objects.requireNonNull(this.s);
       this.p.setAnimationFromUrl("https://ali2.a.yximgs.com/kos/nlav10225/net_icon/check_risk_st.json");
       p0.postDelayed(new k$a(this), 2000);
       return;
    }
}
