package com.yxcorp.login.userlogin.presenter.accountsecurity.g;
import n3d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.http.response.RiskCheckResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.o;
import f2d.p;
import erd.g;
import crd.b;

public final class g implements a	// class@001bab
{
    public final BindThirdPlatformPresenter b;
    public final String c;
    public final View d;

    public void g(BindThirdPlatformPresenter p0,String p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       Objects.requireNonNull(tb);
       if (p1 == -1) {
          RiskCheckResponse mAuthToken = SerializableHook.getSerializableExtra(p2, "KEY_RISK_CHECKING_RESULT").mAuthToken;
          String str = "";
          if (!PatchProxy.applyVoidFourRefs(mAuthToken, str, tc, td, tb, BindThirdPlatformPresenter.class, "7")) {
             a uoa = b.a(0x5cfaafff);
             String str1 = (0x7f0a3386 == td.getId())? "qq2.0": "weixin";
             uoa.j(str1, mAuthToken, str, 78).map(new e()).subscribe(new o(tb, tc, td), new p(tb, tc, td));
          }
       }
       return;
    }
}
