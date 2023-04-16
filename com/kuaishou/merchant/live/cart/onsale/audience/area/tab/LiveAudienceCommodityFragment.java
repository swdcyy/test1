package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.BaseLiveAudienceShopFragment;
import java.lang.System;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k34.p;
import k34.s;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import m34.a;
import androidx.recyclerview.widget.RecyclerView;
import k34.n;
import com.kuaishou.merchant.base.rmc.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import xm4.a;
import e44.f;
import java.lang.Boolean;
import ds3.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f44.a;
import c44.a;
import d44.i;
import androidx.fragment.app.Fragment;
import g9c.d;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Map;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ds3.a;
import k2b.e0;
import e34.b;
import java.util.Objects;
import crd.b;
import lnc.b9;
import y8c.g;
import com.kuaishou.merchant.live.cart.onsale.audience.c;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;

public class LiveAudienceCommodityFragment extends BaseLiveAudienceShopFragment	// class@001925
{
    public final long I;
    public PresenterV2 J;
    public s K;
    public TabInfo L;
    public final a M;
    public static final int N;

    public void LiveAudienceCommodityFragment(){
       super();
       this.I = System.currentTimeMillis();
       this.M = new a();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p(this);
    }
    public String C1(){
       return "MERCHANT_AUDIENCE_ON_SALE";
    }
    public String D1(){
       return "观众端商品列表页";
    }
    public void Mh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCommodityFragment.class, "17")) {
          return;
       }
       if (this.K == null) {
          this.K = new s();
       }
       this.K.c(p0, this.q(), this.h0());
       return;
    }
    public void Nh(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCommodityFragment.class, "14")) {
          return;
       }
       a p = this.M.p;
       if (p != null) {
          p.a();
       }
       LiveAudienceCommodityFragment tJ = this.J;
       if (tJ != null && tJ.R1()) {
          this.J.i(this.fg().toArray());
       }
       return;
    }
    public boolean S1(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceCommodityFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d0dc0, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.M);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceCommodityFragment.class, "7")) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.J = presenterV2;
       presenterV2.U7(new f());
       Object obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "15");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): TextUtils.x(this.M.c.k) ^ 0x01;
       if (b) {
          this.J.U7(new a());
       }
       this.J.U7(new a());
       this.J.U7(new i(this));
       this.J.f(p0);
       super.fh(p0, p1);
       this.ia().S0(this.h0(), new LiveAudienceCommodityFragment$a(this));
       this.h0().addItemDecoration(new LiveAudienceCommodityFragment$b(this));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0dc0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceCommodityFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceCommodityFragment.class, null);
       return objectsByTag;
    }
    public boolean lh(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceCommodityFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0.e = this;
       return;
    }
    public void onDestroyView(){
       a p;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceCommodityFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       LiveAudienceCommodityFragment tJ = this.J;
       if (tJ != null) {
          tJ.destroy();
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceCommodityFragment.class, "16") && this.L.mCurrent != null) {
          p = this.q();
          p = (p != null)? p.o: objArray;
          LiveAudienceCommodityFragment tM = this.M;
          a b = tM.b;
          b.u(this.M.a(), p, b.j, b.g, tM.c.h);
       }
       p = this.M.p;
       if (p != null) {
          p.b();
       }
       tJ = this.K;
       if (tJ != null) {
          Objects.requireNonNull(tJ);
          if (!PatchProxy.applyVoid(objArray, tJ, s.class, "5")) {
             tJ.a();
             b9.a(tJ.d);
          }
       }
       return;
    }
    public int qh(){
       return 0x7f0a399b;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCommodityFragment.class, "5")) {
          return;
       }
       super.th();
       this.M.h = this.h0();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.M);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GridLayoutManager(this.getContext(), 2);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCommodityFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.M, this.L);
    }
}
