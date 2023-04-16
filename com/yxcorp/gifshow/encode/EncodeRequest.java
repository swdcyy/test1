package com.yxcorp.gifshow.encode.EncodeRequest;
import c26.b;
import java.io.Serializable;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import c26.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import s26.d;
import s16.c;
import qk7.a;
import java.util.Objects;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.util.List;
import z30.n0;
import z30.o0;
import um6.a;
import android.content.Intent;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import java.io.File;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Integer;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;

public class EncodeRequest implements b, Serializable	// class@000d07
{
    public String mActivityKey;
    public AtlasInfo mAtlasInfo;
    public String mAudioOutputPath;
    public String mAudioProfile;
    public final String mBackgroundAudioPath;
    public final boolean mBackgroundAudioRepeat;
    public final float mBackgroundAudioVolume;
    public final String mComment;
    public final int mCount;
    public String mCoverPath;
    public boolean mDisableTranscodeDegrade;
    public List mEncodeProfiles;
    public String mEncodedFileOutputTempPath;
    public byte[] mExtraInfoInSEI;
    public long mForegroundAudioClipEndTime;
    public long mForegroundAudioClipStartTime;
    public final String mForegroundAudioPath;
    public final float mForegroundAudioVolume;
    public final int mFrameIntervalMs;
    public final int mHeight;
    public final boolean mHidden;
    public final boolean mIsCrashInEncodingAndGiveUpWorkspace;
    public boolean mIsExportTaskInQueueing;
    public boolean mIsHdExport;
    public final boolean mIsImport;
    public final boolean mIsPhotoMovie;
    public boolean mIsPipelineSupported;
    public KtvInfo mKtvInfo;
    public String mOutputPath;
    public boolean mOverrideParams;
    public final Intent mPreviewIntent;
    public c mResult;
    public String mSessionId;
    public int mTemplateGrade;
    public int mVideoBitrate;
    public final String mVideoBufferPath;
    public VideoContext mVideoContext;
    public VideoEncodeSDKInfo mVideoEncodeSDKInfo;
    public int mVideoGopSize;
    public int mVideoType;
    public final int mWidth;
    public Workspace mWorkspace;
    public File mWorkspaceDirectory;
    public final String mWorkspaceId;
    public String mX264Params;
    public String mX264Preset;

    public void EncodeRequest(EncodeRequest$a p0){
       super();
       this.mForegroundAudioClipStartTime = -1;
       this.mForegroundAudioClipEndTime = -1;
       this.mIsExportTaskInQueueing = true;
       this.mVideoType = 0;
       this.mOutputPath = p0.a;
       this.mCoverPath = p0.b;
       this.mAudioOutputPath = p0.c;
       this.mComment = p0.d;
       this.mVideoBufferPath = p0.e;
       this.mCount = p0.m;
       this.mFrameIntervalMs = p0.p;
       this.mHidden = p0.s;
       this.mForegroundAudioPath = p0.f;
       this.mForegroundAudioClipStartTime = p0.g;
       this.mForegroundAudioClipEndTime = p0.h;
       this.mBackgroundAudioPath = p0.k;
       this.mForegroundAudioVolume = p0.i;
       this.mBackgroundAudioVolume = p0.j;
       this.mBackgroundAudioRepeat = p0.q;
       this.mIsCrashInEncodingAndGiveUpWorkspace = p0.r;
       this.mPreviewIntent = p0.t;
       this.mIsPhotoMovie = p0.u;
       this.mSessionId = p0.v;
       EncodeRequest$a w = p0.w;
       this.mWorkspace = w;
       this.mWorkspaceDirectory = p0.x;
       this.mVideoContext = p0.y;
       String identifier = (w != null)? w.getIdentifier(): null;
       this.mWorkspaceId = identifier;
       this.mIsImport = p0.z;
       this.mKtvInfo = p0.A;
       this.mVideoEncodeSDKInfo = p0.l;
       this.mIsPipelineSupported = p0.B;
       this.mIsExportTaskInQueueing = p0.C;
       this.mEncodeProfiles = p0.D;
       this.mAudioProfile = p0.J;
       this.mX264Params = p0.I;
       this.mX264Preset = p0.H;
       this.mVideoBitrate = p0.F;
       this.mVideoGopSize = p0.G;
       this.mOverrideParams = p0.K;
       w = p0.L;
       this.mResult = w;
       this.mIsHdExport = p0.M;
       this.mExtraInfoInSEI = p0.N;
       this.mAtlasInfo = p0.O;
       this.mActivityKey = p0.P;
       this.mDisableTranscodeDegrade = p0.Q;
       EncodeRequest$a r = p0.R;
       this.mTemplateGrade = r;
       if (r > null && (w != null && w.g() != null)) {
          this.mWidth = this.mResult.g().getVideoWidth();
          this.mHeight = this.mResult.g().getVideoHeight();
       }else {
          this.mWidth = p0.n;
          this.mHeight = p0.o;
       }
       this.mVideoType = p0.S;
       return;
    }
    public static EncodeRequest fromJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeRequest.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().h(p0, EncodeRequest.class);
    }
    public static EncodeRequest$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, EncodeRequest.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EncodeRequest$a();
    }
    public Object get(c p0){
       c obj = PatchProxy.applyOneRefs(p0, this, EncodeRequest.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       if (p0 != obj) {
          return null;
       }
       Objects.requireNonNull(obj);
       return this.mResult;
    }
    public String getActivityKey(){
       return this.mActivityKey;
    }
    public AtlasInfo getAtlasInfo(){
       return this.mAtlasInfo;
    }
    public String getAudioOutputPath(){
       return this.mAudioOutputPath;
    }
    public String getAudioProfile(){
       return this.mAudioProfile;
    }
    public String getBackgroundAudioPath(){
       return this.mBackgroundAudioPath;
    }
    public boolean getBackgroundAudioRepeat(){
       return this.mBackgroundAudioRepeat;
    }
    public float getBackgroundAudioVolume(){
       return this.mForegroundAudioVolume;
    }
    public String getComment(){
       return this.mComment;
    }
    public int getCount(){
       return this.mCount;
    }
    public String getCoverPath(){
       return this.mCoverPath;
    }
    public List getEncodeProfiles(){
       return this.mEncodeProfiles;
    }
    public byte[] getExtraInfoInSEI(){
       return this.mExtraInfoInSEI;
    }
    public long getForegroundAudioClipEndTime(){
       return this.mForegroundAudioClipEndTime;
    }
    public long getForegroundAudioClipStartTime(){
       return this.mForegroundAudioClipStartTime;
    }
    public String getForegroundAudioPath(){
       return this.mForegroundAudioPath;
    }
    public float getForegroundAudioVolume(){
       return this.mForegroundAudioVolume;
    }
    public int getFrameIntervalMs(){
       return this.mFrameIntervalMs;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public n0 getIWorkspace(){
       Object obj = PatchProxy.apply(null, this, EncodeRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b(this.mWorkspace);
    }
    public a getKtvInfo(){
       return this.mKtvInfo;
    }
    public String getOutputPath(){
       return this.mOutputPath;
    }
    public Intent getPreviewIntent(){
       return this.mPreviewIntent;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public int getTemplateGrade(){
       return this.mTemplateGrade;
    }
    public int getVideoBitrate(){
       return this.mVideoBitrate;
    }
    public String getVideoBufferPath(){
       return this.mVideoBufferPath;
    }
    public VideoContext getVideoContext(){
       return this.mVideoContext;
    }
    public VideoEncodeSDKInfo getVideoEncodeSDKInfo(){
       return this.mVideoEncodeSDKInfo;
    }
    public int getVideoGopSiz(){
       return this.mVideoGopSize;
    }
    public int getVideoType(){
       return this.mVideoType;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public Workspace getWorkspace(){
       return this.mWorkspace;
    }
    public File getWorkspaceDirectory(){
       return this.mWorkspaceDirectory;
    }
    public String getX264Params(){
       return this.mX264Params;
    }
    public String getX264Preset(){
       return this.mX264Preset;
    }
    public boolean isAtlasEncode(){
       EncodeRequest obj = PatchProxy.apply(null, this, EncodeRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && (obj.getType() == Workspace$Type.ATLAS || this.mWorkspace.getType() == Workspace$Type.LONG_PICTURE))? true: false;
       return b;
    }
    public boolean isCrashInEncodingAndGiveUpWorkspace(){
       return this.mIsCrashInEncodingAndGiveUpWorkspace;
    }
    public boolean isDisableTranscodeDegrade(){
       return this.mDisableTranscodeDegrade;
    }
    public boolean isExportTaskInQueueing(){
       return this.mIsExportTaskInQueueing;
    }
    public boolean isHdExport(){
       return this.mIsHdExport;
    }
    public boolean isHidden(){
       return this.mHidden;
    }
    public boolean isImport(){
       return this.mIsImport;
    }
    public boolean isOverrideParams(){
       return this.mOverrideParams;
    }
    public boolean isPhotoMovie(){
       return this.mIsPhotoMovie;
    }
    public boolean isPipelineSupported(){
       return this.mIsPipelineSupported;
    }
    public void setCoverPath(String p0){
       this.mCoverPath = p0;
    }
    public EncodeInfo toEncodeInfo(int p0){
       return this.toEncodeInfo(p0);
    }
    public PostEncodeInfo toEncodeInfo(int p0){
       if (PatchProxy.isSupport(EncodeRequest.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EncodeRequest.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PostEncodeInfo(p0, this, this.getVideoEncodeSDKInfo(), b.c().getComplexEncodeConfig(this.getEncodeProfiles()));
    }
    public String toJson(){
       Object obj = PatchProxy.apply(null, this, EncodeRequest.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().q(this);
    }
}
