package com.yxcorp.login.userlogin.presenter.accountsecurity.j;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter$PlatformName;
import android.view.View;
import java.lang.Object;
import u07.t;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.model.AccountRiskParams;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.accountsecurity.g;
import n3d.a;
import com.yxcorp.login.userlogin.b;

public final class j implements u	// class@001bae
{
    public final BindThirdPlatformPresenter b;
    public final BindThirdPlatformPresenter$PlatformName c;
    public final View d;

    public void j(BindThirdPlatformPresenter p0,BindThirdPlatformPresenter$PlatformName p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       j tb = this.b;
       j td = this.d;
       Objects.requireNonNull(tb);
       String str = (BindThirdPlatformPresenter$PlatformName.WECHAT == this.c)? "weixin": "qq2.0";
       if (!PatchProxy.applyVoidTwoRefs(str, td, tb, BindThirdPlatformPresenter.class, "6")) {
          AccountRiskParams uAccountRisk = new AccountRiskParams(2);
          uAccountRisk.setPlatform(str);
          b.b(tb.getActivity(), uAccountRisk, new g(tb, str, td));
       }
       return;
    }
}
