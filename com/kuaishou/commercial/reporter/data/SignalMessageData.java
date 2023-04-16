package com.kuaishou.commercial.reporter.data.SignalMessageData;
import java.io.Serializable;
import java.lang.Object;

public class SignalMessageData implements Serializable	// class@001541
{
    public String mActionResult;
    public String mAnchorRole;
    public boolean mCanShowWidget;
    public long mCompleteActionTimePeriod;
    public int mIndex;
    public String mMessageContent;
    public long mReceiveTimePeriod;
    public long mRecruitCompleteActionTimePeriodMs;
    public long mRecruitReceiveTimePeriodMs;
    public String mSignalType;
    public int mWidgetDataType;
    public static final long serialVersionUID = 0xf1f2d69174009c6e;

    public void SignalMessageData(){
       super();
    }
}
