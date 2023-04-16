package com.kuaishou.merchant.live.cart.onsale.audience.model.UpdateRequestBody;
import java.io.Serializable;
import java.lang.Object;

public class UpdateRequestBody implements Serializable	// class@001963
{
    public String mBuyerCouponId;
    public String mExpTag;
    public String mExtraMap;
    public String mLivePayload;
    public String mLiveStreamId;
    public String mSellerId;
    public String mServerExpTag;
    public List mTabs;
    public String mUpdateParams;
    public int mUpdateSourceType;
    public List mUserStatus;
    public static final long serialVersionUID = 0x89cc8239d921567a;

    public void UpdateRequestBody(){
       super();
    }
}
