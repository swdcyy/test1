package com.yxcorp.login.userlogin.presenter.accountsecurity.p$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.login.userlogin.presenter.accountsecurity.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v0d.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import o1d.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public class p$a extends m	// class@001bb4
{
    public final p c;

    public void p$a(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       if (j.f()) {
          i.d(R.style.arg_RES_7f110669, this.c.getActivity().getString(R.string.arg_RES_7f104a7b));
          return;
       }else {
          ClientContent$ContentPackage uContentPack = this.c.s.Q3();
          Intent intent = null;
          if (!PatchProxy.applyVoidOneRefs(uContentPack, intent, b.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CANCEL_ACCOUNT_BUTTON";
             u1.u(1, uElementPack, uContentPack);
          }
          Activity activity = this.c.getActivity();
          if (activity != null) {
             intent = b.a(0x66dce92a).a(activity, w0.f(this.c.q));
          }
          if (intent != null) {
             activity.startActivity(intent);
          }
          return;
       }
    }
}
