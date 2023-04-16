package com.kwai.live.gzone.guess.kshell.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import p57.d2;
import com.kwai.live.gzone.guess.kshell.o0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kwai.live.gzone.guess.kshell.p0$a;
import com.kwai.live.gzone.guess.kshell.p0$b;
import android.view.View$OnClickListener;
import x57.e;
import x57.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import j47.c;
import q57.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import p57.c2;
import n57.a;
import java.lang.Long;
import android.widget.TextView;
import ekd.m1;
import y43.a;

public class p0 extends PresenterV2	// class@000d5a
{
    public TextView p;
    public View q;
    public b r;
    public c s;
    public a t;
    public f u;
    public View v;
    public View w;
    public View x;

    public void p0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "3")) {
          return;
       }
       this.P8();
       a.b(this.q).throttleFirst(2, TimeUnit.SECONDS).subscribe(new d2(this), o0.b);
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new p0$a(this)));
       this.v.setOnClickListener(new p0$b(this));
       if (TextUtils.x(a.a().f())) {
          this.v.setVisibility(8);
          this.w.setVisibility(8);
       }else {
          this.v.setVisibility(0);
          this.w.setVisibility(0);
          a.f(this.r.a(), "1", this.s.T2());
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p0.class, "8")) {
          return;
       }
       p0 tu = this.u;
       if (tu != null) {
          tu.o();
          this.u = objArray;
       }
       a.a().b("LiveGzoneKshellTopBarPresenter");
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "4")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          this.x.setVisibility(8);
          return;
       }else {
          this.x.setVisibility(0);
          this.R8(a.a().c("LiveGzoneKshellTopBarPresenter", this.r.getLiveStreamId()));
          a.a().a("LiveGzoneKshellTopBarPresenter", new c2(this));
          return;
       }
    }
    public final void R8(long p0){
       p0 op0 = p0.class;
       if (PatchProxy.isSupport(op0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, op0, "5")) {
          return;
       }
       if (p0 - null >= 0) {
          this.p.setText(String.valueOf(p0));
       }else {
          this.p.setText("");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a162e);
       this.p = m1.f(p0, 0x7f0a162a);
       this.v = m1.f(p0, 0x7f0a108d);
       this.w = m1.f(p0, 0x7f0a108e);
       this.x = m1.f(p0, 0x7f0a1631);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.q8(c.class);
       this.t = this.s8(a.class);
       return;
    }
}
