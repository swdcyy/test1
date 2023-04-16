package com.yxcorp.login.userlogin.presenter.kwaiapplogin.c;
import erd.g;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.e;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams;
import g2d.c0;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import java.lang.StringBuilder;
import h3b.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import android.content.Context;
import n3d.d;
import j2d.i;
import n3d.a;

public final class c implements g	// class@001bc4
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "11")) {
       }else {
          tb.b9();
          if (p0 instanceof KwaiException) {
             KwaiException kwaiExceptio = p0;
             KwaiException mErrorMessag = kwaiExceptio.mErrorMessage;
             KwaiException mErrorCode = kwaiExceptio.mErrorCode;
             LoginUserResponse loginUserRes = kwaiExceptio.mResponse.a();
             if (mErrorCode != 1190) {
                if (!LoginHelper.a(p0, 14)) {
                   if (!TextUtils.x(mErrorMessag)) {
                      i.d(R.style.arg_RES_7f11066a, mErrorMessag);
                   }
                   c0.R8(tb.getActivity(), tb.s);
                }
                tb.Z8(mErrorCode, mErrorMessag);
             }else {
                PhoneVerifyParams$b uob = new PhoneVerifyParams$b();
                uob.g(loginUserRes.mMobileCountryCode+loginUserRes.mMobile);
                uob.b(true);
                uob.l(loginUserRes.mVerifyTrustDeviceToken);
                uob.m(a.m());
                uob.f(true);
                uob.c(6);
                uob.d(true);
                uob.k(true);
                d.a(-1712118428).o00(tb.getActivity(), uob.a()).K(4).w(new i(tb, mErrorCode, mErrorMessag)).h();
             }
          }else {
             c0.R8(tb.getActivity(), tb.s);
             tb.Z8(0, p0.getMessage());
          }
       }
       return;
    }
}
