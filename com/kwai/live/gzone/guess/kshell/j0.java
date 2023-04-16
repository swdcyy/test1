package com.kwai.live.gzone.guess.kshell.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import p57.s1;
import com.kwai.live.gzone.guess.kshell.i0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kwai.live.gzone.guess.kshell.j0$a;
import com.kwai.live.gzone.guess.kshell.j0$b;
import android.view.View$OnClickListener;
import x57.e;
import x57.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import j47.c;
import q57.a;
import com.kwai.live.gzone.guess.kshell.j0$c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.widget.f$b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.guess.kshell.j0$d;
import com.kwai.live.gzone.guess.kshell.j0$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import com.kwai.framework.model.user.QCurrentUser;
import p57.r1;
import n57.a;
import java.lang.Long;
import android.widget.TextView;
import ekd.m1;
import y43.a;

public class j0 extends PresenterV2	// class@000d46
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
    public View y;
    public GzonePagerSlidingTabStrip$e z;

    public void j0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       this.R8();
       a.b(this.q).throttleFirst(2, TimeUnit.SECONDS).subscribe(new s1(this), i0.b);
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new j0$a(this)));
       this.v.setOnClickListener(new j0$b(this));
       if (TextUtils.x(a.a().f())) {
          int i = 8;
          this.v.setVisibility(i);
          this.w.setVisibility(i);
       }else {
          this.v.setVisibility(0);
          this.w.setVisibility(0);
          a.f(this.r.a(), "1", this.s.T2());
       }
       if (this.t != null) {
          this.y.setOnClickListener(new j0$c(this));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j0.class, "11")) {
          return;
       }
       j0 tu = this.u;
       if (tu != null) {
          tu.o();
          this.u = objArray;
       }
       a.a().b("LiveGzoneKshellTopBarPresenter");
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "10")) {
          return;
       }
       f$b uob = new f$b(this.getActivity());
       uob.g0(p0);
       uob.e0(false);
       j0$d uod = new j0$d(this, uob);
       this.u = uod;
       uod.i0(new j0$e(this));
       this.u.Z();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "7")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          this.x.setVisibility(8);
          return;
       }else {
          this.x.setVisibility(0);
          this.S8(a.a().c("LiveGzoneKshellTopBarPresenter", this.r.getLiveStreamId()));
          a.a().a("LiveGzoneKshellTopBarPresenter", new r1(this));
          return;
       }
    }
    public final void S8(long p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj0, "8")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a162e);
       this.p = m1.f(p0, 0x7f0a162a);
       this.v = m1.f(p0, 0x7f0a108d);
       this.w = m1.f(p0, 0x7f0a108e);
       this.x = m1.f(p0, 0x7f0a1631);
       this.y = m1.f(p0, 0x7f0a2bfc);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.q8(c.class);
       this.t = this.s8(a.class);
       return;
    }
}
