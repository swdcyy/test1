package com.yxcorp.login.userlogin.presenter.resetpassword.l;
import erd.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.n;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.login.http.response.ResetSelectResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import r2d.q;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.s;
import n3d.a;
import h3b.b;
import java.lang.StringBuilder;
import q87.c;

public final class l implements g	// class@001be3
{
    public final n b;
    public final ProgressFragment c;
    public final String d;
    public final String e;

    public void l(n p0,ProgressFragment p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l td = this.d;
       l te = this.e;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       if (!q.f(p0.mMultiRetrieveUserInfo)) {
          if (tb.getActivity() != null) {
             p0.mCountryCode = td;
             p0.mPhone = te;
             LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.RESET_ACCOUNT_CHECKING);
             loginPageLau.b(tb.getActivity());
             loginPageLau.c(new q(p0));
             loginPageLau.h(new s(tb));
             loginPageLau.f();
          }
       }else {
          Object[] objArray = new Object[0];
          b.C().t("LOGIN_TAG", "retrievePasswordBySelect error code="+p0.mResult, objArray);
       }
       return;
    }
}
