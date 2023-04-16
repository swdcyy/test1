package com.yxcorp.login.userlogin.presenter.accountsecurity.b;
import u07.u;
import f2d.h;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import o1d.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import f2d.g;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import android.content.Context;
import java.util.Map;
import n3d.a;

public final class b implements u	// class@001ba6
{
    public final h b;

    public void b(h p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       boolean b = true;
       if (PatchProxy.applyVoid(objArray, objArray, b.class, "9")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 100;
          uElementPack.value = 3.00f;
          u1.u(b, uElementPack, objArray);
       }
       BindPhoneParams$b uob = new BindPhoneParams$b();
       uob.m(false);
       uob.g(tb.n8(R.string.arg_RES_7f10501d));
       uob.j(201);
       uob.h(13);
       uob.n(b);
       uob.f(BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_PAGE_FIRST);
       BindPhoneParams uBindPhonePa = uob.a();
       d.a(-1712118428).ew(tb.getActivity(), uBindPhonePa, null, "account_security_set_password", new g(tb));
       return;
    }
}
