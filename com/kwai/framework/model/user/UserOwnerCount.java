package com.kwai.framework.model.user.UserOwnerCount;
import java.io.Serializable;
import java.lang.Object;

public class UserOwnerCount implements Serializable	// class@000bdf
{
    public int mAcFun;
    public int mArticlePublic;
    public int mCollection;
    public int mCreation;
    public int mDesignerMagic;
    public int mFan;
    public String mFansCountText;
    public int mFollow;
    public int mLike;
    public int mLivePlayBack;
    public int mMoment;
    public int mNews;
    public int mPhoto;
    public int mPrivatePhoto;
    public int mPublicPhoto;
    public int mSong;
    public long mTotalPhotoLike;
    public int mentionedMeWorksCount;
    public static final long serialVersionUID = 0xc61314ac74abd4bb;

    public void UserOwnerCount(){
       super();
       this.mFan = -1;
       this.mLike = -1;
       this.mPhoto = -1;
       this.mMoment = -1;
       this.mNews = -1;
       this.mCollection = -1;
       this.mFollow = -1;
       this.mPublicPhoto = -1;
       this.mPrivatePhoto = -1;
       this.mSong = -1;
       this.mArticlePublic = -1;
       this.mLivePlayBack = -1;
       this.mDesignerMagic = -1;
       this.mentionedMeWorksCount = -1;
       this.mAcFun = -1;
       this.mCreation = -1;
    }
}
