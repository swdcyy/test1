package com.yxcorp.login.userlogin.presenter.resetpassword.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import oe6.a;
import android.text.Editable;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import mvb.b;
import r2d.f0;
import mvb.b$b;
import java.lang.Thread;
import im8.f;
import r2d.g0;
import erd.g;
import crd.b;
import brd.t;
import android.widget.TextView;
import com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import v0d.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.login.userlogin.presenter.resetpassword.t;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import java.lang.Boolean;
import ekd.m1;
import android.widget.ImageView;
import r2d.c0;
import android.view.View$OnClickListener;
import r2d.d0;
import r2d.e0;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$a;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$b;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$c;
import android.text.TextWatcher;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$d;
import com.yxcorp.login.userlogin.fragment.ResetPasswordByPhoneFragment;
import io.reactivex.subjects.PublishSubject;

public class r extends PresenterV2	// class@001bef
{
    public m A;
    public final g B;
    public EditText p;
    public TextView q;
    public View r;
    public EditText s;
    public View t;
    public TextView u;
    public ImageView v;
    public f w;
    public ResetPasswordByPhoneFragment x;
    public f y;
    public PublishSubject z;

    public void r(){
       super();
       this.B = new r$e(this);
    }
    public void E8(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "3")) {
          return;
       }
       if (this.getActivity() != null) {
          Intent intent = this.getActivity().getIntent();
          objArray = j0.f(intent, "phone_number");
          str = j0.f(intent, "country_code");
       }else {
          str = objArray;
       }
       if (!TextUtils.x(objArray)) {
          this.s.setText(objArray);
       }else if(!TextUtils.x(a.f())){
          this.s.setText(a.f());
       }
       r ts = this.s;
       ts.setSelection(TextUtils.G(ts).length());
       if (!this.s.getVisibility()) {
          n.b0(this.getContext(), this.s, true);
       }
       new b(this.getActivity(), new f0(this, str)).start();
       this.y.get();
       this.R8();
       r tz = this.z;
       if (tz != null) {
          this.X7(tz.subscribe(new g0(this)));
       }
       return;
    }
    public void P8(View p0){
       r or = r.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, or, "5")) {
          return;
       }
       if (p0.getId() == 0x7f0a0744) {
          this.s.setText("");
       }else if(p0.getId() == 0x7f0a43c7){
          this.p.setText("");
       }else if(p0.getId() != 0x7f0a43db || PatchProxy.applyVoid(null, this, or, "9")){
          String str = TextUtils.H(this.u).toString();
          String str1 = TextUtils.G(this.s).toString();
          try{
             int i = 0x7f1008f1;
             ResetPsdFragment.jh(str, i);
             ResetPsdFragment.jh(str1, R.string.arg_RES_7f103be4);
             m om = new m();
             this.A = om;
             t ot = om.c(this.getActivity(), str, str1, 3);
             this.X7(ot.subscribe(this.B, new t(this, this.getContext())));
             this.p.setText("");
             this.q.setEnabled(false);
          }catch(java.security.InvalidParameterException e0){
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       r ts = this.s;
       InputFilter[] inputFilterA = new InputFilter[1];
       int i = (("+86").equals(this.u.getText()))? 11: 15;
       inputFilterA[0] = new InputFilter$LengthFilter(i);
       ts.setFilters(inputFilterA);
       return;
    }
    public void S8(EditText p0,boolean p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, or, "6")) {
          return;
       }
       or = (p0.getId() == 0x7f0a2d15)? this.t: this.r;
       int i = 0;
       boolean b = (p1 && TextUtils.G(p0).length() > 0)? true: false;
       if (!b) {
          i = 8;
       }
       n.Y(or, i, b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a43cc);
       this.q = m1.f(p0, 0x7f0a43db);
       this.r = m1.f(p0, 0x7f0a43c7);
       this.s = m1.f(p0, 0x7f0a2d15);
       this.t = m1.f(p0, 0x7f0a0744);
       this.u = m1.f(p0, 0x7f0a09b7);
       this.v = m1.f(p0, 0x7f0a09b4);
       m1.a(p0, new c0(this), R.id.clear_layout);
       m1.a(p0, new d0(this), R.id.verify_clear_layout);
       m1.a(p0, new e0(this), R.id.verify_tv);
       m1.c(p0, new r$a(this), R.id.name_et);
       m1.c(p0, new r$b(this), R.id.verify_et);
       m1.e(p0, new r$c(this), R.id.name_et);
       m1.e(p0, new r$d(this), R.id.verify_et);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.w = this.x8("LOGIN_PAGE_PARAMS");
       this.x = this.r8("FRAGMENT");
       this.y = this.x8("KEY_AFTER_EDIT_TEXT_CHANGED_INVOKER");
       this.z = this.t8("SELECT_COUNTRY_CODE_RESULT_EVENT");
       return;
    }
}
