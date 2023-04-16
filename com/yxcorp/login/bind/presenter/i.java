package com.yxcorp.login.bind.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.login.bind.presenter.h;
import crd.b;
import ok.h;
import lnc.b9;
import java.lang.Boolean;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import im8.f;
import ekd.m1;
import android.widget.EditText;
import com.yxcorp.login.bind.presenter.i$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.i$b;
import android.view.View$OnFocusChangeListener;
import io.reactivex.subjects.PublishSubject;
import mrd.c;

public class i extends PresenterV2	// class@001a7c
{
    public EditText p;
    public View q;
    public PublishSubject r;
    public b s;
    public f t;
    public c u;
    public c v;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       n.b0(this.getContext(), this.p, true);
       this.s = b9.c(this.s, new h(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       b9.a(this.s);
       return;
    }
    public void P8(String p0){
       i tu;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       boolean b = true;
       if (this.R8()) {
          tu = this.u;
          if (p0.length() != 11) {
             b = false;
          }
          tu.onNext(Boolean.valueOf(b));
       }else {
          tu = this.u;
          if (!p0.length()) {
             b = false;
          }
          tu.onNext(Boolean.valueOf(b));
       }
       return;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("+86").equals(this.t.get());
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3000);
       this.q = m1.f(p0, 0x7f0a0744);
       m1.e(p0, new i$a(this), R.id.phone_edit);
       m1.c(p0, new i$b(this), R.id.phone_edit);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.r = this.r8("SELECT_COUNTRY_CODE_RESULT_EVENT");
       this.t = this.x8("MOBILE_COUNTRY_CODE");
       this.u = this.t8("KEY_IS_INPUT_PHONE_ELEGAL");
       this.v = this.t8("KEY_IS_USER_INPUT_PHONE_EMPTY");
       return;
    }
}
