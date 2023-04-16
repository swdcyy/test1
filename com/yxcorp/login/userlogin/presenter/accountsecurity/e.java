package com.yxcorp.login.userlogin.presenter.accountsecurity.e;
import com.yxcorp.gifshow.widget.m;
import f2d.h;
import android.view.View;
import o1d.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.model.AccountRiskParams;
import com.yxcorp.login.userlogin.presenter.accountsecurity.d;
import n3d.a;
import com.yxcorp.login.userlogin.b;
import java.util.Objects;
import u07.t$a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.c;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.b;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public class e extends m	// class@001ba9
{
    public final h c;

    public void e(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, uob, "7")) {
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "SET_PASSWORD_CLICK";
          double d = (TextUtils.x(a.d()))? 2.00f: 0x3ff0000000000000;
          uElementPack1.value = d;
          u1.u(true, uElementPack1, objArray);
       }
       if (TextUtils.x(a.f()) || TextUtils.x(a.e())) {
          e tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, h.class, "5")) {
             if (!PatchProxy.applyVoid(objArray, objArray, uob, "8")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.value = 3.00f;
                uElementPack.action = 981;
                u1.u0(4, uElementPack, objArray);
             }
             t$a uoa = new t$a(tc.getActivity());
             uoa.X0(tc.n8(R.string.arg_RES_7f1003a7));
             uoa.z0(tc.n8(R.string.arg_RES_7f10501d));
             uoa.R0(tc.n8(R.string.cancel));
             uoa.T0(tc.n8(R.string.arg_RES_7f1012ab));
             uoa.t0(c.b);
             uoa.u0(new b(tc));
             uoa.z(true);
             j.d(uoa);
          }
       }else {
          b.b(this.c.getActivity(), new AccountRiskParams(true), new d(this));
       }
       return;
    }
}
