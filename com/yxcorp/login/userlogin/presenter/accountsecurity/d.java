package com.yxcorp.login.userlogin.presenter.accountsecurity.d;
import n3d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.e;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.http.response.RiskCheckResponse;
import f2d.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import f2d.e;
import com.yxcorp.login.util.LoginPageLauncher$b;
import f2d.f;

public final class d implements a	// class@001ba8
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1) {
          e c = tb.c;
          RiskCheckResponse mAuthToken = SerializableHook.getSerializableExtra(p2, "KEY_RISK_CHECKING_RESULT").mAuthToken;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(mAuthToken, c, h.class, "4")) {
             LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.SET_PASSWORD);
             loginPageLau.b(c.getActivity());
             loginPageLau.c(new e(mAuthToken));
             loginPageLau.i(0);
             loginPageLau.h(new f(c));
             loginPageLau.f();
          }
       }
       return;
    }
}
