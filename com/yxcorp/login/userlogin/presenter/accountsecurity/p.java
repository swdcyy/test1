package com.yxcorp.login.userlogin.presenter.accountsecurity.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mw4.a;
import android.content.SharedPreferences;
import f2d.z;
import erd.g;
import crd.b;
import brd.t;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.yxcorp.login.userlogin.presenter.accountsecurity.p$a;
import android.view.View$OnClickListener;
import ekd.m1;
import mrd.c;
import com.yxcorp.login.userlogin.fragment.LoginFragment;

public class p extends PresenterV2	// class@001bb5
{
    public View p;
    public String q;
    public c r;
    public LoginFragment s;
    public boolean t;

    public void p(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.q = a.a.getString("AccountDestroyUrl", "");
       p tr = this.r;
       if (tr != null) {
          this.X7(tr.subscribe(new z(this)));
       }
       tr = this.p;
       int i = (TextUtils.isEmpty(this.q))? 8: 0;
       tr.setVisibility(i);
       this.p.setOnClickListener(new p$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0aab);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.r = this.t8("KEY_IS_LOGIN_PAGE_RESUME");
       this.s = this.r8("FRAGMENT");
       return;
    }
}
