package com.yxcorp.login.bind.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.q;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import e17.i;
import okd.b;
import c1d.k;
import android.app.Activity;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import n3d.d;
import e1d.y;
import n3d.a;
import ekd.m1;
import com.yxcorp.login.userlogin.fragment.PhoneOneKeyBindDialog;
import mrd.c;

public class s extends PresenterV2	// class@001a9d
{
    public View p;
    public PhoneOneKeyBindDialog q;
    public BindPhoneParams r;
    public ProgressFragment s;
    public a$c t;
    public View u;
    public c v;

    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new q(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, s.class, "6")) {
          return;
       }
       s ts = this.s;
       if (ts != null) {
          ts.dismiss();
       }
       return;
    }
    public void R8(boolean p0,Throwable p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, os, "5")) {
          return;
       }
       b.c("ONE_CLICK_BIND_CLICK", 8, null, p1);
       this.P8();
       if (p0) {
          i.a(R.style.arg_RES_7f110668, 0x7f103bec);
       }
       b.a(-963936570).init(this.getActivity()).i(this.r).b0(true).K(0).w(new y(this)).h();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a054e);
       this.u = m1.f(p0, 0x7f0a2ea6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("BIND_PHONE_PARAMS");
       this.v = this.t8("KEY_CLICK_PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
