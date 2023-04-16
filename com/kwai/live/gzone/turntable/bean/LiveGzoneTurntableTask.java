package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTask;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;

public class LiveGzoneTurntableTask implements Serializable, a	// class@000e3c
{
    public String mCommentContent;
    public List mCornerMarkUrl;
    public int mDayLimit;
    public String mGameIcon;
    public String mGameId;
    public String mGameName;
    public long mGameStartTime;
    public int mGiftId;
    public boolean mHasFollowed;
    public String mLink;
    public int mListIndex;
    public int mObtainedDrawCount;
    public List mPicUrl;
    public String mPkgName;
    public int mRequirement;
    public int mRequirementCount;
    public String mTaskId;
    public String mTip;
    public int mType;
    public static final long serialVersionUID = 0x5c43560153861122;

    public void LiveGzoneTurntableTask(){
       super();
    }
    public void afterDeserialize(){
       if (this.mType == 4 && this.mHasFollowed != null) {
          this.mRequirementCount = 1;
          this.mObtainedDrawCount = 1;
       }
       return;
    }
    public int getStatus(){
       if (this.mObtainedDrawCount == this.mDayLimit) {
          return 2;
       }
       return 1;
    }
    public boolean isVisitSpecificPageType(){
       boolean b = (this.mType == 9)? true: false;
       return b;
    }
    public boolean isWatchLiveTimeType(){
       LiveGzoneTurntableTask tmType = this.mType;
       boolean b = (tmType != 7 && (tmType == 6 || tmType == 5))? true: false;
       return b;
    }
}
