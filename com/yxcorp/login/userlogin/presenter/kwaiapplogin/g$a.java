package com.yxcorp.login.userlogin.presenter.kwaiapplogin.g$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import o1d.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import h3b.a;
import g2d.c0;
import com.kwai.feature.api.social.login.model.LoginParams;
import oe6.e;
import oe6.b;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.login.util.LoginPageLauncher$FromPage;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.f;
import com.yxcorp.login.util.LoginPageLauncher$b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import n3d.a;
import j2d.n;

public class g$a extends m	// class@001bc8
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = this.c.u.Q3();
       n obj = null;
       boolean b = true;
       if (!PatchProxy.applyVoidOneRefs(uContentPack, obj, h.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "THIRD_ACCOUNT_BUTTON";
          u1.v(b, uElementPack, uContentPack, obj);
       }
       int i = a.c();
       int i1 = 0;
       if (c0.X8()) {
          g t = this.c.t;
          if (i != 11) {
             b = false;
          }
          t.mIsPasswordLogin = b;
       }else {
          g t1 = this.c.t;
          if (e.i() || b.A() != 2) {
             b = false;
          }
          t1.mIsPasswordLogin = b;
       }
       LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.PHONE_LOGIN);
       loginPageLau.b(this.c.getActivity());
       loginPageLau = loginPageLau.a(LoginPageLauncher$FromPage.KWAI_APP_ONE_KEY);
       loginPageLau.c(f.a);
       loginPageLau.g(this.c.t);
       loginPageLau.i(i1);
       g$a tc = this.c;
       Objects.requireNonNull(tc);
       obj = PatchProxy.apply(obj, tc, g.class, "4");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new n(tc);
       }
       loginPageLau.h(obj);
       loginPageLau.f();
       return;
    }
}
