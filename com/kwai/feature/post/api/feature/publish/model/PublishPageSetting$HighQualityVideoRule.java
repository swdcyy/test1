package com.kwai.feature.post.api.feature.publish.model.PublishPageSetting$HighQualityVideoRule;
import java.io.Serializable;
import java.lang.Object;

public class PublishPageSetting$HighQualityVideoRule implements Serializable	// class@0013c1
{
    public int mFps;
    public int mLongSide;
    public int mShortSide;
    public static final long serialVersionUID = 0x5d2bbcde3ceef8e5;

    public void PublishPageSetting$HighQualityVideoRule(){
       super();
       this.mShortSide = Integer.MAX_VALUE;
       this.mLongSide = Integer.MAX_VALUE;
       this.mFps = Integer.MAX_VALUE;
    }
}
