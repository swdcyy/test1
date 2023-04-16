package com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import java.io.Serializable;
import java.lang.Object;

public class ApiResponseMessageData implements Serializable	// class@001536
{
    public String mActionResult;
    public String mAnchorRole;
    public boolean mCanShowWidget;
    public long mCompleteActionTimePeriod;
    public int mIndex;
    public long mReceiveTimePeriod;
    public long mRecruitHttpCompleteActionTimePeriodMs;
    public long mRecruitReceiveTimePeriodMs;
    public long mRecruitSendTimePeriodMs;
    public String mResponseContent;
    public long mSendTimePeriod;
    public int mWidgetDataType;
    public static final long serialVersionUID = 0xd477bdbfa9a6fc74;

    public void ApiResponseMessageData(){
       super();
    }
}
