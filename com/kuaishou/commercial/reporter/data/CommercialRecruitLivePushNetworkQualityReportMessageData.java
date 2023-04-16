package com.kuaishou.commercial.reporter.data.CommercialRecruitLivePushNetworkQualityReportMessageData;
import java.io.Serializable;
import java.lang.Object;

public class CommercialRecruitLivePushNetworkQualityReportMessageData implements Serializable	// class@00153f
{
    public String mAnchorId;
    public int mErrorCode;
    public String mErrorMessage;
    public float mRatio;
    public float mRatioCount;
    public long mRequestTimePeriodMs;
    public int mResult;
    public static final long serialVersionUID = 0x82e68759bc9003ea;

    public void CommercialRecruitLivePushNetworkQualityReportMessageData(){
       super();
    }
}
