package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo implements Serializable	// class@000cd8
{
    public boolean mDisableParticipateMethod;
    public String mDisplayAction;
    public int mDisplayStyle;
    public boolean mIsParticipateButtonNegative;
    public String mParticipateDescription;
    public String mParticipateStatus;
    public String mParticipateTextColor;
    public boolean mParticipated;
    public int mRequirementCompleteStatus;
    public long mWatchDurationMs;
    public long mWatchTargetDurationMs;
    public static final long serialVersionUID = 0xe9c6853edcc20d5;

    public void LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo(){
       super();
       this.mParticipated = false;
       this.mDisplayAction = "";
       this.mDisplayStyle = 1;
    }
}
