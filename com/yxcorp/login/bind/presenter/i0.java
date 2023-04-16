package com.yxcorp.login.bind.presenter.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v0d.l;
import com.yxcorp.login.bind.presenter.i0$a;
import com.yxcorp.login.bind.presenter.i0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mvb.b;
import android.app.Activity;
import com.yxcorp.login.bind.presenter.i0$d;
import android.content.Context;
import mvb.b$b;
import java.lang.Thread;
import com.yxcorp.login.util.o;
import android.widget.EditText;
import e1d.x0;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import java.lang.Integer;
import e17.i;
import java.security.InvalidParameterException;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.login.bind.presenter.i0$b;
import v0d.m$b;
import erd.g;
import sfc.a;
import ekd.m1;

public class i0 extends PresenterV2	// class@001a7b
{
    public l A;
    public m$b B;
    public final g C;
    public TextView p;
    public TextView q;
    public EditText r;
    public EditText s;
    public f t;
    public f u;
    public f v;
    public f w;
    public f x;
    public b y;
    public boolean z;

    public void i0(){
       super();
       this.z = false;
       this.A = new l();
       this.B = new i0$a(this);
       this.C = new i0$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "3")) {
          return;
       }
       i0 tq = this.q;
       boolean b = true;
       if (tq != null) {
          tq.setText(R.string.arg_RES_7f101243);
          this.q.setEnabled(b);
       }
       if (TextUtils.x(this.t.get())) {
          b uob = new b(this.getActivity(), this.u.get(), new i0$d(this));
          this.y = uob;
          uob.start();
       }else {
          this.s.setText(o.a((this.u.get()).replace(this.t.get(), "")));
       }
       this.q.setOnClickListener(new x0(this));
       n.b0(this.getActivity(), this.r, b);
       tq = this.p;
       String str = (TextUtils.x(this.t.get()))? this.n8(R.string.arg_RES_7f103be7): this.t.get();
       tq.setText(str);
       this.P8();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "7")) {
          return;
       }
       i0 ty = this.y;
       if (ty != null) {
          ty.a();
       }
       this.A.a();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "4")) {
          return;
       }
       if (!TextUtils.x(o.b(this.v.get().booleanValue(), this.u.get(), this.s))) {
          this.S8();
       }else {
          this.q.setEnabled(true);
          this.q.setText(R.string.arg_RES_7f101243);
       }
       return;
    }
    public final void R8(String p0,int p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi0, "6")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, p1);
       throw new InvalidParameterException();
    }
    public final void S8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i0.class, "5")) {
          return;
       }
       try{
          if (TextUtils.x(this.t.get())) {
             this.p.setText(this.n8(R.string.arg_RES_7f103be7));
             return;
          }else {
             this.p.setText(this.t.get());
             if (this.z == null) {
                return;
             }else {
                this.R8(this.t.get(), R.string.arg_RES_7f1008f1);
                this.R8(o.b(this.v.get().booleanValue(), this.u.get(), this.s), R.string.arg_RES_7f103be4);
                if (this.w.get().intValue()) {
                   i = this.w.get().intValue();
                }else if(this.x.get().booleanValue()){
                   i = 11;
                }else {
                   i = 6;
                }
                int i1 = i;
                this.A.b(this.getActivity(), i1, this.t.get(), (TextUtils.I(this.u.get())).replace(this.t.get(), ""), this.B, this.C, new i0$b(this), true);
                this.q.setEnabled(false);
             }
          }
       }catch(java.security.InvalidParameterException e0){
          e0.printStackTrace();
          this.q.setEnabled(true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a09b7);
       this.q = m1.f(p0, 0x7f0a43db);
       this.r = m1.f(p0, 0x7f0a43cc);
       this.s = m1.f(p0, 0x7f0a3001);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.t = this.x8("MOBILE_COUNTRY_CODE");
       this.u = this.x8("VERIFY_MOBILE_PHONE_NUMBER");
       this.v = this.x8("VERIFY_NEED_MOBILE");
       this.w = this.x8("VERIFY_MOBILE_TYPE");
       this.x = this.x8("VERIFY_MOBILE_ACCOUNT_SECURITY_VERIFY");
       return;
    }
}
