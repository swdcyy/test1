package com.yxcorp.login.userlogin.presenter.accountsecurity.s;
import erd.g;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import java.lang.Object;
import java.lang.Throwable;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.login.model.AccountRiskParams;
import f2d.c0;
import n3d.a;
import com.yxcorp.login.userlogin.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import f2d.b0;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import java.util.Map;
import com.kwai.framework.accountsecurity.d;
import zb6.a;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class s implements g	// class@001bb8
{
    public final t b;
    public final boolean c;

    public void s(t p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       s tb = this.b;
       s tc = this.c;
       if (tb.getActivity().isFinishing()) {
       }else if(p0 instanceof KwaiException){
          KwaiException kwaiExceptio = p0;
          KwaiException mErrorCode = kwaiExceptio.mErrorCode;
          if (mErrorCode == 1190) {
             p0 = t.class;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), tb, p0, "10")) {
                b.b(tb.getActivity(), new AccountRiskParams(3), new c0(tb, tc));
             }
          }else if(mErrorCode == 1192){
             p0 = new BindPhoneParams$b();
             p0.g(kwaiExceptio.mErrorMessage);
             p0.n(true);
             p0.h(16);
             p0.d(kwaiExceptio.mErrorMessage);
             p0.f(BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_PAGE_FIRST);
             p0.j(0);
             BindPhoneParams uBindPhonePa = p0.a();
             d.a(-1712118428).ew(tb.getActivity(), uBindPhonePa, null, "account_security_password_lock", new b0(tb, tc));
          }
       }
       int i = 36;
       if (d.c() == -1) {
          i = 37;
       }
       u1.J0(i, 8, 12, a.b(p0), TextUtils.k(a.i(p0)));
       tb.S8(tc);
       ExceptionHandler.handleException(tb.getActivity(), p0);
       return;
    }
}
