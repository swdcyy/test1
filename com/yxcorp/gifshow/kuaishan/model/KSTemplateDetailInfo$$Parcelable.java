package com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo$$Parcelable$a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDependency;
import com.yxcorp.gifshow.model.FileMd5Info;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Class;
import java.lang.Enum;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import org.parceler.a;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameVisibleTime;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameExtraRequirement;
import com.yxcorp.gifshow.kuaishan.model.TemplateMusic;
import java.util.List;
import java.util.Iterator;

public class KSTemplateDetailInfo$$Parcelable implements Parcelable, d	// class@001a03
{
    public KSTemplateDetailInfo kSTemplateDetailInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KSTemplateDetailInfo$$Parcelable.CREATOR = new KSTemplateDetailInfo$$Parcelable$a();
    }
    public void KSTemplateDetailInfo$$Parcelable(KSTemplateDetailInfo p0){
       super();
       this.kSTemplateDetailInfo$$0 = p0;
    }
    public static KSTemplateDetailInfo read(Parcel p0,a p1){
       List list1;
       List list2;
       ArrayList uArrayList;
       int i3;
       ArrayList uArrayList1;
       int i4;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          KSTemplateDetailInfo kSTemplateDe = new KSTemplateDetailInfo();
          p1.f(p1.g(), kSTemplateDe);
          boolean i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(p0.readString());
             }
          }
          kSTemplateDe.mDependencyLibs = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 < i1; i4 = i4 + 1) {
                uArrayList1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          kSTemplateDe.mIconUrls = list1;
          kSTemplateDe.mTemplateType = p0.readInt();
          kSTemplateDe.mTemplateBiz = p0.readString();
          boolean b = true;
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mIsCollect = i1;
          kSTemplateDe.mDescription = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          kSTemplateDe.mHeadUrls = list2;
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mRequireFace = i1;
          kSTemplateDe.mColor = p0.readString();
          kSTemplateDe.mTopicTag = p0.readString();
          kSTemplateDe.mExternalTemplateFolderPath = p0.readString();
          kSTemplateDe.mMediaCount = p0.readInt();
          kSTemplateDe.mRecentViewedTime = p0.readLong();
          kSTemplateDe.mCursor = p0.readString();
          kSTemplateDe.mWidth = p0.readInt();
          kSTemplateDe.mPrivacyPolicyTitle = p0.readString();
          kSTemplateDe.mVersion = p0.readInt();
          kSTemplateDe.mDefaultMusic = Music$$Parcelable.read(p0, p1);
          kSTemplateDe.mCheckSum = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          kSTemplateDe.mKSTemplateDependencyList = list2;
          kSTemplateDe.mRecentUsedTime = p0.readLong();
          kSTemplateDe.mKuaiyingKrnScheme = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          kSTemplateDe.mFileMd5CheckList = list2;
          kSTemplateDe.mPrivacyPolicyUrl = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          kSTemplateDe.mResourceUrls = list2;
          String str = p0.readString();
          Workspace$Type type = (str == null)? list: Enum.valueOf(Workspace$Type.class, str);
          kSTemplateDe.mTypeFrom = type;
          kSTemplateDe.mCoverFrameTime = p0.readDouble();
          kSTemplateDe.mTemplateDuration = p0.readDouble();
          kSTemplateDe.mName = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mIsSupportVideo = i1;
          kSTemplateDe.mTestImageUrl = p0.readString();
          kSTemplateDe.mTestVideo = p0.readString();
          str = p0.readString();
          KSTemplateDetailInfo kSTemplateDe1 = KSTemplateDetailInfo.class;
          Enum uEnum = (str == null)? list: Enum.valueOf(EditorSdk2Utils$PreviewSizeLimitation.class, str);
          a.d(kSTemplateDe1, kSTemplateDe, "mPreviewSizeLimitation", uEnum);
          kSTemplateDe.mUseCount = p0.readLong();
          kSTemplateDe.mHeight = p0.readInt();
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mEnableStrengthenEntrance = i1;
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mSupportPhotoSaveLocal = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          kSTemplateDe.mMagicModelNameList = list2;
          kSTemplateDe.mTemplateSrc = p0.readString();
          kSTemplateDe.mGroupId = p0.readString();
          kSTemplateDe.mButtonText = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mDisableClientCache = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          kSTemplateDe.mPosterShowIcon = list2;
          kSTemplateDe.mTemplateId = p0.readString();
          i1 = (p0.readInt() == b)? true: false;
          kSTemplateDe.mLaunchAlbumWhenTapOnSegment = i1;
          kSTemplateDe.mFriendUseCount = p0.readLong();
          kSTemplateDe.mTemplateGrade = p0.readInt();
          kSTemplateDe.mGroupName = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          kSTemplateDe.mCoverUrls = list2;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          kSTemplateDe.mDemoUrls = list2;
          kSTemplateDe.mKuaiyingScheme = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          kSTemplateDe.mFrameVisibleTimeList = list2;
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          kSTemplateDe.mFrameExtraRequirementList = list2;
          if (p0.readInt() != b) {
             b = false;
          }
          kSTemplateDe.mIsMustShow = b;
          kSTemplateDe.mEndingClipCount = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          kSTemplateDe.mTemplateMusic = list;
          kSTemplateDe.mOpeningClipCount = p0.readInt();
          p1.f(i, kSTemplateDe);
          return kSTemplateDe;
       }
    }
    public static void write(KSTemplateDetailInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          KSTemplateDetailInfo mDependencyL = p0.mDependencyLibs;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mDependencyLibs.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          mDependencyL = p0.mIconUrls;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mIconUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mTemplateType);
          p1.writeString(p0.mTemplateBiz);
          p1.writeInt(p0.mIsCollect);
          p1.writeString(p0.mDescription);
          mDependencyL = p0.mHeadUrls;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mHeadUrls.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeInt(p0.mRequireFace);
          p1.writeString(p0.mColor);
          p1.writeString(p0.mTopicTag);
          p1.writeString(p0.mExternalTemplateFolderPath);
          p1.writeInt(p0.mMediaCount);
          p1.writeLong(p0.mRecentViewedTime);
          p1.writeString(p0.mCursor);
          p1.writeInt(p0.mWidth);
          p1.writeString(p0.mPrivacyPolicyTitle);
          p1.writeInt(p0.mVersion);
          Music$$Parcelable.write(p0.mDefaultMusic, p1, p2, p3);
          p1.writeString(p0.mCheckSum);
          mDependencyL = p0.mKSTemplateDependencyList;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mKSTemplateDependencyList.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeLong(p0.mRecentUsedTime);
          p1.writeString(p0.mKuaiyingKrnScheme);
          mDependencyL = p0.mFileMd5CheckList;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mFileMd5CheckList.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeString(p0.mPrivacyPolicyUrl);
          mDependencyL = p0.mResourceUrls;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mResourceUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mDependencyL = p0.mTypeFrom;
          String str = null;
          String str1 = (mDependencyL == null)? str: mDependencyL.name();
          p1.writeString(str1);
          p1.writeDouble(p0.mCoverFrameTime);
          p1.writeDouble(p0.mTemplateDuration);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mIsSupportVideo);
          p1.writeString(p0.mTestImageUrl);
          p1.writeString(p0.mTestVideo);
          EditorSdk2Utils$PreviewSizeLimitation previewSizeL = a.b(EditorSdk2Utils$PreviewSizeLimitation.class, KSTemplateDetailInfo.class, p0, "mPreviewSizeLimitation");
          if (previewSizeL != null) {
             str = previewSizeL.name();
          }
          p1.writeString(str);
          p1.writeLong(p0.mUseCount);
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mEnableStrengthenEntrance);
          p1.writeInt(p0.mSupportPhotoSaveLocal);
          mDependencyL = p0.mMagicModelNameList;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mMagicModelNameList.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeString(p0.mTemplateSrc);
          p1.writeString(p0.mGroupId);
          p1.writeString(p0.mButtonText);
          p1.writeInt(p0.mDisableClientCache);
          mDependencyL = p0.mPosterShowIcon;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mPosterShowIcon.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTemplateId);
          p1.writeInt(p0.mLaunchAlbumWhenTapOnSegment);
          p1.writeLong(p0.mFriendUseCount);
          p1.writeInt(p0.mTemplateGrade);
          p1.writeString(p0.mGroupName);
          mDependencyL = p0.mCoverUrls;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mCoverUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mDependencyL = p0.mDemoUrls;
          if (mDependencyL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDependencyL.size());
             iterator1 = p0.mDemoUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mKuaiyingScheme);
          KSBaseInfo mFrameVisibl = p0.mFrameVisibleTimeList;
          if (mFrameVisibl == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFrameVisibl.size());
             iterator = p0.mFrameVisibleTimeList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          mFrameVisibl = p0.mFrameExtraRequirementList;
          if (mFrameVisibl == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFrameVisibl.size());
             iterator = p0.mFrameExtraRequirementList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mIsMustShow);
          p1.writeInt(p0.mEndingClipCount);
          mFrameVisibl = p0.mTemplateMusic;
          if (mFrameVisibl == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFrameVisibl.size());
             iterator = p0.mTemplateMusic.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mOpeningClipCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KSTemplateDetailInfo getParcel(){
       return this.kSTemplateDetailInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KSTemplateDetailInfo$$Parcelable.write(this.kSTemplateDetailInfo$$0, p0, p1, new a());
    }
}
