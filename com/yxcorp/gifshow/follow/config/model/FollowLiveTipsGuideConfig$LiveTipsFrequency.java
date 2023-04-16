package com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsFrequency;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig;
import java.lang.Object;

public class FollowLiveTipsGuideConfig$LiveTipsFrequency implements Serializable	// class@001094
{
    public long mDayMaxShowTime;
    public int mPerAnchorDayShowTime;
    public long mPerSlideSessionShowTime;
    public long mShowInterval;
    public final FollowLiveTipsGuideConfig this$0;
    public static final long serialVersionUID = 0x11adaa71ec5f77d2;

    public void FollowLiveTipsGuideConfig$LiveTipsFrequency(FollowLiveTipsGuideConfig p0){
       this.this$0 = p0;
       super();
       this.mPerAnchorDayShowTime = 1;
       this.mShowInterval = 0x7530;
       this.mPerSlideSessionShowTime = 3;
       this.mDayMaxShowTime = 10;
    }
}
