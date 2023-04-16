package com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;
import android.content.DialogInterface$OnKeyListener;
import ml8.d;
import com.yxcorp.login.bind.fragment.VerifyFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import e1d.u0;
import com.yxcorp.login.bind.presenter.q0;
import e1d.m1;
import com.yxcorp.login.bind.presenter.p0;
import com.yxcorp.login.bind.presenter.i0;
import com.yxcorp.login.bind.presenter.l0;
import com.yxcorp.login.bind.presenter.s0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oe6.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.SwipeLayout;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.Intent;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment$c;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment$a;
import com.yxcorp.gifshow.widget.SwipeLayout$b;

public class WebViewChangeVerifyFragment extends VerifyFragment implements DialogInterface$OnKeyListener, d	// class@001a59
{
    public SwipeLayout D;
    public boolean E;
    public WebViewChangeVerifyFragment$c F;
    public WebViewChangeVerifyFragment$b G;

    public void WebViewChangeVerifyFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, WebViewChangeVerifyFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new u0());
       obj.U7(new q0());
       obj.U7(new m1());
       obj.U7(new p0());
       obj.U7(new i0());
       obj.U7(new l0());
       obj.U7(new s0());
       PatchProxy.onMethodExit(WebViewChangeVerifyFragment.class, "4");
       return obj;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, WebViewChangeVerifyFragment.class, "1")) {
          return;
       }
       if (this.getArguments() != null) {
          this.s = this.getArguments().getString("title");
          boolean b = false;
          this.q = this.getArguments().getBoolean("showResetMobileLink", b);
          String str = "phone_number";
          String str1 = (TextUtils.x(this.getArguments().getString(str)))? a.f(): this.getArguments().getString(str);
          this.l = str1;
          str = "country_code";
          str1 = (TextUtils.x(this.getArguments().getString(str)))? a.e(): this.getArguments().getString(str);
          this.k = str1;
          this.m = this.getArguments().getString("prompt");
          this.n = this.getArguments().getBoolean("mAccountSecurityVerify", b);
          this.o = this.getArguments().getBoolean("need_mobile", b);
          this.t = this.getArguments().getString("submit_text");
          this.E = this.getArguments().getBoolean("pop_back_submit", b);
          this.r = this.getArguments().getInt("type", b);
          this.p = this.getArguments().getBoolean("need_verify", true);
          this.u = this.getArguments().getString("verify_trust_device_token");
          this.v = this.getArguments().getString("verify_user_id");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewChangeVerifyFragment.class, "2")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a3c36);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WebViewChangeVerifyFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(WebViewChangeVerifyFragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, WebViewChangeVerifyFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.i(p1, R.layout.arg_RES_7f0d1659);
       this.doBindView(view);
       return view;
    }
    public boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(WebViewChangeVerifyFragment.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, WebViewChangeVerifyFragment.class, "8");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (this.F != null && (4 == p1 && p2.getAction() == 1)) {
          Intent intent = new Intent();
          intent.putExtra("changeVerifyResult", 0);
          this.F.a(intent);
       }
    label_0040 :
       return 0;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewChangeVerifyFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.D.setOnSwipedListener(new WebViewChangeVerifyFragment$a(this));
       return;
    }
}
