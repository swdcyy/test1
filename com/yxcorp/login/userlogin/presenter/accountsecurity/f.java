package com.yxcorp.login.userlogin.presenter.accountsecurity.f;
import n3d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import r4d.a;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.n;
import com.yxcorp.login.userlogin.presenter.accountsecurity.h;
import erd.g;
import crd.b;
import java.io.Serializable;
import ekd.j0;
import java.lang.Throwable;
import java.lang.CharSequence;
import e17.i;

public final class f implements a	// class@001baa
{
    public final BindThirdPlatformPresenter b;
    public final a c;

    public void f(BindThirdPlatformPresenter p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 == -1) {
          if (tc.isLogined()) {
             String name = tc.getName();
             String token = tc.getToken();
             String openId = tc.getOpenId();
             if (!PatchProxy.applyVoidThreeRefs(name, token, openId, tb, BindThirdPlatformPresenter.class, "8")) {
                b.a(0x5cfaafff).E(name, token, openId).map(new e()).subscribe(new n(tb, name), new h(tb, name, token, openId));
             }
          }
       }else if(p2 != null){
          String str = "exception";
          if (j0.e(p2, str) != null) {
             i.d(R.style.arg_RES_7f110668, j0.e(p2, str).getMessage());
          }
       }
       return;
    }
}
