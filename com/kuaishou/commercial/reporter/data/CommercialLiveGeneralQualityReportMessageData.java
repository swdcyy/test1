package com.kuaishou.commercial.reporter.data.CommercialLiveGeneralQualityReportMessageData;
import java.io.Serializable;
import java.lang.Object;

public class CommercialLiveGeneralQualityReportMessageData implements Serializable	// class@001538
{
    public String mAnchorId;
    public long mEnterLiveTimeMs;
    public String mEnterSource;
    public ApiResponseMessageData mFirstReceiveApiResponse;
    public SignalMessageData mFirstReceiveSignal;
    public long mFirstSetTimePeriodMs;
    public long mInitComponentTimePeriodMs;
    public long mLeaveLiveTimePeriodMs;
    public long mLivePageRealShowTimeMs;
    public String mLiveStreamId;
    public Integer[] mLiveType;
    public String mMessageType;
    public float mRatio;
    public float mRatioCount;
    public long mRealShowTimePeriodMs;
    public ArrayList mReceiveApiResponseList;
    public ApiResponseMessageData mReceiveHttpData;
    public SignalMessageData mReceiveSignalData;
    public ArrayList mReceiveSignalList;
    public long mRecruitEnterLiveTimeStampMs;
    public long mRecruitRealShowTimePeriodMs;
    public long mRecruitRegisterSignalTimePeriodMs;
    public long mRegisterSignalTimePeriodMs;
    public String mRole;
    public Integer[] mTypeViewList;
    public int mWidgetDataSource;
    public static final long serialVersionUID = 0x931abe5debb8a5da;

    public void CommercialLiveGeneralQualityReportMessageData(){
       super();
    }
}
