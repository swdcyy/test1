package com.yxcorp.gifshow.util.PostExperimentUtils$MusicPanelV2Param;
import java.io.Serializable;
import java.lang.Object;

public class PostExperimentUtils$MusicPanelV2Param implements Serializable	// class@001f17
{
    public int mMaxRequestTimes;
    public int mMusicChangeButtonShowPosition;
    public float mMusicRequestRepeatabilityLimit;
    public int mMusicRequestSize;

    public void PostExperimentUtils$MusicPanelV2Param(){
       super();
       this.mMusicRequestRepeatabilityLimit = 0x3f333333;
       this.mMusicChangeButtonShowPosition = 20;
       this.mMusicRequestSize = 80;
       this.mMaxRequestTimes = 5;
    }
}
