package com.kuaishou.merchant.transaction.live.orderconfirmpanel.b;
import qvb.n0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper$PagePreLoadConfig;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ik4.a;
import java.util.Map;
import java.util.HashMap;
import android.net.Uri;
import ot3.h0;
import dm4.b;
import ne4.a;
import ekd.x0;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import sa4.a;
import android.util.Pair;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import ta4.b;
import com.kuaishou.merchant.basic.fragment.f;
import ta4.a;
import njd.a;
import brd.t;
import t45.d;
import brd.z;
import lk4.b;
import lk4.a;
import java.lang.Long;
import brd.x;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.d;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import erd.o;
import cjd.e;
import yj4.a;
import erd.g;
import java.lang.Throwable;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.kuaishou.merchant.transaction.base.sku.c;
import rk4.b;
import qvb.a;
import java.util.ArrayList;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.Iterator;
import java.util.Objects;
import kk4.e;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import kk4.i;
import kk4.g;
import com.kuaishou.merchant.basic.model.AddressInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.transaction.base.model.live.CertificatePropInfo;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.util.Collection;
import ekd.q;
import kk4.c;
import kk4.f;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$PromotionCouponRemindInfo;
import com.kuaishou.merchant.transaction.base.model.DistributionSeller;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.j0;

public class b extends n0	// class@0007e8
{
    public MerchantLivePurchasePanelFragment$b m;

    public void b(MerchantLivePurchasePanelFragment$b p0){
       super();
       this.m = p0;
    }
    public boolean B1(Object p0){
       return false;
    }
    public boolean E1(){
       Object obj = PatchProxy.apply(null, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TransactionPreloadConfigHelper.a().mEnableUseCache;
    }
    public Object F1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "27");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          obj = this.m;
          Context context = obj.b.getContext();
          String jumpParams = this.m.f.getJumpParams();
          HashMap hashMap = PatchProxy.applyThreeRefs(obj, context, jumpParams, null, a.class, "1");
          if (hashMap != patchProxyRe) {
          }else {
             hashMap = new HashMap();
             hashMap.put("itemId", h0.a(Uri.parse(obj.x)).get("itemId"));
             hashMap.put("sellerId", h0.a(Uri.parse(obj.x)).get("sellerId"));
             hashMap.put("liveStreamId", h0.a(Uri.parse(obj.x)).get("liveStreamId"));
             hashMap.put("cashierParam", b.a(context));
             hashMap.put("kwaiMerchantCpsTrack", a.d(jumpParams, "kwaiMerchantCpsTrack"));
             hashMap.put("traceTag", a.d(obj.x, "traceTag"));
             hashMap.put("sourceType", x0.b(x0.f(obj.x), "fromType", "0"));
             hashMap.put("notUseCouponTemplateQuote", String.valueOf(false));
             hashMap.put("carrierType", String.valueOf(obj.F));
             hashMap.put("carrierId", obj.G);
          }
          Pair pair = PreloadCache.d.b(new a("/rest/app/kwaishop/product/c/shortcut/buy", hashMap));
          this.m.b.G.h(pair.second);
          pair = pair.first;
          if (pair != null) {
             objArray = pair.b().a();
          }
       }
       return objArray;
    }
    public t I1(){
       Object obj = this;
       b obj1 = PatchProxy.apply(null, obj, b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = obj.m;
       if (obj1.k != null) {
          return t.just(obj1.c).subscribeOn(d.b);
       }
       obj1 = obj.m;
       obj1 = obj.m;
       return a.a().b(obj1.y, obj1.A, obj1.z, a.b("kwaiMerchantCpsTrack", obj1.x, obj1.f), a.d(obj.m.x, "traceTag"), b.a(obj.m.b.getContext()), obj1.B, obj1.D, obj1.F, obj1.G, obj1.H, obj1.E, obj1.P, Long.toString(obj1.O), obj.m.Q).compose(obj.m.b.Hh()).retryWhen(new d(obj.m.b.Ac())).map(new e()).doOnNext(new a(obj));
    }
    public void L1(Throwable p0){
       MerchantLivePurchasePanelFragment$b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.m.T = p0.getMessage();
       b = this.m.b;
       if (b != null) {
          b.a(b.getActivity()).K(this.m.b);
       }
       return;
    }
    public void M1(Object p0,List p1){
       MerchantLivePurchasePanelFragment$b d;
       MerchantLivePurchasePanelFragment$b o;
       Iterator iterator;
       SkuInfo skuInfo;
       g og;
       MerchantLivePurchasePanelResponse mPromotionCo;
       MerchantLivePurchasePanelResponse$ItemInfo mDefaultCert;
       MerchantLivePurchasePanelFragment$b c;
       Object obj = this;
       Object obj1 = p1;
       AddressInfo uAddressInfo = p0;
       if (PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "4")) {
       }else {
          b m = obj.m;
          m.c = uAddressInfo;
          m.S = uAddressInfo.mLoggerInfo;
          uAddressInfo.buildOrderLogParams(m.f, m.x, m.R);
          if (!uAddressInfo.isEmpty()) {
             m = obj.m;
             if (m.C != null) {
                b.a(uAddressInfo, m);
             }
             obj.d(obj1);
             m = obj.m;
             if (m.l == null) {
                m.d.i = uAddressInfo.hasSkuInfo();
                if (uAddressInfo.hasSkuInfo()) {
                   obj.m.d.r(uAddressInfo.mSkuSpecifications, uAddressInfo.mSkuInfos, new ArrayList(), 1);
                }
             }else if(PatchProxy.applyVoidOneRefs(uAddressInfo, obj, b.class, "10") || !obj.m.d.f()){
                SkuInfo skuInfo1 = obj.m.d.b();
                iterator = uAddressInfo.mSkuInfos.iterator();
                while (iterator.hasNext()) {
                   skuInfo = iterator.next();
                   if (!skuInfo.mSkuId - skuInfo1.mSkuId) {
                      d = obj.m.d;
                      Objects.requireNonNull(d);
                      if (!PatchProxy.applyVoidOneRefs(skuInfo, d, c.class, "26") && d.j.isValidSku()) {
                         c j = d.j;
                         j.mOriginalPriceSuffix = skuInfo.mOriginalPriceSuffix;
                         j.mCouponPriceSuffix = skuInfo.mCouponPriceSuffix;
                         j.mSkuShowPrice = skuInfo.mSkuShowPrice;
                         j.mSkuShowCouponPrice = skuInfo.mSkuShowCouponPrice;
                         break ;
                      }
                   }
                }
             }
             if (!PatchProxy.applyVoid(null, obj, b.class, "11")) {
                m = obj.m;
                if (m.e == null) {
                   m.e = new e();
                }
                o = m.e;
                c = m.c;
                MerchantLivePurchasePanelResponse mItemInfo = c.mItemInfo;
                o.b = mItemInfo.mTitle;
                o.a = m.n ^ 1;
                o.c = c.mMoreInfo;
                o.d = mItemInfo.mShowIconListV2;
                if (m.i == null) {
                   m.i = new i();
                }
                d = m.i;
                d.a = c.mBottomTip;
                d.b = c.mItemSaleStatus;
             }
             obj.m.p = p1.size();
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "21") && uAddressInfo.mCrossBorderInfo != null) {
                og = new g();
                og.a = 14;
                og.b = uAddressInfo.mCrossBorderInfo;
                og.c = 0;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "6") && uAddressInfo.mOffShoreInfo != null) {
                og = new g();
                og.a = 18;
                og.b = uAddressInfo.mOffShoreInfo;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "20")) {
                og = new g();
                og.a = 5;
                if (uAddressInfo.mAddressInfo == null) {
                   uAddressInfo.mAddressInfo = new AddressInfo();
                }
                og.b = uAddressInfo.mAddressInfo;
                og.c = 0;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "22") && uAddressInfo.mUpgradeAddressGuideModel != null) {
                og = new g();
                og.a = 19;
                og.b = uAddressInfo.mUpgradeAddressGuideModel;
                og.c = 0;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, b.class, "23")) {
                og = new g();
                og.a = 15;
                og.b = "";
                og.c = 0;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "12")) {
                og = new g();
                og.a = 1;
                OrderConfirmCommodity orderConfirm = uAddressInfo.retrieveToCommodity();
                og.b = orderConfirm;
                obj.m.q = orderConfirm;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "5") && uAddressInfo.mPayStatusInfo != null) {
                og = new g();
                og.a = 17;
                og.b = uAddressInfo.mPayStatusInfo;
                og.c = 0;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "13")) {
                og = new g();
                og.a = 2;
                mPromotionCo = uAddressInfo.mItemInfo;
                if (mPromotionCo != null) {
                   mDefaultCert = mPromotionCo.mDefaultCertificateProp;
                   if (mDefaultCert != null) {
                   label_0202 :
                      og.b = mDefaultCert;
                      og.c = 0;
                      obj1.add(og);
                   }
                }
                mDefaultCert = new CertificatePropInfo();
                goto label_0202 ;
             }
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, b.class, "14")) {
                Iterator iterator1 = obj.m.d.d().iterator();
                while (iterator1.hasNext()) {
                   g og1 = new g();
                   og1.a = 3;
                   og1.b = iterator1.next();
                   obj1.add(og1);
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "28") && !q.f(uAddressInfo.mItemCategoryProps)) {
                og = new g();
                og.a = 8;
                og.b = new c(uAddressInfo.mItemCategoryProps);
                obj1.add(og);
             }
             boolean i = 0;
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "17")) {
                og = new g();
                og.a = 10;
                f uof = PatchProxy.applyOneRefs(uAddressInfo, obj, b.class, "18");
                if (uof != PatchProxyResult.class) {
                }else {
                   uof = new f();
                   if (uAddressInfo.mCarModelInfo != null) {
                      uof.mBottomMargin = i;
                   }
                }
                og.b = uof;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "19") && uAddressInfo.mCarModelInfo != null) {
                og = new g();
                og.a = 20;
                og.b = uAddressInfo.mCarModelInfo;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "7") && (PatchProxy.isSupport(b.class) && (!PatchProxy.applyVoidThreeRefs(uAddressInfo, p1, Integer.valueOf(1), this, b.class, "8") && uAddressInfo.mPromotionCouponRemindInfo != null))) {
                og = new g();
                mPromotionCo = uAddressInfo.mPromotionCouponRemindInfo;
                mPromotionCo.mLocationType = 1;
                og.a = 13;
                og.b = mPromotionCo;
                og.c = 0;
                obj1.add(og);
             }
          label_02ea :
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "24") && uAddressInfo.mFreightInsuranceModel != null) {
                og = new g();
                og.a = 6;
                og.b = uAddressInfo.mFreightInsuranceModel;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "25") && !q.f(uAddressInfo.mPaymentMethodInfos)) {
                og = new g();
                og.a = 7;
                og.b = uAddressInfo.mPaymentMethodInfos;
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, b.class, "15")) {
                og = new g();
                og.a = 4;
                og.b = "";
                obj1.add(og);
             }
             if (!PatchProxy.applyVoidTwoRefs(uAddressInfo, obj1, obj, b.class, "16")) {
                MerchantLivePurchasePanelResponse mDistributio = uAddressInfo.mDistributionSeller;
                if (mDistributio != null && !TextUtils.x(mDistributio.desc)) {
                   og = new g();
                   og.a = 16;
                   og.b = uAddressInfo.mDistributionSeller;
                   obj1.add(og);
                }
             }
             if (!PatchProxy.applyVoid(null, obj, b.class, "9")) {
                m = obj.m;
                o = m.d;
                OrderConfirmCommodity mSpikeInfo = m.q.mSpikeInfo;
                i = (mSpikeInfo != null && mSpikeInfo.mSoldStatus != 1)? true: false;
                o.j(i);
             }
             m = obj.m;
             if (m.C != null) {
                b m1 = obj.m;
                b.a(m.b.getActivity()).P(m1.b, m1.f.getLiveStreamPackage(), obj.m.c);
                m = obj.m;
                m.C = false;
                d = m.d;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(null, d, c.class, "6")) {
                   iterator = d.e.iterator();
                   while (iterator.hasNext()) {
                      skuInfo = iterator.next();
                      if (skuInfo.mSelected != null) {
                         d.k(skuInfo, 1, 1);
                         break ;
                      }
                   }
                }
             }
             obj.m.b.a();
             m = obj.m;
             if (m != null) {
                o = m.O;
                if (o > 0) {
                   m.d.n(Long.valueOf(o), 1);
                   obj.m.O = 0;
                }
             }
          }
       }
       return;
    }
    public void O1(boolean p0){
       MerchantLivePurchasePanelFragment$b b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       b = this.m.b;
       if (b != null) {
          b.a(b.getActivity()).K(this.m.b);
       }
       return;
    }
    public boolean P1(){
       return true;
    }
}
