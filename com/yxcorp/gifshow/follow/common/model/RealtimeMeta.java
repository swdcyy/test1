package com.yxcorp.gifshow.follow.common.model.RealtimeMeta;
import java.io.Serializable;
import java.lang.Object;

public class RealtimeMeta implements Serializable	// class@00106a
{
    public CDNUrl[] mCdnList;
    public String mContent;
    public int mContentType;
    public CDNUrl[] mCoverThumbnailUrls;
    public String mFeedId;
    public String mLinkUrl;
    public RealtimeMeta$LogParams mLogParams;
    public List mPhotos;
    public RealtimeMeta$PymkParams mPymkExtParams;
    public List mRecommendUsers;
    public int mRecommendUsersFromIndex;
    public CDNUrl[] mRightIconUrls;
    public boolean mShown;
    public String mSubTitle;
    public int mTheme;
    public String mTitle;
    public User[] mUserAvatars;
    public static final long serialVersionUID = 0xbd447c7177203ab4;

    public void RealtimeMeta(){
       super();
    }
}
