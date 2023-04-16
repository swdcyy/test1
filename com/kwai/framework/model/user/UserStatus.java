package com.kwai.framework.model.user.UserStatus;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yl8.b;

public class UserStatus extends DefaultObservableAndSyncable	// class@001776
{
    public UserStatus$CoverColor mCoverColor;
    public List mCoverUrl;
    public long mCreateTime;
    public List mDynamicImageUrls;
    public String mId;
    public boolean mIsLiked;
    public long mLikeCount;
    public List mMoodAggregateUsers;
    public String mMoodCountText;
    public String mMoodPostTimeText;
    public int mMoodStatus;
    public String mMoodText;
    public Status mMoodTypeInfo;
    public int mPostedStatus;
    public String mSameMoodText;
    public List mStaticImageUrls;
    public long mVisitorCount;
    public long mZtPhotoId;
    public static final long serialVersionUID = 0x7bba31ea1421c6b6;

    public void UserStatus(){
       super();
    }
    public String getBizId(){
       return this.mId;
    }
    public void sync(UserStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserStatus.class, "1")) {
          return;
       }
       this.mMoodPostTimeText = p0.mMoodPostTimeText;
       this.mMoodTypeInfo = p0.mMoodTypeInfo;
       this.mSameMoodText = p0.mSameMoodText;
       this.mLikeCount = p0.mLikeCount;
       this.mVisitorCount = p0.mVisitorCount;
       this.mIsLiked = p0.mIsLiked;
       this.mId = p0.mId;
       this.mZtPhotoId = p0.mZtPhotoId;
       this.mMoodStatus = p0.mMoodStatus;
       this.mCreateTime = p0.mCreateTime;
       this.mDynamicImageUrls = p0.mDynamicImageUrls;
       this.mStaticImageUrls = p0.mStaticImageUrls;
       this.mCoverColor = p0.mCoverColor;
       this.mMoodText = p0.mMoodText;
       this.mPostedStatus = p0.mPostedStatus;
       this.notifyChanged();
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
