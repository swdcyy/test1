package com.kwai.feature.api.social.followStagger.model.FollowV5StyleConfig;
import java.io.Serializable;
import java.lang.Object;

public class FollowV5StyleConfig implements Serializable	// class@0010d6
{
    public boolean mExchangeLikeAndTimeStampPosition;
    public boolean mShowAuthorName;
    public boolean mShowTimeStamp;
    public static final long serialVersionUID = 0x383242e98c23ed58;

    public void FollowV5StyleConfig(){
       super();
       this.mShowAuthorName = true;
       this.mShowTimeStamp = false;
       this.mExchangeLikeAndTimeStampPosition = true;
    }
}
