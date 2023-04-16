package com.kwai.feature.api.corona.model.CoronaTvFilm;
import java.io.Serializable;
import java.lang.Object;

public class CoronaTvFilm implements Serializable	// class@000e0c
{
    public boolean disableRelatedFeeds;
    public List mActor;
    public List mBigCardTags;
    public String mColor;
    public List mContentCategory;
    public String mDescription;
    public List mDetailPhotoTags;
    public List mDetailRelatedTags;
    public List mDetailShortDesFirtLine;
    public List mDetailShortDesSecondLine;
    public List mDirectors;
    public CoronaTvFilm$EpisodeModuleInfo mEpisodeModuleInfo;
    public int mEpisodeNum;
    public long mGradeNum;
    public int mIpType;
    public String mKgID;
    public CDNUrl[] mLandscapeCover;
    public String mLatestDescription;
    public String mMaoyanGrade;
    public String mModuleTitle;
    public String mName;
    public String mPanelTitle;
    public List mPidsInfo;
    public String mPlayCountView;
    public CDNUrl[] mPosterUrl;
    public String mRecommendWord;
    public String mRegion;
    public String mReleaseDate;
    public int mSequenceNum;
    public String mShortDescription;
    public List mSubscribeTags;
    public long mSubscribeTime;
    public boolean mSubscribed;
    public ArrayList mTags;
    public int mTvCopyright;
    public static final long serialVersionUID = 0x707d204f4239b835;

    public void CoronaTvFilm(){
       super();
    }
    public boolean isMultipleEpisodes(){
       boolean b = true;
       if (this.mEpisodeNum > b) {
       }else {
          b = false;
       }
       return b;
    }
}
