package com.yxcorp.login.bind.presenter.m$a;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.bind.presenter.m;
import java.util.Map;
import java.lang.Object;
import java.security.KeyPair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import s00.b$b;
import s00.b;
import java.security.PublicKey;
import o56.a;
import java.security.PrivateKey;
import com.kwai.framework.accountsecurity.d;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.util.Objects;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import e1d.s;
import com.yxcorp.login.bind.presenter.o;
import erd.g;
import crd.b;
import java.lang.Throwable;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class m$a implements d$a	// class@001a87
{
    public final Map a;
    public final m b;

    public void m$a(m p0,Map p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(KeyPair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       String str = String.valueOf(System.currentTimeMillis());
       this.a.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       this.a.put("deviceName", a.j);
       this.a.put("deviceMode", a.j);
       m$a ta = this.a;
       String str1 = "raw";
       try{
          ta.put(str1, str);
          this.a.put("secret", d.j(p0.getPrivate(), str));
          m$a tb = this.b;
          m u = tb.u;
          BindPhoneParams mFromWhere = u.mFromWhere;
          if (mFromWhere == 18) {
             this.a.put("platformId", String.valueOf(u.mPlatformId));
             this.a.put("platformUserId", this.b.u.mPlatformUserId);
             this.a.put("authToken", this.b.u.mAuthToken);
             this.a.put("identityToken", this.b.u.mIdentityToken);
             tb = this.b;
             m$a ta1 = this.a;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(ta1, tb, m.class, "11")) {
                b.a(0x5cfaafff).u(ta1).map(new e()).subscribe(new s(tb), new o(tb));
             }
          }else if(mFromWhere == 11){
             tb.R8(b.a(0x5cfaafff).Q(this.a));
          }else {
             tb.P8(this.a);
          }
          return;
       }catch(java.lang.Exception e5){
          this.onError(e5);
          return;
       }
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "2")) {
          return;
       }
       ExceptionHandler.handleException(a.B, p0);
       this.b.W8(p0);
       return;
    }
}
