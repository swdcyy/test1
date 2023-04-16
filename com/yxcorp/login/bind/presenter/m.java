package com.yxcorp.login.bind.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b3d.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import e1d.n;
import android.view.View$OnClickListener;
import e1d.o;
import erd.g;
import crd.b;
import brd.t;
import e1d.q;
import java.util.Map;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import wkd.b;
import m1d.a;
import cjd.e;
import erd.o;
import e1d.r;
import com.yxcorp.login.bind.presenter.n;
import e1d.p;
import com.yxcorp.login.bind.presenter.m$b;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import android.text.Editable;
import java.lang.StringBuilder;
import com.yxcorp.login.bind.presenter.m$a;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import com.kwai.framework.accountsecurity.d;
import java.lang.Throwable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import android.view.View;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import e17.i;
import oe6.a;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import ekd.m1;
import mrd.c;

public class m extends PresenterV2	// class@001a8a
{
    public RelativeLayout p;
    public TextView q;
    public EditText r;
    public EditText s;
    public LottieAnimationView t;
    public BindPhoneParams u;
    public c v;
    public c w;
    public boolean x;
    public boolean y;
    public u z;

    public void m(){
       super();
       this.z = new u();
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       this.p.getLayoutParams().width = (int)((float)(n.z(a.B) - a1.e(38.00f)) * 0x3f19999a);
       if (!PatchProxy.applyVoid(objArray, this, om, "4")) {
          this.p.setEnabled(false);
          this.p.setOnClickListener(new n(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "5")) {
          this.v.subscribe(new o(this));
          this.w.subscribe(new q(this));
       }
       return;
    }
    public void P8(Map p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "9")) {
          return;
       }
       if (this.u.mFromWhere == 12) {
          t ot = b.a(0x5cfaafff).m0(p0);
          if (!PatchProxy.applyVoidOneRefs(ot, this, om, "10")) {
             ot.map(new e()).subscribe(new r(this), new n(this));
          }
       }else {
          this.R8(b.a(0x5cfaafff).y(p0));
       }
       return;
    }
    public void R8(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "12")) {
          return;
       }
       p0.map(new e()).subscribe(new p(this), new m$b(this));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       m tp = this.p;
       boolean b = (this.x != null && this.y != null)? true: false;
       tp.setEnabled(b);
       return;
    }
    public final void V8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "7")) {
          this.t.setVisibility(0);
          this.t.setAnimationFromUrl(this.z.b(2));
          this.t.s();
       }
       String str = "";
       String str1 = (this.u.mHasNotification != null)? "tips": str;
       HashMap hashMap = new HashMap();
       hashMap.put("mobileCountryCode", TextUtils.H(this.q).toString());
       hashMap.put("mobile", TextUtils.G(this.s).toString());
       hashMap.put("mobileCode", TextUtils.G(this.r).toString());
       hashMap.put("bindToken", TextUtils.I(this.u.mBindToken));
       hashMap.put("userId", this.u.mUserId+str);
       hashMap.put("act_ref", str1);
       if (this.u.mBindForAccountSecurity != null) {
          d.a(new m$a(this, hashMap));
       }else {
          this.P8(hashMap);
       }
       return;
    }
    public void W8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "13")) {
          return;
       }
       int i = 8;
       this.t.setVisibility(i);
       this.S8();
       b.c("CONFIRM", i, null, p0);
       if (this.s.isFocused()) {
          n.b0(this.getContext(), this.s, true);
          return;
       }else if(this.r.isFocused()){
          n.b0(this.getContext(), this.r, true);
       }
       return;
    }
    public final void X8(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "14")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, this.n8(R.string.arg_RES_7f1003ac));
       this.t.setVisibility(8);
       b.b("CONFIRM", 7, null);
       a.U(TextUtils.G(this.s).toString());
       a.T(TextUtils.H(this.q).toString());
       Intent intent = new Intent();
       if (p0 != null) {
          SerializableHook.putExtra(intent, "LOGIN_USER_RESULT", p0);
       }
       this.getActivity().setResult(-1, intent);
       this.getActivity().finish();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a08fb);
       this.q = m1.f(p0, 0x7f0a09b7);
       this.r = m1.f(p0, 0x7f0a0656);
       this.s = m1.f(p0, 0x7f0a3000);
       this.t = m1.f(p0, 0x7f0a0901);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.u = this.r8("BIND_PHONE_PARAMS");
       this.v = this.r8("KEY_IS_INPUT_PHONE_ELEGAL");
       this.w = this.r8("KEY_IS_USER_INPUT_VERIFY_CODE_EMPTY");
       return;
    }
}
