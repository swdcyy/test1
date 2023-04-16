package com.yxcorp.login.userlogin.presenter.kwaiapplogin.e;
import g2d.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import o1d.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.view.View;
import k2b.u1;
import android.widget.TextView;
import x45.b$a;
import java.util.Map;
import b3d.v;
import x45.b;
import u45.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.d;
import u45.a;
import java.lang.Integer;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import k2b.e0;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.login.util.f;
import h3b.a;
import java.lang.Boolean;
import mw4.a;
import v0d.j;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import j2d.j;
import n3d.a;
import com.yxcorp.login.userlogin.fragment.KwaiAppLoginV2Fragment;
import ekd.m1;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import java.lang.CharSequence;
import j2d.l;
import android.view.View$OnClickListener;

public class e extends c0	// class@001bc6
{
    public LoginParams s;
    public KwaiAppLoginV2Fragment t;
    public KwaiGravityEffectButton u;

    public void e(){
       super();
    }
    public void Y8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       e tt = this.t;
       int i = 1;
       if (tt != null) {
          ClientContent$ContentPackage uContentPack = tt.Q3();
          if (!PatchProxy.applyVoidOneRefs(uContentPack, objArray, h.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "KWAI_ACCOUNT_BUTTON";
             u1.v(i, uElementPack, uContentPack, objArray);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
             this.u.setEnabled(false);
          }
          b$a uoa = new b$a();
          uoa.f("nebula_app");
          uoa.b("code");
          uoa.d(i);
          String[] stringArray = new String[]{"nebula_app"};
          uoa.e(stringArray);
          uoa.c(v.a());
          b uob = uoa.a();
          b.b().d(this.getActivity(), uob, new d(this));
       }
       return;
    }
    public final void Z8(int p0,String p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "10")) {
          return;
       }
       h.a(null, p0, p1, 8, this.t, this.s);
       if (f.i(p0)) {
          return;
       }
       this.getActivity().setResult(-1);
       this.getActivity().finish();
       return;
    }
    public void a9(LoginUserResponse p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "9")) {
          return;
       }
       this.b9();
       h.a(p0, 0, "", 7, this.t, this.s);
       if (p0 == null) {
          this.getActivity().setResult(-1);
          this.getActivity().finish();
          return;
       }else {
          a.p(14);
          LoginUserResponse mIsNewThirdP = p0.mIsNewThirdPlatformUser;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(mIsNewThirdP), this, uoe, "12")) {
             if (mIsNewThirdP != null && (a.g() || j.b())) {
                uoe = this.t;
                if (uoe != null) {
                   uoe.hh(p0, mIsNewThirdP);
                }
             }else {
                LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.REGISTER_USER_INFO_SETTING);
                loginPageLau.b(this.getContext());
                loginPageLau.g(this.s);
                loginPageLau.i(260);
                loginPageLau.h(new j(this, p0, mIsNewThirdP));
                loginPageLau.f();
             }
          }
          return;
       }
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.u.setEnabled(true);
       return;
    }
    public void doBindView(View p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       super.doBindView(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "3")) {
          this.u = m1.f(p0, 0x7f0a054e);
          if (v.e(0, null, null, null)) {
             this.u.setText(a1.p(R.string.arg_RES_7f101bf1));
          }
          this.u.setOnClickListener(new l(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.s = this.t8("LOGIN_PAGE_PARAMS");
       this.t = this.t8("FRAGMENT");
       return;
    }
}
