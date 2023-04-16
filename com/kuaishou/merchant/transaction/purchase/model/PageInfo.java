package com.kuaishou.merchant.transaction.purchase.model.PageInfo;
import com.kuaishou.merchant.transaction.base.net.error.PromptBean;

public class PageInfo extends PromptBean	// class@000943
{
    public AddressInfo mAddressInfo;
    public AgreementInfo mAgreementInfo;
    public AgreementInfoV2 mAgreementInfoV2;
    public AnnouncementInfo mAnnouncementInfo;
    public BottomTipInfo mBottomTip;
    public BuyButton mBuyButton;
    public boolean mCanSale;
    public List mCashierConfig;
    public CrossBorderInfo mCrossBorderInfo;
    public FollowingInfo mFollowingInfo;
    public boolean mIsFoldPayList;
    public PaymentInfo mMoneyInfo;
    public String mPageInfoTransparentParam;
    public Map mPageModuleInfo;
    public PoiInfo mPoiInfo;
    public ProductInfo mProductInfo;
    public List mPromotionEventLogParam;
    public List mRechargeConfigList;
    public int mResponseVersion;
    public String mRetentionMsg;
    public int mShowProviderSize;
    public String mToastMsg;
    public int mToastMsgType;
    public UpgradeAddressGuideModel mUpgradeAddressGuideModel;
    public static final long serialVersionUID = 0xbbcda3653226ea20;

    public void PageInfo(){
       super();
    }
}
