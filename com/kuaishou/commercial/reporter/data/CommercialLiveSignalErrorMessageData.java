package com.kuaishou.commercial.reporter.data.CommercialLiveSignalErrorMessageData;
import java.io.Serializable;
import java.lang.Object;

public class CommercialLiveSignalErrorMessageData implements Serializable	// class@00153d
{
    public CommercialLiveSignalErrorMessageData$ErrorMsg mErrorMsg;
    public String mErrorType;
    public String mLiveStreamId;
    public Integer[] mLiveType;
    public String mMessageType;
    public float mRatio;
    public float mRatioCount;
    public String mRole;
    public static final long serialVersionUID = 0xf1985dc045792a35;

    public void CommercialLiveSignalErrorMessageData(){
       super();
    }
}
