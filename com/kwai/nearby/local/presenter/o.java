package com.kwai.nearby.local.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.HomeLocalFragment;
import io.reactivex.subjects.PublishSubject;
import com.kwai.nearby.local.presenter.o$a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kwai.robust.PatchProxyResult;
import vc7.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dd7.r;
import erd.g;
import crd.b;
import eda.l;
import dd7.q;
import com.kwai.nearby.local.presenter.g;
import brd.w;
import erd.h;
import com.kwai.nearby.local.presenter.h;
import erd.r;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import dd7.s;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import kotlin.jvm.internal.a;
import dd7.u;
import com.kwai.nearby.local.presenter.m;
import erd.c;
import com.kwai.nearby.local.presenter.i;
import dd7.v;
import tw5.d;
import dd7.t;
import com.kwai.nearby.local.presenter.n;
import com.kwai.nearby.local.presenter.j;
import dd7.w;
import dd7.x;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import android.view.ViewStub;
import com.kwai.library.widget.specific.misc.ClipWidthView;
import android.widget.TextView;
import android.widget.ImageView;
import csb.b;
import android.view.View$OnClickListener;
import com.kwai.nearby.local.presenter.l;
import lsb.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.kwai.nearby.local.presenter.k;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView$b;
import dd7.p;
import androidx.fragment.app.Fragment;
import xa5.a;
import o1b.b;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.KwaiDynamicRefreshView;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import r17.a;
import android.net.Uri;
import ekd.x0;
import urb.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import qvb.n0;
import sc7.b0;
import xl8.b;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import jrb.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import qvb.q;
import qvb.a;
import ekd.m1;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Set;
import mrd.a;

public class o extends PresenterV2	// class@000fbb
{
    public boolean A;
    public PublishSubject B;
    public TipRefreshView C;
    public q D;
    public Set p;
    public d0 q;
    public b0 r;
    public RecyclerFragment s;
    public d t;
    public a u;
    public b v;
    public final HomeLocalFragment w;
    public final FragmentCompositeLifecycleState x;
    public a y;
    public TipRefreshLayout z;

    public void o(HomeLocalFragment p0){
       super();
       this.B = PublishSubject.g();
       this.D = new o$a(this);
       this.w = p0;
       this.x = new FragmentCompositeLifecycleState(p0);
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoid(null, this, o.class, "5")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new r(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new q(this)));
       g e = Functions.e;
       this.X7(t.combineLatest(this.q.h(), this.x.f(), this.B.hide(), g.a).filter(h.b).delay(1000, TimeUnit.MICROSECONDS, d.c).observeOn(d.a).subscribe(new s(this), e));
       o tq = this.q;
       Objects.requireNonNull(tq);
       t ot = PatchProxy.apply(null, tq, uod0, "8");
       if (ot != patchProxyRe) {
       }else {
          ot = tq.b.hide();
          a.o(ot, "mMigrateTipShowing.hide\(\)");
       }
       this.X7(ot.subscribe(new u(this), e));
       tq = this.q;
       Objects.requireNonNull(tq);
       t ot1 = PatchProxy.apply(null, tq, uod0, "17");
       if (ot1 != patchProxyRe) {
       }else {
          ot1 = tq.g.hide();
          a.o(ot1, "mCityChangeRealTimeRefresh.hide\(\)");
       }
       this.X7(t.combineLatest(ot1, this.x.f(), m.a).filter(i.b).subscribe(new v(this), e));
       this.X7(this.t.a().subscribe(new t(this)));
       this.X7(t.combineLatest(this.q.h(), this.x.f(), n.a).filter(j.b).subscribe(new w(this)));
       this.X7(this.u.hide().subscribe(new x(this), e));
       if (this.getActivity() != null && this.R8(this.getActivity().getIntent())) {
          this.P8(this.getActivity().getIntent(), false);
       }
       return;
    }
    public void F8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       TipRefreshView refreshView = this.z.getRefreshView();
       this.C = refreshView;
       if (!PatchProxy.applyVoidOneRefs(refreshView, this, oo, "4")) {
          Objects.requireNonNull(refreshView);
          if (!PatchProxy.applyVoid(objArray, refreshView, TipRefreshView.class, "2")) {
             View view = refreshView.h.inflate();
             refreshView.e = view.findViewById(0x7f0a3539);
             refreshView.f = view.findViewById(0x7f0a353a);
             ImageView imageView = view.findViewById(R.id.close);
             refreshView.g = imageView;
             imageView.setOnClickListener(new b(refreshView));
          }
          boolean b = true;
          refreshView.setCloseShowAble(b);
          refreshView.setOnCloseClick(l.a);
          refreshView.setRefreshLayout(this.z);
          refreshView.setTipShowListener(k.a);
          this.y = new p(this);
          o tw = this.w;
          boolean b1 = (tw != null && (a.h(tw) && b.a("n")))? true: false;
          o ty = this.y;
          if (!PatchProxy.isSupport(TipRefreshView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), ty, refreshView, TipRefreshView.class, "16")) {
             refreshView = refreshView.d;
             if (refreshView instanceof KwaiDynamicRefreshView) {
                refreshView.setForceDefault((b ^ b1));
                refreshView.setRefreshCompleteListener(ty);
             }
          }
       }
    label_00b5 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "10")) {
          return;
       }
       this.y = null;
       return;
    }
    public final void P8(Intent p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oo, "6")) {
          return;
       }
       Uri data = p0.getData();
       String str = x0.a(data, "cityName");
       String str1 = x0.a(data, "cityId");
       a.a().c = x0.a(data, "linkUrlParams");
       if (!TextUtils.isEmpty(str)) {
          CityInfo uCityInfo = new CityInfo(str1, str);
          if (this.r.isLoading() && (this.r.X2()).equals(uCityInfo.mRoamCityId)) {
             return;
          }else {
             this.t.b(uCityInfo);
             this.r.b3(uCityInfo);
             if (p1) {
                this.v.d(uCityInfo);
                this.r.T1(false);
                this.w.N1();
                this.w.J3(RefreshType.PROGRAM);
             }
          }
       }
       return;
    }
    public final boolean R8(Intent p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          Uri data = p0.getData();
          Object obj1 = PatchProxy.applyTwoRefs(data, "local", null, a.class, "5");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(data == null){
             List pathSegments = data.getPathSegments();
             if (!q.f(pathSegments)) {
                b1 = "local".equals(pathSegments.get(b));
             }
          }
          b1 = false;
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       this.A = false;
       this.B.onNext(Boolean.FALSE);
       this.r.h(this.D);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a3537);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.r8("HOME_LOCAL_PAGE_STATE");
       this.r = this.r8("PAGE_LIST");
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("local_current_city");
       this.p = this.r8("FRAGMENT_SELECT_LISTENER");
       this.u = this.r8("NEARBY_INTERFACE_NEW_INTENT_SUBJECT");
       this.v = this.r8("nearby_header_NEARBY_LIFE_ENTRANCE_UPDATE_SUBJECT");
       return;
    }
}
