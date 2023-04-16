package com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantPendentModel;
import java.io.Serializable;
import java.lang.Object;

public class LiveMerchantPendentModel implements Serializable	// class@001aee
{
    public LiveMerchantActivityModel mActivityModel;
    public long mDestroyTimestamp;
    public Map mExtraMap;
    public String mJumpUrl;
    public LiveMerchantAnimationModel mLiveMerchantAnimationModel;
    public LiveMerchantBalanceStrategyModel mLiveMerchantBalanceStrategyModel;
    public int pendantStatus;
    public int pendantType;

    public void LiveMerchantPendentModel(){
       super();
    }
}
