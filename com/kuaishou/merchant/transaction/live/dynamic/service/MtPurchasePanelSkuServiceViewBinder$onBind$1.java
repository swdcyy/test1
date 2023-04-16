package com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder;
import java.lang.Object;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.sku.b;
import com.google.gson.JsonObject;
import gd4.d;
import androidx.fragment.app.Fragment;
import rk0.b;
import gd4.d$a;
import vd4.b;
import kj4.f;
import java.lang.reflect.Type;
import el.a;
import ue4.g;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.model.LocalSaleStatusModel;
import bo4.b;
import fg6.a;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.SkuV2Model;
import com.google.gson.Gson;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;
import java.lang.Long;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import zd4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import sk4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import lnc.o5;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public final class MtPurchasePanelSkuServiceViewBinder$onBind$1 extends Lambda implements l	// class@0007bc
{
    public final MtPurchasePanelSkuServiceViewBinder this$0;

    public void MtPurchasePanelSkuServiceViewBinder$onBind$1(MtPurchasePanelSkuServiceViewBinder p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonElement p0){
       String str4;
       long l;
       Long longx;
       SkuSpecification$PropValue propValue;
       Long longx1;
       Iterator iterator2;
       SkuSpecification$PropValue propValue1;
       String str5;
       SkuV2Model skuV2Model;
       boolean b1;
       Iterator iterator3;
       Object obj = this;
       SkuV2Model obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MtPurchasePanelSkuServiceViewBinder$onBind$1.class, str)) {
          return;
       }
       MtPurchasePanelSkuServiceViewBinder$onBind$1 this$0 = obj.this$0;
       Objects.requireNonNull(this$0);
       MtPurchasePanelSkuServiceViewBinder mtPurchasePa = MtPurchasePanelSkuServiceViewBinder.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, this$0, mtPurchasePa, "6")) {
          Object[] objArray = null;
          if (!obj1 instanceof JsonObject) {
             obj1 = objArray;
          }
          if (obj1 != null) {
             b uob = d.n.a(this$0.R8()).v0();
             String str1 = "7";
             boolean i = 3;
             String str2 = 4;
             boolean b = false;
             b uob1 = 1;
             if (!PatchProxy.applyVoidOneRefs(uob, this$0, mtPurchasePa, str1)) {
                LocalSaleStatusModel localSaleSta = g.c(this$0.d9("mt_purchase_panel_get_local_sale_status_async", objArray), new f().getType());
                if (localSaleSta != null) {
                   localSaleSta = localSaleSta.mLocalSaleStatus;
                   boolean b2 = (localSaleSta == i || localSaleSta == str2)? true: false;
                   uob.m(b2);
                }else {
                   uob.m(b);
                }
             }
             if (uob.p == null && uob.v == null) {
                if (!PatchProxy.applyVoid(objArray, uob, b.class, "21")) {
                   b.a(uob.q, uob.r);
                   b.a(uob.q, uob.s);
                }
             }else {
                uob.v = b;
                uob.p = b;
                uob.q = this$0.R8();
                obj1 = a.a.c(obj1, SkuV2Model.class);
                if (obj1 != null) {
                   SkuV2Model mSkuSpecific = obj1.mSkuSpecifications;
                   SkuV2Model mSkuInfos = obj1.mSkuInfos;
                   String str3 = "8";
                   if (PatchProxy.applyVoidTwoRefs(mSkuSpecific, mSkuInfos, uob, b.class, str)) {
                      str4 = str3;
                      i = true;
                   }else if(PatchProxy.isSupport(b.class)){
                      str5 = str3;
                      skuV2Model = mSkuInfos;
                      b1 = false;
                      if (PatchProxy.applyVoidFourRefs(mSkuSpecific, mSkuInfos, 0, Integer.valueOf(uob1), uob, b.class, "3")) {
                         i = true;
                      label_010d :
                         str4 = str5;
                      }
                   }else {
                      str5 = str3;
                      skuV2Model = mSkuInfos;
                      b1 = 0;
                      int i1 = 3;
                      int i2 = 4;
                   }
                   if (PatchProxy.isSupport(b.class)) {
                      Object[] objArray1 = new Object[]{mSkuSpecific,skuV2Model,null,Boolean.TRUE,Integer.valueOf(i)};
                      i = 1;
                      if (PatchProxy.applyVoid(objArray1, uob, b.class, "5")) {
                         goto label_010d ;
                      }
                   }else {
                      i = true;
                   }
                   uob.c.clear();
                   uob.e.clear();
                   uob.g.clear();
                   uob.b.clear();
                   uob.i.clear();
                   uob.k = null;
                   uob.j = i;
                   uob.a = mSkuSpecific.size();
                   uob.l = b1;
                   uob.f = skuV2Model;
                   HashMap hashMap = new HashMap();
                   Iterator iterator1 = mSkuSpecific.iterator();
                   while (iterator1.hasNext()) {
                      SkuSpecification skuSpecifica = iterator1.next();
                      iterator3 = skuSpecifica.mPropValues.iterator();
                      while (iterator3.hasNext()) {
                         SkuSpecification$PropValue propValue2 = iterator3.next();
                         propValue2.mSpecification = skuSpecifica;
                         hashMap.put(Long.valueOf(propValue2.mPropValueId), propValue2);
                      }
                      uob.b.add(skuSpecifica);
                   }
                   iterator1 = skuV2Model.iterator();
                   while (iterator1.hasNext()) {
                      SkuInfo skuInfo1 = iterator1.next();
                      HashMap hashMap1 = new HashMap();
                      iterator3 = skuInfo1.mPropValueIds.iterator();
                      while (true) {
                         if (iterator3.hasNext()) {
                            Long longx2 = iterator3.next();
                            SkuSpecification$PropValue mPropValueId = hashMap.get(longx2);
                            if (mPropValueId == null) {
                               Object[] objArray2 = new Object[b1];
                               a.C().A("SkuManger", "invalid sku="+skuInfo1.mSkuId, objArray2);
                            }else {
                               hashMap1.put(longx2, mPropValueId);
                            }
                         }else if(skuInfo1.mSkuStock >= Math.max(i, i)){
                            uob.c.putAll(hashMap1);
                            uob.e.add(skuInfo1);
                            continue ;
                         }else {
                            uob.d.putAll(hashMap1);
                            continue ;
                         }
                      }
                   }
                   str4 = str5;
                   if (!PatchProxy.applyVoid(null, uob, b.class, str4)) {
                      uob.k(b1);
                      iterator1 = uob.b.iterator();
                      while (iterator1.hasNext()) {
                         SkuSpecification skuSpecifica1 = iterator1.next();
                         if (skuSpecifica1.mPropValues.size() == i && skuSpecifica1.mPropValues.get(b1).mEnabled != null) {
                            uob.o(skuSpecifica1.mPropValues.get(b1), i, b1);
                         }
                      }
                      uob.m = i;
                      uob.q();
                   }
                   uob.o = obj1.mIsHiddenSpecification;
                   if (!PatchProxy.applyVoid(null, uob, b.class, str1)) {
                      Iterator iterator = uob.e.iterator();
                      while (iterator.hasNext()) {
                         SkuInfo skuInfo = iterator.next();
                         if (skuInfo.mSelected != null) {
                            if (PatchProxy.isSupport(b.class)) {
                               Boolean tRUE = Boolean.TRUE;
                               if (!PatchProxy.applyVoidThreeRefs(skuInfo, tRUE, tRUE, uob, b.class, "15")) {
                               }
                            }else {
                            }
                         }
                      }
                   }
                   Fragment uFragment = this$0.R8();
                   Object obj2 = PatchProxy.applyOneRefs(uFragment, null, b.class, str4);
                   if (obj2 != PatchProxyResult.class) {
                      l = obj2.longValue();
                   }else {
                      d uod = ViewModelProviders.of(uFragment).get(d.class);
                      try{
                         l = o5.c(uod.y0().get("selectedPropId"));
                      }catch(java.lang.Exception e0){
                         a.g(MerchantTransactionLogBiz.PURCHASE, "CreatOrderHelper", "getUriSelectedPropId err");
                         l = 0;
                      }
                   }
                }
             }
          }
       }
    label_031c :
       return;
    }
}
