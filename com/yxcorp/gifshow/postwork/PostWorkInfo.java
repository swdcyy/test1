package com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import r26.a;
import java.lang.Object;
import java.lang.String;
import k2b.u1;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kuaishou.android.post.PostArguments;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postwork.PostWorkInfo$a;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import f0c.w0;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.lang.Number;
import wkd.b;
import dnc.x0;
import r26.b;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.IllegalStateException;
import java.lang.Float;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;

public class PostWorkInfo implements Cloneable, Serializable, a	// class@0010b1
{
    public int mAutoRetryTimes;
    public String mCacheId;
    public float mCurrentUiProgress;
    public boolean mDisableForbidDialog;
    public boolean mDisableSuccessToast;
    public PostEncodeInfo mEncodeInfo;
    public int mErrorType;
    public boolean mFailedByCash;
    public float mFailedProgress;
    public int mId;
    public boolean mIsFailMsgLogger;
    public boolean mIsPublished;
    public boolean mIsSaveWorkSpace;
    public PostStatus mLastNotifyStatus;
    public float mPauseProgress;
    public PhotoEditInfo mPhotoEditInfo;
    public final PostArguments mPostArgs;
    public int mRecoverStatus;
    public w0 mRequest;
    public String mSessionId;
    public boolean mShowCancelToast;
    public long mSpaceSize;
    public UploadInfo mUploadInfo;
    public int mUploadTaskType;
    public c mWorkspaceDraft;
    public static final long serialVersionUID = 0x13b8cecd065ef91d;

    public void PostWorkInfo(){
       super();
       this.mSessionId = u1.f();
       this.mRecoverStatus = 0;
       this.mFailedByCash = false;
       this.mPauseProgress = 0;
       this.mFailedProgress = 0;
       this.mCurrentUiProgress = 0;
       this.mIsPublished = false;
       this.mIsFailMsgLogger = false;
       this.mShowCancelToast = true;
       this.mDisableSuccessToast = false;
       this.mDisableForbidDialog = false;
       this.mIsSaveWorkSpace = true;
       this.mPostArgs = null;
    }
    public void PostWorkInfo(int p0,PostEncodeInfo p1,PostArguments p2){
       super();
       this.mSessionId = u1.f();
       this.mRecoverStatus = 0;
       this.mFailedByCash = false;
       this.mPauseProgress = 0;
       this.mFailedProgress = 0;
       this.mCurrentUiProgress = 0;
       this.mIsPublished = false;
       this.mIsFailMsgLogger = false;
       this.mShowCancelToast = true;
       this.mDisableSuccessToast = false;
       this.mDisableForbidDialog = false;
       this.mIsSaveWorkSpace = true;
       this.mId = p0;
       this.mEncodeInfo = p1;
       this.mPostArgs = p2;
    }
    public void PostWorkInfo(int p0,UploadInfo p1,PostArguments p2){
       super();
       this.mSessionId = u1.f();
       this.mRecoverStatus = 0;
       this.mFailedByCash = false;
       this.mPauseProgress = 0;
       this.mFailedProgress = 0;
       this.mCurrentUiProgress = 0;
       this.mIsPublished = false;
       this.mIsFailMsgLogger = false;
       this.mShowCancelToast = true;
       this.mDisableSuccessToast = false;
       this.mDisableForbidDialog = false;
       this.mIsSaveWorkSpace = true;
       this.mId = p0;
       this.mUploadInfo = p1;
       this.mPostArgs = p2;
    }
    public static PostStatus from(EncodeInfo$Status p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostWorkInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = PostWorkInfo$a.a[p0.ordinal()];
       if (i == 1) {
          return PostStatus.ENCODE_PENDING;
       }
       if (i == 2) {
          return PostStatus.ENCODING;
       }
       if (i == 3) {
          return PostStatus.ENCODE_COMPLETE;
       }
       if (i == 4) {
          return PostStatus.ENCODE_FAILED;
       }
       if (i != 5) {
          return null;
       }
       return PostStatus.ENCODE_CANCELED;
    }
    public static PostStatus from(IUploadInfo$Status p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostWorkInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (PostWorkInfo$a.b[p0.ordinal()]){
           case 1:
             return PostStatus.UPLOAD_PENDING;
           case 2:
             return PostStatus.UPLOADING;
           case 3:
             return PostStatus.UPLOAD_SUCCEED;
           case 4:
             return PostStatus.UPLOAD_COMPLETE;
           case 5:
             return PostStatus.UPLOAD_FAILED;
           case 6:
             return PostStatus.UPLOAD_CANCELED;
           default:
             return null;
       }
    }
    public IUploadInfo convertRequest2UploadInfo(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getUploadInfo() != null) {
          return this.getUploadInfo();
       }
       obj = this.mRequest;
       if (obj != null) {
          w0 b = obj.b;
          if (b != null) {
             return UploadInfo.generateUploadInfo(b);
          }
       }
       return null;
    }
    public String getCacheId(){
       return this.mCacheId;
    }
    public EncodeInfo getEncodeInfo(){
       return this.getEncodeInfo();
    }
    public PostEncodeInfo getEncodeInfo(){
       return this.mEncodeInfo;
    }
    public int getId(){
       return this.mId;
    }
    public PhotoEditInfo getPhotoEditInfo(){
       return this.mPhotoEditInfo;
    }
    public float getProgress(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = -2001546430;
       boolean b = b.a(i).n(this.mEncodeInfo, this.mUploadInfo);
       PostWorkInfo tmUploadInfo = this.mUploadInfo;
       tmUploadInfo = (tmUploadInfo != null && tmUploadInfo.isPipelineFailedThenFallback())? 1: 0;
       if (b && !tmUploadInfo) {
          return b.a(i).k(this);
       }else {
          obj = this.mEncodeInfo;
          if (obj != null) {
             PostWorkInfo tmUploadInfo1 = this.mUploadInfo;
             if (tmUploadInfo1 != null) {
                return ((tmUploadInfo1.getProgress() * 0x3f333333) + (this.mEncodeInfo.getProgress() * 0.30f));
             }else {
                tmUploadInfo1 = this.mRequest;
                if (tmUploadInfo1 != null && tmUploadInfo1.b != null) {
                   return (obj.getProgress() * 0.30f);
                }else {
                   return obj.getProgress();
                }
             }
          }else {
             obj = this.mUploadInfo;
             if (obj != null) {
                return obj.getProgress();
             }else {
                return 0;
             }
          }
       }
    }
    public int getRecoverStatus(){
       return this.mRecoverStatus;
    }
    public b getRequest(){
       return this.mRequest;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public KwaiOp getShareOption(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUploadInfo;
       if (obj != null) {
          return obj.getShareOption();
       }
       return KwaiOp.NONE;
    }
    public PostStatus getStatus(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mEncodeInfo;
       if (obj != null) {
          if (obj.getStatus() != EncodeInfo$Status.COMPLETE) {
             return PostWorkInfo.from(this.mEncodeInfo.getStatus());
          }
          obj = this.mUploadInfo;
          if (obj == null) {
             return PostWorkInfo.from(this.mEncodeInfo.getStatus());
          }
          return PostWorkInfo.from(obj.getStatus());
       }else {
          obj = this.mUploadInfo;
          if (obj != null) {
             return PostWorkInfo.from(obj.getStatus());
          }
          throw new IllegalStateException("Cannot get status");
       }
    }
    public float getUiProgress(){
       Object obj = PatchProxy.apply(null, this, PostWorkInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getUiProgress(this.getProgress());
    }
    public float getUiProgress(float p0){
       PostWorkInfo obj;
       float f1;
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(PostWorkInfo.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PostWorkInfo.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       String str = "mCurrentUiProgress:";
       float f = 0x3f800000;
       if (b.a(-2001546430).b(this.getEncodeInfo(), this.getUploadInfo()) && PostExperimentUtils.h()) {
          obj = this.mCurrentUiProgress;
          if (obj - p0) {
             obj = this.mPauseProgress;
             f1 = obj + ((f - obj) * p0);
             objArray = new Object[0];
             a.D().s("PostWorkInfo", "progress: "+p0+" tempProgress: "+this.mCurrentUiProgress+" mPauseProgress:"+this.mPauseProgress, objArray);
          }else {
             objArray = new Object[0];
             a.D().w("PostWorkInfo", "progress == mCurrentUiProgress: "+p0, objArray);
          }
          this.mCurrentUiProgress = Math.max(this.mCurrentUiProgress, f1);
          objArray1 = new Object[0];
          a.D().s("PostWorkInfo", str+this.mCurrentUiProgress, objArray1);
          return this.mCurrentUiProgress;
       }else {
          obj = this.mFailedProgress;
          f1 = obj + ((f - obj) * p0);
          if (f1 - f <= 0) {
             f = f1;
          }
          if (f - p0) {
             objArray = new Object[0];
             a.D().w("IPostWorkInfo", "progress:"+p0+",uiProgress:"+f+",failedProgress:"+this.mFailedProgress, objArray);
          }
          if (f - this.mCurrentUiProgress < 0) {
             objArray1 = new Object[0];
             a.D().w("PostWorkInfo", str+this.mCurrentUiProgress+",use mCurrentUiProgress", objArray1);
             f = this.mCurrentUiProgress;
          }
          this.mCurrentUiProgress = f;
          return f;
       }
    }
    public IUploadInfo getUploadInfo(){
       return this.getUploadInfo();
    }
    public UploadInfo getUploadInfo(){
       return this.mUploadInfo;
    }
    public int getUploadTaskType(){
       return this.mUploadTaskType;
    }
    public File getWorkspaceDirectory(){
       Object[] objArray = null;
       PostWorkInfo obj = PatchProxy.apply(objArray, this, PostWorkInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mEncodeInfo;
       if (obj != null) {
          EncodeInfo mWorkspaceDi = obj.mWorkspaceDirectory;
          if (mWorkspaceDi != null) {
             return mWorkspaceDi;
          }
       }
       obj = this.mRequest;
       if (obj != null) {
          w0 b = obj.b;
          if (b != null && b.getWorkspaceDirectory() != null) {
             return this.mRequest.b.getWorkspaceDirectory();
          }
       }
       obj = this.mUploadInfo;
       if (obj != null && !TextUtils.isEmpty(obj.getWorkspacePath())) {
          return new File(this.mUploadInfo.getWorkspacePath());
       }else {
          return objArray;
       }
    }
    public c getWorkspaceDraft(){
       return this.mWorkspaceDraft;
    }
    public boolean hasPhotoId(){
       Object obj = PatchProxy.apply(null, this, PostWorkInfo.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getUploadInfo() != null && (this.getUploadInfo().getUploadResult() != null && !TextUtils.isEmpty(this.getUploadInfo().getUploadResult().getPhotoId())))? true: false;
       return b;
    }
    public boolean isDisableFileCache(){
       IUploadRequest$UploadPostType obj = PatchProxy.apply(null, this, PostWorkInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getUploadInfo() == null) {
          return b;
       }
       obj = this.getUploadInfo().getUploadPostType();
       if (obj != IUploadRequest$UploadPostType.INTOWN && (obj == IUploadRequest$UploadPostType.SHOP || obj == IUploadRequest$UploadPostType.JUXING)) {
          b = true;
       }
       return b;
    }
    public boolean isDisableUploadForbiddenCenterDialog(){
       return this.mDisableForbidDialog;
    }
    public boolean isDisableUploadSuccessToast(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUploadInfo;
       boolean b = true;
       obj = (obj != null && (obj.getIsBenefitTask().booleanValue() && this.mUploadInfo.getVisibility() != PhotoVisibility.PRIVATE))? 1: null;
       if (this.mDisableSuccessToast == null && (!obj || this.mUploadInfo.mIsTmpDisablePublishedToast != null)) {
          b = false;
       }
       return b;
    }
    public boolean isPipelineFailedThenFallback(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUploadInfo;
       boolean b = (obj != null && obj.isPipelineFailedThenFallback())? true: false;
       return b;
    }
    public boolean isPublished(){
       return this.mIsPublished;
    }
    public boolean isReturnToHomeRequest(){
       boolean b1;
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRequest;
       if (obj != null) {
          w0 b = obj.b;
          if (b != null && b.isReturnToHome()) {
             b1 = true;
          label_0025 :
             return b1;
          }
       }
       b1 = false;
       goto label_0025 ;
    }
    public boolean isSaveWorkSpace(){
       return this.mIsSaveWorkSpace;
    }
    public boolean isUploadForbidden(){
       PostWorkInfo obj = PatchProxy.apply(null, this, PostWorkInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUploadInfo;
       boolean b = (obj != null && obj.getErrorCode() == 0xc384)? true: false;
       return b;
    }
    public boolean needUpload(){
       PostWorkInfo tmRequest = this.mRequest;
       boolean b = (tmRequest == null || (tmRequest.b != null || this.mUploadInfo != null))? true: false;
       return b;
    }
    public void resetPauseProgress(){
       if (PatchProxy.applyVoid(null, this, PostWorkInfo.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInfo", "resetPauseProgress: "+this.mCurrentUiProgress, objArray);
       this.mPauseProgress = this.mCurrentUiProgress;
       return;
    }
    public void setDisableUploadForbiddenCenterDialog(boolean p0){
       this.mDisableForbidDialog = p0;
    }
    public void setDisableUploadSuccessToast(boolean p0){
       this.mDisableSuccessToast = p0;
    }
    public void setFailedProgress(float p0){
       if (PatchProxy.isSupport(PostWorkInfo.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PostWorkInfo.class, "4")) {
          return;
       }
       if (p0 >= 0 && p0 - 0x3f800000 <= 0) {
          if (p0 - this.mFailedProgress < 0) {
             Object[] objArray = new Object[0];
             a.D().s("IPostWorkInfo", "failedProgress lower than before,before:"+this.mFailedProgress+",after:"+p0, objArray);
             return;
          }else {
             this.mFailedProgress = p0;
          }
       }
       return;
    }
    public void setIsPublished(boolean p0){
       if (PatchProxy.isSupport(PostWorkInfo.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PostWorkInfo.class, "8")) {
          return;
       }
       this.mIsPublished = p0;
       PostWorkInfo tmPostArgs = this.mPostArgs;
       if (tmPostArgs != null && p0) {
          tmPostArgs.setPublished();
       }
       return;
    }
    public void setIsSaveWorkSpace(boolean p0){
       this.mIsSaveWorkSpace = p0;
    }
    public void setPhotoEditInfo(PhotoEditInfo p0){
       this.mPhotoEditInfo = p0;
    }
    public void setRecoverStatus(int p0){
       this.mRecoverStatus = p0;
    }
    public void setSessionId(String p0){
       this.mSessionId = p0;
    }
    public void setShowCancelToast(boolean p0){
       this.mShowCancelToast = p0;
    }
    public void setUploadInfo(UploadInfo p0){
       this.mUploadInfo = p0;
    }
    public void setWorkspaceDraft(c p0){
       this.mWorkspaceDraft = p0;
    }
    public boolean showCancelToast(){
       return this.mShowCancelToast;
    }
    public void update(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkInfo.class, "7")) {
          return;
       }
       if (p0.getEncodeInfo() != null) {
          this.mEncodeInfo = p0.getEncodeInfo();
       }
       if (p0.getUploadInfo() != null) {
          this.mUploadInfo = p0.getUploadInfo();
       }
       this.mId = p0.getId();
       this.mRequest = p0.mRequest;
       this.mSessionId = p0.mSessionId;
       this.mFailedProgress = p0.mFailedProgress;
       this.mCurrentUiProgress = p0.mCurrentUiProgress;
       return;
    }
    public boolean uploadToThirdPartyServer(){
       Object obj = PatchProxy.apply(null, this, PostWorkInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getUploadInfo() != null && this.getUploadInfo().uploadToThirdPartyServer())? true: false;
       return b;
    }
}
