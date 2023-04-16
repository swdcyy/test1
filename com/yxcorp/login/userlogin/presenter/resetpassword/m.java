package com.yxcorp.login.userlogin.presenter.resetpassword.m;
import erd.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.n;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.login.http.response.ResetSelectResponse;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import r2d.r;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.t;
import n3d.a;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class m implements g	// class@001be4
{
    public final n b;
    public final ProgressFragment c;
    public final String d;
    public final String e;

    public void m(n p0,ProgressFragment p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m td = this.d;
       m te = this.e;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          ResetSelectResponse resetSelectR = kwaiExceptio.mResponse.a();
          resetSelectR.mCountryCode = td;
          resetSelectR.mPhone = te;
          if (kwaiExceptio.mErrorCode == 711) {
             p0 = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.MULTI_RETRIEVE_ACCOUNT_SELECT);
             p0.b(tb.getActivity());
             p0.c(new r(resetSelectR));
             p0.i(8198);
             p0.h(new t(tb));
             p0.f();
          }else {
             ExceptionHandler.handleException(a.B, p0);
          }
       }else {
          ExceptionHandler.handleException(a.B, p0);
       }
       return;
    }
}
