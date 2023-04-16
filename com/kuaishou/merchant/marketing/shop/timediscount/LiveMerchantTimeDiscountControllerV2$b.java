package com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2$b;
import vu.c;
import com.kuaishou.merchant.marketing.shop.timediscount.LiveMerchantTimeDiscountControllerV2;
import java.lang.Object;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import vu.b;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import fq5.b;
import d84.c;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantPendentModel;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import y94.c;
import java.util.Collection;
import q94.a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBaseLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;

public final class LiveMerchantTimeDiscountControllerV2$b implements c	// class@001bfe
{
    public final LiveMerchantTimeDiscountControllerV2 a;

    public void LiveMerchantTimeDiscountControllerV2$b(LiveMerchantTimeDiscountControllerV2 p0){
       this.a = p0;
       super();
    }
    public void b(int p0,ComponentDataSource p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public final void c(int p0,MaterialMap p1,ComponentDataSource p2){
       LiveMerchantTimeDiscountControllerV2$b ta;
       c uoc;
       Collection uCollection1;
       LiveMerchantTimeDiscountControllerV2 liveMerchant = LiveMerchantTimeDiscountControllerV2.class;
       if (PatchProxy.isSupport(LiveMerchantTimeDiscountControllerV2$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveMerchantTimeDiscountControllerV2$b.class, "1")) {
          return;
       }
       LiveMerchantTimeDiscountControllerV2 e = this.a.e;
       if (e == null) {
          a.S("mLiveBasicContext");
       }
       c.a(e.getLiveStreamId(), this.a.g, p0, p1, p2);
       e = 1;
       Collection uCollection = null;
       if (p2 == ComponentDataSource.PAGE_INIT_MATERIAL) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p1, ta, liveMerchant, "4")) {
             ta.g();
             if (p1 != null) {
                p1 = p1.datas;
                if (p1 != null) {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = p1.iterator();
                   while (iterator.hasNext()) {
                      MaterialMapItem materialMapI = iterator.next();
                      Object obj = PatchProxy.applyOneRefs(materialMapI, ta, liveMerchant, "5");
                      if (obj != PatchProxyResult.class) {
                      }else if(materialMapI != null){
                         try{
                            obj = a.a.c(materialMapI.data, LiveMerchantPendentModel.class);
                         }catch(java.lang.Exception e0){
                            obj = uCollection;
                         }
                      }else {
                         goto label_0083 ;
                      }
                      uArrayList.add(uoc);
                   }
                   uCollection = uArrayList;
                }
             }
             if (uCollection != null && !uCollection.isEmpty()) {
                e = 0;
             }
             if (!e) {
                ta.c.addAll(uCollection);
                ta.b.i3();
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p1, ta, liveMerchant, "2") && p1 != null) {
             p1 = p1.datas;
             if (p1 != null) {
                MaterialMapItem materialMapI1 = CollectionsKt___CollectionsKt.p2(p1);
                if (materialMapI1 != null) {
                   materialMapI1 = materialMapI1.data;
                label_00cf :
                   if (materialMapI1 != null) {
                      try{
                         uCollection1 = a.a.c(materialMapI1, LiveMerchantPendentModel.class);
                      label_00e5 :
                         if (uCollection1 != null) {
                            c uoc1 = ta.i(uCollection1);
                            if (uoc1 != null) {
                               Iterator iterator1 = ta.c.iterator();
                               while (iterator1.hasNext()) {
                                  Object obj1 = iterator1.next();
                                  String str = obj1.b();
                                  boolean b = (str != null)? str.equals(uoc1.b()): false;
                                  if (b) {
                                     uCollection = obj1;
                                     break ;
                                  }
                               }
                               if (uCollection == null) {
                                  e = 0;
                               }
                               if (!e) {
                                  ta.c.add(uoc1);
                                  ta.f(uoc1);
                                  ta.b.O6(uoc1);
                               }else if(uoc1.g() == 4){
                                  ta.h("receive activity end signal but user is already grab coupon success", uoc1.b());
                               }else {
                                  uoc1.l(3);
                                  ta.h("timeDiscount activity remove", uoc1.b());
                                  ta.c.remove(uoc1);
                               }
                            }
                         }
                      }catch(java.lang.Exception e10){
                         a.l(MerchantMarketingBaseLogBiz.DEBUG, "ComponentDataUtil", "getFirstData error", e10);
                      }
                      uCollection1 = uCollection;
                      goto label_00e5 ;
                   }else {
                      goto label_00e4 ;
                   }
                }
             }
             uCollection1 = uCollection;
             goto label_00cf ;
          }
       }
    label_014c :
       return;
    }
}
