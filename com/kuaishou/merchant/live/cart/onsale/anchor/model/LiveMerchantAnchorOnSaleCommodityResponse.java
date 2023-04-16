package com.kuaishou.merchant.live.cart.onsale.anchor.model.LiveMerchantAnchorOnSaleCommodityResponse;
import java.io.Serializable;
import mkd.a;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import com.kuaishou.merchant.live.cart.onsale.model.ExtraMap;
import com.kwai.robust.PatchProxyResult;
import h34.e;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import js3.a;

public class LiveMerchantAnchorOnSaleCommodityResponse implements Serializable, a, g	// class@001911
{
    public List commodityList;
    public boolean hasSandeagoAuthority;
    public boolean isSandeagoShow;
    public LiveAnchorConfig mAnchorConfig;
    public boolean mEnableShowItemInterpret;
    public ExtraMap mExtraMap;
    public List mItemCardList;
    public LiveAnchorToolsInfo mOnSellToolAreaInfo;
    public TopToolBar mTopToolBar;
    public String sandeagoForbiddenReason;
    public static final long serialVersionUID = 0xb63bc03dd51fa5d9;

    public void LiveMerchantAnchorOnSaleCommodityResponse(){
       super();
    }
    public void afterDeserialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMerchantAnchorOnSaleCommodityResponse.class, "4")) {
          return;
       }
       if (this.commodityList != null && this.mItemCardList == null) {
          this.mItemCardList = new ArrayList();
          if (this.commodityList.size() > 0) {
             Commodity uCommodity = this.commodityList.get(0);
             Iterator iterator = this.commodityList.iterator();
             int i = 1;
             while (iterator.hasNext()) {
                Commodity uCommodity1 = iterator.next();
                ItemCard itemCard = new ItemCard();
                itemCard.mType = i;
                itemCard.mCommodity = uCommodity1;
                this.mItemCardList.add(itemCard);
                if (objArray == null && uCommodity1.isInterpreting()) {
                   objArray = uCommodity1;
                }
             }
             if (objArray != null && !objArray.equals(uCommodity)) {
                ItemCard itemCard1 = new ItemCard();
                itemCard1.mType = i;
                itemCard1.mCommodity = objArray.copyForInterpretation();
                this.mItemCardList.add(0, itemCard1);
             }
          }
       }
       return;
    }
    public ExtraMap getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorOnSaleCommodityResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtraMap();
       }
       return this.mExtraMap;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantAnchorOnSaleCommodityResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantAnchorOnSaleCommodityResponse.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveMerchantAnchorOnSaleCommodityResponse.class, new e());
       }else {
          obj.put(LiveMerchantAnchorOnSaleCommodityResponse.class, null);
       }
       return obj;
    }
    public LiveAnchorToolsInfo getOnSellToolAreaInfo(boolean p0){
       Iterator obj;
       if (PatchProxy.isSupport(LiveMerchantAnchorOnSaleCommodityResponse.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveMerchantAnchorOnSaleCommodityResponse.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          LiveMerchantAnchorOnSaleCommodityResponse tmOnSellTool = this.mOnSellToolAreaInfo;
          if (tmOnSellTool != null && !q.f(tmOnSellTool.mLiveAnchorToolList)) {
             ArrayList uArrayList = new ArrayList();
             obj = this.mOnSellToolAreaInfo.mLiveAnchorToolList.iterator();
             while (obj.hasNext()) {
                LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo = obj.next();
                LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo1 = (liveAnchorTo.mType == 9)? 1: null;
                if (!liveAnchorTo1) {
                   uArrayList.add(liveAnchorTo);
                }
             }
             LiveMerchantAnchorOnSaleCommodityResponse tmOnSellTool1 = this.mOnSellToolAreaInfo;
             tmOnSellTool1.mLiveAnchorToolList = uArrayList;
             return tmOnSellTool1;
          }
       }
       return this.mOnSellToolAreaInfo;
    }
    public a getSandeagoInfo(){
       a obj = PatchProxy.apply(null, this, LiveMerchantAnchorOnSaleCommodityResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a = this.isSandeagoShow;
       obj.b = this.hasSandeagoAuthority;
       obj.c = this.sandeagoForbiddenReason;
       return obj;
    }
}
