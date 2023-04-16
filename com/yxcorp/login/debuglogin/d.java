package com.yxcorp.login.debuglogin.d;
import erd.g;
import j1d.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k1d.e;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import android.app.Activity;
import java.lang.String;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import java.lang.StringBuilder;
import h3b.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import android.content.Context;
import n3d.d;
import j1d.b;
import n3d.a;

public final class d implements g	// class@001ab0
{
    public final e b;
    public final GifshowActivity c;
    public final e d;

    public void d(e p0,GifshowActivity p1,e p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          KwaiException mErrorMessag = kwaiExceptio.mErrorMessage;
          KwaiException mErrorCode = kwaiExceptio.mErrorCode;
          LoginUserResponse loginUserRes = kwaiExceptio.mResponse.a();
          if (mErrorCode != 1190) {
             if (!LoginHelper.a(p0, 13)) {
                if (!TextUtils.x(mErrorMessag)) {
                   i.d(R.style.arg_RES_7f11066a, mErrorMessag);
                }
                tb.d(tc);
             }
             td.b(mErrorCode, mErrorMessag);
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
             b uob1 = new b(tb, td, mErrorCode, mErrorMessag, tc);
             d.a(-1712118428).o00(tc, uob.a()).K(4).w(uob).h();
          }
       }else {
          tb.d(tc);
          td.b(0, p0.getMessage());
       }
       return;
    }
}
