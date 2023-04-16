package com.yxcorp.login.userlogin.presenter.resetpassword.j;
import erd.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.k;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import r2d.m;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.o;
import n3d.a;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class j implements g	// class@001be1
{
    public final k b;
    public final ProgressFragment c;

    public void j(k p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          LoginUserResponse loginUserRes = kwaiExceptio.mResponse.a();
          if (kwaiExceptio.mErrorCode == 711) {
             p0 = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.MULTI_RETRIEVE_ACCOUNT_SELECT);
             p0.b(tb.getActivity());
             p0.c(new m(loginUserRes));
             p0.i(8198);
             p0.h(new o(tb));
             p0.f();
          label_004e :
             return;
          }
       }
       ExceptionHandler.handleException(a.B, p0);
       goto label_004e ;
    }
}
