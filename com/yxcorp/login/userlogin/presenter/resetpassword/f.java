package com.yxcorp.login.userlogin.presenter.resetpassword.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b3d.u;
import com.yxcorp.login.userlogin.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import crd.b;
import lnc.b9;
import java.util.Map;
import android.view.View;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import r2d.h;
import java.lang.Runnable;
import com.yxcorp.login.http.response.ResetSelectResponse;
import androidx.fragment.app.Fragment;

public class f extends PresenterV2	// class@001bda
{
    public LottieAnimationView p;
    public TextView q;
    public TextView r;
    public u s;
    public ResetSelectResponse t;
    public f u;
    public Fragment v;

    public void f(){
       super();
       this.s = new u();
       this.u = new f();
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "7")) {
          return;
       }
       f tu = this.u;
       Objects.requireNonNull(tu);
       if (!PatchProxy.applyVoid(objArray, tu, f.class, "4")) {
          b9.a(tu.a);
          tu.b.clear();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a290e);
       this.q = m1.f(p0, 0x7f0a0a67);
       this.r = m1.f(p0, 0x7f0a0a68);
       Objects.requireNonNull(this.s);
       this.p.setAnimationFromUrl("https://ali2.a.yximgs.com/kos/nlav10225/net_icon/check_risk_st.json");
       p0.postDelayed(new h(this), 2000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.t = this.t8("RESET_ACCOUNT_CHECK_RESPONSE");
       this.v = this.r8("FRAGMENT");
       return;
    }
}
