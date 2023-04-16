package com.kuaishou.merchant.transaction.live.dynamic.service.preview.a$a;
import mu4.d;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.PreviewSpbModel;
import ue4.g;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.merchant.transaction.base.sku.b;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;
import java.util.Collection;
import ekd.q;
import gd4.d;
import androidx.fragment.app.Fragment;
import gd4.d$a;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import com.kuaishou.merchant.api.core.model.Commodity;
import kx7.c;
import me4.e;
import com.yxcorp.gifshow.model.CDNUrl;
import kx7.b;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.PreviewSpbModel$Location;
import android.graphics.Rect;
import lx7.a$a;
import lx7.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import sj4.a;
import com.kuaishou.merchant.transaction.base.preview.TransactionPreViewActivity;
import java.lang.Integer;
import ix7.n;
import android.content.Intent;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import moc.b;
import mu4.c;

public class a$a implements d	// class@0007da
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       int i;
       int i5;
       int i6;
       int i7;
       n on;
       Intent intent;
       MerchantLivePurchasePanelResponse$ItemInfo itemInfo;
       Object obj = this;
       PreviewSpbModel obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$a.class, "1")) {
          return;
       }
       obj1 = g.b(obj1, PreviewSpbModel.class);
       if (obj1 == null) {
          obj1 = new PreviewSpbModel();
       }
       a$a a = obj.a;
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, a, uoa, "2")) {
          ArrayList uArrayList = new ArrayList();
          Object[] objArray = null;
          ArrayList uArrayList1 = PatchProxy.apply(objArray, a, uoa, "3");
          if (uArrayList1 != PatchProxyResult.class) {
          }else {
             uArrayList1 = new ArrayList();
             i = 0;
             while (i < a.z.e().size()) {
                Iterator iterator = a.z.e().get(i).mPropValues.iterator();
                while (iterator.hasNext()) {
                   SkuSpecification$PropValue propValue = iterator.next();
                   if (propValue.mEnabled != null && !q.f(propValue.mImageUrls)) {
                      uArrayList1.add(propValue);
                   }
                }
                i = i + 1;
             }
             JsonObject jsonObject = d.n.a(a.y).o0();
             if (jsonObject != null) {
                String str = "itemInfo";
                if (jsonObject.e0(str) != null) {
                   itemInfo = g.a(jsonObject.e0(str), MerchantLivePurchasePanelResponse$ItemInfo.class);
                   if (itemInfo != null && !q.f(itemInfo.mImageUrls)) {
                      SkuSpecification$PropValue propValue1 = new SkuSpecification$PropValue();
                      propValue1.mImageUrls = itemInfo.mImageUrls;
                      uArrayList1.add(0, propValue1);
                   }
                }
             }
          }
          if (!q.f(uArrayList1)) {
             i = 0;
             int i1 = 0;
             int i2 = 1;
             while (i < uArrayList1.size()) {
                c uoc = new c();
                int i3 = 0;
                if (!uArrayList1.get(i).mPropValueId - i3 || uArrayList1.get(i).mEnabled != null) {
                   uoc.d(i2);
                   e uoe = new e();
                   uoe.b(uArrayList1.get(i).mImageUrls.get(0).mUrl);
                   uoe.b = uArrayList1.get(i).mPropValueName;
                   uoe.c = uArrayList1.get(i).mPropValueId;
                   uoc.a = uoe;
                   uArrayList.add(uoc);
                   PreviewSpbModel mPropValueId = obj1.mPropValueId;
                   if (mPropValueId - i3) {
                      if (mPropValueId - uArrayList1.get(i).mPropValueId) {
                      label_0140 :
                         i = i + 1;
                      }
                   }else if(uArrayList1.get(i).mSelected != null){
                   }
                   i1 = i;
                   goto label_0140 ;
                }
             }
             obj1 = obj1.mLocation;
             int i4 = 2;
             if (obj1 == null) {
                i5 = n.k(a.P8()) / i4;
                i = n.j(a.P8()) / i4;
                i6 = i5;
                i7 = i;
             }else {
                PreviewSpbModel$Location x = obj1.x;
                PreviewSpbModel$Location y = obj1.y;
                i6 = obj1.w + x;
                PreviewSpbModel$Location location = y;
                i7 = obj1.h + y;
                i5 = x;
                x = location;
             }
             Rect rect = new Rect(i5, i, i6, i7);
             a$a uoa1 = new a$a();
             uoa1.b(0);
             uoa1.c(i2);
             a uoa2 = uoa1.a();
             GifshowActivity gifshowActiv = a.P8();
             a uoa3 = new a(a, i1, uArrayList);
             if (PatchProxy.isSupport2(TransactionPreViewActivity.class, "1")) {
                Object[] objArray1 = new Object[]{gifshowActiv,rect,uArrayList,uoa3,Integer.valueOf(i1),uoa2};
                if (!PatchProxy.applyVoid(objArray1, objArray, TransactionPreViewActivity.class, "1")) {
                }
             }else {
             }
          }
       }
    label_01de :
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
