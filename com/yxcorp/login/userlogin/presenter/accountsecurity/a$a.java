package com.yxcorp.login.userlogin.presenter.accountsecurity.a$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.login.userlogin.presenter.accountsecurity.a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e17.i;
import h3b.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f2d.b;
import u07.u;
import f2d.c;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class a$a implements SlipSwitchButton$b	// class@001ba4
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1) {
          this.a.R8(true);
          i.a(R.style.arg_RES_7f11066a, 0x7f100861);
          a.v(true);
       }else {
          a$a ta = this.a;
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, a.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             ta.elementPackage = uElementPack;
             uElementPack.action2 = "REMOVE_LOGIN_POPUP";
             u1.u0(4, uElementPack, objArray);
          }
          this.a.R8(false);
          t$a uoa1 = new t$a(this.a.getActivity());
          uoa1.W0(R.string.arg_RES_7f1007ec);
          uoa1.y0(R.string.arg_RES_7f1038cd);
          uoa1.S0(R.string.arg_RES_7f103a83);
          uoa1.Q0(R.string.cancel);
          uoa1.u0(new b(this));
          uoa1.t0(new c(this, p0));
          uoa1.z(false);
          j.d(uoa1);
       }
       return;
    }
}
