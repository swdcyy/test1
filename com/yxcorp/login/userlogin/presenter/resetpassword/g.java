package com.yxcorp.login.userlogin.presenter.resetpassword.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
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
import oe6.e;
import android.text.Editable;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import im8.f;
import ekd.m1;
import r2d.j;
import android.view.View$OnClickListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.g$a;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.g$b;
import android.text.TextWatcher;

public class g extends PresenterV2	// class@001bdd
{
    public EditText p;
    public View q;
    public f r;

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          if (this.getActivity() != null) {
             objArray = j0.f(this.getActivity().getIntent(), "mail_account");
          }
          if (!TextUtils.x(objArray)) {
             this.p.setText(objArray);
          }else if(!TextUtils.x(e.B())){
             this.p.setText(e.B());
          }
       }
       og = this.p;
       og.setSelection(TextUtils.G(og).length());
       if (!this.p.getVisibility()) {
          n.b0(this.getContext(), this.p, true);
       }
       this.r.get();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2d15);
       this.q = m1.f(p0, 0x7f0a0744);
       m1.a(p0, new j(this), R.id.clear_layout);
       m1.c(p0, new g$a(this), R.id.name_et);
       m1.e(p0, new g$b(this), R.id.name_et);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.x8("KEY_AFTER_EDIT_TEXT_CHANGED_INVOKER");
       return;
    }
}
