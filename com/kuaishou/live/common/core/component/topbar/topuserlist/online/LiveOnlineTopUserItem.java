package com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveOnlineTopUserItem implements Serializable	// class@00179c
{
    public String mAvatarRingDynamicPicKey;
    public CDNUrl[] mAvatarRingPicUrl;
    public String mBadgeDynamicKey;
    public String mBadgeJumpUrl;
    public CDNUrl[] mBadgeUrls;
    public String mBase64Segments;
    public String mDisplayFansCount;
    public String mDisplayKsCoin;
    public String mDisplayPhotoCount;
    public String mDisplayToAudienceKsCoin;
    public String mDisplayToAuthorKsCoin;
    public long mFansCount;
    public boolean mHasLoggedShowEvent;
    public List mIconSegments;
    public int mIndex;
    public long mKsCoin;
    public LiveTopUserItemExtraInfo mLiveTopUserItemExtraInfo;
    public int mPhotoCount;
    public long mToAudienceKsCoin;
    public long mToAuthorKsCoin;
    public UserVerifiedDetail mTopUserVerifiedDetail;
    public UserInfo mUserInfo;
    public LiveOnlineTopUserItem$LiveTopUserWatchDurationInfo mWatchDurationInfo;
    public int mWealthGrade;
    public CharSequence userStateDisplayIcon;
    public static final long serialVersionUID = 0x837021d0678b290;

    public void LiveOnlineTopUserItem(){
       super();
    }
}
