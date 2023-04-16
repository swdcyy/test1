package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMultiPkConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveMultiPkConfig implements Serializable	// class@001059
{
    public boolean mEnableAtmosphereAnimationDisplay;
    public boolean mEnableRepeatEntranceAnimation;
    public int mMultiPkMaxAuthorNum;
    public int mMultiPkMinAuthorNum;
    public long mPkExcitingMomentAnimationIntervalMs;
    public long mPkExcitingMomentAnimationThresholdScore;
    public long mPkScoreTagAnimationIntervalMs;
    public long mPkScoreTagAnimationThresholdScore;
    public static final long serialVersionUID = 0x40a11761713727c6;

    public void LiveConfigStartupResponse$LiveMultiPkConfig(){
       super();
       this.mMultiPkMinAuthorNum = 3;
       this.mMultiPkMaxAuthorNum = 9;
       this.mEnableRepeatEntranceAnimation = false;
       this.mPkScoreTagAnimationIntervalMs = 1000;
       this.mPkScoreTagAnimationThresholdScore = 30;
       this.mPkExcitingMomentAnimationIntervalMs = 0x2710;
       this.mPkExcitingMomentAnimationThresholdScore = 30;
       this.mEnableAtmosphereAnimationDisplay = false;
    }
}
