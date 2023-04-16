package com.yxcorp.login.userlogin.presenter.accountsecurity.t$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import com.yxcorp.login.util.o;
import java.util.Objects;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.f0;
import com.yxcorp.login.userlogin.presenter.accountsecurity.s;
import erd.g;
import crd.b;
import com.yxcorp.login.model.AccountRiskParams;
import com.yxcorp.login.userlogin.presenter.accountsecurity.r;
import n3d.a;
import com.yxcorp.login.userlogin.b;

public class t$a implements SlipSwitchButton$b	// class@001bb9
{
    public final t a;

    public void t$a(t p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       String str;
       t$a ta;
       t ot = t.class;
       t$a uoa = t$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       int i = 0;
       if (!TextUtils.x(a.f())) {
          Object[] objArray = new Object[]{a.e()+o.a(a.f())};
          str = this.a.getActivity().getString(R.string.arg_RES_7f105021, objArray);
       }else {
          str = "";
       }
       if (p1) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, str, ta, ot, "11") && (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, ta, ot, "6"))) {
             b.a(0x5cfaafff).P().map(new e()).subscribe(new f0(ta), new s(ta, i));
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, str, ta, ot, "12")) {
             b.b(ta.getActivity(), new AccountRiskParams(4), new r(ta));
          }
       }
       return;
    }
}
