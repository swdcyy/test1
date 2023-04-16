package com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class MagicEmojiPageConfig implements Serializable	// class@000fec
{
    public final String mAutoSearchMagicWords;
    public final long mClickEntranceTimeStamp;
    public final int mDefaultTab;
    public final boolean mEditable;
    public final boolean mEnableMagicUseRecoFeature;
    public final boolean mEnableVote;
    public final boolean mFilterUnswitchableEmoji;
    public final int mFrameMode;
    public final boolean mH5EntryEnable;
    public final boolean mHasRecord;
    public final boolean mIsLive;
    public final boolean mIsOpenByClicked;
    public final boolean mIsSupportImmerseMagicFace;
    public final boolean mIsTakePhoto;
    public final boolean mIsTaskPhotoMode;
    public final int mMagicAutoSearchSource;
    public final boolean mNoLoginMode;
    public final boolean mNoMusic;
    public final String mPageIdentify;
    public final CameraPageType mPageType;
    public final boolean mRemoveViewWhenHide;
    public final int mSimilarBarTopMargin;
    public String mTaskId;
    public final MagicEmoji$MagicFace mTopMagicFace;
    public final boolean mTopMagicFaceAutoApply;
    public final String mTopMagicFaceId;
    public final List mTopMagicFaces;
    public final WishMagicInfo mWishMagicInfo;
    public final boolean showCollectionIcon;
    public static final long serialVersionUID = 0xc7070d5d9c346f2f;

    public void MagicEmojiPageConfig(MagicEmojiPageConfig$b p0){
       super();
       this.mTaskId = "";
       this.mPageIdentify = p0.e;
       this.mIsTakePhoto = p0.b;
       this.mIsTaskPhotoMode = p0.c;
       this.mIsOpenByClicked = p0.a;
       this.mNoMusic = p0.d;
       this.mFilterUnswitchableEmoji = p0.f;
       this.mHasRecord = p0.g;
       this.mFrameMode = p0.h;
       this.mIsLive = p0.i;
       this.mPageType = p0.j;
       this.mNoLoginMode = p0.k;
       this.mH5EntryEnable = p0.l;
       this.mClickEntranceTimeStamp = p0.m;
       this.mTopMagicFace = p0.n;
       this.mTopMagicFaceAutoApply = p0.o;
       this.mTopMagicFaceId = p0.q;
       this.mTopMagicFaces = p0.p;
       this.mEditable = p0.r;
       this.mEnableVote = p0.s;
       this.mWishMagicInfo = p0.t;
       this.mTaskId = p0.v;
       this.mAutoSearchMagicWords = p0.w;
       this.mMagicAutoSearchSource = p0.x;
       this.mSimilarBarTopMargin = p0.z;
       this.showCollectionIcon = p0.u;
       this.mDefaultTab = p0.y;
       this.mIsSupportImmerseMagicFace = p0.A;
       this.mRemoveViewWhenHide = p0.B;
       this.mEnableMagicUseRecoFeature = p0.C;
    }
    public void MagicEmojiPageConfig(MagicEmojiPageConfig$b p0,MagicEmojiPageConfig$a p1){
       super(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiPageConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && (p0 instanceof MagicEmojiPageConfig && (this.mIsTakePhoto == p0.mIsTakePhoto && (this.mIsTaskPhotoMode == p0.mIsTaskPhotoMode && (this.mNoMusic == p0.mNoMusic && (TextUtils.n(this.mPageIdentify, p0.mPageIdentify) && (this.mFilterUnswitchableEmoji == p0.mFilterUnswitchableEmoji && (this.mHasRecord == p0.mHasRecord && (this.mFrameMode == p0.mFrameMode && (this.mIsLive == p0.mIsLive && (this.mPageType == p0.mPageType && (this.mNoLoginMode == p0.mNoLoginMode && (this.mH5EntryEnable == p0.mH5EntryEnable && (this.mSimilarBarTopMargin == p0.mSimilarBarTopMargin && (this.mEditable == p0.mEditable && (this.mEnableVote == p0.mEnableVote && (this.mWishMagicInfo == p0.mWishMagicInfo && (this.mTopMagicFace == p0.mTopMagicFace && (this.mTopMagicFaces == p0.mTopMagicFaces && (TextUtils.n(this.mTopMagicFaceId, p0.mTopMagicFaceId) && (this.showCollectionIcon == p0.showCollectionIcon && (this.mIsSupportImmerseMagicFace == p0.mIsSupportImmerseMagicFace && this.mEnableMagicUseRecoFeature == p0.mEnableMagicUseRecoFeature)))))))))))))))))))))) {
          b = true;
       }
    label_00a3 :
       return b;
    }
    public boolean equalsFilter(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiPageConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && (p0 instanceof MagicEmojiPageConfig && (this.mIsTakePhoto == p0.mIsTakePhoto && (this.mNoMusic == p0.mNoMusic && (this.mFilterUnswitchableEmoji == p0.mFilterUnswitchableEmoji && (this.mHasRecord == p0.mHasRecord && (this.mFrameMode == p0.mFrameMode && (this.mIsLive == p0.mIsLive && (this.mPageType == p0.mPageType && (this.mNoLoginMode == p0.mNoLoginMode && (this.mH5EntryEnable == p0.mH5EntryEnable && (this.mEditable == p0.mEditable && (this.mEnableVote == p0.mEnableVote && (this.mWishMagicInfo == p0.mWishMagicInfo && (TextUtils.n(this.mTopMagicFaceId, p0.mTopMagicFaceId) && (this.mTopMagicFace == p0.mTopMagicFace && (this.mTopMagicFaces == p0.mTopMagicFaces && (this.showCollectionIcon == p0.showCollectionIcon && this.mIsSupportImmerseMagicFace == p0.mIsSupportImmerseMagicFace)))))))))))))))))) {
          b = true;
       }
    label_0087 :
       return b;
    }
}
