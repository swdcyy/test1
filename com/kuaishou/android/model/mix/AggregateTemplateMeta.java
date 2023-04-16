package com.kuaishou.android.model.mix.AggregateTemplateMeta;
import java.io.Serializable;
import java.lang.Object;

public class AggregateTemplateMeta implements Serializable	// class@000bb2
{
    public String mAudienceCount;
    public String mBottomButton;
    public String mContent;
    public int mContentType;
    public List mCoverFeedInfos;
    public Distance mDistance;
    public String mExpTag;
    public ExtMeta mExtMeta;
    public String mFeedId;
    public boolean mHasShowed;
    public boolean mHideCloseButton;
    public CDNUrl[] mIconUrls;
    public int mInnerFeedType;
    public String mLinkUrl;
    public Distance mLocation;
    public String mNewStyle;
    public List mPhotoInfos;
    public RecoUser mRecoUser;
    public User mRecommendUser;
    public List mRecommendUsers;
    public int mScene;
    public boolean mShowContact;
    public String mShowLocation;
    public int mTheme;
    public String mTitle;
    public List mUsers;
    public static final long serialVersionUID = 0x3957d39bc58758f7;

    public void AggregateTemplateMeta(){
       super();
       this.mInnerFeedType = 1;
    }
}
