package com.yxcorp.gifshow.profile.model.UserProfileBgMedia;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia$BackgroundVideo;

public class UserProfileBgMedia implements Serializable	// class@0013c4
{
    public UserProfileBgMedia$BackgroundVideo mBackground;
    public LiveStreamFeed mLiveFeed;
    public int mLiveStyle;
    public int mMType;
    public static final long serialVersionUID = 0x860023c791ebeb1b;

    public void UserProfileBgMedia(){
       super();
    }
    public UserProfileBgMedia$BackgroundVideo getImage(){
       if (this.mMType == 6) {
          UserProfileBgMedia tmBackground = this.mBackground;
          if (tmBackground != null && tmBackground.mCoverThumbnailUrls != null) {
             return tmBackground;
          }
       }
       return null;
    }
    public UserProfileBgMedia$BackgroundVideo getVideo(){
       if (this.mMType == 3) {
          UserProfileBgMedia tmBackground = this.mBackground;
          if (tmBackground != null && (tmBackground.mVideoUrls != null || tmBackground.mFeed != null)) {
             return tmBackground;
          }
       }
       return null;
    }
}
