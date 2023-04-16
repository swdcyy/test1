package com.yxcorp.login.userlogin.presenter.phoneverify.PhoneVerifyCodeViewPresenter$4;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
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
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.login.userlogin.presenter.phoneverify.PhoneVerifyCodeViewPresenter$4$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import h3b.a;
import java.util.Collection;
import ekd.q;
import java.security.PrivateKey;
import com.kwai.framework.accountsecurity.d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import p2d.d;
import p2d.c;
import erd.g;
import crd.b;
import java.lang.Throwable;

public class PhoneVerifyCodeViewPresenter$4 implements d$a	// class@001bcc
{
    public final Map a;
    public final String b;
    public final String c;
    public final c d;

    public void PhoneVerifyCodeViewPresenter$4(c p0,Map p1,String p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(KeyPair p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneVerifyCodeViewPresenter$4.class, "1")) {
          return;
       }
       String str = String.valueOf(System.currentTimeMillis());
       this.a.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       this.a.put("deviceName", a.j);
       this.a.put("deviceMod", a.j);
       this.a.put("raw", str);
       if (!TextUtils.x(this.d.x.get())) {
          this.a.put("verifyTrustDeviceToken", this.d.x.get());
       }
       PhoneVerifyCodeViewPresenter$4 td = this.d;
       int i = td.A.get().intValue();
       Objects.requireNonNull(td);
       PhoneVerifyCodeViewPresenter$4$1 u4$1 = (i != 5 && (i != 3 && (i == 4 || i == 6)))? 1: null;
       b = (u4$1 && !q.f(a.l(new PhoneVerifyCodeViewPresenter$4$1(this).getType())))? true: false;
       if (!TextUtils.x(this.d.y.get())) {
          this.a.put("userId", this.d.y.get());
       }
       try{
          this.a.put("secret", d.j(p0.getPrivate(), str));
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Jh(this.d.n8(R.string.arg_RES_7f103667));
          progressFrag.show(this.d.getActivity().getSupportFragmentManager(), "runner");
          d uod = new d(this, b, this.b, this.c, progressFrag);
          b.a(0x5cfaafff).R(this.a, b).map(new e()).subscribe(u4$1, new c(this, progressFrag));
          return;
       }catch(java.security.InvalidKeyException e12){
       }catch(java.security.NoSuchAlgorithmException e12){
       }catch(java.io.UnsupportedEncodingException e12){
       }catch(java.security.SignatureException e12){
       }
       this.onError(e12);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneVerifyCodeViewPresenter$4.class, "2")) {
          return;
       }
       this.d.V8(p0);
       return;
    }
}
