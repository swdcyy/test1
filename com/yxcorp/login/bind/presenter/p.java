package com.yxcorp.login.bind.presenter.p;
import com.yxcorp.login.util.h$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v0d.m;
import com.yxcorp.login.bind.presenter.p$d;
import com.yxcorp.login.bind.presenter.p$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e1d.v;
import erd.g;
import crd.b;
import brd.t;
import e1d.w;
import java.lang.Boolean;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import android.text.Editable;
import android.widget.EditText;
import com.yxcorp.login.bind.presenter.p$c;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import e1d.u;
import android.view.View$OnClickListener;
import e1d.t;
import com.yxcorp.login.bind.presenter.p$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.p$b;
import android.view.View$OnFocusChangeListener;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import mrd.c;
import java.lang.Throwable;
import h3b.b;
import q87.c;

public class p extends PresenterV2 implements h$a	// class@001a97
{
    public boolean A;
    public m$b B;
    public final g C;
    public BindPhoneParams p;
    public EditText q;
    public TextView r;
    public TextView s;
    public EditText t;
    public View u;
    public c v;
    public c w;
    public c x;
    public final m y;
    public boolean z;

    public void p(){
       super();
       this.y = new m();
       this.B = new p$d(this);
       this.C = new p$e(this);
    }
    public void E8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "5")) {
          p tx = this.x;
          if (tx != null) {
             this.X7(tx.subscribe(new v(this)));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "6")) {
          op = this.v;
          if (op != null) {
             this.X7(op.subscribe(new w(this)));
          }
       }
       return;
    }
    public void Hc(boolean p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "11")) {
          return;
       }
       if (p0) {
          this.P8();
       }else {
          this.r.setEnabled(true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.B = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, p.class, "13")) {
          return;
       }
       this.y.c(this.getActivity(), this.s.getText().toString(), this.t.getText().toString(), 2).subscribe(this.C, new p$c(this, this.getContext()));
       this.q.requestFocus();
       n.b0(this.getContext(), this.q, true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0656);
       this.r = m1.f(p0, 0x7f0a0e4a);
       this.s = m1.f(p0, 0x7f0a09b7);
       this.t = m1.f(p0, 0x7f0a3000);
       this.u = m1.f(p0, 0x7f0a0655);
       m1.a(p0, new u(this), R.id.fetch_code_tv);
       m1.a(p0, new t(this), R.id.captcha_clear_layout);
       m1.e(p0, new p$a(this), R.id.captcha_code_et);
       m1.c(p0, new p$b(this), R.id.captcha_code_et);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.r8("BIND_PHONE_PARAMS");
       this.v = this.t8("KEY_IS_INPUT_PHONE_ELEGAL");
       this.w = this.t8("KEY_IS_USER_INPUT_VERIFY_CODE_EMPTY");
       this.x = this.t8("KEY_IS_USER_INPUT_PHONE_EMPTY");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "12")) {
          return;
       }
       this.r.setEnabled(true);
       Object[] objArray = new Object[0];
       b.C().t("BindPhoneRiskCheck", "network error", objArray);
       return;
    }
}
