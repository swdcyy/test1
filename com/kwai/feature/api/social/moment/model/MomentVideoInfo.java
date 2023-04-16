package com.kwai.feature.api.social.moment.model.MomentVideoInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kwai.feature.api.social.moment.model.MomentVideoInfo$ExtParams;

public class MomentVideoInfo implements Serializable, a	// class@001194
{
    public boolean mAdjusted;
    public CDNUrl[] mCoverUrls;
    public long mDuration;
    public MomentVideoInfo$ExtParams mExtParams;
    public CDNUrl[] mFFCoverThumbnailUrls;
    public int mHeight;
    public String mLocalPath;
    public CDNUrl[] mVideoUrls;
    public int mWidth;
    public static final long serialVersionUID = 0x3fa0a424ea6beee3;

    public void MomentVideoInfo(){
       super();
    }
    public void afterDeserialize(){
       MomentVideoInfo tmExtParams = this.mExtParams;
       if (tmExtParams != null) {
          this.mWidth = tmExtParams.mWidth;
          this.mHeight = tmExtParams.mHeight;
          this.mDuration = tmExtParams.mDuration;
       }
       return;
    }
}
