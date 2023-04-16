package com.kuaishou.android.model.mix.VideoQualityInfo;
import java.io.Serializable;
import java.lang.Object;

public class VideoQualityInfo implements Serializable	// class@000e31
{
    public int mRateCoverShowStatus;
    public List mScoreMarkList;
    public int mSelectRateViewId;
    public String mTitle;
    public String mType;
    public String surveyId;
    public static final long serialVersionUID = 0x7765789484dea662;

    public void VideoQualityInfo(){
       super();
       this.mSelectRateViewId = -1;
    }
}
