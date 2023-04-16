package com.yxcorp.login.bind.presenter.l0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.yxcorp.login.bind.presenter.j0;
import android.view.View$OnClickListener;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.view.View;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.login.bind.presenter.k0;
import erd.r;
import e1d.a1;
import e1d.y0;
import sfc.a;
import erd.g;
import crd.b;
import android.text.Editable;
import android.widget.EditText;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.content.Intent;
import java.lang.Boolean;
import com.yxcorp.login.util.o;
import oe6.a;
import k1d.i;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import com.yxcorp.login.bind.presenter.l0$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.l0$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class l0 extends PresenterV2	// class@001a85
{
    public f A;
    public f B;
    public PublishSubject C;
    public BaseFragment D;
    public f p;
    public EditText q;
    public EditText r;
    public TextView s;
    public TextView t;
    public f u;
    public f v;
    public f w;
    public f x;
    public f y;
    public f z;

    public void l0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "3")) {
          return;
       }
       this.s.getLayoutParams().width = (int)((float)(n.z(a.B) - a1.e(38.00f)) * 0x3f19999a);
       this.s.setOnClickListener(new j0(this));
       if (!TextUtils.x(this.p.get())) {
          this.s.setText(this.p.get());
       }
       n.b0(this.getActivity(), this.r, true);
       this.X7(this.D.m().filter(k0.b).filter(new a1(this)).subscribe(new y0(this), new a()));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "5")) {
          return;
       }
       l0 ts = this.s;
       boolean b = (!TextUtils.x(this.q.getText()) && !TextUtils.x(this.r.getText()))? true: false;
       ts.setEnabled(b);
       return;
    }
    public void R8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "9")) {
          return;
       }
       ExceptionHandler.handleException(a.B, p0);
       return;
    }
    public void S8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l0.class, "8")) {
          return;
       }
       Intent intent = new Intent();
       intent.putExtra("mobile_code", p1);
       intent.putExtra("country_code", TextUtils.k(this.u.get()));
       String str = "";
       p1 = (TextUtils.x(this.u.get()))? str: (this.u.get()).replace("+", str);
       intent.putExtra("mobile_country_code", p1);
       p1 = o.b(this.w.get().booleanValue(), this.v.get(), this.q);
       if (p1 != null) {
          str = p1.replace(TextUtils.I(this.u.get()), str);
       }
       intent.putExtra("phone_number", str);
       if (!TextUtils.x(str)) {
          a.U(str);
       }
       this.C.onNext(new i(p0, intent));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3001);
       this.r = m1.f(p0, 0x7f0a43cc);
       this.s = m1.f(p0, 0x7f0a43d6);
       this.t = m1.f(p0, 0x7f0a09b7);
       m1.e(p0, new l0$a(this), R.id.phone_et);
       m1.e(p0, new l0$b(this), R.id.verify_et);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       this.p = this.x8("VERIFY_MOBILE_CONFIRM_TEXT");
       this.u = this.x8("MOBILE_COUNTRY_CODE");
       this.v = this.x8("VERIFY_MOBILE_PHONE_NUMBER");
       this.w = this.x8("VERIFY_NEED_MOBILE");
       this.x = this.x8("VERIFY_MOBILE_TYPE");
       this.y = this.x8("VERIFY_MOBILE_NEED_VERIFY");
       this.z = this.x8("VERIFY_MOBILE_ACCOUNT_SECURITY_VERIFY");
       this.A = this.x8("VERIFY_TRUST_DEVICE_TOKEN");
       this.B = this.x8("VERIFY_USER_ID");
       this.C = this.r8("VERIFY_SUCCESS_EVENT");
       this.D = this.r8("FRAGMENT");
       return;
    }
}
