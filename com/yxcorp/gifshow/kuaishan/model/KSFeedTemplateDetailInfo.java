package com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSBaseInfo;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Number;
import android.graphics.Color;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Math;
import gq.a;
import java.lang.IllegalArgumentException;
import q87.c;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$TemplateZip;
import java.util.Collections;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.ArrayList;
import android.graphics.drawable.ColorDrawable;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$TemplateTag;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FriendUseInfo;

public class KSFeedTemplateDetailInfo extends KSBaseInfo	// class@0019ff
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
    public List mFileMd5CheckList;
    public KSFeedTemplateDetailInfo$FriendUseInfo mFriendUseInfo;
    public String mGroupId;
    public int mHeight;
    public List mIconUrls;
    public String mId;
    public boolean mIsCollect;
    public List mKSTemplateDependencyList;
    public String mKuaiyingKrnScheme;
    public String mKuaiyingScheme;
    public boolean mLaunchAlbumWhenTapOnSegment;
    public List mMagicModelNameList;
    public int mMaterialCount;
    public String mName;
    public double mOverlapTimeOfTail;
    public List mPosterShowIcon;
    public String mPrivacyPolicyTitle;
    public String mPrivacyPolicyUrl;
    public String mProduceType;
    public long mRecentUsedTime;
    public long mRecentViewedTime;
    public boolean mSupportPhotoSaveLocal;
    public List mTags;
    public String mTemplateBiz;
    public double mTemplateDuration;
    public int mTemplateGrade;
    public int mTemplateType;
    public KSFeedTemplateDetailInfo$TemplateZip mTemplateZip;
    public String mTopicTag;
    public List mTopics;
    public String mType;
    public Workspace$Type mTypeFrom;
    public KSFeedTemplateDetailInfo$UnSupportReason mUnSupportReason;
    public long mUseCount;
    public int mVersion;
    public String mVideoUrl;
    public int mWidth;
    public static final long serialVersionUID = 0x84beba54f9f43689;

    public void KSFeedTemplateDetailInfo(){
       super();
       this.mTypeFrom = Workspace$Type.KUAISHAN;
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSFeedTemplateDetailInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return p0;
       }
       if (!p0.startsWith("#")) {
          p0 = "#"+p0;
       }
       return p0;
    }
    public static int b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, KSFeedTemplateDetailInfo.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       p0 = KSFeedTemplateDetailInfo.a(p0);
       int i = 0;
       if (!TextUtils.x(p0)) {
          try{
             int i1 = Color.parseColor(p0);
             float f = 0x3f733333;
             if (PatchProxy.isSupport(KSFeedTemplateDetailInfo.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(Float.valueOf(f), Integer.valueOf(i1), null, KSFeedTemplateDetailInfo.class, "3");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }
             }
             i = (Math.min(255, Math.max(i, (int)242.25f)) << 24) + (i1 & 0xffffff);
          }catch(java.lang.IllegalArgumentException e7){
             obj = new Object[i];
             a.D().A("TemplateTag", "getKSTagColor: "+e7.getMessage(), obj);
          }
       }
    }
    public String getId(){
       return this.mId;
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, KSFeedTemplateDetailInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.singletonList(new CDNUrl("", this.mTemplateZip.mUrl));
    }
    public KSTemplateDetailInfo toKSTemplateDetailInfo(){
       KSTemplateDetailInfo obj = PatchProxy.apply(null, this, KSFeedTemplateDetailInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSTemplateDetailInfo();
       obj.mTemplateId = this.mId;
       obj.mName = this.mName;
       obj.mVersion = this.mVersion;
       obj.mIconUrls = this.mIconUrls;
       ArrayList uArrayList = new ArrayList();
       obj.mResourceUrls = uArrayList;
       KSFeedTemplateDetailInfo tmTemplateZi = this.mTemplateZip;
       if (tmTemplateZi != null) {
          uArrayList.add(new CDNUrl("", tmTemplateZi.mUrl));
       }
       obj.mDemoUrls = this.mDemoUrls;
       obj.mCoverUrls = this.mCoverUrls;
       obj.mDescription = this.mDescription;
       obj.mCheckSum = this.mCheckSum;
       KSFeedTemplateDetailInfo tmColor = this.mColor;
       obj.mColor = tmColor;
       int i = 0;
       try{
          if (!TextUtils.x(tmColor)) {
             obj.mPlaceholderDrawable = new ColorDrawable(Color.parseColor(KSFeedTemplateDetailInfo.a(this.mColor)));
          }
       }catch(java.lang.IllegalArgumentException e1){
          Object[] objArray = new Object[i];
          a.D().A("TemplateTag", "toKSTemplateDetailInfo: invalid color "+this.mColor+e1.getMessage(), objArray);
       }
       tmColor = this.mTags;
       if (tmColor != null && !tmColor.isEmpty()) {
          KSFeedTemplateDetailInfo$TemplateTag templateTag = this.mTags.get(i);
          obj.mTag = templateTag;
          templateTag.mKSTagColor = KSFeedTemplateDetailInfo.b(templateTag.mColor);
          KSTemplateDetailInfo mTag = obj.mTag;
          mTag.mKSTagSecondColor = KSFeedTemplateDetailInfo.b(mTag.mSecondColor);
       }
       obj.mTopicTag = this.mTopicTag;
       obj.mIsSupportVideo = TextUtils.n(this.mType, "mv_mix");
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
       obj.mMediaCount = this.mMaterialCount;
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
       tmColor = this.mFriendUseInfo;
       if (tmColor != null) {
          obj.mFriendUseCount = tmColor.mUseCount;
          obj.mHeadUrls = tmColor.mHeadUrls;
       }
       obj.mPosterShowIcon = this.mPosterShowIcon;
       obj.mTemplateGrade = this.mTemplateGrade;
       obj.mTemplateBiz = this.mTemplateBiz;
       obj.mUnSupportReason = this.mUnSupportReason;
       obj.mTypeFrom = this.mTypeFrom;
       obj.mLaunchAlbumWhenTapOnSegment = this.mLaunchAlbumWhenTapOnSegment;
       obj.mKuaiyingScheme = this.mKuaiyingScheme;
       obj.mKuaiyingKrnScheme = this.mKuaiyingKrnScheme;
       obj.mRecentViewedTime = this.mRecentViewedTime;
       obj.mRecentUsedTime = this.mRecentUsedTime;
       return obj;
    }
}
