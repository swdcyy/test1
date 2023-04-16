package com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import wr3.b;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopBuyButton;
import fg6.a;
import com.google.gson.Gson;
import ur3.d;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopLayerMask;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopPriceRegion;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel;
import com.kuaishou.merchant.api.core.model.live.shop.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$ItemExtraInfo;
import java.lang.Integer;

public class LiveShopFrameModel implements Serializable, a	// class@001541
{
    public HashMap mBuyButton;
    public List mItemExtraInfos;
    public HashMap mLayerMask;
    public HashMap mLeftRegion;
    public HashMap mPriceRegion;
    public LiveShopRMCModel mRmc;
    public HashMap mSuccessBuyButton;
    public LiveShopFrameModel$Toast mToast;
    public int mType;
    public static final long serialVersionUID = 0xc0b825d25b53b2e;

    public void LiveShopFrameModel(){
       super();
    }
    public final void a(Map p0,Map p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveShopFrameModel.class, "2")) {
          return;
       }
       if (!q.h(p1)) {
          Iterator obj = PatchProxy.applyOneRefs(p1, this, LiveShopFrameModel.class, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             String str1 = "delete";
             if (p1.containsKey(str1)) {
                Object obj1 = p1.get(str1);
                if (obj1 instanceof Boolean && obj1.booleanValue()) {
                   b = true;
                }
             }
             b = false;
          }
          if (b) {
             d.a(-1122717348).i("LiveShopFrameModel", "delete current map");
             p0.clear();
             return;
          }else {
             obj = p1.keySet().iterator();
             while (obj.hasNext()) {
                String str = obj.next();
                p0.put(str, p1.get(str));
             }
          }
       }
       return;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveShopFrameModel.class, "9")) {
          return;
       }
       LiveShopFrameModel tmToast = this.mToast;
       if (tmToast != null) {
          tmToast.createIndexMessage(this.getLeftRegion());
       }
       return;
    }
    public LiveShopBuyButton getBuyButton(){
       Object[] objArray = null;
       LiveShopFrameModel obj = PatchProxy.apply(objArray, this, LiveShopFrameModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBuyButton;
       if (obj == null) {
          return objArray;
       }
       return d.b(a.a.q(obj), LiveShopBuyButton.class);
    }
    public LiveShopLayerMask getLayerMask(){
       Object[] objArray = null;
       LiveShopFrameModel obj = PatchProxy.apply(objArray, this, LiveShopFrameModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLayerMask;
       if (obj == null) {
          return objArray;
       }
       return d.b(a.a.q(obj), LiveShopLayerMask.class);
    }
    public LiveShopLeftRegion getLeftRegion(){
       Object[] objArray = null;
       LiveShopFrameModel obj = PatchProxy.apply(objArray, this, LiveShopFrameModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLeftRegion;
       if (obj == null) {
          return objArray;
       }
       return d.b(a.a.q(obj), LiveShopLeftRegion.class);
    }
    public LiveShopPriceRegion getPriceRegion(){
       Object[] objArray = null;
       LiveShopFrameModel obj = PatchProxy.apply(objArray, this, LiveShopFrameModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPriceRegion;
       if (obj == null) {
          return objArray;
       }
       return d.b(a.a.q(obj), LiveShopPriceRegion.class);
    }
    public LiveShopBuyButton getSuccessBuyButton(){
       Object[] objArray = null;
       LiveShopFrameModel obj = PatchProxy.apply(objArray, this, LiveShopFrameModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSuccessBuyButton;
       if (obj == null) {
          return objArray;
       }
       return d.b(a.a.q(obj), LiveShopBuyButton.class);
    }
    public void incrementMerge(LiveShopFrameModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopFrameModel.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LiveShopFrameModel tmBuyButton = this.mBuyButton;
       if (tmBuyButton == null) {
          this.mBuyButton = p0.mBuyButton;
       }else {
          this.a(tmBuyButton, p0.mBuyButton);
       }
       tmBuyButton = this.mRmc;
       if (tmBuyButton == null) {
          this.mRmc = p0.mRmc;
       }else {
          tmBuyButton.incrementMerge(p0.mRmc);
       }
       tmBuyButton = this.mLayerMask;
       if (tmBuyButton == null) {
          this.mLayerMask = p0.mLayerMask;
       }else {
          this.a(tmBuyButton, p0.mLayerMask);
       }
       tmBuyButton = this.mLeftRegion;
       if (tmBuyButton == null) {
          this.mLeftRegion = p0.mLeftRegion;
       }else {
          this.a(tmBuyButton, p0.mLeftRegion);
       }
       tmBuyButton = this.mPriceRegion;
       if (tmBuyButton == null) {
          this.mPriceRegion = p0.mPriceRegion;
       }else {
          this.a(tmBuyButton, p0.mPriceRegion);
       }
       tmBuyButton = p0.mToast;
       this.mToast = tmBuyButton;
       if (tmBuyButton != null) {
          tmBuyButton.createIndexMessage(this.getLeftRegion());
       }
       tmBuyButton = this.mItemExtraInfos;
       if (tmBuyButton == null) {
          this.mItemExtraInfos = p0.mItemExtraInfos;
       }else if(p0.mItemExtraInfos != null){
          a b = a.b;
          Map map = PatchProxy.applyTwoRefs(tmBuyButton, b, this, LiveShopFrameModel.class, "10");
          if (map != PatchProxyResult.class) {
          }else if(q.f(tmBuyButton)){
             map = Collections.emptyMap();
          }else {
             HashMap hashMap = new HashMap(tmBuyButton.size());
             Iterator iterator1 = tmBuyButton.iterator();
             while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                Object obj1 = b.apply(obj);
                if (obj1 != null) {
                   hashMap.put(obj1, obj);
                }
             }
             map = Collections.unmodifiableMap(hashMap);
          }
          Iterator iterator = p0.mItemExtraInfos.iterator();
          while (iterator.hasNext()) {
             LiveShopFrameModel$ItemExtraInfo itemExtraInf = iterator.next();
             LiveShopFrameModel$ItemExtraInfo itemExtraInf1 = map.get(Integer.valueOf(itemExtraInf.mBusinessType));
             if (itemExtraInf1 == null) {
                continue ;
             }
             this.a(itemExtraInf1.mPayload, itemExtraInf.mPayload);
          }
       }
       return;
    }
    public boolean isCompleteFrame(){
       boolean b = true;
       if (this.mType == b) {
       }else {
          b = false;
       }
       return b;
    }
}
