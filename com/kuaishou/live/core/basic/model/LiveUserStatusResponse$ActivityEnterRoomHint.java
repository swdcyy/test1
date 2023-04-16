package com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LiveUserStatusResponse$ActivityEnterRoomHint implements Serializable	// class@0008a0
{
    public String mActivityType;
    public long mAnimationIntervalMs;
    public CDNUrl[] mAvatarDynamicRingUrls;
    public CDNUrl[] mAvatarRingUrls;
    public CDNUrl[] mAvatarStaticRingUrls;
    public String[] mBackgroudBorderColors;
    public int mBackgroundBorderWidth;
    public String[] mBackgroundColors;
    public LiveEnterRoomEffectBackgroudPicInfo mBackgroundPicInfo;
    public CDNUrl[] mBadgePic;
    public int mBadgePicHeight;
    public int mBadgePicWidth;
    public String mCommonEffectInfo;
    public String mDisplayText;
    public int mDisplayType;
    public String mMountKey;
    public String mNobleAnimationKey;
    public int mNobleEnterRoomAvatarRingSize;
    public int mNobleEnterRoomAvatarSize;
    public int mNobleEnterRoomMountHeight;
    public int mPicHeight;
    public CDNUrl[] mPicUrl;
    public int mPicWidth;
    public String mTextColor;
    public int mTextLeftMargin;
    public UserInfo mUserInfo;
    public String mWelcomeAnimationKey;
    public static final long serialVersionUID = 0x2195c4db7abe65bf;

    public void LiveUserStatusResponse$ActivityEnterRoomHint(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveUserStatusResponse$ActivityEnterRoomHint.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityEnterRoomHint{mActivityType=\'"+this.mActivityType+'''+", mDisplayType="+this.mDisplayType+", mPicUrl="+Arrays.toString(this.mPicUrl)+", mPicHeight="+this.mPicHeight+", mPicWidth="+this.mPicWidth+", mDisplayText=\'"+this.mDisplayText+'''+", mTextColor=\'"+this.mTextColor+'''+", mTextLeftMargin="+this.mTextLeftMargin+", mBackgroundBorderWidth="+this.mBackgroundBorderWidth+", mBackgroundColors="+Arrays.toString(this.mBackgroundColors)+", mBackgroudBorderColors="+Arrays.toString(this.mBackgroudBorderColors)+", mMountKey=\'"+this.mMountKey+'''+", mAvatarRingUrls="+Arrays.toString(this.mAvatarRingUrls)+", mNobleAnimationKey=\'"+this.mNobleAnimationKey+'''+", mWelcomeAnimationKey=\'"+this.mWelcomeAnimationKey+'''+", mNobleEnterRoomAvatarRingSize="+this.mNobleEnterRoomAvatarRingSize+", mNobleEnterRoomAvatarSize="+this.mNobleEnterRoomAvatarSize+", mNobleEnterRoomMountHeight="+this.mNobleEnterRoomMountHeight+", mAvatarDynamicRingUrls="+Arrays.toString(this.mAvatarDynamicRingUrls)+", mAvatarStaticRingUrls="+Arrays.toString(this.mAvatarStaticRingUrls)+", mAnimationIntervalMs="+this.mAnimationIntervalMs+", mBackgroundPicInfo="+this.mBackgroundPicInfo+", mBadgePic="+Arrays.toString(this.mBadgePic)+", mBadgePicWidth="+this.mBadgePicWidth+", mBadgePicHeight="+this.mBadgePicHeight+", mUserInfo="+this.mUserInfo+", mCommonEffectInfo=\'"+this.mCommonEffectInfo+'''+'}';
    }
}
