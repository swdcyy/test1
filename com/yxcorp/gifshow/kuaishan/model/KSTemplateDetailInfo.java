package com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$TemplateZip;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FriendUseInfo;

public class KSTemplateDetailInfo extends KSBaseInfo	// class@001a04
{
    public KSFeedTemplateDetailInfo$TemplateAuthor mAuthor;
    public String mButtonText;
    public String mCheckSum;
    public String mColor;
    public double mCoverFrameTime;
    public List mCoverUrls;
    public String mCursor;
    public Music mDefaultMusic;
    public List mDemoUrls;
    public List mDependencyLibs;
    public String mDescription;
    public boolean mDisableClientCache;
    public boolean mEnableStrengthenEntrance;
    public String mExternalTemplateFolderPath;
    public List mFileMd5CheckList;
    public long mFriendUseCount;
    public String mGroupId;
    public String mGroupName;
    public List mHeadUrls;
    public int mHeight;
    public List mIconUrls;
    public int mIndexInGroup;
    public boolean mIsCollect;
    public boolean mIsSupportVideo;
    public List mKSTemplateDependencyList;
    public String mKuaiyingKrnScheme;
    public String mKuaiyingScheme;
    public boolean mLaunchAlbumWhenTapOnSegment;
    public List mMagicModelNameList;
    public int mMediaCount;
    public String mName;
    public ColorDrawable mPlaceholderDrawable;
    public List mPosterShowIcon;
    public EditorSdk2Utils$PreviewSizeLimitation mPreviewSizeLimitation;
    public String mPrivacyPolicyTitle;
    public String mPrivacyPolicyUrl;
    public long mRecentUsedTime;
    public long mRecentViewedTime;
    public boolean mRequireFace;
    public List mResourceUrls;
    public boolean mSupportPhotoSaveLocal;
    public KSFeedTemplateDetailInfo$TemplateTag mTag;
    public String mTemplateBiz;
    public double mTemplateDuration;
    public int mTemplateGrade;
    public String mTemplateId;
    public String mTemplateSrc;
    public int mTemplateType;
    public String mTestImageUrl;
    public String mTestVideo;
    public String mTopicTag;
    public Workspace$Type mTypeFrom;
    public KSFeedTemplateDetailInfo$UnSupportReason mUnSupportReason;
    public long mUseCount;
    public int mVersion;
    public int mWidth;
    public static final long serialVersionUID = 0x900ba98c7f592f17;

    public void KSTemplateDetailInfo(){
       super();
       this.mPreviewSizeLimitation = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
       this.mGroupId = "default";
       this.mGroupName = "";
       this.mIndexInGroup = 0;
       this.mTypeFrom = Workspace$Type.KUAISHAN;
    }
    public String getId(){
       return this.mTemplateId;
    }
    public EditorSdk2Utils$PreviewSizeLimitation getPreviewSizeLimitation(){
       this.mPreviewSizeLimitation = (this.mTemplateGrade == 1)? EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_576P: EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
       return this.mPreviewSizeLimitation;
    }
    public List getResourceUrls(){
       return this.mResourceUrls;
    }
    public int getTemplateGrade(){
       return this.mTemplateGrade;
    }
    public String getTemplateName(){
       return this.mName;
    }
    public String getUniqueIdentifier(){
       Object obj = PatchProxy.apply(null, this, KSTemplateDetailInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTemplateId+"+"+this.mCheckSum;
    }
    public boolean isServerEffectTemplate(){
       KSTemplateDetailInfo tmTemplateTy = this.mTemplateType;
       boolean b = true;
       if (tmTemplateTy != b && tmTemplateTy != 11) {
          b = false;
       }
       return b;
    }
    public boolean isShimmer(){
       KSTemplateDetailInfo tmTemplateTy = this.mTemplateType;
       boolean b = (tmTemplateTy == 10 || tmTemplateTy == 11)? true: false;
       return b;
    }
    public KSFeedTemplateDetailInfo toKSFeedTemplateDetailInfo(){
       KSFeedTemplateDetailInfo obj = PatchProxy.apply(null, this, KSTemplateDetailInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSFeedTemplateDetailInfo();
       obj.mId = this.mTemplateId;
       obj.mName = this.mName;
       obj.mVersion = this.mVersion;
       obj.mIconUrls = this.mIconUrls;
       KSTemplateDetailInfo tmResourceUr = this.mResourceUrls;
       if (tmResourceUr != null && tmResourceUr.size() > 0) {
          KSFeedTemplateDetailInfo$TemplateZip templateZip = new KSFeedTemplateDetailInfo$TemplateZip();
          templateZip.mUrl = this.mResourceUrls.get(0).mUrl;
          obj.mTemplateZip = templateZip;
       }
       obj.mDemoUrls = this.mDemoUrls;
       obj.mCoverUrls = this.mCoverUrls;
       obj.mDescription = this.mDescription;
       obj.mCheckSum = this.mCheckSum;
       obj.mColor = this.mColor;
       obj.mTopicTag = this.mTopicTag;
       String str = (this.mIsSupportVideo != null)? "mv_mix": "mv_normal";
       obj.mType = str;
       obj.mCoverFrameTime = this.mCoverFrameTime;
       obj.mDisableClientCache = this.mDisableClientCache;
       obj.mKSTemplateDependencyList = this.mKSTemplateDependencyList;
       obj.mTemplateType = this.mTemplateType;
       obj.mDefaultMusic = this.mDefaultMusic;
       obj.mMagicModelNameList = this.mMagicModelNameList;
       obj.mDependencyLibs = this.mDependencyLibs;
       obj.mGroupId = this.mGroupId;
       obj.mWidth = this.mWidth;
       obj.mHeight = this.mHeight;
       obj.mCursor = this.mCursor;
       obj.mUseCount = this.mUseCount;
       obj.mMaterialCount = this.mMediaCount;
       obj.mAuthor = this.mAuthor;
       obj.mTemplateDuration = this.mTemplateDuration;
       obj.mSupportPhotoSaveLocal = this.mSupportPhotoSaveLocal;
       obj.mFileMd5CheckList = this.mFileMd5CheckList;
       obj.mButtonText = this.mButtonText;
       obj.mEnableStrengthenEntrance = this.mEnableStrengthenEntrance;
       obj.mPrivacyPolicyTitle = this.mPrivacyPolicyTitle;
       obj.mPrivacyPolicyUrl = this.mPrivacyPolicyUrl;
       obj.mFrameVisibleTimeList = this.mFrameVisibleTimeList;
       obj.mFrameExtraRequirementList = this.mFrameExtraRequirementList;
       obj.mTemplateMusic = this.mTemplateMusic;
       obj.mOpeningClipCount = this.mOpeningClipCount;
       obj.mEndingClipCount = this.mEndingClipCount;
       obj.mIsCollect = this.mIsCollect;
       obj.mTemplateGrade = this.mTemplateGrade;
       obj.mTemplateBiz = this.mTemplateBiz;
       if (this.mFriendUseCount) {
          tmResourceUr = this.mHeadUrls;
          if (tmResourceUr != null && tmResourceUr.size() > 0) {
             KSFeedTemplateDetailInfo$FriendUseInfo uFriendUseIn = new KSFeedTemplateDetailInfo$FriendUseInfo();
             uFriendUseIn.mUseCount = this.mFriendUseCount;
             uFriendUseIn.mHeadUrls = this.mHeadUrls;
             obj.mFriendUseInfo = uFriendUseIn;
          }
       }
       obj.mUnSupportReason = this.mUnSupportReason;
       obj.mLaunchAlbumWhenTapOnSegment = this.mLaunchAlbumWhenTapOnSegment;
       obj.mKuaiyingScheme = this.mKuaiyingScheme;
       obj.mKuaiyingKrnScheme = this.mKuaiyingKrnScheme;
       obj.mRecentViewedTime = this.mRecentViewedTime;
       obj.mRecentUsedTime = this.mRecentUsedTime;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KSTemplateDetailInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "template info [mTemplateId="+this.mTemplateId+", mName="+this.mName+", mCheckSum="+this.mCheckSum+"]";
    }
    public KSTemplateDetailInfo updateGroupName(String p0){
       this.mGroupName = p0;
       return this;
    }
}
