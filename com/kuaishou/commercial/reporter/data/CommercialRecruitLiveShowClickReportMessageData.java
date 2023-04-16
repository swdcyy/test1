package com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import java.io.Serializable;
import java.lang.Object;

public class CommercialRecruitLiveShowClickReportMessageData implements Serializable	// class@001540
{
    public int mActionType;
    public int mClickAreaType;
    public String mLiveStreamId;
    public String mMessageType;
    public float mRatio;
    public float mRatioCount;
    public Integer[] mTypeViewList;
    public int mWidgetButtonType;
    public static final long serialVersionUID = 0xba7c67f871c30eaa;

    public void CommercialRecruitLiveShowClickReportMessageData(){
       super();
    }
}
