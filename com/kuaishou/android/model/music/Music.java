package com.kuaishou.android.model.music.Music;
import java.lang.Cloneable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import com.kuaishou.android.model.music.Music$MusicDuringInfo;
import java.lang.Math;
import com.kuaishou.android.model.music.Music$MusicLabel;
import com.kuaishou.android.model.music.MusicLabelType;
import java.lang.Enum;
import java.lang.StringBuilder;
import ok.k;
import yl8.b;

public class Music extends DefaultObservableAndSyncable implements Cloneable	// class@000688
{
    public int index;
    public boolean isOriginal;
    public CDNUrl[] mAccompanimentUrls;
    public String mAiRapStyle;
    public Music$MusicAnalysisResult mAnalysisResult;
    public String mArtist;
    public String mArtistId;
    public String mArtistName;
    public UploadedMusicAuditStatus mAuditStatus;
    public String mAuditionUrl;
    public CDNUrl[] mAuditionUrls;
    public String mAvatarUrl;
    public CDNUrl[] mAvatarUrls;
    public int mBillboardType;
    public int mCSource;
    public long mCategoryId;
    public String mCategoryName;
    public int mChorus;
    public long mClipStartMills;
    public int mCopyrightTimeLimitInSecond;
    public int mCoverHeight;
    public String mCoverPath;
    public int mCoverWidth;
    public int mDataListIndex;
    public String mDescription;
    public boolean mDisableEnhancedEntry;
    public boolean mDisplayPhotoCount;
    public int mDuration;
    public String mExpTag;
    public String mFileId;
    public String mId;
    public String mImageUrl;
    public CDNUrl[] mImageUrls;
    public boolean mInstrumental;
    public boolean mIsFakeQPhoto;
    public int mIsFavorited;
    public boolean mIsMagicRecommend;
    public boolean mIsMockForGroupTitle;
    public int mIsNotSafe;
    public boolean mIsRecordMusic;
    public boolean mIsSearchResult;
    public int mKtvBeginTime;
    public int mKtvEndTime;
    public String[] mLicensedPlaySceneList;
    public String mLlsid;
    public double mLoudness;
    public String mLrcUrl;
    public CDNUrl[] mLrcUrls;
    public String mLyrics;
    public List mMappingTextTags;
    public CDNUrl[] mMelodyUrls;
    public String mMmuLrcUrl;
    public CDNUrl[] mMmuLrcUrls;
    public String mMmuLyrics;
    public CDNUrl[] mMmuMelodyUrls;
    public Music$MusicBackgroundColorInfo mMusicBackgroundColorInfo;
    public String mMusicBeatsString;
    public String mMusicBeatsUrl;
    public String mMusicDocId;
    public String mMusicDownbeatsUrl;
    public Music$MusicDuringInfo[] mMusicDuringInfoList;
    public Music$MusicLabel[] mMusicLabelList;
    public MusicPartners mMusicPartners;
    public MusicRankModel mMusicRankModel;
    public MusicRankModelV2 mMusicRankModelV2;
    public int mMusicSearchRank;
    public String mMusicianUid;
    public String mName;
    public boolean mNameChanged;
    public MusicType mNewType;
    public boolean mOnLine;
    public String mPath;
    public float mPercent;
    public Long mPhotoCount;
    public String mPhotoId;
    public String mPureName;
    public String mRecommendReason;
    public String mSearchKeyWord;
    public boolean mShowed;
    public long mSingingCount;
    public int mSnippetDuration;
    public CDNUrl[] mSnippetUrls;
    public int mSoundTrackPromoteStrategy;
    public String mTagSourcePhotoId;
    public String mTitle;
    public MusicType mType;
    public String mUploadTime;
    public String mUrl;
    public CDNUrl[] mUrls;
    public long mUsedDuration;
    public long mUsedStart;
    public UserInfo mUserProfile;
    public String mUssid;
    public int mViewAdapterPosition;
    public long mVocalStartTime;
    public boolean needResetFavoriteState;
    public static final long serialVersionUID = 0x178e30710a15047d;

    public void Music(){
       super();
       this.mType = MusicType.UNKNOWN;
       this.mLoudness = -15.00f;
       this.mOnLine = true;
       this.mPercent = 0;
       this.mPath = "";
       this.mFileId = "";
       this.mCoverPath = "";
       this.mCategoryId = 0;
       this.mDataListIndex = -1;
       this.needResetFavoriteState = false;
    }
    public Music clone(){
       Music obj = PatchProxy.apply(null, this, Music.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Music();
       obj.mId = this.mId;
       obj.mType = this.mType;
       obj.mNewType = this.mNewType;
       obj.mName = this.mName;
       obj.mPureName = this.mPureName;
       obj.mUrl = this.mUrl;
       obj.mUrls = this.mUrls;
       obj.mLrcUrl = this.mLrcUrl;
       obj.mLrcUrls = this.mLrcUrls;
       obj.mMmuLrcUrls = this.mMmuLrcUrls;
       obj.mMmuLrcUrl = this.mMmuLrcUrl;
       obj.mArtist = this.mArtist;
       obj.mArtistId = this.mArtistId;
       obj.mLyrics = this.mLyrics;
       obj.mMmuLyrics = this.mMmuLyrics;
       obj.mImageUrl = this.mImageUrl;
       obj.mImageUrls = this.mImageUrls;
       obj.mAuditionUrls = this.mAuditionUrls;
       obj.mAuditionUrl = this.mAuditionUrl;
       obj.mAvatarUrl = this.mAvatarUrl;
       obj.mAuditionUrls = this.mAuditionUrls;
       obj.mDuration = this.mDuration;
       obj.mDescription = this.mDescription;
       obj.mChorus = this.mChorus;
       obj.mKtvBeginTime = this.mKtvBeginTime;
       obj.mKtvEndTime = this.mKtvEndTime;
       obj.mSingingCount = this.mSingingCount;
       obj.mExpTag = this.mExpTag;
       obj.mInstrumental = this.mInstrumental;
       obj.mOnLine = this.mOnLine;
       obj.mAccompanimentUrls = this.mAccompanimentUrls;
       obj.mIsFavorited = this.mIsFavorited;
       obj.mIsNotSafe = this.mIsNotSafe;
       obj.mSnippetUrls = this.mSnippetUrls;
       obj.mSnippetDuration = this.mSnippetDuration;
       obj.mMelodyUrls = this.mMelodyUrls;
       obj.mMusicianUid = this.mMusicianUid;
       obj.mPhotoCount = this.mPhotoCount;
       obj.mSoundTrackPromoteStrategy = this.mSoundTrackPromoteStrategy;
       obj.mDisableEnhancedEntry = this.mDisableEnhancedEntry;
       obj.mPhotoId = this.mPhotoId;
       obj.mNameChanged = this.mNameChanged;
       obj.mMusicRankModel = this.mMusicRankModel;
       obj.mMusicRankModelV2 = this.mMusicRankModelV2;
       obj.mUsedStart = this.mUsedStart;
       obj.mUsedDuration = this.mUsedDuration;
       obj.mIsRecordMusic = this.mIsRecordMusic;
       obj.mCSource = this.mCSource;
       obj.mMusicPartners = this.mMusicPartners;
       obj.mTagSourcePhotoId = this.mTagSourcePhotoId;
       obj.mUserProfile = this.mUserProfile;
       obj.mAuditStatus = this.mAuditStatus;
       obj.mArtistName = this.mArtistName;
       obj.mUploadTime = this.mUploadTime;
       obj.mPercent = this.mPercent;
       obj.mPath = this.mPath;
       obj.mFileId = this.mFileId;
       obj.mCoverPath = this.mCoverPath;
       obj.mCoverWidth = this.mCoverWidth;
       obj.mCoverHeight = this.mCoverHeight;
       obj.mIsFakeQPhoto = this.mIsFakeQPhoto;
       obj.mClipStartMills = this.mClipStartMills;
       obj.mLlsid = this.mLlsid;
       obj.mUssid = this.mUssid;
       obj.mCategoryId = this.mCategoryId;
       obj.mCategoryName = this.mCategoryName;
       obj.mViewAdapterPosition = this.mViewAdapterPosition;
       obj.mSearchKeyWord = this.mSearchKeyWord;
       obj.mIsSearchResult = this.mIsSearchResult;
       obj.mBillboardType = this.mBillboardType;
       obj.index = this.index;
       obj.mLoudness = this.mLoudness;
       obj.mCopyrightTimeLimitInSecond = this.mCopyrightTimeLimitInSecond;
       obj.mVocalStartTime = this.mVocalStartTime;
       obj.mAiRapStyle = this.mAiRapStyle;
       obj.mMusicBeatsString = this.mMusicBeatsString;
       obj.mAnalysisResult = this.mAnalysisResult;
       obj.mMusicBeatsUrl = this.mMusicBeatsUrl;
       obj.mMusicDownbeatsUrl = this.mMusicDownbeatsUrl;
       obj.mMusicDocId = this.mMusicDocId;
       obj.mMusicSearchRank = this.mMusicSearchRank;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Music obj = PatchProxy.applyOneRefs(p0, this, Music.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof Music) {
          if (!TextUtils.isEmpty(p0.mId) && !TextUtils.isEmpty(this.mId)) {
             if (TextUtils.equals(p0.mId, this.mId) && p0.mType == this.mType) {
                b = true;
             }
             return b;
          }else if(!TextUtils.isEmpty(p0.mFileId) && !TextUtils.isEmpty(this.mFileId)){
             if (TextUtils.equals(p0.mFileId, this.mFileId) && p0.mType == this.mType) {
                b = true;
             }
             return b;
          }else {
             obj = p0.mType;
             if (obj == MusicType.LOCAL && obj == this.mType) {
                return TextUtils.equals(this.mPath, p0.mPath);
             }
          }
       }
       return b;
    }
    public String getArtist(){
       return this.mArtist;
    }
    public String getArtistId(){
       return this.mArtistId;
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, Music.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUniqueCode();
    }
    public String getCategoryId(){
       Object obj = PatchProxy.apply(null, this, Music.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mCategoryId);
    }
    public String getDisplayName(){
       return this.mName;
    }
    public String getId(){
       return this.mId;
    }
    public int getReallyDuring(){
       Music obj = PatchProxy.apply(null, this, Music.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMusicDuringInfoList;
       if (obj != null && obj.length > 0) {
          Music tmDuration = this.mDuration;
          int i = 0;
          if (tmDuration > null) {
             return Math.min((int)(obj[i].mReallyDuration / 1000), tmDuration);
          }
          return (int)(obj[i].mReallyDuration / 1000);
       }else {
          obj = this.mDuration;
          if (obj > null) {
             return obj;
          }
          return this.mCopyrightTimeLimitInSecond;
       }
    }
    public String getSleepMusicLabel(){
       Music obj = PatchProxy.apply(null, this, Music.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMusicLabelList;
       if (obj != null) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             object oobject = obj[i];
             if (oobject.mMusicLabelType == MusicLabelType.SLEEP.ordinal()) {
                return oobject.mMusicLabelValue;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public int getType(){
       Music tmType = this.mType;
       if (tmType != null) {
          return tmType.mValue;
       }
       return 0;
    }
    public String getUniqueCode(){
       Object obj = PatchProxy.apply(null, this, Music.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mId+"_"+this.mType.mValue;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, Music.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = 2;
       if (!TextUtils.isEmpty(this.mId)) {
          obj = new Object[i1];
          obj[i] = this.mId;
          obj[1] = this.mType;
          return k.b(obj);
       }else if(!TextUtils.isEmpty(this.mFileId)){
          obj = new Object[i1];
          obj[i] = this.mType;
          obj[1] = this.mFileId;
          return k.b(obj);
       }else {
          Music tmType = this.mType;
          if (tmType != MusicType.LOCAL) {
             return super.hashCode();
          }
          Object[] objArray = new Object[i1];
          objArray[i] = tmType;
          objArray[1] = this.mPath;
          return k.b(objArray);
       }
    }
    public boolean isBillboardMusic(){
       boolean b = (this.mBillboardType > null)? true: false;
       return b;
    }
    public boolean isCopyrightRiskMusic(){
       Music obj = PatchProxy.apply(null, this, Music.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLicensedPlaySceneList;
       if (obj == null) {
          return false;
       }
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if ((obj[i]).equals("1")) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public boolean isFavorited(){
       boolean b = (this.mIsFavorited != null)? true: false;
       return b;
    }
    public boolean isInstrumental(){
       return this.mInstrumental;
    }
    public boolean isOffline(){
       boolean b = (this.mOnLine == null || this.mIsNotSafe != null)? true: false;
       return b;
    }
    public boolean isRecommendMusic(){
       Object obj = PatchProxy.apply(null, this, Music.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.mLlsid) ^ 0x01);
    }
    public boolean isSearchDispatchMusic(){
       Object obj = PatchProxy.apply(null, this, Music.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.mUssid) ^ 0x01);
    }
    public boolean isSleepMusic(){
       Music obj = PatchProxy.apply(null, this, Music.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMusicLabelList;
       if (obj != null) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             if (obj[i].mMusicLabelType == MusicLabelType.SLEEP.ordinal()) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public boolean isUploadingOrNotTranscoding(){
       Object obj = PatchProxy.apply(null, this, Music.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.mFileId) ^ 0x01);
    }
    public void resetData(Music p0){
       this.mId = p0.mId;
       this.mName = p0.mName;
       this.mPercent = p0.mPercent;
       this.mArtistName = p0.mArtistName;
       this.mType = p0.mType;
       this.mAuditStatus = p0.mAuditStatus;
       this.mUploadTime = p0.mUploadTime;
       this.mUrl = p0.mUrl;
       this.mUserProfile = p0.mUserProfile;
       this.mLrcUrl = p0.mLrcUrl;
       this.mLyrics = p0.mLyrics;
       this.mMmuLyrics = p0.mMmuLyrics;
       this.mMmuLrcUrl = p0.mMmuLrcUrl;
       this.mFileId = p0.mFileId;
       this.mPath = p0.mPath;
       this.mPhotoCount = p0.mPhotoCount;
       this.mAvatarUrl = p0.mAvatarUrl;
       this.mMusicRankModel = p0.mMusicRankModel;
       this.mMusicRankModelV2 = p0.mMusicRankModelV2;
       this.mLoudness = p0.mLoudness;
    }
    public void sync(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Music.class, "12")) {
          return;
       }
       this.mIsFavorited = p0.mIsFavorited;
       this.mName = p0.mName;
       this.notifyChanged(this);
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
