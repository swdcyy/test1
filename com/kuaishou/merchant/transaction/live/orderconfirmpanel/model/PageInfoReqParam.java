package com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import java.lang.Object;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam$ReselectedParams;
import com.kuaishou.merchant.basic.model.AddressInfo;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.base.model.SubCashierConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam$CashierAttachParam;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam$PromotionParam;
import com.kwai.robust.PatchProxyResult;
import yz7.e;

public class PageInfoReqParam implements Serializable	// class@000804
{
    public boolean mNotUseUnownedCoupon;
    public int mReselectedEventType;
    public final PageInfoReqParam$ReselectedParams mReselectedParamModel;
    public String mReselectedParamsString;
    public boolean mShouldRequest;
    public String mTransparentParam;
    public static final long serialVersionUID = 0x9064350bd84a102f;

    public void PageInfoReqParam(MerchantLivePurchasePanelResponse p0){
       super();
       this.mReselectedEventType = 1;
       PageInfoReqParam$ReselectedParams reselectedPa = new PageInfoReqParam$ReselectedParams();
       this.mReselectedParamModel = reselectedPa;
       this.mShouldRequest = false;
       if (p0 == null) {
          return;
       }
       MerchantLivePurchasePanelResponse mAddressInfo = p0.mAddressInfo;
       long l = (mAddressInfo == null)? 0: mAddressInfo.mAddressId;
       reselectedPa.mAddressId = l;
       mAddressInfo = p0.mSelectedSku;
       if (mAddressInfo != null) {
          reselectedPa.mSkuId = mAddressInfo.mSkuId;
       }
       this.mTransparentParam = p0.mTransparentParam;
       return;
    }
    public void buildCashierAttachParam(PaymentMethodInfo p0,SubCashierConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageInfoReqParam.class, "5")) {
          return;
       }
       this.mReselectedParamModel.mCashierAttachParam = new PageInfoReqParam$CashierAttachParam();
       PageInfoReqParam$ReselectedParams mCashierAtta = this.mReselectedParamModel.mCashierAttachParam;
       mCashierAtta.mProvider = p0.mProvider;
       mCashierAtta.mProviderChannelType = p0.mProviderChannelType;
       if (p1 != null) {
          mCashierAtta.mSubCashierConfigScene = p1.mSubCashierConfigScene;
       }
       return;
    }
    public void buildCashierAttachParam(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PageInfoReqParam.class, "4")) {
          return;
       }
       this.mReselectedParamModel.mCashierAttachParam = new PageInfoReqParam$CashierAttachParam();
       PageInfoReqParam$ReselectedParams mCashierAtta = this.mReselectedParamModel.mCashierAttachParam;
       mCashierAtta.mProvider = p0;
       mCashierAtta.mProviderChannelType = p1;
       mCashierAtta.mBankCardToken = p2;
       return;
    }
    public void buildInsuranceInfo(Object p0){
       PageInfoReqParam tmReselected = this.mReselectedParamModel;
       if (tmReselected == null) {
          return;
       }
       this.mReselectedEventType = 6;
       tmReselected.mFreightInsuranceParam = p0;
       return;
    }
    public void buildPromotionInfo(int p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(PageInfoReqParam.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, PageInfoReqParam.class, "2")) {
          return;
       }
       this.mReselectedParamModel.mPromotionParam = new PageInfoReqParam$PromotionParam();
       PageInfoReqParam$ReselectedParams mPromotionPa = this.mReselectedParamModel.mPromotionParam;
       mPromotionPa.mPromotionType = p0;
       mPromotionPa.mPromotionId = p1;
       mPromotionPa.mPromotionSubCategoryFront = p2;
       mPromotionPa.mToBeSelected = p3;
       return;
    }
    public void clearPromotionParamsAfterCouponGotten(){
       this.mReselectedParamModel.mPromotionParam = null;
    }
    public void fillPromotionParamsAfterCouponGotten(int p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(PageInfoReqParam.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, PageInfoReqParam.class, "3")) {
          return;
       }
       this.mReselectedParamModel.mPromotionParam = new PageInfoReqParam$PromotionParam();
       PageInfoReqParam$ReselectedParams mPromotionPa = this.mReselectedParamModel.mPromotionParam;
       mPromotionPa.mPromotionType = p0;
       mPromotionPa.mPromotionId = p1;
       mPromotionPa.mPromotionSubCategoryFront = p2;
       mPromotionPa.mToBeSelected = false;
       mPromotionPa.mCouponTemplateId = p3;
       return;
    }
    public void reselectAddress(long p0){
       this.mReselectedEventType = 4;
       this.mReselectedParamModel.mAddressId = p0;
    }
    public void setItemCountInfo(int p0){
       this.mReselectedParamModel.mItemCount = p0;
    }
    public void setMemberJoin(){
       this.mReselectedEventType = 11;
    }
    public void setModifyCountType(int p0){
       this.mReselectedParamModel.mModifyCountType = p0;
    }
    public PageInfoReqParam update(MerchantLivePurchasePanelResponse p0){
       MerchantLivePurchasePanelResponse obj = PatchProxy.applyOneRefs(p0, this, PageInfoReqParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mTransparentParam = p0.mTransparentParam;
          obj = p0.mSelectedSku;
          if (obj != null) {
             this.mReselectedParamModel.mSkuId = obj.mSkuId;
          }
          PageInfoReqParam tmReselected = this.mReselectedParamModel;
          tmReselected.mItemCount = p0.mSelectedItemCount;
          if (this.mReselectedEventType != 4) {
             p0 = p0.mAddressInfo;
             long l = (p0 == null)? 0: p0.mAddressId;
             tmReselected.mAddressId = l;
          }
       }
       this.mReselectedParamsString = e.f(this.mReselectedParamModel);
       return this;
    }
    public void upgradeAddressSuccess(long p0){
       this.mReselectedEventType = 10;
       this.mReselectedParamModel.mAddressId = p0;
    }
}
