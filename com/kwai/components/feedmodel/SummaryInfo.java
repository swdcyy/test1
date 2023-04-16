package com.kwai.components.feedmodel.SummaryInfo;
import java.io.Serializable;
import java.lang.Object;

public class SummaryInfo implements Serializable	// class@000c45
{
    public String mCommentTitle;
    public SummaryInfo$SummaryExtInfo mExtInfo;
    public int mMaxLines;
    public String mResultTitle;
    public String mSlideTitle;
    public String mSummaryNote;
    public long mSummaryPosition;
    public static final long serialVersionUID = 0x9c2a074942afc7c5;

    public void SummaryInfo(){
       super();
       this.mSummaryPosition = -1;
    }
    public long getSummaryPosition(){
       return (this.mSummaryPosition * 1000);
    }
}
