package com.yxcorp.gifshow.model.response.UsersResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class UsersResponse implements CursorResponse, Serializable	// class@001240
{
    public int familiarCount;
    public int fansCount;
    public int followingCount;
    public List mAbnormalUsers;
    public int mActionButtonType;
    public int mContactsFriendsCount;
    public boolean mContactsUploaded;
    public String mCursor;
    public boolean mEnableFansSearch;
    public boolean mEnableRelationListOptimize;
    public boolean mEnableShowUnreadPhotoEntrance;
    public String mExtraInfo;
    public List mFavoriteFollowings;
    public FollowBackInfo mFollowBackInfo;
    public List mFriends;
    public long mLastInsertTime;
    public List mLatestContactUsers;
    public int mLessInteractionFollowGroup;
    public PhotoRewardCollectStat mPhotoRewardCollectStat;
    public String mPrsid;
    public String mRecoFansCacheKey;
    public boolean mShowPublicFollowTip;
    public int mSubTitleStyle;
    public List mUsers;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void UsersResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mUsers;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, UsersResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mCursor) && !("no_more").equals(this.mCursor))? true: false;
       return b;
    }
}
