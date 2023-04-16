package com.yxcorp.login.userlogin.presenter.accountsecurity.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.accountsecurity.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import f2d.a;
import erd.g;
import crd.b;
import brd.t;
import h3b.a;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import mrd.c;

public class a extends PresenterV2	// class@001ba5
{
    public SlipSwitchButton p;
    public c q;
    public View r;
    public final SlipSwitchButton$b s;

    public void a(){
       super();
       this.s = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.setVisibility(0);
       this.P8();
       a tq = this.q;
       if (tq != null) {
          this.X7(tq.subscribe(new a(this)));
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.p.setEnabled(true);
       this.p.setSwitch(a.i());
       this.p.setOnSwitchChangeListener(this.s);
       return;
    }
    public void R8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       new ClientEvent$ShowEvent().elementPackage = uElementPack;
       uElementPack.action2 = "REMEMBER_LOGIN_INFORMATION_BUTTON";
       i3 oi3 = i3.f();
       String str = (p0)? "OPEN": "CLOSE";
       oi3.d("operation_type", str);
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public void S8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       new ClientEvent$ShowEvent().elementPackage = uElementPack;
       String str = (p0)? "CANCEL_REMOVE_LOGIN_POPUP": "REMOVE_LOGIN_POPUP";
       uElementPack.action2 = str;
       u1.u(1, uElementPack, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a36fb);
       this.p = m1.f(p0, 0x7f0a0077);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.t8("KEY_IS_LOGIN_PAGE_RESUME");
       return;
    }
}
