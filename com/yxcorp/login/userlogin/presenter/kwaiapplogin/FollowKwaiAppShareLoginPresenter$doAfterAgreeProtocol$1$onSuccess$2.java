package com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g2d.a;
import com.kwai.feature.api.social.login.model.LoginParams;
import android.app.Activity;
import g2d.c0;
import mrd.c;
import java.lang.Boolean;
import brd.y;
import njd.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import java.lang.StringBuilder;
import h3b.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import android.content.Context;
import n3d.d;
import j2d.a;
import n3d.a;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public final class FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2 extends FunctionReferenceImpl implements l	// class@001bbe
{

    public void FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2(FollowKwaiAppShareLoginPresenter p0){
       super(1, p0, FollowKwaiAppShareLoginPresenter.class, "handleThrowable", "handleThrowable\(Ljava/lang/Throwable;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       c uoc;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, FollowKwaiAppShareLoginPresenter.class, "3")) {
          if (!p0 instanceof KwaiException) {
             c0.R8(treceiver.c(), treceiver.d());
             uoc = treceiver.e();
             if (uoc != null) {
                uoc.onNext(Boolean.TRUE);
             }
          }else {
             KwaiException kwaiExceptio = p0;
             KwaiException mErrorMessag = kwaiExceptio.mErrorMessage;
             Object obj = kwaiExceptio.mResponse.a();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.model.response.login.LoginUserResponse");
             if (kwaiExceptio.mErrorCode == 1190) {
                PhoneVerifyParams$b uob = new PhoneVerifyParams$b();
                uob.g(obj.mMobileCountryCode+obj.mMobile);
                uob.b(true);
                uob.l(obj.mVerifyTrustDeviceToken);
                uob.m(a.m());
                uob.f(true);
                uob.c(6);
                uob.d(true);
                uob.k(true);
                d.a(-1712118428).o00(treceiver.c(), uob.a()).K(4).w(new a(treceiver)).h();
             }else if(!LoginHelper.a(p0, 14)){
                if (!TextUtils.x(mErrorMessag)) {
                   i.d(R.style.arg_RES_7f11066a, mErrorMessag);
                }
                c0.R8(treceiver.c(), treceiver.d());
             }
             uoc = treceiver.e();
             if (uoc != null) {
                uoc.onNext(Boolean.TRUE);
             }
          }
       }
       return;
    }
}
