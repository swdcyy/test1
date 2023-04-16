package com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse;
import java.lang.Object;
import com.kuaishou.merchant.transaction.detail.self.dynamic.model.DetailCommonData;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.BuyButton;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailHiddenConfig;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse;
import java.lang.Long;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;

public class SkuPanelResponse	// class@000786
{
    public BuyButton mBuyButton;
    public String mBuyUrl;
    public DetailHiddenConfig mHiddenConfig;
    public ItemInfo mItemInfo;
    public DetailSkuPreviewImageInfo mPreviewImageInfo;
    public List mPurchaseMethods;
    public SkuInfo mSelectedSkuInfo;
    public DetailResponse$SkuBottomTips mSkuBottomTips;
    public List mSkuInfos;
    public List mSkuSpecifications;

    public void SkuPanelResponse(){
       super();
    }
    public static SkuPanelResponse create(DetailCommonData p0,BuyButton p1,SkuInfo p2){
       SkuPanelResponse obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SkuPanelResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SkuPanelResponse();
       obj.mItemInfo = p0.mItemInfo;
       obj.mBuyButton = p1;
       obj.mSkuBottomTips = p0.mSkuBottomTips;
       obj.mSkuSpecifications = p0.mSkuSpecifications;
       obj.mSkuInfos = p0.mSkuInfos;
       obj.mBuyUrl = p1.mBuyUrl;
       obj.mHiddenConfig = p0.getHiddenConfig();
       obj.mSelectedSkuInfo = p2;
       obj.mPreviewImageInfo = p0.mPreviewImageInfo;
       p0 = p0.mItemInfo;
       List list = (p0 == null)? null: p0.mPurchaseMethods;
       obj.mPurchaseMethods = list;
       return obj;
    }
    public static SkuPanelResponse create(DetailResponse p0,SkuInfo p1){
       ItemInfo itemInfo = null;
       SkuPanelResponse obj = PatchProxy.applyTwoRefs(p0, p1, itemInfo, SkuPanelResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SkuPanelResponse();
       obj.mItemInfo = p0.mItemInfo;
       obj.mBuyButton = p0.mBuyButton;
       obj.mSkuBottomTips = p0.mSkuBottomTips;
       obj.mSkuSpecifications = p0.mSkuSpecifications;
       obj.mSkuInfos = p0.mSkuInfos;
       obj.mBuyUrl = p0.mBuyUrl;
       obj.mHiddenConfig = p0.getHiddenConfig();
       obj.mSelectedSkuInfo = p1;
       obj.mPreviewImageInfo = p0.mPreviewImageInfo;
       p0 = p0.mItemInfo;
       if (p0 != null) {
          itemInfo = p0.mPurchaseMethods;
       }
       obj.mPurchaseMethods = itemInfo;
       return obj;
    }
    public SkuInfo getSkuInfo(long p0){
       Iterator obj;
       SkuInfo skuInfo;
       SkuPanelResponse skuPanelResp = SkuPanelResponse.class;
       if (PatchProxy.isSupport(skuPanelResp)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, skuPanelResp, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(this.mSkuInfos)) {
          return null;
       }else {
          obj = this.mSkuInfos.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return null;
             }
             skuInfo = obj.next();
             if (!skuInfo.mSkuId - p0) {
                break ;
             }
          }
          return skuInfo;
       }
    }
}
