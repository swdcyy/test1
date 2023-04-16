package com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f2d.d0;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.framework.accountsecurity.d;
import android.view.View;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Boolean;
import k2b.u1;
import ekd.m1;
import mrd.c;

public class t extends PresenterV2	// class@001bba
{
    public SlipSwitchButton p;
    public c q;
    public final SlipSwitchButton$b r;

    public void t(){
       super();
       this.r = new t$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       this.P8();
       t tq = this.q;
       if (tq != null) {
          this.X7(tq.subscribe(new d0(this)));
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       boolean b = true;
       if (d.c() == b) {
          this.p.setEnabled(b);
          this.p.setSwitch(b);
       }else if(d.c() == -1){
          this.p.setEnabled(b);
          this.p.setSwitch(false);
       }else {
          this.p.setSwitch(false);
          this.p.setEnabled(false);
       }
       this.p.setOnSwitchChangeListener(this.r);
       return;
    }
    public void R8(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "16")) {
          return;
       }
       this.S8(p0);
       u1.I0(37, 7, 12);
       d.i(-1);
       return;
    }
    public final void S8(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "5")) {
          return;
       }
       this.p.setOnSwitchChangeListener(null);
       this.p.setSwitch(p0);
       this.p.setOnSwitchChangeListener(this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3306);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.q = this.t8("KEY_IS_LOGIN_PAGE_RESUME");
       return;
    }
}
