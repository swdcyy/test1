package com.yxcorp.login.bind.presenter.r;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.bind.presenter.s;
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
import wkd.b;
import m1d.a;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import e1d.a0;
import e1d.z;
import erd.g;
import crd.b;
import java.lang.Throwable;

public class r implements d$a	// class@001a9b
{
    public final s a;

    public void r(s p0){
       this.a = p0;
       super();
    }
    public void a(KeyPair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String str = String.valueOf(System.currentTimeMillis());
       try{
          hashMap.put("secret", d.j(p0.getPrivate(), str));
          e0.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
          e0.put("deviceName", a.j);
          e0.put("deviceMod", a.j);
          e0.put("raw", str);
          e0.put("accessCode", f.h());
          e0.put("phoneToken", f.m());
          e0.put("ispType", f.j(a.b()));
          b.a(0x5cfaafff).J(e0).map(new e()).subscribe(new a0(this), new z(this));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.a.R8(true, p0);
       return;
    }
}
