package com.kuaishou.merchant.live.cart.onsale.audience.d;
import k34.n;
import com.kuaishou.merchant.live.cart.onsale.audience.BaseLiveAudienceShopFragment;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import java.util.ArrayList;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import qvb.n0;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$Config;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import java.lang.Long;
import p74.a;
import o74.a;
import d34.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ds3.a;
import android.content.Context;
import lnc.a1;
import ot3.l0;
import cjd.e;
import erd.o;
import brd.x;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import java.lang.Throwable;
import qvb.n0$a;
import java.util.List;
import ds3.l;
import qvb.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import p34.a;
import com.kuaishou.merchant.live.cart.onsale.audience.a$a;

public class d extends n	// class@00193b
{
    public final BaseLiveAudienceShopFragment m;
    public final a n;
    public final List o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public void d(BaseLiveAudienceShopFragment p0,a p1,boolean p2){
       super();
       this.o = new ArrayList();
       this.r = true;
       this.m = p0;
       this.n = p1;
       this.p = p2;
       this.q = p2;
    }
    public boolean B1(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.hasMore();
       return b;
    }
    public t I1(){
       LiveShopPreloadHelper$Config uConfig1;
       LiveShopPreloadHelper$Config uConfig2;
       boolean b = this;
       LiveShopPreloadHelper$Config obj = PatchProxy.apply(null, b, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b1 = false;
       if (this.K() && b.r != null) {
          b.r = b1;
          return t.just(b.n.g);
       }else {
          String str = "";
          String str1 = (this.K())? str: this.L0().mCursor;
          if (!this.K()) {
             str = this.L0().mContext;
          }
          String str2 = str;
          LiveShopPreloadHelper$Config uConfig = null;
          if (this.K()) {
             obj = LiveShopPreloadHelper.f();
             LiveShopPreloadHelper$Config mPreloadEach = obj.mPreloadEachEnable;
             uConfig = obj.mCurrentCacheTime;
             a.u(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveAudienceShopPageList", "refresh shop list", "needCache", Boolean.valueOf(mPreloadEach), "cacheTime", Long.valueOf(uConfig));
             uConfig1 = mPreloadEach;
             uConfig2 = uConfig;
          }else {
             uConfig2 = uConfig;
             uConfig1 = false;
          }
          d n = b.n;
          t ot = a.a().b(uConfig1, uConfig2, b.n.a().getLiveStreamId(), b.n.a().getServerExpTag(), n.b.i, n.a().getFansGroupLevel(), b.n.a().getLivePayload(), str1, str2, "", "", 1, 0, "", "", l0.h(a1.c()), b.n.a().getLiveAuthorId()).map(new e());
          if (b.q != null && this.K()) {
             ot = ot.compose(b.m.Hh());
          }
          return ot;
       }
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.J1(p0);
       a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopPageList", "loadCommodity fail", p0);
       return;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       super.K1(p0);
       if (this.p != null) {
          this.p = false;
          this.a();
       }
       return;
    }
    public void M1(Object p0,List p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "6")) {
       }else {
          this.n.g = p0;
          if (this.K()) {
             if (p0.isCacheResponse == null) {
                a.s(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "LiveAudienceShopPageList", "refresh cache config");
                d tn = this.n;
                LiveShopPreloadHelper.i(tn.b, tn.c);
             }
             if (!PatchProxy.applyVoid(null, this, uod, "7")) {
                this.b.clear();
                this.o.clear();
             }
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "8") && !q.f(p0.mTopArea)) {
                Iterator iterator = p0.mTopArea.iterator();
                while (iterator.hasNext()) {
                   ComponentInfo uComponentIn = iterator.next();
                   if (uComponentIn != null && uComponentIn.isValid()) {
                      this.n.q.a(uComponentIn);
                      p1.add(uComponentIn);
                   }
                }
             }
             if (this.p == null) {
                a r = this.n.r;
                if (r != null) {
                   r.a(p0);
                }
             }
          }
       }
       return;
    }
    public void O1(boolean p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, d.class, "4")) {
          return;
       }
       if (this.K()) {
          this.m.Nh();
       }
       return;
    }
    public List V1(){
       return this.o;
    }
    public boolean isEmpty(){
       return false;
    }
}
