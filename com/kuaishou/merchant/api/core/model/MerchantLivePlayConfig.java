package com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$ABConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MerchantLivePlayConfig implements Serializable	// class@001536
{
    public MerchantLivePlayConfig$ABConfig mAbConfig;
    public MerchantAuctionConfig mAuctionConfig;
    public List mCarPreElementList;
    public MerchantLivePlayConfig$ChainEntranceConfig mChainEntranceConfig;
    public MerchantLivePlayConfig$CommentListConfig mCommentListConfig;
    public boolean mEnableLiveCommentCS;
    public MerchantLivePlayConfig$HeadAuthentication mHeadAuthentication;
    public boolean mIsMerchantChainEnable;
    public boolean mIsMerchantLive;
    public String mLivePayload;
    public int mPaySuccessToastMillis;
    public String mPurchaseSuccessToast;
    public MerchantLivePlayConfig$ShareRedPackConfig mShareRedPackConfig;
    public boolean mShowSurpriseChestAnimation;
    public boolean mShowYellowCar;
    public String mSkinResource;
    public List mTaskList;
    public MerchantLivePlayConfig$WakeupConfig mWakeupConfig;
    public static final long serialVersionUID = 0x4c8c6392f33eadeb;

    public void MerchantLivePlayConfig(){
       super();
       this.mShowSurpriseChestAnimation = true;
    }
    public MerchantLivePlayConfig$ABConfig getAbConfig(){
       Object obj = PatchProxy.apply(null, this, MerchantLivePlayConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mAbConfig == null) {
          this.mAbConfig = new MerchantLivePlayConfig$ABConfig();
       }
       return this.mAbConfig;
    }
}
