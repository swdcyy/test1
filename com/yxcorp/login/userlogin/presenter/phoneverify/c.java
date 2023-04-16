package com.yxcorp.login.userlogin.presenter.phoneverify.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v0d.l;
import com.yxcorp.login.userlogin.presenter.phoneverify.c$a;
import com.yxcorp.login.userlogin.presenter.phoneverify.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Context;
import com.yxcorp.utility.n;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mvb.b;
import com.yxcorp.login.userlogin.presenter.phoneverify.c$c;
import mvb.b$b;
import java.lang.Thread;
import com.yxcorp.login.userlogin.presenter.phoneverify.a;
import com.kwai.library.widget.edittext.VerificationCodeView$c;
import com.kwai.library.widget.edittext.VerificationCodeView;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.login.userlogin.presenter.phoneverify.b;
import v0d.m$b;
import erd.g;
import sfc.a;
import android.widget.TextView;
import java.security.InvalidParameterException;
import e17.i;
import q2b.h$b;
import k2b.u1;
import java.lang.Throwable;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.content.Intent;
import oe6.a;
import k1d.i;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import p2d.a;
import android.view.View$OnClickListener;

public class c extends PresenterV2	// class@001bd2
{
    public f A;
    public b B;
    public l C;
    public m$b D;
    public final g E;
    public VerificationCodeView p;
    public TextView q;
    public f r;
    public f s;
    public f t;
    public f u;
    public f v;
    public f w;
    public f x;
    public f y;
    public PublishSubject z;

    public void c(){
       super();
       this.C = new l();
       this.D = new c$a(this);
       this.E = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       n.a0(this.getActivity(), this.p.getChildAt(0), 50);
       if (TextUtils.x(this.r.get())) {
          b uob = new b(this.getActivity(), this.s.get(), new c$c(this));
          this.B = uob;
          uob.start();
       }else {
          this.P8();
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.p.setOnCodeFinishListener(new a(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       c tB = this.B;
       if (tB != null) {
          tB.a();
       }
       this.C.a();
       return;
    }
    public void P8(){
       int i;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       if (!TextUtils.x(this.s.get())) {
          try{
             if (!PatchProxy.applyVoid(objArray, this, uoc, "6") && !TextUtils.x(this.r.get())) {
                this.R8(this.r.get(), R.string.arg_RES_7f1008f1);
                String str = this.s.get();
                this.R8(str, R.string.arg_RES_7f103be4);
                if (this.u.get().intValue()) {
                   i = this.u.get().intValue();
                }else if(this.v.get().booleanValue()){
                   i = 11;
                }else {
                   i = 6;
                }
                this.C.b(this.getActivity(), i, this.r.get(), str.replace(this.r.get(), ""), this.D, this.E, new b(this), true);
                this.q.setEnabled(false);
             }
          }catch(java.security.InvalidParameterException e0){
             e0.printStackTrace();
             this.q.setEnabled(true);
          }
       }else {
          this.q.setEnabled(true);
          this.q.setText(R.string.arg_RES_7f1042b2);
       }
    }
    public final void R8(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "7")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, p1);
       throw new InvalidParameterException();
    }
    public final void S8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "16")) {
          return;
       }
       u1.r0(h$b.e(p0, "INPUT_SMS_AUTHENTICATION_CODE"));
       return;
    }
    public void V8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       this.S8(8);
       ExceptionHandler.handleException(a.B, p0);
       this.getActivity().setResult(-2);
       return;
    }
    public void W8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "12")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.S8(7);
       }
       Intent intent = new Intent();
       intent.putExtra("mobile_code", p1);
       intent.putExtra("country_code", TextUtils.k(this.r.get()));
       String str = "";
       p1 = (TextUtils.x(this.r.get()))? str: (this.r.get()).replace("+", str);
       intent.putExtra("mobile_country_code", p1);
       p1 = this.s.get();
       if (p1 != null) {
          str = p1.replace(TextUtils.I(this.r.get()), str);
       }
       intent.putExtra("phone_number", str);
       if (!TextUtils.x(str)) {
          a.U(str);
          a.T(TextUtils.I(this.r.get()));
       }
       this.z.onNext(new i(p0, intent));
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a43c8);
       this.q = m1.f(p0, 0x7f0a43ca);
       m1.a(p0, new a(this), R.id.verify_code_resend);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.x8("MOBILE_COUNTRY_CODE");
       this.s = this.x8("VERIFY_MOBILE_PHONE_NUMBER");
       this.t = this.x8("VERIFY_NEED_MOBILE");
       this.u = this.x8("VERIFY_MOBILE_TYPE");
       this.v = this.x8("VERIFY_MOBILE_ACCOUNT_SECURITY_VERIFY");
       this.w = this.x8("VERIFY_MOBILE_NEED_VERIFY");
       this.x = this.x8("VERIFY_TRUST_DEVICE_TOKEN");
       this.y = this.x8("VERIFY_USER_ID");
       this.z = this.r8("VERIFY_SUCCESS_EVENT");
       this.A = this.x8("VERIFY_ACCOUNT_FROM");
       return;
    }
}
