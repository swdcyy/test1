package com.kuaishou.commercial.reporter.data.CommercialLivePlayTimeQualityReportMessage;
import java.io.Serializable;
import java.lang.Object;

public class CommercialLivePlayTimeQualityReportMessage implements Serializable	// class@00153a
{
    public boolean mCanShowWidget;
    public long mEnterLiveTimestamp;
    public int mEnterSource;
    public long mLeaveLiveTimePeriodMs;
    public long mLeaveLiveTimestamp;
    public int mLiveExposureType;
    public String mLiveStreamId;
    public float mRatio;
    public float mRatioCount;
    public long mRealShowWidgetTimePeriodMs;
    public Integer[] mTypeViewList;
    public static final long serialVersionUID = 0xc35fe829ed81ac52;

    public void CommercialLivePlayTimeQualityReportMessage(){
       super();
    }
}
