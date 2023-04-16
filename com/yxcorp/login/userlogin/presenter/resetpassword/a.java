package com.yxcorp.login.userlogin.presenter.resetpassword.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r2d.b;
import erd.g;
import crd.b;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import android.content.Context;
import androidx.core.content.ContextCompat;
import r2d.a;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.login.userlogin.fragment.CaptchaResetPasswordFragment;
import mrd.c;

public class a extends PresenterV2	// class@001bd5
{
    public KwaiActionBar p;
    public TextView q;
    public CaptchaResetPasswordFragment r;
    public c s;
    public boolean t;

    public void a(){
       super();
       this.t = true;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          this.X7(ts.subscribe(new b(this)));
       }
       this.p.e(-1, -1, "");
       this.q.setText(R.string.arg_RES_7f104838);
       this.q.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f0619e8));
       this.q.setOnClickListener(new a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a366d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.t8("KEY_IS_USER_INPUT_PASSWORD_EMPTY");
       return;
    }
}
