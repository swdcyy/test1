package com.kuaishou.commercial.reporter.data.CommercialLiveNetworkQualityReportMessageData;
import java.io.Serializable;
import java.lang.Object;

public class CommercialLiveNetworkQualityReportMessageData implements Serializable	// class@001539
{
    public String mAnchorId;
    public String mApiPath;
    public int mErrorCode;
    public String mErrorMessage;
    public int mLiveExposureType;
    public String mLiveStreamId;
    public Integer[] mLiveType;
    public String mMessageType;
    public String mParams;
    public float mRatio;
    public float mRatioCount;
    public long mRequestTimePeriod;
    public long mRequestTimePeriodMs;
    public int mResult;
    public String mRole;
    public Integer[] mTypeViewList;
    public static final long serialVersionUID = 0x931abe5debb8a5da;

    public void CommercialLiveNetworkQualityReportMessageData(){
       super();
    }
}
