package com.yxcorp.login.bind.presenter.v;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.bind.presenter.w;
import java.lang.Object;
import java.security.KeyPair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.System;
import java.security.PrivateKey;
import com.kwai.framework.accountsecurity.d;
import s00.b$b;
import s00.b;
import java.security.PublicKey;
import o56.a;
import z2d.f;
import android.app.Application;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.util.Objects;
import wkd.b;
import m1d.a;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import e1d.g0;
import e1d.f0;
import erd.g;
import crd.b;
import e1d.i0;
import e1d.h0;
import java.lang.Throwable;

public class v implements d$a	// class@001aa0
{
    public final w a;

    public void v(w p0){
       this.a = p0;
       super();
    }
    public void a(KeyPair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String str = String.valueOf(System.currentTimeMillis());
       try{
          hashMap.put("secret", d.j(p0.getPrivate(), str));
       }catch(java.lang.Exception e0){
       }
       e0.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       e0.put("deviceName", a.j);
       e0.put("deviceMod", a.j);
       e0.put("raw", str);
       e0.put("accessCode", f.h());
       e0.put("phoneToken", f.m());
       e0.put("ispType", f.j(a.b()));
       v ta = this.a;
       w q = ta.q;
       int i = 0x5cfaafff;
       if (q != null && q.mFromWhere == 18) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(e0, ta, w.class, "5")) {
             e0.put("platformId", String.valueOf(ta.q.mPlatformId));
             e0.put("platformUserId", ta.q.mPlatformUserId);
             e0.put("authToken", ta.q.mAuthToken);
             e0.put("identityToken", ta.q.mIdentityToken);
             b.a(i).B(e0).map(new e()).subscribe(new g0(ta), new f0(ta));
          }
       }else {
          b.a(i).J(e0).map(new e()).subscribe(new i0(this), new h0(this));
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.a.R8(true, p0);
       return;
    }
}
