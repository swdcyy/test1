package com.yxcorp.login.userlogin.presenter.resetpassword.i;
import erd.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.k;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r2d.l;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.n;
import n3d.a;

public final class i implements g	// class@001be0
{
    public final k b;
    public final ProgressFragment c;

    public void i(k p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       if (!q.f(p0.mMultiRetrieveUserInfo)) {
          LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.RESET_SELECT_ACCOUNT_PASSWORD);
          loginPageLau.b(tb.getContext());
          loginPageLau.c(new l(p0));
          loginPageLau.i(0);
          loginPageLau.h(new n(tb));
          loginPageLau.f();
       }
       return;
    }
}
