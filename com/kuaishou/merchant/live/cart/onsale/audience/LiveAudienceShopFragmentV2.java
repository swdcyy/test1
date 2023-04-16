package com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopFragmentV2;
import com.kuaishou.merchant.live.cart.onsale.audience.BaseLiveAudienceShopFragment;
import java.lang.System;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k34.u;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import ds3.a;
import k2b.e0;
import java.lang.Number;
import com.kuaishou.merchant.live.cart.onsale.audience.a$b;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import e34.b;
import java.lang.Boolean;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import xm4.a;
import e44.f;
import e44.d;
import n34.i;
import l34.b;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import l34.a;
import b44.a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter;
import java.util.Map;
import lnc.i3;
import java.lang.Integer;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import o34.h;
import p34.a;
import java.util.UUID;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import o34.f;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import y8c.g;
import com.kuaishou.merchant.live.cart.onsale.audience.c;
import qvb.i;
import com.kuaishou.merchant.live.cart.onsale.audience.d;

public class LiveAudienceShopFragmentV2 extends BaseLiveAudienceShopFragment	// class@00191a
{
    public final long I;
    public PresenterV2 J;
    public boolean K;
    public boolean L;
    public String M;
    public final a N;
    public static final int O;

    public void LiveAudienceShopFragmentV2(){
       super();
       this.I = System.currentTimeMillis();
       this.K = false;
       this.N = new a();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new u(this.h0(), this.S1(), this.ia());
    }
    public String C1(){
       return "MERCHANT_AUDIENCE_ON_SALE";
    }
    public String D1(){
       return "观众端商品列表页";
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveAudienceShopFragmentV2.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Oh()) {
          objArray = this.N.b.g.I1();
       }
       return objArray;
    }
    public ClientEvent$ExpTagTrans K5(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveAudienceShopFragmentV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Oh()) {
          objArray = this.N.b.g.K5();
       }
       return objArray;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Oh();
    }
    public void Mh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopFragmentV2.class, "25")) {
          return;
       }
       a l = this.N.l;
       if (l != null) {
          l.a(p0);
       }
       return;
    }
    public void Nh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceShopFragmentV2.class, "21")) {
          return;
       }
       a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopFragmentV2", "bindCommonPresenter");
       LiveAudienceShopFragmentV2 tJ = this.J;
       if (tJ != null && (tJ.R1() && !this.J.y8())) {
          this.J.i(this.fg().toArray());
       }
    label_0034 :
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceShopFragmentV2.class, "24") && !a.t().d("disableYellowCartOldPV", true)) {
          a g = this.N.g;
          if (g != null && !q.f(g.mItemListArea)) {
             b.l(this.N.a(), this.N.b.g);
          }
       }
       return;
    }
    public final boolean Oh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableYellowCartNewPageShow", true);
    }
    public boolean S1(){
       return false;
    }
    public boolean eg(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Oh();
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceShopFragmentV2.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d0dc1, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.N);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShopFragmentV2.class, "7")) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.J = presenterV2;
       presenterV2.U7(new f());
       this.J.U7(new d());
       this.J.U7(new i());
       this.J.U7(new b());
       this.J.U7(new a());
       this.J.U7(new a());
       this.J.U7(new a());
       this.J.U7(new LiveAudienceShopPreloadPresenter());
       this.J.f(p0);
       super.fh(p0, p1);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0dc1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceShopFragmentV2.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceShopFragmentV2.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.Oh()) {
          return "";
       }
       obj = i3.f();
       obj.d("author_id", this.N.a().getLiveAuthorId());
       obj.d("live_id", this.N.a().getLiveStreamId());
       obj.d("server_exp_tag", this.N.a().getServerExpTag());
       obj.c("carrier_type", Integer.valueOf(2));
       obj.d("carrier_id", this.N.a().getLiveStreamId());
       return obj.e();
    }
    public String h5(){
       String str;
       LiveAudienceShopFragmentV2 obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.Oh())? this.M: "";
       return obj;
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.Oh())? "MERCHANT_LIVE_SMALL_CART_GOODS_LIST_SUBPAGE": "";
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopFragmentV2.class, "2")) {
          return;
       }
       super.onCreate(p0);
       LiveAudienceShopFragmentV2 tN = this.N;
       tN.e = this;
       tN.m = new h();
       tN.q = new a();
       tN = this.N;
       e0 uoe0 = (this.Oh())? this: this.N.b.g;
       tN.n = uoe0;
       this.M = UUID.randomUUID().toString();
       b.p(this.F);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopFragmentV2.class, "6")) {
          return;
       }
       super.onDestroyView();
       LiveShopPreloadHelper.h(this.C1());
       LiveAudienceShopFragmentV2 tJ = this.J;
       if (tJ != null) {
          tJ.destroy();
       }
       if (!PatchProxy.applyVoid(null, this, LiveAudienceShopFragmentV2.class, "23")) {
          b.k(this.N.a(), (System.currentTimeMillis() - this.I), this.N.b.g);
       }
       this.N.m.release();
       if (this.Oh()) {
          b.a(0x4b316083).X(this.o(), this.M);
       }
       this.M = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopFragmentV2.class, "3")) {
          return;
       }
       super.onResume();
       if (this.K == null) {
          b.q(this.F);
          this.K = true;
       }
       return;
    }
    public int qh(){
       return 0x7f0a399c;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopFragmentV2.class, "5")) {
          return;
       }
       super.th();
       this.N.h = this.h0();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.N);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceShopFragmentV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this, this.N, this.L);
    }
}
