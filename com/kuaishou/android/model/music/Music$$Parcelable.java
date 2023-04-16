package com.kuaishou.android.model.music.Music$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.Music$$Parcelable$a;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import com.kuaishou.android.model.music.MusicType;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.music.MusicPartners;
import com.kuaishou.android.model.music.Music$MusicAnalysisResult;
import com.kuaishou.android.model.music.Music$MusicDuringInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import java.lang.Long;
import com.kuaishou.android.model.music.MusicRankModel;
import com.kuaishou.android.model.music.MusicRankModel$$Parcelable;
import java.util.ArrayList;
import com.kuaishou.android.model.music.Music$MusicBackgroundColorInfo;
import java.lang.Class;
import java.lang.Enum;
import com.kuaishou.android.model.music.Music$MusicLabel;
import com.kuaishou.android.model.music.UploadedMusicAuditStatus;
import com.kuaishou.android.model.music.MusicRankModelV2;
import com.kuaishou.android.model.music.MusicRankModelV2$$Parcelable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import org.parceler.a$c;

public class Music$$Parcelable implements Parcelable, d	// class@000e50
{
    public Music music$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Music$$Parcelable.CREATOR = new Music$$Parcelable$a();
    }
    public void Music$$Parcelable(Music p0){
       super();
       this.music$$0 = p0;
    }
    public static Music read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       CDNUrl[] uCDNUrlArray2;
       Music$MusicDuringInfo[] musicDuringI;
       String[] stringArray;
       List list;
       Music$MusicLabel[] musicLabelAr;
       CDNUrl[] uCDNUrlArray3;
       int i4;
       MusicType musicType = MusicType.class;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Music music = new Music();
          p1.f(p1.g(), music);
          boolean i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (int i5 = 0; i5 < i1; i5 = i5 + 1) {
                uCDNUrlArray1[i5] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mAvatarUrls = uCDNUrlArray1;
          music.mIsNotSafe = p0.readInt();
          music.mSoundTrackPromoteStrategy = p0.readInt();
          music.mLlsid = p0.readString();
          music.mViewAdapterPosition = p0.readInt();
          music.mMusicianUid = p0.readString();
          music.mArtistName = p0.readString();
          int b = true;
          i1 = (p0.readInt() == b)? true: false;
          music.mDisableEnhancedEntry = i1;
          music.mArtistId = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          music.mIsSearchResult = i1;
          i1 = (p0.readInt() == b)? true: false;
          music.mIsMagicRecommend = i1;
          music.mMusicBeatsString = p0.readString();
          music.mDescription = p0.readString();
          music.mSnippetDuration = p0.readInt();
          music.mUploadTime = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mImageUrls = uCDNUrlArray2;
          music.mMusicPartners = p0.readSerializable();
          music.mPath = p0.readString();
          music.mDataListIndex = p0.readInt();
          music.mLoudness = p0.readDouble();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mAuditionUrls = uCDNUrlArray2;
          music.mAuditionUrl = p0.readString();
          music.mExpTag = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          music.mNameChanged = i1;
          music.mAnalysisResult = p0.readSerializable();
          music.mKtvBeginTime = p0.readInt();
          i1 = (p0.readInt() == b)? true: false;
          music.mInstrumental = i1;
          music.mCSource = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mLrcUrls = uCDNUrlArray2;
          music.index = p0.readInt();
          music.mUsedDuration = p0.readLong();
          i1 = p0.readInt();
          if (i1 < 0) {
             musicDuringI = uCDNUrlArray;
          }else {
             musicDuringI = new Music$MusicDuringInfo[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                musicDuringI[i4] = p0.readSerializable();
             }
          }
          music.mMusicDuringInfoList = musicDuringI;
          music.mUserProfile = UserInfo$$Parcelable.read(p0, p1);
          Long longx = (p0.readInt() < 0)? uCDNUrlArray: Long.valueOf(p0.readLong());
          music.mPhotoCount = longx;
          i1 = p0.readInt();
          if (i1 < 0) {
             stringArray = uCDNUrlArray;
          }else {
             stringArray = new String[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                stringArray[i4] = p0.readString();
             }
          }
          music.mLicensedPlaySceneList = stringArray;
          music.mMusicDocId = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          music.mDisplayPhotoCount = i1;
          music.mMusicRankModel = MusicRankModel$$Parcelable.read(p0, p1);
          music.mMusicDownbeatsUrl = p0.readString();
          music.mTagSourcePhotoId = p0.readString();
          music.mKtvEndTime = p0.readInt();
          music.mCopyrightTimeLimitInSecond = p0.readInt();
          i1 = (p0.readInt() == b)? true: false;
          music.mIsFakeQPhoto = i1;
          music.mSearchKeyWord = p0.readString();
          music.mPercent = p0.readFloat();
          music.mChorus = p0.readInt();
          music.mCoverPath = p0.readString();
          music.mTitle = p0.readString();
          music.mName = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                list.add(p0.readString());
             }
          }
          music.mMappingTextTags = list;
          music.mVocalStartTime = p0.readLong();
          music.mMusicBackgroundColorInfo = p0.readSerializable();
          music.mMmuLyrics = p0.readString();
          music.mMmuLrcUrl = p0.readString();
          music.mAvatarUrl = p0.readString();
          music.mPureName = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          music.mOnLine = i1;
          music.mCoverHeight = p0.readInt();
          music.mCategoryName = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          music.mIsRecordMusic = i1;
          music.mMusicSearchRank = p0.readInt();
          music.mMusicBeatsUrl = p0.readString();
          music.mLyrics = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mMmuLrcUrls = uCDNUrlArray2;
          String str = p0.readString();
          MusicType musicType1 = (str == null)? uCDNUrlArray: Enum.valueOf(musicType, str);
          music.mNewType = musicType1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mUrls = uCDNUrlArray2;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mMmuMelodyUrls = uCDNUrlArray2;
          music.mPhotoId = p0.readString();
          music.mSingingCount = p0.readLong();
          music.mUsedStart = p0.readLong();
          music.mImageUrl = p0.readString();
          music.mDuration = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             musicLabelAr = uCDNUrlArray;
          }else {
             musicLabelAr = new Music$MusicLabel[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                musicLabelAr[i4] = p0.readSerializable();
             }
          }
          music.mMusicLabelList = musicLabelAr;
          str = p0.readString();
          UploadedMusicAuditStatus uploadedMusi = (str == null)? uCDNUrlArray: Enum.valueOf(UploadedMusicAuditStatus.class, str);
          music.mAuditStatus = uploadedMusi;
          music.mBillboardType = p0.readInt();
          i1 = (p0.readInt() == b)? true: false;
          music.mIsMockForGroupTitle = i1;
          music.mMusicRankModelV2 = MusicRankModelV2$$Parcelable.read(p0, p1);
          music.mRecommendReason = p0.readString();
          music.mClipStartMills = p0.readLong();
          music.mUssid = p0.readString();
          music.mId = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray2 = uCDNUrlArray;
          }else {
             uCDNUrlArray2 = new CDNUrl[i1];
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uCDNUrlArray2[i4] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mAccompanimentUrls = uCDNUrlArray2;
          str = p0.readString();
          musicType = (str == null)? uCDNUrlArray: Enum.valueOf(musicType, str);
          music.mType = musicType;
          music.mUrl = p0.readString();
          music.mIsFavorited = p0.readInt();
          music.mFileId = p0.readString();
          if (p0.readInt() != b) {
             b = false;
          }
          music.isOriginal = b;
          music.mLrcUrl = p0.readString();
          music.mCoverWidth = p0.readInt();
          music.mArtist = p0.readString();
          int i3 = p0.readInt();
          if (i3 < 0) {
             uCDNUrlArray3 = uCDNUrlArray;
          }else {
             uCDNUrlArray3 = new CDNUrl[i3];
             for (b = 0; b < i3; b = b + 1) {
                uCDNUrlArray3[b] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mMelodyUrls = uCDNUrlArray3;
          music.mAiRapStyle = p0.readString();
          i3 = p0.readInt();
          if (i3 >= 0) {
             uCDNUrlArray = new CDNUrl[i3];
             for (; i2 < i3; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          music.mSnippetUrls = uCDNUrlArray;
          music.mCategoryId = p0.readLong();
          a.d(DefaultObservableAndSyncable.class, music, "mDefaultObservable", p0.readSerializable());
          p1.f(i, music);
          return music;
       }
    }
    public static void write(Music p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i4;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Music mAvatarUrls = p0.mAvatarUrls;
          int i2 = 0;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mAvatarUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsNotSafe);
          p1.writeInt(p0.mSoundTrackPromoteStrategy);
          p1.writeString(p0.mLlsid);
          p1.writeInt(p0.mViewAdapterPosition);
          p1.writeString(p0.mMusicianUid);
          p1.writeString(p0.mArtistName);
          p1.writeInt(p0.mDisableEnhancedEntry);
          p1.writeString(p0.mArtistId);
          p1.writeInt(p0.mIsSearchResult);
          p1.writeInt(p0.mIsMagicRecommend);
          p1.writeString(p0.mMusicBeatsString);
          p1.writeString(p0.mDescription);
          p1.writeInt(p0.mSnippetDuration);
          p1.writeString(p0.mUploadTime);
          mAvatarUrls = p0.mImageUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mImageUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mMusicPartners);
          p1.writeString(p0.mPath);
          p1.writeInt(p0.mDataListIndex);
          p1.writeDouble(p0.mLoudness);
          mAvatarUrls = p0.mAuditionUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mAuditionUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mAuditionUrl);
          p1.writeString(p0.mExpTag);
          p1.writeInt(p0.mNameChanged);
          p1.writeSerializable(p0.mAnalysisResult);
          p1.writeInt(p0.mKtvBeginTime);
          p1.writeInt(p0.mInstrumental);
          p1.writeInt(p0.mCSource);
          mAvatarUrls = p0.mLrcUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mLrcUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.index);
          p1.writeLong(p0.mUsedDuration);
          mAvatarUrls = p0.mMusicDuringInfoList;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mMusicDuringInfoList;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                p1.writeSerializable(mAvatarUrls[i3]);
             }
          }
          UserInfo$$Parcelable.write(p0.mUserProfile, p1, p2, p3);
          if (p0.mPhotoCount == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mPhotoCount.longValue());
          }
          mAvatarUrls = p0.mLicensedPlaySceneList;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mLicensedPlaySceneList;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                p1.writeString(mAvatarUrls[i3]);
             }
          }
          p1.writeString(p0.mMusicDocId);
          p1.writeInt(p0.mDisplayPhotoCount);
          MusicRankModel$$Parcelable.write(p0.mMusicRankModel, p1, p2, p3);
          p1.writeString(p0.mMusicDownbeatsUrl);
          p1.writeString(p0.mTagSourcePhotoId);
          p1.writeInt(p0.mKtvEndTime);
          p1.writeInt(p0.mCopyrightTimeLimitInSecond);
          p1.writeInt(p0.mIsFakeQPhoto);
          p1.writeString(p0.mSearchKeyWord);
          p1.writeFloat(p0.mPercent);
          p1.writeInt(p0.mChorus);
          p1.writeString(p0.mCoverPath);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mName);
          mAvatarUrls = p0.mMappingTextTags;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.size());
             Iterator iterator = p0.mMappingTextTags.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeLong(p0.mVocalStartTime);
          p1.writeSerializable(p0.mMusicBackgroundColorInfo);
          p1.writeString(p0.mMmuLyrics);
          p1.writeString(p0.mMmuLrcUrl);
          p1.writeString(p0.mAvatarUrl);
          p1.writeString(p0.mPureName);
          p1.writeInt(p0.mOnLine);
          p1.writeInt(p0.mCoverHeight);
          p1.writeString(p0.mCategoryName);
          p1.writeInt(p0.mIsRecordMusic);
          p1.writeInt(p0.mMusicSearchRank);
          p1.writeString(p0.mMusicBeatsUrl);
          p1.writeString(p0.mLyrics);
          mAvatarUrls = p0.mMmuLrcUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mMmuLrcUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          mAvatarUrls = p0.mNewType;
          String str = null;
          String str1 = (mAvatarUrls == null)? str: mAvatarUrls.name();
          p1.writeString(str1);
          mAvatarUrls = p0.mUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mUrls;
             i3 = mAvatarUrls.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i4], p1, p2, p3);
             }
          }
          mAvatarUrls = p0.mMmuMelodyUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mMmuMelodyUrls;
             i3 = mAvatarUrls.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i4], p1, p2, p3);
             }
          }
          p1.writeString(p0.mPhotoId);
          p1.writeLong(p0.mSingingCount);
          p1.writeLong(p0.mUsedStart);
          p1.writeString(p0.mImageUrl);
          p1.writeInt(p0.mDuration);
          mAvatarUrls = p0.mMusicLabelList;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mMusicLabelList;
             i3 = mAvatarUrls.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                p1.writeSerializable(mAvatarUrls[i4]);
             }
          }
          mAvatarUrls = p0.mAuditStatus;
          str1 = (mAvatarUrls == null)? str: mAvatarUrls.name();
          p1.writeString(str1);
          p1.writeInt(p0.mBillboardType);
          p1.writeInt(p0.mIsMockForGroupTitle);
          MusicRankModelV2$$Parcelable.write(p0.mMusicRankModelV2, p1, p2, p3);
          p1.writeString(p0.mRecommendReason);
          p1.writeLong(p0.mClipStartMills);
          p1.writeString(p0.mUssid);
          p1.writeString(p0.mId);
          mAvatarUrls = p0.mAccompanimentUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mAccompanimentUrls;
             i3 = mAvatarUrls.length;
             for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i4], p1, p2, p3);
             }
          }
          mAvatarUrls = p0.mType;
          if (mAvatarUrls != null) {
             str = mAvatarUrls.name();
          }
          p1.writeString(str);
          p1.writeString(p0.mUrl);
          p1.writeInt(p0.mIsFavorited);
          p1.writeString(p0.mFileId);
          p1.writeInt(p0.isOriginal);
          p1.writeString(p0.mLrcUrl);
          p1.writeInt(p0.mCoverWidth);
          p1.writeString(p0.mArtist);
          mAvatarUrls = p0.mMelodyUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mMelodyUrls;
             len = mAvatarUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mAiRapStyle);
          mAvatarUrls = p0.mSnippetUrls;
          if (mAvatarUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatarUrls.length);
             mAvatarUrls = p0.mSnippetUrls;
             i1 = mAvatarUrls.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mAvatarUrls[i2], p1, p2, p3);
             }
          }
          p1.writeLong(p0.mCategoryId);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Music getParcel(){
       return this.music$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Music$$Parcelable.write(this.music$$0, p0, p1, new a());
    }
}
