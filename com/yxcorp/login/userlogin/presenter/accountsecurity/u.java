package com.yxcorp.login.userlogin.presenter.accountsecurity.u;
import com.kwai.framework.accountsecurity.d$a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import java.util.Map;
import com.yxcorp.login.http.response.RiskCheckResponse;
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
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.h0;
import f2d.i0;
import erd.g;
import crd.b;
import java.lang.Throwable;

public class u implements d$a	// class@001bbb
{
    public final Map a;
    public final RiskCheckResponse b;
    public final boolean c;
    public final t d;

    public void u(t p0,Map p1,RiskCheckResponse p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(KeyPair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       String str = String.valueOf(System.currentTimeMillis());
       this.a.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       this.a.put("deviceName", a.j);
       this.a.put("deviceMod", a.j);
       u ta = this.a;
       String str1 = "raw";
       try{
          ta.put(str1, str);
          this.a.put("secret", d.j(p0.getPrivate(), str));
          this.a.put("authToken", this.b.mAuthToken);
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Jh(this.d.n8(R.string.arg_RES_7f103667));
          progressFrag.show(this.d.getActivity().getSupportFragmentManager(), "runner");
          b.a(0x5cfaafff).R(this.a, false).map(new e()).subscribe(new h0(this, progressFrag), new i0(this, this.c, progressFrag));
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
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.d.R8(this.c);
       return;
    }
}
