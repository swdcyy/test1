package com.yxcorp.login.bind.presenter.m0;
import erd.g;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.Objects;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import e1d.b1;
import com.yxcorp.login.util.LoginPageLauncher$b;
import e1d.c1;
import n3d.a;

public final class m0 implements g	// class@001a89
{
    public final VerifyConfirmButtonPresenter$3 b;
    public final ProgressFragment c;
    public final String d;

    public void m0(VerifyConfirmButtonPresenter$3 p0,ProgressFragment p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       m0 td = this.d;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       if (p0 != null && p0.mTokenResetInfo != null) {
          LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.SET_PASSWORD);
          loginPageLau.b(tb.d.getActivity());
          loginPageLau.c(new b1(td, p0));
          loginPageLau.i(0);
          loginPageLau.h(new c1(tb, p0, td));
          loginPageLau.f();
       }
       return;
    }
}
