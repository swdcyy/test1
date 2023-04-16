package com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsSimpleGuide;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig;
import java.lang.Object;

public class FollowLiveTipsGuideConfig$LiveTipsSimpleGuide implements Serializable	// class@001096
{
    public int mConsumePhotoNum;
    public long mConsumePhotoTime;
    public long mShowTime;
    public String mText;
    public final FollowLiveTipsGuideConfig this$0;
    public static final long serialVersionUID = 0x11adaa71ec5f77d2;

    public void FollowLiveTipsGuideConfig$LiveTipsSimpleGuide(FollowLiveTipsGuideConfig p0){
       this.this$0 = p0;
       super();
       this.mShowTime = 3000;
       this.mConsumePhotoNum = 2;
       this.mConsumePhotoTime = 1000;
    }
}
