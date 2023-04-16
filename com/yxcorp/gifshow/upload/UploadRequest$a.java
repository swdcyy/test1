package com.yxcorp.gifshow.upload.UploadRequest$a;
import java.lang.Object;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.kuaishou.edit.draft.Workspace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.List;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import n1b.b;
import com.kwai.kcube.TabIdentifier;
import com.kuaishou.android.model.music.Music;

public class UploadRequest$a	// class@001e59
{
    public UploadRequest a;
    public String b;
    public String c;

    public void UploadRequest$a(){
       super();
       this.a = new UploadRequest();
    }
    public UploadRequest$a A(boolean p0){
       this.a.mNoSysNotification = p0;
       return this;
    }
    public UploadRequest$a B(File p0){
       f obj = PatchProxy.applyOneRefs(p0, this, UploadRequest$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.D();
       StringBuilder str = "setOriginCoverFile: ";
       String absolutePath = (p0 != null)? p0.getAbsolutePath(): "";
       Object[] objArray = new Object[0];
       obj.w("UploadRequest", str+absolutePath, objArray);
       this.a.mOriginCoverFile = p0;
       return this;
    }
    public UploadRequest$a C(String p0){
       this.a.mPostAgainText = p0;
       return this;
    }
    public UploadRequest$a D(String p0){
       this.a.mPrompt = p0;
       return this;
    }
    public UploadRequest$a E(long p0){
       this.a.mPublishClickTime = p0;
       return this;
    }
    public UploadRequest$a F(String p0){
       this.a.mPublishToastMainText = p0;
       return this;
    }
    public UploadRequest$a G(boolean p0){
       this.a.mReturnToHome = p0;
       return this;
    }
    public UploadRequest$a H(RickonWholeUploadParams p0){
       this.a.mRickonWholeUploadParams = p0;
       return this;
    }
    public UploadRequest$a I(String p0){
       this.a.mSessionId = p0;
       return this;
    }
    public UploadRequest$a J(String p0){
       this.a.mShareAppPackage = p0;
       return this;
    }
    public UploadRequest$a K(String p0){
       this.a.mSharePubInfo = p0;
       return this;
    }
    public UploadRequest$a L(boolean p0){
       this.a.mShareSoundTrack = p0;
       return this;
    }
    public UploadRequest$a M(boolean p0){
       this.a.mShowFlowFeedback = p0;
       return this;
    }
    public UploadRequest$a N(String p0){
       this.a.mTagSourceCollection = p0;
       return this;
    }
    public UploadRequest$a O(boolean p0){
       this.a.mTriggerByEncode = p0;
       return this;
    }
    public UploadRequest$a P(int p0){
       this.a.mUploadMode = p0;
       return this;
    }
    public UploadRequest$a Q(IUploadRequest$UploadPostType p0){
       this.a.mUploadPostType = p0;
       return this;
    }
    public UploadRequest$a R(int p0){
       this.a.mUploadRestrict = p0;
       return this;
    }
    public UploadRequest$a S(String p0){
       this.a.mUploadSuccessTipText = p0;
       return this;
    }
    public UploadRequest$a T(boolean p0){
       this.a.mUseFakeUploader = p0;
       return this;
    }
    public UploadRequest$a U(String p0){
       this.a.mUserId = p0;
       return this;
    }
    public UploadRequest$a V(VideoContext p0){
       this.a.mVideoContext = p0;
       return this;
    }
    public UploadRequest$a W(long p0){
       this.a.mVideoDuration = p0;
       return this;
    }
    public UploadRequest$a X(PhotoVisibility p0){
       this.a.mVisibility = p0;
       return this;
    }
    public UploadRequest$a Y(Workspace p0){
       this.a.mWorkspace = p0;
       return this;
    }
    public UploadRequest$a Z(File p0){
       this.a.mWorkspaceDirectory = p0;
       return this;
    }
    public UploadRequest a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UploadRequest$a uoa = UploadRequest$a.class;
       UploadRequest$a obj = PatchProxy.apply(null, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       UploadRequest$a tb = this.b;
       UploadRequest$a tc = this.c;
       String str = PatchProxy.applyTwoRefs(tb, tc, this, uoa, "4");
       if (str != patchProxyRe) {
       }else if(!TextUtils.x(tb) && !TextUtils.x(tc)){
          tb = tb+"\n"+tc;
       }else if(!TextUtils.x(tb)){
          tb = tc;
       }
       str = TextUtils.k(tb);
       obj.mCaption = str;
       return this.a;
    }
    public UploadRequest$a a0(String p0){
       this.a.mZipUuid = p0;
       return this;
    }
    public UploadRequest$a b(String p0){
       this.a.mAuthorName = p0;
       return this;
    }
    public UploadRequest$a c(String p0){
       this.b = p0;
       return this;
    }
    public UploadRequest$a d(boolean p0){
       this.a.mCaptionPasted = p0;
       return this;
    }
    public UploadRequest$a e(String p0){
       this.a.mCaptionTitle = p0;
       return this;
    }
    public UploadRequest$a f(File p0){
       f obj = PatchProxy.applyOneRefs(p0, this, UploadRequest$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.D();
       StringBuilder str = "setCoverFile: ";
       String absolutePath = (p0 != null)? p0.getAbsolutePath(): "";
       Object[] objArray = new Object[0];
       obj.w("UploadRequest", str+absolutePath, objArray);
       this.a.mCoverFile = p0;
       return this;
    }
    public UploadRequest$a g(Size p0){
       this.a.mCroppedCoverSize = p0;
       return this;
    }
    public UploadRequest$a h(String p0){
       this.a.mCustomizedMagicFilePath = p0;
       return this;
    }
    public UploadRequest$a i(long p0){
       this.a.mEncodeConfigId = p0;
       return this;
    }
    public UploadRequest$a j(String p0){
       this.a.mFilePath = p0;
       return this;
    }
    public UploadRequest$a k(boolean p0){
       this.a.mHaveMerchantBusinessPlc = p0;
       return this;
    }
    public UploadRequest$a l(boolean p0){
       this.a.mIsHidden = p0;
       return this;
    }
    public UploadRequest$a m(List p0){
       this.a.mInteractStickerInfo = p0;
       return this;
    }
    public UploadRequest$a n(boolean p0){
       this.a.mIsBenefitTask = p0;
       return this;
    }
    public UploadRequest$a o(boolean p0){
       this.a.mIsEnablePipelineUpload = p0;
       return this;
    }
    public UploadRequest$a p(boolean p0){
       this.a.mIsLongVideo = p0;
       return this;
    }
    public UploadRequest$a q(boolean p0){
       this.a.mIsPublished = p0;
       return this;
    }
    public UploadRequest$a r(KtvInfo p0){
       this.a.mKtvInfo = p0;
       return this;
    }
    public UploadRequest$a s(b p0){
       this.a.mLiveAvatarInfo = p0;
       return this;
    }
    public UploadRequest$a t(long p0){
       this.a.mLocationId = p0;
       return this;
    }
    public UploadRequest$a u(List p0){
       this.a.mMagicEmoji = p0;
       return this;
    }
    public UploadRequest$a v(String p0){
       this.a.mMagicFaceRecoId = p0;
       return this;
    }
    public UploadRequest$a w(int p0){
       this.a.mMockFeedOption = p0;
       return this;
    }
    public UploadRequest$a x(TabIdentifier p0){
       this.a.mockFeedUploadTarget = p0;
       return this;
    }
    public UploadRequest$a y(Music p0){
       this.a.mMusic = p0;
       return this;
    }
    public UploadRequest$a z(String p0){
       this.a.mMusicSwitch = p0;
       return this;
    }
}
