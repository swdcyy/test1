package com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.bind.presenter.l0;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.security.KeyPair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import s00.b$b;
import s00.b;
import java.security.PublicKey;
import o56.a;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.security.PrivateKey;
import com.kwai.framework.accountsecurity.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import h3b.a;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import wkd.b;
import m1d.a;
import brd.t;
import e1d.d1;
import erd.a;
import e1d.f1;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3$a;
import erd.g;
import crd.b;
import cjd.e;
import erd.o;
import com.yxcorp.login.bind.presenter.m0;
import e1d.e1;
import e1d.g1;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3$b;
import java.lang.Throwable;

public class VerifyConfirmButtonPresenter$3 implements d$a	// class@001a60
{
    public final Map a;
    public final String b;
    public final String c;
    public final l0 d;

    public void VerifyConfirmButtonPresenter$3(l0 p0,Map p1,String p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(KeyPair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerifyConfirmButtonPresenter$3.class, "1")) {
          return;
       }
       String str = String.valueOf(System.currentTimeMillis());
       this.a.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       this.a.put("deviceName", a.j);
       this.a.put("deviceMod", a.j);
       this.a.put("raw", str);
       if (!TextUtils.x(this.d.A.get())) {
          this.a.put("verifyTrustDeviceToken", this.d.A.get());
       }
       if (!TextUtils.x(this.d.B.get())) {
          this.a.put("userId", this.d.B.get());
       }
       try{
          this.a.put("secret", d.j(p0.getPrivate(), str));
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Jh(this.d.n8(R.string.arg_RES_7f103667));
          progressFrag.show(this.d.getActivity().getSupportFragmentManager(), "runner");
          int i = q.f(a.l(new VerifyConfirmButtonPresenter$3$1(this).getType())) ^ 0x01;
          int i1 = 0x5cfaafff;
          if (this.d.x.get().intValue() == 199) {
             this.d.X7(b.a(i1).D(this.a).doFinally(new d1(progressFrag)).subscribe(new f1(this, this.b), new VerifyConfirmButtonPresenter$3$a(this)));
          }else if(this.d.x.get().intValue() == 259){
             b.a(i1).f(this.a).map(new e()).subscribe(new m0(this, progressFrag, this.b), new e1(this, progressFrag));
          }else {
             b.a(i1).R(this.a, i).map(new e()).subscribe(new g1(this, this.b, this.c, progressFrag), new VerifyConfirmButtonPresenter$3$b(this, progressFrag));
          }
          return;
       }catch(java.security.InvalidKeyException e5){
       }catch(java.security.NoSuchAlgorithmException e5){
       }catch(java.io.UnsupportedEncodingException e5){
       }catch(java.security.SignatureException e5){
       }
       this.onError(e5);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerifyConfirmButtonPresenter$3.class, "2")) {
          return;
       }
       this.d.R8(p0);
       return;
    }
}
