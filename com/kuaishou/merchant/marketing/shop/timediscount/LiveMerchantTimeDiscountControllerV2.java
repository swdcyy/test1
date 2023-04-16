package com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2;
import fa4.a;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$a;
import nsd.u;
import java.lang.String;
import q94.a;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import su.o;
import vu.c;
import y94.c;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;
import java.util.Map;
import q94.j;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Boolean;
import da4.a;
import java.lang.Number;
import android.content.Context;
import ks3.k0;
import ks3.l0;
import fq5.b;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel;
import com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent$a;
import crd.a;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantPendentModel;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$b;

public final class LiveMerchantTimeDiscountControllerV2 implements a	// class@001bff
{
    public String a;
    public a b;
    public LiveMerchantContainerDataList c;
    public ArrayList d;
    public b e;
    public Context f;
    public String g;
    public c h;
    public static final LiveMerchantTimeDiscountControllerV2$a i;

    static {
       LiveMerchantTimeDiscountControllerV2.i = new LiveMerchantTimeDiscountControllerV2$a(null);
    }
    public void LiveMerchantTimeDiscountControllerV2(String p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new LiveMerchantContainerDataList();
       this.d = new ArrayList();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantTimeDiscountControllerV2.class, "9")) {
          return;
       }
       this.g();
       o.c().m("LIVE_WATCH", this.g, this.h);
       return;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTimeDiscountControllerV2.class, "11")) {
          return;
       }
       String str = null;
       String str1 = (p0 != null)? p0.b(): str;
       this.h("removePendantData", str1);
       LiveMerchantTimeDiscountControllerV2 tc = this.c;
       Objects.requireNonNull(tc, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(tc).remove(p0);
       if (p0 != null) {
          LiveMerchantTimeDiscountControllerV2.i.a(j.a(p0, "removeCoupon", this.g));
       }
       MerchantMarketingShopLogBiz lIVE_MERCHAN = MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT;
       if (p0 != null) {
          str = p0.b();
       }
       a.u(lIVE_MERCHAN, "LiveMerchantTimeDiscountController", "sendUpdateToCouponCenter", "activityId", str, "action", "removeCoupon");
       return;
    }
    public LiveMerchantContainerDataList b(){
       boolean b;
       LiveMerchantContainerDataList obj = PatchProxy.apply(null, this, LiveMerchantTimeDiscountControllerV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveMerchantContainerDataList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          Objects.requireNonNull(uoc);
          c obj1 = PatchProxy.apply(null, uoc, c.class, "4");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             obj1 = uoc.b;
             if (obj1 == 1 || obj1 == 2) {
                obj1 = uoc.d;
                if (obj1 != null) {
                   b = obj1.v;
                }
             }
             b = null;
          }
          if (b != null) {
             obj.add(uoc);
          }
       }
       return obj;
    }
    public LiveMerchantContainerDataList c(){
       return this.c;
    }
    public int d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantTimeDiscountControllerV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.indexOf(p0);
    }
    public void e(String p0,Context p1,k0 p2,l0 p3,b p4){
       this.g = p0;
       this.f = p1;
       this.e = p4;
    }
    public final void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTimeDiscountControllerV2.class, "7")) {
          return;
       }
       this.d.add(new LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel(p0, this.b.T3()));
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantTimeDiscountControllerV2.class, "8")) {
          return;
       }
       this.c.clear();
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel timeDiscount = iterator.next();
          Objects.requireNonNull(timeDiscount);
          if (PatchProxy.applyVoid(null, timeDiscount, LiveMerchantTimeDiscountControllerV2$TimeDiscountDiscountModel.class, "3")) {
             continue ;
          }else {
             timeDiscount.a().dispose();
          }
       }
       this.d.clear();
       return;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantTimeDiscountControllerV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.size();
    }
    public final void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantTimeDiscountControllerV2.class, "3")) {
          return;
       }
       a.t(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, this.a, p0, "activity_id", p1);
       return;
    }
    public final c i(LiveMerchantPendentModel p0){
       c obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantTimeDiscountControllerV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          LiveMerchantTimeDiscountControllerV2 te = this.e;
          String str = "mLiveBasicContext";
          if (te == null) {
             a.S(str);
          }
          CDNUrl[] avatars = te.I().getAvatars();
          LiveMerchantTimeDiscountControllerV2 te1 = this.e;
          if (te1 == null) {
             a.S(str);
          }
          obj = new c(new a(p0, avatars, te1.I().getName()));
       }else {
          obj = null;
       }
       return obj;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantTimeDiscountControllerV2.class, "1")) {
          return;
       }
       this.h = new LiveMerchantTimeDiscountControllerV2$b(this);
       o.c().a("LIVE_WATCH", this.g, "timing_activity_pop", this.h);
       return;
    }
}
