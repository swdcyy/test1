package com.kwai.feature.api.corona.model.CoronaTvSerial;
import java.io.Serializable;
import java.lang.Object;

public class CoronaTvSerial implements Serializable	// class@000e10
{
    public List mBigCardTags;
    public String mColor;
    public long mCommentCount;
    public List mDetailPhotoTags;
    public CoronaTvSerial$TVEpisodeInfo mEpisodeInfo;
    public int mEpisodeNum;
    public QPhoto mFilm;
    public String mId;
    public String mKgID;
    public CDNUrl[] mLandscapeCover;
    public String mLatestDescription;
    public String mModuleTitle;
    public String mName;
    public String mPanelTitle;
    public CDNUrl[] mPosterUrl;
    public String mRecommendWord;
    public List mSubscribeTags;
    public long mSubscribeTime;
    public boolean mSubscribed;
    public int mType;
    public long mViewCount;
    public static final long serialVersionUID = 0x707cff9030fd8635;

    public void CoronaTvSerial(){
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
