package com.yxcorp.login.userlogin.presenter.resetpassword.e;
import com.yxcorp.login.userlogin.f$a;
import com.yxcorp.login.userlogin.presenter.resetpassword.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import r2d.i;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.d;
import w4.j;
import com.yxcorp.login.http.response.CheckAntispamResponse;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import r2d.f;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.g;
import n3d.a;

public class e implements f$a	// class@001bd9
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uof, "4")) {
          ta.q.getLayoutParams().topMargin = a1.e(10.00f);
          ta.q.setText(R.string.arg_RES_7f1040f1);
          Objects.requireNonNull(ta.s);
          String str = "https://s1-11322.kwimgs.com/kos/nlav11322/animation/verify_fail_333.json";
          if (!PatchProxy.applyVoidOneRefs(str, ta, uof, "6") && !TextUtils.x(str)) {
             uof = ta.p;
             if (uof != null) {
                uof.clearAnimation();
                ta.p.setAnimationFromUrl(str);
                ta.p.setRepeatCount(0);
                ta.p.a(new i(ta));
                ta.p.setFailureListener(d.a);
                ta.p.s();
             }
          }
          if (!TextUtils.x(p0)) {
             ta.r.setVisibility(0);
             ta.r.setText(p0);
          }
       }
       return;
    }
    public void b(CheckAntispamResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "5") && (ta.getActivity() != null && (!ta.getActivity().isFinishing() && ta.t != null))) {
          LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.RESET_SELECT_ACCOUNT_PASSWORD);
          loginPageLau.b(ta.getContext());
          loginPageLau.c(new f(ta, p0));
          loginPageLau.i(0);
          loginPageLau.h(new g(ta));
          loginPageLau.f();
       }
    label_0055 :
       return;
    }
}
