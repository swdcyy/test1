package com.yxcorp.gifshow.share.config.PhotoShareGuideConfig;
import java.io.Serializable;
import java.lang.Object;

public class PhotoShareGuideConfig implements Serializable	// class@001b76
{
    public boolean mPhotoShareGuide;
    public int mTextDisplayTimesPerDay;
    public static final long serialVersionUID = 0xae43926407903705;

    public void PhotoShareGuideConfig(){
       super();
       this.mPhotoShareGuide = false;
       this.mTextDisplayTimesPerDay = 5;
    }
}
