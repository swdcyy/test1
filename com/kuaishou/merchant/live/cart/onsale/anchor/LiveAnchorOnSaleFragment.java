package com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import hka.a;
import ml8.d;
import c34.a;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import e34.a;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$a;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$b;
import f34.g;
import fs3.g;
import java.lang.Void;
import crd.b;
import d34.c;
import d34.b;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import brd.t;
import brd.x;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.live.cart.onsale.anchor.s;
import com.kuaishou.merchant.live.cart.onsale.anchor.r;
import erd.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import f34.b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Boolean;
import aa0.a;
import android.content.SharedPreferences;
import w24.a;
import q87.c;
import mkc.b;
import mkc.c;
import fs3.f;
import ixc.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import com.kuaishou.merchant.live.cart.onsale.anchor.t;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i34.n0;
import i34.w;
import i34.u;
import f44.f;
import i34.a0;
import i34.m0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import android.os.Parcelable;
import org.parceler.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.basic.util.h;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import f34.e;
import androidx.fragment.app.c$c;
import lnc.b9;
import java.util.List;
import com.trello.rxlifecycle3.components.support.RxFragment;

public class LiveAnchorOnSaleFragment extends MerchantBaseFragment implements a, d, a	// class@001902
{
    public e A;
    public c$a B;
    public View m;
    public View n;
    public PresenterV2 o;
    public c$b p;
    public LiveAnchorOnSaleFragment$c q;
    public b r;
    public b s;
    public a t;
    public e u;
    public g v;
    public u$b w;
    public boolean x;
    public WatchDispatchDrawRecyclerView y;
    public k0 z;
    public static final int C;

    public void LiveAnchorOnSaleFragment(){
       super();
       this.q = new LiveAnchorOnSaleFragment$c();
       this.t = new a();
       this.u = new LiveAnchorOnSaleFragment$a(this);
       this.v = new LiveAnchorOnSaleFragment$b(this);
       this.w = new g(this);
    }
    public static b gh(LiveAnchorOnSaleFragment p0,g p1,Void p2){
       return p0.ih(p1, p2);
    }
    private b ih(g p0,Void p1){
       return b.a().Z0(this.q.b.getLiveStreamId(), p0.i1(), p0.p3()).compose(this.eh()).map(new e()).subscribe(new s(this), new r(this));
    }
    public String C1(){
       return "MERCHANT_ANCHOR_ON_SALE";
    }
    public String D1(){
       return "主播端商品列表页";
    }
    public int M(){
       return 1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "8")) {
          return;
       }
       this.jh();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorOnSaleFragment.class, "2")) {
          return;
       }
       this.m = m1.f(p0, 0x7f0a3f16);
       this.y = m1.f(p0, 0x7f0a399b);
       m1.a(p0, new b(this), R.id.merchant_fragment_layout);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getDispatchDrawObservable();
    }
    public String getPageParams(){
       JsonObject obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("live_streamid", this.q.b.getLiveStreamId());
       obj.c0("author_id", this.q.b.getLiveAuthorId());
       return obj.toString();
    }
    public boolean hh(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("merchant_anchor_show_linkage", true);
    }
    public final void jh(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().A("LiveAnchorOnSaleFragment", "loadCommodityList ", objArray);
       c.h(this.m, b.d);
       b[] uobArray = new b[]{b.g};
       c.d(this.m, uobArray);
       b[] uobArray1 = new b[]{b.i};
       c.d(this.m, uobArray1);
       Object[] objArray1 = new Object[0];
       a.C().w("RequestOrder", "onSale", objArray1);
       this.s = qa.s(c.class, LoadPolicy.DIALOG).Q(new t(this, f.a()));
       return;
    }
    public String o(){
       return "LIVE_PUSH";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorOnSaleFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.o = presenterV2;
       presenterV2.U7(new n0());
       this.o.U7(new w());
       this.o.U7(new u());
       if (this.hh()) {
          this.o.U7(new f());
       }
       this.o.U7(new a0());
       this.o.U7(new m0());
       this.o.f(this.n);
       Object[] objArray = new Object[]{this.q};
       this.o.i(objArray);
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.C().A("LiveAnchorOnSaleFragment", "popBackStackImmediate ", objArray);
       if (!this.isAdded()) {
          return 0;
       }
       if (this.getChildFragmentManager().getBackStackEntryCount() > 0) {
          return this.getChildFragmentManager().popBackStackImmediate();
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorOnSaleFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0.b = b.a(this.getArguments().getParcelable("KEY_LIVE_BASE_CONTEXT"));
       LiveAnchorOnSaleFragment tq = this.q;
       tq.f = this.p;
       tq.e = this;
       tq.g = this.z;
       tq.h = this.A;
       tq.m = this.u;
       tq.n = this.v;
       tq.o = this.w;
       tq.s = this.B;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAnchorOnSaleFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.e(p1, R.layout.arg_RES_7f0d09d3);
       this.n = view;
       this.doBindView(view);
       FragmentActivity activity = this.getActivity();
       View view1 = this.n.findViewById(R.id.fragment_container);
       if (!PatchProxy.applyVoidTwoRefs(activity, view1, null, h.class, "9") && view1 != null) {
          view1.height = h.g(activity);
       }
       boolean b = i.e(this.getActivity());
       this.x = b;
       if (b) {
          this.n.setPadding(0, n.A(this.getContext()), 0, 0);
          i.a(this.getActivity(), 0, true);
       }
       if (!PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "13")) {
          this.getChildFragmentManager().addOnBackStackChangedListener(new e(this));
       }
       b.l = this.y;
       return this.n;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "15")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.r);
       b9.a(this.s);
       LiveAnchorOnSaleFragment to = this.o;
       if (to != null) {
          to.destroy();
          this.o = null;
       }
       to = this.q;
       to.c = null;
       to.k.clear();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "6")) {
          return;
       }
       super.onResume();
       this.a();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorOnSaleFragment.class, "14")) {
          return;
       }
       super.onStop();
       return;
    }
}
