package com.kwai.live.gzone.guess.kshell.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p57.h;
import fq5.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.live.gzone.guess.kshell.e0$a;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.live.gzone.guess.kshell.e0$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import p57.x0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import p57.z0;
import erd.g;
import crd.b;
import p57.w0;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import y8c.g;
import com.kwai.library.widget.popup.common.c;
import x57.e;
import x57.a;
import java.lang.Integer;
import ekd.k1;
import u37.d;
import u37.e;
import p57.a1;
import p57.y0;
import erd.a;
import cjd.e;
import erd.o;
import p57.c1;
import p57.b1;
import ekd.m1;
import n57.b;
import j47.c;

public class e0 extends PresenterV2	// class@000d32
{
    public f p;
    public View q;
    public h r;
    public RecyclerView s;
    public b t;
    public c u;
    public b v;
    public final PublishSubject w;
    public a x;
    public PagerSlidingTabStrip$d y;
    public a$a z;

    public void e0(){
       super();
       this.w = PublishSubject.g();
    }
    public void E8(){
       e0 uoe0 = e0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe0, "3")) {
          return;
       }
       this.r = new h(this.v);
       this.s.setLayoutManager(new LinearLayoutManager(this.getContext()));
       this.s.addItemDecoration(new e0$a(this, a1.e(20.00f)));
       this.s.setAdapter(this.r);
       if (this.t == null) {
          return;
       }
       if (this.x != null) {
          e0 ty = this.y;
          if (ty != null) {
             e0$b uob = new e0$b(this, ty.c());
             this.z = uob;
             this.x.e(uob);
             if (this.x.a(this.y.c())) {
                this.z.a(objArray);
             }
          }
       }
       if (!QCurrentUser.me().isLogined() && !PatchProxy.applyVoid(objArray, this, uoe0, "8")) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.k(R.drawable.arg_RES_7f080609);
          uoa.j(2);
          uoa.h(R.string.arg_RES_7f1030ae);
          uoa.e(R.string.arg_RES_7f103059);
          uoa.p(new x0(this));
          uoa.a(c.h(this.s, b.g));
       }
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new z0(this)));
       this.X7(this.w.subscribe(new w0(this.getActivity(), this.s, this.r, this.v.a())));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e0.class, "10")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       e0 tp = this.p;
       if (tp != null) {
          tp.o();
       }
       tp = this.r;
       if (tp != null) {
          tp.z0(this.s);
       }
       this.s.setAdapter(objArray);
       a.a().b("LiveGuessRecommendPresenter");
       this.w.onNext(Integer.valueOf(5));
       k1.n(this);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "4")) {
          return;
       }
       this.X7(e.b().d(this.v.getLiveStreamId()).doOnSubscribe(new a1(this)).doFinally(new y0(this)).map(new e()).subscribe(new c1(this), new b1(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1f80);
       this.q = m1.f(p0, 0x7f0a108d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.v = this.r8("LIVE_BASIC_CONTEXT");
       this.x = this.s8(a.class);
       this.y = this.t8("LIVE_GZONE_TAB");
       this.t = this.s8(b.class);
       this.u = this.q8(c.class);
       return;
    }
}
