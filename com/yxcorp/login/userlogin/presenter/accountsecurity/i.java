package com.yxcorp.login.userlogin.presenter.accountsecurity.i;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter$PlatformName;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import vgc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import f2d.u;
import android.content.Context;
import java.util.Map;
import n3d.a;

public final class i implements u	// class@001bad
{
    public final BindThirdPlatformPresenter b;
    public final BindThirdPlatformPresenter$PlatformName c;

    public void i(BindThirdPlatformPresenter p0,BindThirdPlatformPresenter$PlatformName p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       i tb = this.b;
       Objects.requireNonNull(tb);
       int i = (this.c == BindThirdPlatformPresenter$PlatformName.WECHAT)? 1: 2;
       String str = "user_bind_phone";
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(100), Integer.valueOf(i), null, b.class, "1")) {
          b.a(1, 100, 1, 0, str, 0, (double)i);
       }
       BindPhoneParams$b uob = new BindPhoneParams$b();
       uob.m(false);
       uob.i(false);
       uob.o(false);
       uob.n(true);
       uob.h(13);
       d.a(-1712118428).ew(tb.getActivity(), uob.a(), null, "account_security_unbind_third_party", new u(tb));
       return;
    }
}
