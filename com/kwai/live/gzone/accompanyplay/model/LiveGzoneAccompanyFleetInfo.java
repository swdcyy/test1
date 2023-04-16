package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGzoneAccompanyFleetInfo implements Serializable, b	// class@000c2f
{
    public String currentBizRoundId;
    public String mAccompanyId;
    public LiveGzoneAccompanySdkPlatformConfig mAccompanySdkPlatformConfig;
    public int mAccompanyStatus;
    public int mAllowedMaxUser;
    public long mAnchorCancelFrozenTime;
    public CDNUrl[] mBackground;
    public LiveGzoneAccompanyBindGameAccountInfo mBindGameAccountInfo;
    public long mCreatingRoundId;
    public LiveGzoneAccompanyEasyBoardConfig mEasyBoardConfig;
    public String mEasyBoardGuideUrl;
    public int mEasyBoardType;
    public boolean mEnableOneClick;
    public int mEnableQueuing;
    public String mFleetTitle;
    public CDNUrl[] mGameBackground;
    public LiveGzoneAccompanyGameDownloadConfig mGameDownloadConfig;
    public String mGameId;
    public String mGameName;
    public LiveGzoneLivelinkConfig mLivelinkConfig;
    public long mLocalTimeDiff;
    public List mOnBoardMembers;
    public boolean mReachWaitingLimit;
    public String mRoundId;
    public long mRoundStartTimestamp;
    public int mRoundStatus;
    public List mSettings;
    public long mTimestamp;
    public int mWaitingMemberCount;
    public List mWaitingUserList;
    public static final long serialVersionUID = 0x68bcad112222ec85;

    public void LiveGzoneAccompanyFleetInfo(){
       super();
    }
    public boolean enableRoomLink(){
       boolean b = (this.mEasyBoardType == 2)? true: false;
       return b;
    }
    public List getItems(){
       return this.mOnBoardMembers;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isEnableLivelink(){
       boolean b = (this.mLivelinkConfig != null)? true: false;
       return b;
    }
    public boolean isEnableQueuing(){
       boolean b = true;
       if (this.mEnableQueuing == b) {
       }else {
          b = false;
       }
       return b;
    }
}
