package com.yxcorp.login.bind.presenter.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.u;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import e17.i;
import okd.b;
import c1d.k;
import android.app.Activity;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import n3d.d;
import e1d.e0;
import n3d.a;
import android.view.View;
import ekd.m1;
import o56.a;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import mrd.c;

public class w extends PresenterV2	// class@001aa1
{
    public TextView p;
    public BindPhoneParams q;
    public ProgressFragment r;
    public a$c s;
    public View t;
    public c u;

    public void w(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new u(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, w.class, "7")) {
          return;
       }
       w tr = this.r;
       if (tr != null && tr.isAdded()) {
          this.r.dismiss();
       }
       return;
    }
    public void R8(boolean p0,Throwable p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ow, "6")) {
          return;
       }
       b.c("ONE_CLICK_BIND", 8, null, p1);
       this.P8();
       if (p0) {
          i.a(R.style.arg_RES_7f110668, 0x7f103bec);
       }
       b.a(-963936570).init(this.getActivity()).i(this.q).b0(true).K(0).w(new e0(this)).h();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2ea6);
       this.p = m1.f(p0, 0x7f0a2ea4);
       this.p.getLayoutParams().width = (int)((float)(n.z(a.B) - a1.e(38.00f)) * 0x3f19999a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       this.u = this.t8("KEY_CLICK_PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
