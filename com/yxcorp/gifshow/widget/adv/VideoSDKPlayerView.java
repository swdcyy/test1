package com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import zxa.a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import android.view.View;
import com.kwai.video.editorsdk2.PreviewPlayerQosInfo;
import gq.a;
import q87.c;
import java.lang.Throwable;
import java.lang.StringBuilder;
import w46.b;
import android.app.Activity;
import e3a.a;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import android.graphics.Bitmap;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PerfEntry;
import ekd.k1;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkQosStatEvent;
import java.util.HashMap;
import java.lang.Enum;
import java.util.Map;
import k2b.u1;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.Iterator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkErrorStats;
import java.lang.Math;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerStats;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.PreviewPlayerDetailedStats;
import com.yxcorp.utility.SystemUtil;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import o56.c;
import o56.a;
import android.app.Application;
import android.graphics.Point;
import com.yxcorp.utility.n;
import com.kwai.video.editorsdk2.ThumbnailStatsInfo;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$b;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.GestureDetector;
import java.lang.Long;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.encode.v0;
import lq.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import fba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.CharSequence;
import h69.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d;
import lnc.g7;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.Kuaishan$TemplateType;
import u80.d;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$VideoSDKPlayerViewException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import com.kwai.video.editorsdk2.ThumbnailGenerator$RequestFinishListener;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import com.kwai.video.editorsdk2.ReleaseResourceRequestBuilder;
import com.kwai.video.editorsdk2.ReleaseResourceRequest;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$f;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.clipkit.ClipFilterBase;
import android.widget.ImageView;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPlayerStats;
import com.kwai.video.editorsdk2.PreviewTextureView;
import com.kwai.video.editorsdk2.RenderPosDetail;
import mca.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import wyc.j;
import com.yxcorp.gifshow.widget.adv.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$SDKPlayerViewException;
import ok.n;
import com.kwai.video.editorsdk2.VideoEditorSession;
import com.kuaishou.ax2c.AX2C;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.widget.TextView;
import xf6.g;
import wyc.f;
import android.view.View$OnClickListener;
import zxa.b;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$c;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector$OnGestureListener;
import com.kuaishou.edit.draft.Workspace;
import wba.d0;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewOption;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.PreviewPlayerInitParamsBuilder;
import com.kwai.video.editorsdk2.PreviewPlayerInitParams;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.j;
import com.kwai.video.editorsdk2.PreviewEventListener;
import wyc.n;
import java.lang.Runnable;
import wyc.m;
import android.view.View$MeasureSpec;
import com.kwai.video.clipkit.log.ClipEditPreviewLog;
import com.kwai.video.clipkit.log.ClipThumbLog;
import java.lang.Exception;
import wyc.k;
import wyc.l;
import java.util.concurrent.Executor;
import java.lang.System;
import java.lang.RuntimeException;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.io.File;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import oa0.a;
import android.content.SharedPreferences;
import cq.a;
import wyc.g;
import com.kwai.video.editorsdk2.PerfEntryConsumer;
import wyc.i;
import com.kwai.video.editorsdk2.PreviewPlayer$RealtimeStatsListenerMc;
import wyc.h;
import com.kwai.video.editorsdk2.PreviewPlayer$RealtimeStatsListener;
import java.lang.IllegalStateException;
import java.io.IOException;
import android.graphics.drawable.Drawable;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import lnc.i1;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import android.view.TextureView;
import android.graphics.Rect;
import ekd.b0;
import android.view.ViewGroup$MarginLayoutParams;

public class VideoSDKPlayerView extends RelativeLayout	// class@001918
{
    public AE2Project mAECustomAE2Project;
    public boolean mAVSync;
    public KwaiImageView mCoverImageView;
    public String mCoverPath;
    public int mCoverRotation;
    public VideoSDKPlayerView$b mCustomThumbnailStatsProvider;
    public PreviewEventListenerV2 mDefaultPreviewEventListener;
    public double mDisplayDuration;
    public TextView mDumpInfoBtn;
    public d mEditingKuaiShanProject;
    public String mExtraDebugInfo;
    public EditorSdk2V2$VideoEditorProject mFakeEditorProject;
    public boolean mGLNeedResetMaskColor;
    public GestureDetector mGestureDetector;
    public b mHideCoverDisposable;
    public boolean mHideCoverWhenPlay;
    public boolean mIsEnableFling;
    public boolean mIsEnablePlayerStatusChanged;
    public boolean mIsNormalAETemplate;
    public boolean mIsOwnPlayer;
    public KwaiMvParam mKuaiShanMvParam;
    public double mLastDebugTimestamp;
    public CountDownLatch mLatch;
    public boolean mLoadedData;
    public boolean mLoading;
    public boolean mLoop;
    public AE2Project mLyricAEProject;
    public final a mMainMvFilterDelegate;
    public int mPage;
    public ImageView mPlayerStatus;
    public Map mPreviewEventListenersMap;
    public PreviewPlayer mPreviewPlayer;
    public PreviewTextureView mPreviewView;
    public float mRatio;
    public VideoEditorSession mSession;
    public PreviewPlayer mSharingPlayer;
    public Map mSimpleGestureListeners;
    public String mTaskId;
    public b mTemplateExceptionLogHelper;
    public ThumbnailGenerator mThumbnailGenerator;
    public final a mThumbnailMvFilterDelegate;
    public Executor mUpdateProjectExecutor;
    public TextView mVideoInfoText;
    public Workspace$Source mWorkSpaceSource;
    public Workspace$Type mWorkSpaceType;
    public static final String DEBUG_TAG;

    static {
       VideoSDKPlayerView.DEBUG_TAG = "VideoSDKPlayerView";
    }
    public void VideoSDKPlayerView(Context p0){
       super(p0, null, 0);
    }
    public void VideoSDKPlayerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VideoSDKPlayerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mUpdateProjectExecutor = null;
       this.mSimpleGestureListeners = new ConcurrentHashMap();
       this.mAVSync = true;
       this.mHideCoverWhenPlay = true;
       this.mPreviewEventListenersMap = new ConcurrentHashMap();
       this.mLoading = true;
       this.mLatch = new CountDownLatch(true);
       this.mGLNeedResetMaskColor = false;
       this.mTaskId = "";
       this.mDisplayDuration = 0xbff0000000000000;
       this.mIsOwnPlayer = true;
       this.mIsEnablePlayerStatusChanged = false;
       this.mIsEnableFling = true;
       this.mMainMvFilterDelegate = new a();
       this.mThumbnailMvFilterDelegate = new a();
       this.mLyricAEProject = null;
       this.mIsNormalAETemplate = false;
       this.mLoadedData = false;
       this.mDefaultPreviewEventListener = new VideoSDKPlayerView$a(this);
       this.initView(p0, p1);
    }
    public static void a(VideoSDKPlayerView p0,int p1,Object p2){
       p0.lambda$runPlayerActionInOtherThread$6(p1, p2);
    }
    public static void b(VideoSDKPlayerView p0,String p1){
       p0.lambda$setStats$4(p1);
    }
    public static void c(VideoSDKPlayerView p0,int p1,Object p2){
       p0.lambda$runPlayerActionInOtherThread$7(p1, p2);
    }
    public static void d(VideoSDKPlayerView p0,Boolean p1){
       p0.lambda$hideCoverIfNeeded$1(p1);
    }
    public static void e(VideoSDKPlayerView p0,PreviewPlayer p1,ThumbnailGenerator p2,String p3,EditorSdk2$EditorSdkError p4){
       p0.lambda$logErrorStatPackageOpt$9(p1, p2, p3, p4);
    }
    public static void f(VideoSDKPlayerView p0,View p1){
       p0.lambda$initView$0(p1);
    }
    public static void g(VideoSDKPlayerView p0,PreviewPlayer p1,ThumbnailGenerator p2,String p3){
       p0.lambda$logStatPackageOpt$8(p1, p2, p3);
    }
    public static void h(VideoSDKPlayerView p0,PreviewPlayerQosInfo p1){
       p0.lambda$setStats$5(p1);
    }
    private void lambda$hideCoverIfNeeded$1(Boolean p0){
       this.mHideCoverWhenPlay = p0.booleanValue();
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "mHideCoverDisposable onNext\(\)", objArray);
    }
    public static void lambda$hideCoverIfNeeded$2(Throwable p0){
       Object[] objArray = new Object[0];
       a.D().t(VideoSDKPlayerView.DEBUG_TAG, "mHideCoverDisposable onError:"+p0.toString(), objArray);
    }
    private void lambda$initView$0(View p0){
       Activity uActivity = a.b(p0.getContext());
       if (uActivity != null) {
          d.a(-273232199).a20().Z3(uActivity, this.mPreviewPlayer.mProject, null);
       }
       return;
    }
    private void lambda$logErrorStatPackageOpt$9(PreviewPlayer p0,ThumbnailGenerator p1,String p2,EditorSdk2$EditorSdkError p3){
       try{
          VideoSDKPlayerView.logStatPackage(this.buildSDKErrorStatPackage(p0, p1, p2, p3));
       }catch(java.lang.Exception e1){
          PostUtils.D("VideoSDKPlayerView", "buildSDKErrorStatPackage: ", e1);
       }
       return;
    }
    private void lambda$logStatPackageOpt$8(PreviewPlayer p0,ThumbnailGenerator p1,String p2){
       try{
          VideoSDKPlayerView.logStatPackage(this.buildStatPackage(p0, p1, p2));
       }catch(java.lang.Exception e1){
          PostUtils.D("VideoSDKPlayerView", "buildStatPackage: ", e1);
       }
       return;
    }
    private void lambda$runPlayerActionInOtherThread$6(int p0,Object p1){
       this.runPlayerActionInOtherThreadInner(p0, p1);
    }
    private void lambda$runPlayerActionInOtherThread$7(int p0,Object p1){
       this.runPlayerActionInOtherThreadInner(p0, p1);
    }
    public static void lambda$setStats$3(float p0,EditorSdk2$PerfEntry p1){
       int i = 0;
       if (p1 == null) {
          Object[] objArray = new Object[i];
          a.D().t("EditorSDK2", "perf entry passed to perfConsumer is null!", objArray);
          return;
       }else if(k1.l(p0)){
          Object[] objArray1 = new Object[i];
          a.D().w("EditorSDK2", "OnPerfEvent: "+p1, objArray1);
       }
       return;
    }
    private void lambda$setStats$4(String p0){
       ClipEditLogger.reportMcRealTimeLog(TextUtils.k(this.mTaskId), p0);
    }
    private void lambda$setStats$5(PreviewPlayerQosInfo p0){
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.editorSdkQosStatEvent = new ClientStat$EditorSdkQosStatEvent();
       HashMap hashMap = new HashMap();
       VideoSDKPlayerView tmWorkSpaceT = this.mWorkSpaceType;
       String str = "unknown";
       String str1 = (tmWorkSpaceT != null)? tmWorkSpaceT.toString(): str;
       hashMap.put("workspace", str1);
       tmWorkSpaceT = this.mWorkSpaceSource;
       if (tmWorkSpaceT != null) {
          str = tmWorkSpaceT.toString();
       }
       hashMap.put("workspaceSource", str);
       p0.insertExtraKeyValueIntoRealtimeStats(hashMap);
       statPackage.editorSdkQosStatEvent.editorSdkQosInfo = p0.getJson();
       statPackage.editorSdkQosStatEvent.taskSessionId = TextUtils.k(this.mTaskId);
       u1.j0(statPackage);
       ClipEditLogger.reportRealTimeLog(TextUtils.k(this.mTaskId), p0, this.getClipEditExtraInfo(), this.getContext().getApplicationContext());
       Iterator iterator = EditorSdk2UtilsV2.getYKitStats().iterator();
       while (iterator.hasNext()) {
          u1.R("YTECH_STAT_INFO", iterator.next(), 26);
       }
       return;
    }
    public static void logStatPackage(ClientStat$StatPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VideoSDKPlayerView.class, "95")) {
          return;
       }
       u1.F0(new StatMetaData().setStatPackage(p0));
       return;
    }
    public void addAnimatedRenderView(EditorSdk2AnimatedRenderView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "9")) {
          return;
       }
       if (this.mPreviewPlayer != null && p0 != null) {
          if (PostExperimentUtils.k1()) {
             this.runPlayerActionInOtherThread(3, p0);
          }else {
             this.mPreviewPlayer.addAnimatedRenderView(p0);
             this.mPreviewPlayer.forceRenderUpdateOnce();
          }
       }
       return;
    }
    public void addSimpleGestureListener(String p0,VideoSDKPlayerView$d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "19")) {
          return;
       }
       if (p1 == null) {
          this.mSimpleGestureListeners.remove(p0);
       }else {
          this.mSimpleGestureListeners.put(p0, p1);
       }
       return;
    }
    public final void assetTaskIdIsNotEmpty(){
    }
    public final ClientStat$StatPackage buildSDKErrorStatPackage(PreviewPlayer p0,ThumbnailGenerator p1,String p2,EditorSdk2$EditorSdkError p3){
       ClientStat$StatPackage obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, VideoSDKPlayerView.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientStat$StatPackage();
       ClientStat$EditorSdkStatEvent uEditorSdkSt = new ClientStat$EditorSdkStatEvent();
       obj.editorSdkStatEvent = uEditorSdkSt;
       ClientStat$EditorSdkErrorStats[] uEditorSdkEr = new ClientStat$EditorSdkErrorStats[]{new ClientStat$EditorSdkErrorStats()};
       uEditorSdkSt.errorStats = uEditorSdkEr;
       obj.editorSdkStatEvent.errorStats[0].errorCode = Math.abs(p3.code());
       obj.editorSdkStatEvent.errorStats[0].errorMessage = p3.message();
       obj.editorSdkStatEvent.previewPlayerStats = this.buildStatPacketEditorMetaPreviewPlayerAndThumbnail(p0, p1, p2, p3);
       p0.urlPackage = new ClientEvent$UrlPackage();
       p0.page = this.getPage();
       p0.statsSessionId = TextUtils.k(p2);
       return obj;
    }
    public final ClientStat$StatPackage buildStatPackage(PreviewPlayer p0,ThumbnailGenerator p1,String p2){
       ClientStat$StatPackage obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoSDKPlayerView.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.assetTaskIdIsNotEmpty();
       obj = new ClientStat$StatPackage();
       ClientStat$EditorSdkStatEvent uEditorSdkSt = new ClientStat$EditorSdkStatEvent();
       obj.editorSdkStatEvent = uEditorSdkSt;
       uEditorSdkSt.previewPlayerStats = this.buildStatPacketEditorMetaPreviewPlayerAndThumbnail(p0, p1, p2, null);
       p0.urlPackage = new ClientEvent$UrlPackage();
       p0.page = this.getPage();
       p0.statsSessionId = TextUtils.k(p2);
       return obj;
    }
    public final ClientStat$EditorSdkPreviewPlayerStats buildStatPacketEditorMetaPreviewPlayerAndThumbnail(PreviewPlayer p0,ThumbnailGenerator p1,String p2,EditorSdk2$EditorSdkError p3){
       VideoSDKPlayerView this;
       HashMap obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, VideoSDKPlayerView.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ClientStat$EditorSdkPreviewPlayerStats uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerStats();
       obj = new HashMap();
       ArrayList uArrayList = new ArrayList();
       PreviewPlayerDetailedStats previewPlaye = null;
       if (p0 != null) {
          previewPlaye = p0.consumeDetailedStats();
          if (previewPlaye != null) {
             HashMap hashMap = new HashMap();
             this = this.mWorkSpaceType;
             String str = "unknown";
             String this1 = (this != null)? this.toString(): str;
             hashMap.put("workspace", this1);
             this = this.mWorkSpaceSource;
             if (this != null) {
                str = this.toString();
             }
             hashMap.put("workspaceSource", str);
             previewPlaye.insertExtraKeyValueIntoPreviewStats(hashMap);
             Map map = previewPlaye.serializeToMap();
             EditorSdk2Utils.insertBoardPlatformIntoPreviewStatsMap(map, SystemUtil.g());
             Point point = n.s(a.a().a());
             EditorSdk2Utils.insertScreenSizeIntoPreviewStatsMap(map, point.x, point.y);
             EditorSdk2Utils.insertTotalMemorySizeIntoPreviewStatsMap(map, (int)(SystemUtil.t() / 1024));
             uArrayList.add(map);
          }
       }
       PreviewPlayerDetailedStats point1 = previewPlaye;
       ThumbnailStatsInfo thumbnailSta = this.buildThumbnailStatsInfo();
       if (thumbnailSta != null) {
          uArrayList.add(thumbnailSta.serializeToMap());
       }
       obj.put("preview_stats", uArrayList);
       uEditorSdkPr.editorMeta = a.a.q(obj);
       this.reportPlayerAndThumb(p0, p1, p2, point1, p3);
       return uEditorSdkPr;
    }
    public final ThumbnailStatsInfo buildThumbnailStatsInfo(){
       Object[] objArray1;
       Object[] objArray = null;
       VideoSDKPlayerView obj = PatchProxy.apply(objArray, this, VideoSDKPlayerView.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mThumbnailGenerator;
       int i = 0;
       if (obj != null) {
          objArray1 = new Object[i];
          a.D().s(VideoSDKPlayerView.DEBUG_TAG, "buildThumbnailStatsInfo: using mThumbnailGenerator", objArray1);
          return obj.getThumbnailDetailedStats();
       }else {
          String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
          Object[] objArray2 = new Object[i];
          a.D().A(dEBUG_TAG, "buildThumbnailStatsInfo: mThumbnailGenerator is null", objArray2);
          obj = this.mCustomThumbnailStatsProvider;
          if (obj != null) {
             objArray1 = new Object[i];
             a.D().s(dEBUG_TAG, "buildThumbnailStatsInfo: using mCustomThumbnailStatsProvider", objArray1);
             return obj.a();
          }else {
             objArray1 = new Object[i];
             a.D().A(dEBUG_TAG, "buildThumbnailStatsInfo: mCustomThumbnailStatsProvider is null", objArray1);
             return objArray;
          }
       }
    }
    public void clearOverlyFilter(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "56")) {
          return;
       }
       if (this.mPreviewPlayer == null) {
          return;
       }
       this.mPreviewPlayer.clearOverlayFilter();
       return;
    }
    public final void clearStats(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "11")) {
          return;
       }
       if (this.mPreviewPlayer != null) {
          this.mPreviewPlayer.removePerfConsumer("preview");
          this.mPreviewPlayer.stopRealtimeQos();
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoSDKPlayerView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.mSimpleGestureListeners.size()) {
          return super.dispatchTouchEvent(p0);
       }
       this.mGestureDetector.onTouchEvent(p0);
       return true;
    }
    public Bitmap dumpNextFrame(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreviewPlayer != null) {
          return this.mPreviewPlayer.dumpNextFrame();
       }
       return null;
    }
    public Bitmap dumpNextFrame(long p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, VideoSDKPlayerView.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mPreviewPlayer != null) {
          return this.mPreviewPlayer.dumpNextFrame(p0);
       }else {
          return null;
       }
    }
    public Bitmap dumpNextOriginalFrame(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreviewPlayer != null) {
          return this.mPreviewPlayer.dumpNextOriginalFrame();
       }
       return null;
    }
    public synchronized AE2Project getAECustomAE2Project(){
       return this.mAECustomAE2Project;
    }
    public final ClipEditExtraInfo getClipEditExtraInfo(){
       int i;
       String str1;
       Kuaishan$TemplateType templateType;
       String templateName;
       Object[] objArray = null;
       ClipEditExtraInfo obj = PatchProxy.apply(objArray, this, VideoSDKPlayerView.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipEditExtraInfo();
       HashMap hashMap = new HashMap();
       obj.appMap = hashMap;
       VideoSDKPlayerView tmWorkSpaceT = this.mWorkSpaceType;
       if (tmWorkSpaceT != null) {
          hashMap.put("videoType", String.valueOf(obj.a(tmWorkSpaceT, this.mWorkSpaceSource)));
       }
       if (i.h()) {
          i = 3;
          Workspace$Type[] typeArray = new Workspace$Type[i];
          typeArray[0] = Workspace$Type.SINGLE_PICTURE;
          typeArray[1] = Workspace$Type.ATLAS;
          typeArray[2] = Workspace$Type.LONG_PICTURE;
          c uoc = i.m().w(typeArray);
          if (uoc != null) {
             VideoSDKPlayerView tmEditingKua = this.mEditingKuaiShanProject;
             a.p(obj, "clipEditExtraInfo");
             if (DraftUtils.K(uoc)) {
                a uoa = uoc.n0();
                if (uoa != null) {
                   AICutTheme uAICutTheme = uoa.v();
                   if (uAICutTheme != null) {
                      a.o(uAICutTheme, "aiCutTheme");
                      FeatureId featureId = uAICutTheme.getFeatureId();
                      String str = "aiCutTheme.featureId";
                      a.o(featureId, str);
                      if (!TextUtils.n(featureId.getExternal(), "-1")) {
                         if (j.j(uoc)) {
                            i = 4;
                         }
                         Size size = d.h(uoc);
                         featureId = uAICutTheme.getFeatureId();
                         a.o(featureId, str);
                         String external = featureId.getExternal();
                         a.o(external, "aiCutTheme.featureId.external");
                         String name = uAICutTheme.getName();
                         a.o(name, "aiCutTheme.name");
                         str1 = external;
                         String str2 = name;
                         g7.n(obj, str1, i, size.b, size.c, 0, 0, 0, str2, 0);
                      }
                   }
                }
             }else if(DraftUtils.G(uoc.F0()) && tmEditingKua != null){
                a uoa1 = uoc.F0();
                if (uoa1 != null) {
                   Kuaishan kuaishan = uoa1.v();
                   if (kuaishan != null) {
                      templateType = kuaishan.getTemplateType();
                   label_00e2 :
                      i = (templateType == Kuaishan$TemplateType.SHIMMER)? 1: 2;
                      str1 = tmEditingKua.getTemplateId();
                      a.o(str1, "ksProject.templateId");
                      int i1 = tmEditingKua.I();
                      int i2 = tmEditingKua.q();
                      boolean b = tmEditingKua.g();
                      boolean b1 = tmEditingKua.H();
                      KSTemplateDetailInfo kSTemplateDe = tmEditingKua.k0();
                      int i3 = (kSTemplateDe != null)? kSTemplateDe.getTemplateGrade(): 0;
                      KSTemplateDetailInfo kSTemplateDe1 = tmEditingKua.k0();
                      if (kSTemplateDe1 != null) {
                         templateName = kSTemplateDe1.getTemplateName();
                         if (templateName != null) {
                         label_011e :
                            String str3 = templateName;
                            KSTemplateDetailInfo kSTemplateDe2 = tmEditingKua.k0();
                            if (kSTemplateDe2 != null) {
                               objArray = kSTemplateDe2.mTemplateBiz;
                            }
                            g7.n(obj, str1, i, i1, i2, b, b1, i3, str3, objArray);
                         }
                      }
                      templateName = "";
                      goto label_011e ;
                   }
                }
                templateType = objArray;
                goto label_00e2 ;
             }
          }
       }
       return obj;
    }
    public CountDownLatch getCountDownLatch(){
       return this.mLatch;
    }
    public String getCoverPath(){
       return this.mCoverPath;
    }
    public KwaiImageView getCoverView(){
       return this.mCoverImageView;
    }
    public double getCurrentTime(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double currentTime = (this.mPreviewPlayer != null)? this.mPreviewPlayer.getCurrentTime(): 0;
       return currentTime;
    }
    public double getDisplayDuration(){
       VideoSDKPlayerView obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.mDisplayDuration;
       if (obj <= 0) {
          double displayDurat = (this.getVideoProject() != null)? EditorSdk2UtilsV2.getDisplayDuration(this.getVideoProject()): 0;
       }
    label_002d :
       return obj;
    }
    public d getEditingKuaiShanProject(){
       return this.mEditingKuaiShanProject;
    }
    public Bitmap getFirstFrame(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreviewPlayer != null) {
          return this.mPreviewPlayer.getFirstFrame();
       }
       return null;
    }
    public Bitmap getFrameAtTime(double p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, VideoSDKPlayerView.class, "74");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getFrameAtTime(p0, 0, 0, false, 0x3ff0000000000000, null);
    }
    public final Bitmap getFrameAtTime(double p0,int p1,int p2,boolean p3,double p4,int p5,Bitmap p6){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Double.valueOf(p4),Integer.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, this, VideoSDKPlayerView.class, "79");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.getFrameAtTime(p0, p1, p2, p3, p4, p5, p6, true);
    }
    public final Bitmap getFrameAtTime(double p0,int p1,int p2,boolean p3,double p4,int p5,Bitmap p6,boolean p7){
       int videoWidth;
       int videoHeight;
       VideoSDKPlayerView videoSDKPlay = this;
       object oobject = p6;
       int i = 0;
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Double.valueOf(p4),Integer.valueOf(p5),oobject,Boolean.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, this, VideoSDKPlayerView.class, "80");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Bitmap uBitmap = null;
       if (this.getVideoWidth() && (!this.getVideoHeight() || !this.getVideoLength())) {
          return uBitmap;
       }else if(p1 <= 0 || p2 <= 0){
          videoWidth = this.getVideoWidth();
          videoHeight = this.getVideoHeight();
       }else {
          videoWidth = p1;
          videoHeight = p2;
       }
       boolean i1 = GSConfig.i();
       int i2 = GSConfig.i();
       int i3 = Math.max(videoWidth, videoHeight);
       int i4 = Math.min(videoWidth, videoHeight);
       if (i4 > i1 || i3 > i2) {
          float f = (float)i4;
          float f1 = (float)i3;
          float f2 = Math.max((f / (float)i1), (f1 / (float)i2));
          int i5 = (int)(f / f2);
          int i6 = (int)(f1 / f2);
          if (videoWidth > videoHeight) {
             videoHeight = i5;
             videoWidth = i6;
          }else {
             videoWidth = i5;
             videoHeight = i6;
          }
          Object[] objArray1 = new Object[i];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "getFrameAtTime: too big shortSide="+i4+" longSide="+i3+" limit w="+i1+" limit h="+i2+" resize w="+videoWidth+" h="+videoHeight, objArray1);
       }
       i1 = p7;
       this.initThumbnailGenerator(i1);
       if (videoSDKPlay.mThumbnailGenerator == null) {
          if (videoSDKPlay.mPreviewPlayer == null) {
             ExceptionHandler.handleCaughtException(new VideoSDKPlayerView$VideoSDKPlayerViewException("ThumbnailGenerator is released and PreviewPlayer is released"));
          }else {
             ExceptionHandler.handleCaughtException(new VideoSDKPlayerView$VideoSDKPlayerViewException("ThumbnailGenerator is released"));
          }
          return uBitmap;
       }else {
          ThumbnailGeneratorResult thumbnailSyn = videoSDKPlay.mThumbnailGenerator.getThumbnailSync(videoSDKPlay.mThumbnailGenerator.newRequestBuilder().setOriginalBitmap(oobject).setTolerance(p4).setIsHighPriority(p3).setProjectRenderFlags(p5).setThumbnailSize(videoWidth, videoHeight).setPositionByRenderPositionSec(p0).build());
          Object[] objArray2 = new Object[i];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "getFrameAtTime: "+thumbnailSyn.hasError()+" "+thumbnailSyn.getErrorReason(), objArray2);
          return thumbnailSyn.getThumbnailBitmap();
       }
    }
    public Bitmap getFrameAtTime(double p0,int p1,int p2,boolean p3,double p4,Bitmap p5){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Double.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, VideoSDKPlayerView.class, "75");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.getFrameAtTime(p0, p1, p2, p3, p4, 8194, p5);
    }
    public void getFrameAtTimeAsync(double p0,int p1,int p2,boolean p3,ThumbnailGenerator$RequestFinishListener p4){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "87")) {
             return;
          }
       }
       if (p4 != null && p0 >= 0) {
          this.initThumbnailGenerator((p3 ^ 0x01));
          if (this.mThumbnailGenerator == null) {
             return;
          }else {
             ThumbnailGeneratorRequestBuilder thumbnailGen = this.mThumbnailGenerator.newRequestBuilder();
             thumbnailGen.setPositionByPlaybackPositionSec(p0).setThumbnailSize(p1, p2);
             if (!p3) {
                thumbnailGen.setProjectRenderFlags(0x4000);
             }
             this.mThumbnailGenerator.getThumbnailAsync(thumbnailGen.build(), p4);
          }
       }
       return;
    }
    public Bitmap getFrameAtTimeWithAllEffects(double p0,int p1,int p2,boolean p3,double p4,Bitmap p5){
       Iterator obj1;
       Bitmap this;
       Object obj = this;
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{Double.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Double.valueOf(p4),p5};
          obj1 = PatchProxy.apply(objArray, obj, VideoSDKPlayerView.class, "77");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       obj1 = this.getVideoProject().animatedSubAssets().iterator();
       while (obj1.hasNext()) {
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = obj1.next();
          hashMap.put(Long.valueOf(uAnimatedSub.assetId()), Boolean.valueOf(uAnimatedSub.notRenderInThumbnail()));
          uAnimatedSub.setNotRenderInThumbnail(0);
          if (b.v(uAnimatedSub.opaque()) || (b.p(uAnimatedSub.opaque()) && uAnimatedSub.renderType())) {
             hashMap1.put(Long.valueOf(uAnimatedSub.assetId()), Integer.valueOf(uAnimatedSub.renderType()));
             uAnimatedSub.setRenderType(0);
          }
       }
       obj.reloadThumbnailGenerator(0);
       this = this.getFrameAtTime(p0, p1, p2, p3, p4, 0, p5, false);
       Iterator iterator = this.getVideoProject().animatedSubAssets().iterator();
       while (iterator.hasNext()) {
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub1 = iterator.next();
          Boolean uBoolean = hashMap.get(Long.valueOf(uAnimatedSub1.assetId()));
          if (uBoolean != null) {
             uAnimatedSub1.setNotRenderInThumbnail(uBoolean.booleanValue());
          }
          Integer integer = hashMap1.get(Long.valueOf(uAnimatedSub1.assetId()));
          if (integer != null) {
             uAnimatedSub1.setRenderType(integer.intValue());
          }
       }
       if (this.getVideoProject().animatedSubAssetsSize() != hashMap.size()) {
          Object[] objArray1 = new Object[0];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "animatedSubAssets changed", objArray1);
       }
       this.reloadThumbnailGenerator();
       if (obj.mThumbnailGenerator != null) {
          obj.mThumbnailGenerator.releaseResourcesAsync(new ReleaseResourceRequestBuilder().setReleaseWesteros(1).build(), new VideoSDKPlayerView$f(null));
       }
       return this;
    }
    public Bitmap getFrameAtTimeWithAllEffects(double p0,boolean p1,double p2,Bitmap p3){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyFourRefs(Double.valueOf(p0), Boolean.valueOf(p1), Double.valueOf(p2), p3, this, VideoSDKPlayerView.class, "76");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getFrameAtTimeWithAllEffects(p0, 0, 0, p1, p2, p3);
    }
    public Bitmap getFrameAtTimeWithoutEffect(double p0,int p1,int p2){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, VideoSDKPlayerView.class, "78");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getFrameAtTime(p0, p1, p2, false, 0x3ff0000000000000, 8202, null);
    }
    public boolean getIsNormalAETemplate(){
       return this.mIsNormalAETemplate;
    }
    public synchronized KwaiMvParam getKuaiShanMvParam(){
       return this.mKuaiShanMvParam;
    }
    public AE2Project getLyricAEProject(){
       return this.mLyricAEProject;
    }
    public ClipFilterBase getMvFilter(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainMvFilterDelegate.a;
    }
    public int getPage(){
       return this.mPage;
    }
    public PreviewPlayer getPlayer(){
       return this.mPreviewPlayer;
    }
    public ImageView getPlayerStatusView(){
       return this.mPlayerStatus;
    }
    public EditorSdk2$PreviewPlayerStats getPreviewPlayerStats(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreviewPlayer == null) {
          return null;
       }
       return this.mPreviewPlayer.getPreviewPlayerStats();
    }
    public PreviewTextureView getPreviewView(){
       return this.mPreviewView;
    }
    public double getProgressOfOutputVideo(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.mPreviewPlayer != null && (this.mPreviewPlayer.mProject == null || this.mDisplayDuration <= 0)) {
          return 0;
       }
       return (this.mPreviewPlayer.getCurrentRenderPosDetail().getPlaybackPositionSec() / this.mDisplayDuration);
    }
    public ThumbnailGenerator getThumbnailGenerator(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.initThumbnailGenerator();
       return this.mThumbnailGenerator;
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.getVideoProject() != null)? a.r(this.getVideoProject()): 1;
       return i;
    }
    public double getVideoLength(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double computedDura = (this.getVideoProject() != null)? EditorSdk2UtilsV2.getComputedDuration(this.getVideoProject()): 0x3ee4f8b588e368f1;
       return computedDura;
    }
    public EditorSdk2V2$VideoEditorProject getVideoProject(){
       PreviewPlayer obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreviewPlayer != null && this.mPreviewPlayer.mProject != null) {
          obj = this.mPreviewPlayer.mProject;
       }else {
          VideoSDKPlayerView tmFakeEditor = this.mFakeEditorProject;
          if (tmFakeEditor == null) {
             tmFakeEditor = new EditorSdk2V2$VideoEditorProject();
             this.mFakeEditorProject = tmFakeEditor;
          }
       }
       return obj;
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.getVideoProject() != null)? a.s(this.getVideoProject()): 1;
       return i;
    }
    public final void hideCoverIfNeeded(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "6")) {
          return;
       }
       this.mHideCoverDisposable = t.just(Boolean.TRUE).delay(200, TimeUnit.MILLISECONDS).subscribe(new j(this), h.b);
       return;
    }
    public final void initThumbnailGenerator(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "81")) {
          return;
       }
       this.initThumbnailGenerator(true);
       return;
    }
    public final void initThumbnailGenerator(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "82")) {
          return;
       }
       _monitor_enter(this);
       if (this.mThumbnailGenerator == null && this.mPreviewPlayer != null) {
          double computedFps = EditorSdk2UtilsV2.getComputedFps(this.getVideoProject());
          if (!computedFps - null) {
             Object[] objArray = new Object[0];
             a.D().t(VideoSDKPlayerView.DEBUG_TAG, "project wrong= "+this.getVideoProject(), objArray);
             ExceptionHandler.handleCaughtException(new VideoSDKPlayerView$SDKPlayerViewException("project wrong, computed fps = 0"));
             computedFps = 24.00f;
          }
          double d = 0x3ff0000000000000 / computedFps;
          n.k(this.mSession, "initialize\(\) should be called first");
          VideoSDKPlayerView tmSession = this.mSession;
          if (tmSession == null) {
             _monitor_exit(this);
             return;
          }else {
             this.mThumbnailGenerator = tmSession.createThumbnailGenerator(a.a().a(), d, this.getVideoWidth(), this.getVideoHeight(), 0x989680);
             this.reloadThumbnailGenerator(p0);
          }
       }
       _monitor_exit(this);
       return;
    }
    public final void initView(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "1")) {
          return;
       }
       this.removeAllViews();
       View view = new AX2C(p0).inflateSync(R.layout.sdk_video_player, this, true);
       this.mPreviewView = view.findViewById(0x7f0a0cb9);
       this.mCoverImageView = view.findViewById(0x7f0a0cb8);
       this.mPlayerStatus = view.findViewById(0x7f0a1569);
       this.mCoverImageView.getHierarchy().u(t$b.e);
       this.mVideoInfoText = this.findViewById(0x7f0a43f9);
       this.mDumpInfoBtn = this.findViewById(0x7f0a0c55);
       if (g.i0()) {
          this.mVideoInfoText.setVisibility(0);
          this.mDumpInfoBtn.setVisibility(0);
          this.mDumpInfoBtn.setOnClickListener(new f(this));
       }
       this.mTemplateExceptionLogHelper = new b("preview");
       return;
    }
    public void initialize(VideoEditorSession p0,PreviewPlayer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "2")) {
          return;
       }
       this.initialize(p0, p1, null);
       return;
    }
    public void initialize(VideoEditorSession p0,PreviewPlayer p1,EditorSdk2Utils$PreviewSizeLimitation p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VideoSDKPlayerView.class, "3")) {
          return;
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       Object[] objArray = new Object[0];
       a.D().w(dEBUG_TAG, "initialize "+this+", sharedPlayer "+p1, objArray);
       if (PostExperimentUtils.k1()) {
          this.mUpdateProjectExecutor = c.f("VideoSDKPlayerView");
       }
       this.mSession = p0;
       this.mGestureDetector = new GestureDetector(this.getContext(), new VideoSDKPlayerView$c(this), new Handler(Looper.getMainLooper()));
       ExternalFilterRequestListenerV2 uExternalFil = null;
       if (p1 != null) {
          this.mPreviewPlayer = p1;
          this.mIsOwnPlayer = false;
       }else if(p2 == null){
          p2 = d0.g(uExternalFil);
       }
       Object[] objArray2 = new Object[0];
       a.D().w(dEBUG_TAG, "create player with preview limitation "+p2, objArray2);
       EditorSdk2$PreviewOption previewOptio = new EditorSdk2$PreviewOption();
       previewOptio.setEnableInaccurateSeekOpt(true);
       boolean b = (a.t().d("enable_tvd_v2", 0) || g.a0())? true: false;
       previewOptio.setEnableTvdV2(b);
       this.mPreviewPlayer = this.mSession.createPreviewPlayer(new PreviewPlayerInitParamsBuilder().setPreviewSizeLimitation(p2).setPreviewOption(previewOptio).setContext(this.getContext()).build());
       this.mIsOwnPlayer = true;
       this.mPreviewPlayer.setExternalFilterRequestListenerV2(uExternalFil);
       this.mPreviewPlayer.setAVSync(this.mAVSync);
       this.mPreviewPlayer.setLoop(this.mLoop);
       this.mPreviewView.setPreviewPlayer(this.mPreviewPlayer);
       if (this.mFakeEditorProject != null) {
          uExternalFil.mProject = this.mFakeEditorProject;
          if (!j.h(this.mPreviewPlayer.mProject.trackAssets().toNormalArray())) {
             Object[] objArray1 = new Object[0];
             a.D().w(dEBUG_TAG, "set project in initialize "+this, objArray1);
             this.sendChangeToPlayer(0);
          }
       }
       this.mPreviewPlayer.setPreviewEventListener(this.mDefaultPreviewEventListener);
       this.setStats();
       this.mFakeEditorProject = new EditorSdk2V2$VideoEditorProject();
       return;
    }
    public final boolean isEditorStatReady(){
       PreviewPlayerDetailedStats obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getPlayer() == null) {
          return b;
       }
       obj = this.getPlayer().getDetailedStats();
       if (obj != null && (!obj.getRenderStats().isEmpty() && !obj.getDecoderStats().isEmpty())) {
          b = true;
       }
    label_003b :
       return b;
    }
    public boolean isLoadedData(){
       return this.mLoadedData;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mPreviewPlayer != null && this.mPreviewPlayer.isPlaying())? true: false;
       return b;
    }
    public boolean isReleased(){
       boolean b = (this.mPreviewPlayer == null)? true: false;
       return b;
    }
    public synchronized boolean isSharingPlayer(){
       boolean b = (this.mSharingPlayer != null)? true: false;
       return b;
    }
    public void logErrorStatPackageOpt(EditorSdk2$EditorSdkError p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "94")) {
          return;
       }
       VideoSDKPlayerView tmTaskId = this.mTaskId;
       VideoSDKPlayerView tmPreviewPla = this.mPreviewPlayer;
       VideoSDKPlayerView tmThumbnailG = this.mThumbnailGenerator;
       if (PostExperimentUtils.M()) {
          n on = new n(this, tmPreviewPla, tmThumbnailG, tmTaskId, p0);
          c.a(v0);
       }else {
          VideoSDKPlayerView.logStatPackage(this.buildSDKErrorStatPackage(tmPreviewPla, tmThumbnailG, tmTaskId, p0));
       }
       return;
    }
    public void logStatPackageOpt(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "93")) {
          return;
       }
       VideoSDKPlayerView tmTaskId = this.mTaskId;
       VideoSDKPlayerView tmPreviewPla = this.mPreviewPlayer;
       VideoSDKPlayerView tmThumbnailG = this.mThumbnailGenerator;
       if (PostExperimentUtils.M()) {
          c.a(new m(this, tmPreviewPla, tmThumbnailG, tmTaskId));
       }else {
          VideoSDKPlayerView.logStatPackage(this.buildStatPackage(tmPreviewPla, tmThumbnailG, tmTaskId));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VideoSDKPlayerView.class, "65")) {
          return;
       }
       if (!this.mRatio) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int mode = View$MeasureSpec.getMode(p1);
          int mode1 = View$MeasureSpec.getMode(p0);
          p1 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
          p0 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
          if (mode != 0x40000000 || mode1 != 0x40000000) {
             if (mode == 0x40000000) {
                p0 = (int)((this.mRatio * (float)p1) + 0x3f000000);
             }else if(mode1 == 0x40000000){
                p1 = (int)(((float)p0 / this.mRatio) + 0x3f000000);
             }else {
                float f = (float)p0;
                float f1 = (float)p1;
                VideoSDKPlayerView tmRatio = this.mRatio;
                if (f - (f1 * tmRatio) > 0) {
                   p0 = (int)((tmRatio * f1) + 0x3f000000);
                }else {
                   p1 = (int)((f / tmRatio) + 0x3f000000);
                }
             }
          }
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
          return;
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "37")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "onPause TextureView "+this, objArray);
       this.mPreviewView.onPause();
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "36")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "onResume TextureView "+this, objArray1);
       this.mPreviewView.onResume();
       if (this.mPreviewPlayer != null) {
          this.mPreviewPlayer.setExternalFilterRequestListenerV2(objArray);
          this.mPreviewPlayer.setPreviewEventListener(this.mDefaultPreviewEventListener);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "31")) {
          return;
       }
       if (this.mPreviewPlayer != null && this.mPreviewPlayer.isPlaying()) {
          Object[] objArray = new Object[0];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "player pause "+this.mPreviewPlayer, objArray);
          this.mPreviewPlayer.pause();
       }
       this.updatePlayerStatusView(0);
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "30")) {
          return;
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(dEBUG_TAG, "call play "+this, objArray);
       if (this.mPreviewPlayer != null && !this.mPreviewPlayer.isPlaying()) {
          Object[] objArray1 = new Object[i];
          a.D().w(dEBUG_TAG, "player play "+this.mPreviewPlayer, objArray1);
          this.mPreviewPlayer.play();
       }
       this.updatePlayerStatusView(true);
       return;
    }
    public void prepareToResize(boolean p0){
       Object[] objArray;
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "5")) {
          return;
       }
       VideoSDKPlayerView tmHideCoverD = this.mHideCoverDisposable;
       if (tmHideCoverD != null && !tmHideCoverD.isDisposed()) {
          this.mHideCoverDisposable.dispose();
          objArray = new Object[0];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "prepareToResize - mHideCoverDisposable disposed", objArray);
       }
       Bitmap uBitmap = this.dumpNextFrame(1000);
       if (uBitmap == null) {
          objArray = new Object[0];
          a.D().A(VideoSDKPlayerView.DEBUG_TAG, "prepareToResize - dumpNextFrame\(\) returns null", objArray);
          if (!p0) {
             this.hideCoverIfNeeded();
             return;
          }
       }else {
          this.mCoverImageView.setImageBitmap(uBitmap);
       }
       this.mCoverImageView.setVisibility(0);
       this.mHideCoverWhenPlay = false;
       this.hideCoverIfNeeded();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "22")) {
          return;
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(dEBUG_TAG, "call release "+this, objArray);
       if (this.mIsOwnPlayer != null && this.mSharingPlayer != null) {
          Object[] objArray1 = new Object[i];
          a.D().w(dEBUG_TAG, "restore sharing player before release "+this.mSharingPlayer, objArray1);
          this.mPreviewPlayer = this.mSharingPlayer;
          this.mSharingPlayer = null;
       }
       this.stop();
       this.releaseThumbnailGenerator();
       this.mCustomThumbnailStatsProvider = null;
       return;
    }
    public void releaseThumbnailGenerator(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "23")) {
          return;
       }
       this.releaseThumbnailGenerator(null);
       return;
    }
    public void releaseThumbnailGenerator(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "24")) {
          return;
       }
       if (this.mThumbnailGenerator != null) {
          Object[] objArray = new Object[0];
          a.D().w(VideoSDKPlayerView.DEBUG_TAG, "call releaseThumbnailGenerator "+this, objArray);
          this.mThumbnailGenerator.release();
          this.mThumbnailGenerator = null;
          if (p0 != null) {
             p0.run();
          }
       }
       return;
    }
    public void reloadThumbnailGenerator(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "86")) {
          return;
       }
       this.reloadThumbnailGenerator(true);
       return;
    }
    public void reloadThumbnailGenerator(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "85")) {
          return;
       }
       if (this.mThumbnailGenerator != null) {
          d0.w(this.mThumbnailGenerator, this.getVideoProject(), p0);
       }
       return;
    }
    public void removeAnimatedRenderView(EditorSdk2AnimatedRenderView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "10")) {
          return;
       }
       if (this.mPreviewPlayer != null && p0 != null) {
          if (PostExperimentUtils.k1()) {
             this.runPlayerActionInOtherThread(4, p0);
          }else {
             this.mPreviewPlayer.removeAnimatedRenderView(p0);
          }
       }
       return;
    }
    public void replaceThumbnailGenerator(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "83")) {
          return;
       }
       if (this.mThumbnailGenerator != null) {
          this.mThumbnailGenerator.release();
       }
       this.mThumbnailGenerator = null;
       return;
    }
    public final void reportPlayerAndThumb(PreviewPlayer p0,ThumbnailGenerator p1,String p2,PreviewPlayerDetailedStats p3,EditorSdk2$EditorSdkError p4){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "68")) {
             return;
          }
       }
       if (p0 != null && p3 != null) {
          Map map = p3.serializeToMap();
          EditorSdk2Utils.insertBoardPlatformIntoPreviewStatsMap(map, SystemUtil.g());
          Point point = n.s(a.a().a());
          EditorSdk2Utils.insertScreenSizeIntoPreviewStatsMap(map, point.x, point.y);
          EditorSdk2Utils.insertTotalMemorySizeIntoPreviewStatsMap(map, (int)(SystemUtil.t() / 1024));
          ClipEditExtraInfo clipEditExtr = this.getClipEditExtraInfo();
          clipEditExtr.page = String.valueOf(this.getPage());
          int i = (p4 != null && p4.code())? 8: 7;
          if (p0.mProject != null) {
             ClipEditPreviewLog uClipEditPre = new ClipEditPreviewLog(this.getContext(), 0, map, p4, p0.mProject, clipEditExtr);
             ClipEditLogger.reportPreviewLog(i, TextUtils.k(p2), v9);
          }
       }
    label_0087 :
       if (p1 != null) {
          ThumbnailStatsInfo thumbnailSta = this.buildThumbnailStatsInfo();
          if (thumbnailSta != null) {
             ClipThumbLog uClipThumbLo = new ClipThumbLog();
             ClipEditExtraInfo uClipEditExt = new ClipEditExtraInfo();
             uClipEditExt.page = String.valueOf(this.getPage());
             uClipThumbLo.extraInfo = uClipEditExt;
             uClipThumbLo.qosMap = thumbnailSta.serializeToMap();
             ClipEditLogger.reportThumbnailLog(7, TextUtils.k(p2), uClipThumbLo.toJson());
          }
       }
       return;
    }
    public synchronized void restorePlayer(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "27")) {
          return;
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       Object[] objArray1 = new Object[0];
       a.D().w(dEBUG_TAG, "call restorePlayer "+this, objArray1);
       if (this.mPreviewPlayer == null) {
          VideoSDKPlayerView tmSharingPla = this.mSharingPlayer;
          if (tmSharingPla != null) {
             this.mPreviewPlayer = tmSharingPla;
             this.mSharingPlayer = objArray;
             this.mPreviewPlayer.setExternalFilterRequestListenerV2(objArray);
             this.mPreviewView.setPreviewPlayer(this.mPreviewPlayer);
             if (this.mFakeEditorProject != null) {
                this.mPreviewPlayer.mProject = this.mFakeEditorProject;
                if (!j.h(this.mPreviewPlayer.mProject.trackAssets().toNormalArray())) {
                   a uoa = a.D();
                   String str = "set project in restorePlayer "+this;
                   Object[] objArray2 = new Object[0];
                   try{
                      uoa.w(dEBUG_TAG, str, objArray2);
                      if (PostExperimentUtils.k1()) {
                         this.sendChangeToPlayerNew(0xbff0000000000000, 2);
                      }else {
                         this.mPreviewPlayer.updateProjectAndMagicData();
                      }
                   }catch(java.io.IOException e0){
                   }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   }
                   e0.printStackTrace();
                }
             }
             this.mPreviewPlayer.setPreviewEventListener(this.mDefaultPreviewEventListener);
             this.mPreviewPlayer.setLoop(this.mLoop);
             this.setStats();
             return;
          }
       }
       return;
    }
    public boolean resume(){
       return false;
    }
    public final void runPlayerActionInOtherThread(int p0,Object p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VideoSDKPlayerView.class, "48")) {
          return;
       }
       VideoSDKPlayerView tmUpdateProj = this.mUpdateProjectExecutor;
       if (tmUpdateProj == null) {
          c.a(new k(this, p0, p1));
       }else {
          tmUpdateProj.execute(new l(this, p0, p1));
       }
       return;
    }
    public final void runPlayerActionInOtherThreadInner(int p0,Object p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VideoSDKPlayerView.class, "49")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoSDKPlayerView", "sendChangeToPlayer async playerAction:"+p0, objArray);
       VideoSDKPlayerView tmPreviewPla = this.mPreviewPlayer;
       if (tmPreviewPla == null) {
          p1 = new Object[0];
          a.D().A("VideoSDKPlayerView", "sendChangeToPlayer async return", p1);
          return;
       }else {
          try{
             long l = System.currentTimeMillis();
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      if (p0 == 4) {
                         if (p1 instanceof EditorSdk2AnimatedRenderView) {
                            tmPreviewPla.removeAnimatedRenderView(p1);
                         }else {
                            PostUtils.D("VideoSDKPlayerView", "runPlayerActionInOtherThreadInner remove", new RuntimeException());
                         }
                      }
                   }else if(p1 instanceof EditorSdk2AnimatedRenderView){
                      tmPreviewPla.addAnimatedRenderView(p1);
                      tmPreviewPla.forceRenderUpdateOnce();
                   }else {
                      PostUtils.D("VideoSDKPlayerView", "runPlayerActionInOtherThreadInner add", new RuntimeException());
                   }
                }else {
                   tmPreviewPla.updateProjectAndMagicData();
                }
             }else {
                tmPreviewPla.updateProject();
             }
             Object[] objArray1 = new Object[0];
             a.D().w("VideoSDKPlayerView", "sendChangeToPlayer async real new cost2:"+k1.t(l), objArray1);
          }catch(java.lang.Exception e8){
             PostUtils.D("VideoSDKPlayerView", "sendChangeToPlayer async error", e8);
          }
          return;
       }
    }
    public void seekTo(double p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, VideoSDKPlayerView.class, "57")) {
          return;
       }
       if (this.mPreviewPlayer == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "seekTo :"+p0, objArray);
       this.mPreviewPlayer.seek(p0);
       return;
    }
    public void seekToPlaybackPosition(double p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, VideoSDKPlayerView.class, "61")) {
          return;
       }
       if (this.mPreviewPlayer != null && this.mPreviewPlayer.mProject != null) {
          this.mPreviewPlayer.seek(this.mPreviewPlayer.getPlaybackPtsDetail(p0).getRenderPositionSec());
       }
       return;
    }
    public void seekToPlaybackStart(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "60")) {
          return;
       }
       this.seekToPlaybackPosition(0);
       return;
    }
    public void seekToStart(){
       double d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "59")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject videoProject = this.getVideoProject();
       Object obj = PatchProxy.applyOneRefs(videoProject, objArray, d0.class, "38");
       if (obj != PatchProxyResult.class) {
          d = obj.doubleValue();
       }else if(videoProject != null && (videoProject.timeEffect() != null && videoProject.timeEffect().timeEffectType() == 3)){
          d = EditorSdk2UtilsV2.getComputedDuration(videoProject);
       }else {
          d = 0;
       }
       this.seekTo(d);
       return;
    }
    public void seekToWithDeletedRange(double p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, VideoSDKPlayerView.class, "58")) {
          return;
       }
       if (this.mPreviewPlayer == null) {
          return;
       }
       this.mPreviewPlayer.seek(p0);
       return;
    }
    public void sendChangeToPlayer(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "45")) {
          return;
       }
       this.sendChangeToPlayer(true);
       return;
    }
    public void sendChangeToPlayer(double p0){
       this.sendChangeToPlayer(true, p0);
    }
    public void sendChangeToPlayer(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "46")) {
          return;
       }
       this.sendChangeToPlayer(p0, 0xbff0000000000000);
       return;
    }
    public void sendChangeToPlayer(boolean p0,double p1){
       if (this.mPreviewPlayer == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoSDKPlayerView", "sendChangeToPlayer "+this, objArray);
       try{
          int i = 0xbff0000000000000;
          this.mDisplayDuration = i;
          if (PostExperimentUtils.k1()) {
             this.sendChangeToPlayerNew(p1, 1);
          label_0064 :
             if (p0 && (this.mThumbnailGenerator != null && this.getVideoProject() != null)) {
                d0.x(this.mThumbnailGenerator, this.getVideoProject(), 0);
             }
          }else {
             long l = System.currentTimeMillis();
             if (p1 - null >= 0) {
                this.mPreviewPlayer.updateProjectAndSeek(p1);
             }else {
                this.mPreviewPlayer.updateProject();
             }
             Object[] objArray1 = new Object[0];
             a.D().w("VideoSDKPlayerView", "sendChangeToPlayer old cost1:"+k1.t(l), objArray1);
             goto label_0064 ;
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("VideoSDKPlayerView", "sendChangeToPlayer needCalSignature="+p0+" seekTime="+p1, e0);
       }
       return;
    }
    public final void sendChangeToPlayerNew(double p0,int p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, VideoSDKPlayerView.class, "47")) {
          return;
       }
       try{
          long l = System.currentTimeMillis();
          if (this.mPreviewPlayer.getPreviewSizeLimitation() == null) {
             EditorSdk2UtilsV2.loadProject(this.mPreviewPlayer.mProject);
          }else {
             EditorSdk2UtilsV2.loadProjectWithSizeLimitation(this.mPreviewPlayer.mProject, this.mPreviewPlayer.getPreviewSizeLimitation());
          }
          if (p0 - null >= 0) {
             this.mPreviewPlayer.seek(p0);
          }
          Object[] objArray = new Object[0];
          a.D().w("VideoSDKPlayerView", "sendChangeToPlayer async new cost1:"+k1.t(l)+",PreviewSizeLimitation:"+this.mPreviewPlayer.getPreviewSizeLimitation(), objArray);
          this.runPlayerActionInOtherThread(p1, null);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized void setAETemplateExternalParams(KwaiMvParam p0,AE2Project p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "89")) {
          return;
       }
       this.mKuaiShanMvParam = p0;
       this.mAECustomAE2Project = p1;
       this.mMainMvFilterDelegate.a(p0, p1);
       this.mThumbnailMvFilterDelegate.a(p0, p1);
       return;
    }
    public void setAVSync(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "28")) {
          return;
       }
       this.mAVSync = p0;
       if (this.mPreviewPlayer != null) {
          this.mPreviewPlayer.setAVSync(p0);
       }
       return;
    }
    public void setCoverMaskColor(int p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VideoSDKPlayerView.class, "13")) {
          return;
       }
       VideoSDKPlayerView tmCoverImage = this.mCoverImageView;
       if (tmCoverImage != null) {
          tmCoverImage.setBackgroundColor(p0);
       }
       return;
    }
    public void setCoverPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "12")) {
          return;
       }
       VideoSDKPlayerView tmCoverImage = this.mCoverImageView;
       if (tmCoverImage != null) {
          tmCoverImage.i0();
          this.mCoverPath = p0;
          if (!TextUtils.x(p0)) {
             this.mCoverImageView.setImageRotation(this.mCoverRotation);
             this.mCoverImageView.v(new File(p0), 0, 0);
          }
       }
       return;
    }
    public void setCoverRotation(int p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VideoSDKPlayerView.class, "15")) {
          return;
       }
       if (p0 == this.mCoverRotation) {
          return;
       }
       this.mCoverRotation = p0;
       VideoSDKPlayerView tmCoverImage = this.mCoverImageView;
       if (tmCoverImage != null) {
          tmCoverImage.setImageRotation(p0);
       }
       if (!TextUtils.x(this.mCoverPath)) {
          this.setCoverPath(this.mCoverPath);
       }
       return;
    }
    public void setCoverVisibility(int p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VideoSDKPlayerView.class, "16")) {
          return;
       }
       VideoSDKPlayerView tmCoverImage = this.mCoverImageView;
       if (tmCoverImage != null && tmCoverImage.getVisibility() != p0) {
          this.setCoverPath(this.mCoverPath);
          this.mCoverImageView.setVisibility(p0);
       }
       return;
    }
    public void setCustomThumbnailStatsProvider(VideoSDKPlayerView$b p0){
       this.mCustomThumbnailStatsProvider = p0;
    }
    public void setDisableAERender(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "64")) {
          return;
       }
       if (this.mPreviewPlayer != null) {
          this.mPreviewPlayer.SetDisableAERender(p0);
       }
       return;
    }
    public void setEnableFling(boolean p0){
       this.mIsEnableFling = p0;
    }
    public void setEnablePlayerStatusChanged(boolean p0){
       this.mIsEnablePlayerStatusChanged = p0;
    }
    public void setExternalFilterListener(ExternalFilterRequestListenerV2 p0){
       this.mMainMvFilterDelegate.d = p0;
    }
    public void setExtraDebugInfo(String p0){
       this.mExtraDebugInfo = p0;
    }
    public void setHideCoverWhenPlay(boolean p0){
       this.mHideCoverWhenPlay = p0;
    }
    public void setIKuaiShanProject(d p0){
       this.mEditingKuaiShanProject = p0;
    }
    public void setIsNormalAETemplate(boolean p0){
       this.mIsNormalAETemplate = p0;
    }
    public VideoSDKPlayerView setLoop(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mLoop = p0;
       if (this.mPreviewPlayer != null) {
          this.mPreviewPlayer.setLoop(p0);
       }
       return this;
    }
    public void setLyricAEProjectModel(AE2Project p0){
       this.mLyricAEProject = p0;
    }
    public void setOverlyFilter(Minecraft$ColorFilterParam p0,float p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, VideoSDKPlayerView.class, "55")) {
          return;
       }
       if (this.mPreviewPlayer == null) {
          return;
       }
       this.mPreviewPlayer.setOverlayFilter(p0, p1, true);
       return;
    }
    public void setPage(int p0){
       this.mPage = p0;
    }
    public void setPlayerStatusIcon(int p0,int p1,int p2){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, VideoSDKPlayerView.class, "7")) {
          return;
       }
       this.mPlayerStatus.setImageResource(p0);
       RelativeLayout$LayoutParams layoutParams = this.mPlayerStatus.getLayoutParams();
       layoutParams.width = p1;
       layoutParams.height = p2;
       this.mPlayerStatus.setLayoutParams(layoutParams);
       return;
    }
    public void setPreviewEventListener(String p0,PreviewEventListenerV2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1 == null) {
          this.mPreviewEventListenersMap.remove(p0);
       }else {
          this.mPreviewEventListenersMap.put(p0, p1);
       }
       return;
    }
    public void setPreviewPlayer(PreviewPlayer p0){
       this.mPreviewPlayer = p0;
    }
    public void setRatio(float p0){
       this.mRatio = p0;
    }
    public final void setStats(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "8")) {
          return;
       }
       float floatx = a.a.getFloat("editor_sdk_statistic_ratio", 0.00f);
       if (this.mPreviewPlayer == null) {
          Object[] objArray = new Object[0];
          a.D().t("VideoSDKPlayerView", "mPreviewPlayer is null", objArray);
          return;
       }else {
          this.mPreviewPlayer.addPerfConsumer("preview", new g(floatx));
          this.mPreviewPlayer.setMcRealtimeQosWithListener(new i(this));
          this.mPreviewPlayer.startRealtimeQosWithListener(new h(this));
          return;
       }
    }
    public void setTaskId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView.class, "88")) {
          return;
       }
       this.mTaskId = p0;
       this.assetTaskIdIsNotEmpty();
       return;
    }
    public VideoSDKPlayerView setVideoProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoSDKPlayerView.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.setVideoProject(p0, false);
    }
    public VideoSDKPlayerView setVideoProject(EditorSdk2V2$VideoEditorProject p0,boolean p1){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, VideoSDKPlayerView.class, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && this.mPreviewPlayer != null) {
          try{
             this.mPreviewPlayer.mProject = p0;
             Object[] objArray = new Object[0];
             a.D().w(VideoSDKPlayerView.DEBUG_TAG, "set project in setVideoProject.", objArray);
             this.mFakeEditorProject = p0;
             if (p1) {
                double d = 0xbff0000000000000;
                this.mDisplayDuration = d;
                if (PostExperimentUtils.k1()) {
                   this.sendChangeToPlayerNew(d, 2);
                }else {
                   this.mPreviewPlayer.updateProjectAndMagicData();
                }
             }else {
                this.sendChangeToPlayer();
             }
          }catch(java.io.IOException e5){
             e5.printStackTrace();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e5){
             e5.printStackTrace();
          }catch(java.lang.IllegalStateException e5){
             e5.printStackTrace();
          }
       }
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VideoSDKPlayerView.class, "14")) {
          return;
       }
       super.setVisibility(p0);
       this.mGLNeedResetMaskColor = true;
       return;
    }
    public void setWorkSpaceInfo(Workspace$Type p0,Workspace$Source p1){
       this.mWorkSpaceType = p0;
       this.mWorkSpaceSource = p1;
    }
    public synchronized PreviewPlayer sharePlayer(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.sharePlayer(true);
    }
    public synchronized PreviewPlayer sharePlayer(boolean p0){
       String obj;
       if (PatchProxy.isSupport(VideoSDKPlayerView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(dEBUG_TAG, "call sharePlayer "+this, objArray);
       if (this.mPreviewPlayer == null) {
          return null;
       }else if(this.mPreviewPlayer != null){
          obj = this.mPreviewPlayer.getMcSummaryPreviewStats();
          Object[] objArray1 = new Object[i];
          a.D().w(dEBUG_TAG, "getMcSummaryPreviewStats:"+obj, objArray1);
          ClipEditLogger.reportMcSummaryLog(7, TextUtils.k(this.mTaskId), obj);
       }
       this.logStatPackageOpt();
       this.onPause();
       this.mPreviewView.setPreviewPlayer(null);
       this.mPreviewPlayer.setPreviewEventListener(null);
       this.mPreviewPlayer.setExternalFilterRequestListenerV2(null);
       this.clearStats();
       this.mPreviewPlayer.pause();
       if (p0) {
          this.mFakeEditorProject = this.mPreviewPlayer.mProject;
       }
       this.mSharingPlayer = this.mPreviewPlayer;
       this.mPreviewPlayer = null;
       return this.mSharingPlayer;
    }
    public EditorSdk2V2$VideoEditorProject snapCurrentProject(){
       Object obj = PatchProxy.apply(null, this, VideoSDKPlayerView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.d(this.getVideoProject());
    }
    public void startVoiceRecording(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "53")) {
          return;
       }
       if (this.mPreviewPlayer != null && this.mPreviewPlayer.mProject != null) {
          this.mPreviewPlayer.mProject.setMuteFlags(3);
          this.sendChangeToPlayer();
       }
       return;
    }
    public synchronized void stop(){
       Object[] objArray3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoSDKPlayerView.class, "21")) {
          return;
       }
       String dEBUG_TAG = VideoSDKPlayerView.DEBUG_TAG;
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w(dEBUG_TAG, "call stop "+this, objArray1);
       if (this.mPreviewPlayer != null) {
          objArray1 = new Object[i];
          a.D().w(dEBUG_TAG, "do stop "+this, objArray1);
          if (this.isEditorStatReady()) {
             String mcSummaryPre = this.mPreviewPlayer.getMcSummaryPreviewStats();
             Object[] objArray2 = new Object[i];
             a.D().w(dEBUG_TAG, "getMcSummaryPreviewStats:"+mcSummaryPre, objArray2);
             ClipEditLogger.reportMcSummaryLog(7, TextUtils.k(this.mTaskId), mcSummaryPre);
             this.logStatPackageOpt();
          }
          if (this.mCoverImageView.getDrawable() != null) {
             this.mCoverImageView.setVisibility(i);
          }
          this.onPause();
          this.mPreviewView.setPreviewPlayer(objArray);
          this.mPreviewPlayer.setExternalFilterRequestListenerV2(objArray);
          this.mFakeEditorProject = this.mPreviewPlayer.mProject;
          this.mTemplateExceptionLogHelper.a();
          if (this.mIsOwnPlayer != null) {
             objArray3 = new Object[i];
             a.D().w(dEBUG_TAG, "release own player "+this.mPreviewPlayer, objArray3);
             this.mPreviewPlayer.setPreviewEventListener(objArray);
             this.clearStats();
             VideoSDKPlayerView tmPreviewPla = this.mPreviewPlayer;
             this.mPreviewPlayer = objArray;
             tmPreviewPla.release();
          }else {
             objArray3 = new Object[i];
             a.D().w(dEBUG_TAG, "using shared player, won\'t release"+this.mPreviewPlayer, objArray3);
             this.mPreviewPlayer.setPreviewEventListener(objArray);
             this.clearStats();
             this.mPreviewPlayer = objArray;
          }
       }
       Iterator iterator = EditorSdk2UtilsV2.getYKitStats().iterator();
       while (iterator.hasNext()) {
          u1.R("YTECH_STAT_INFO", iterator.next(), 26);
       }
       return;
    }
    public void stopVoiceRecording(boolean p0){
       int i1;
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "54")) {
          return;
       }
       if (this.mPreviewPlayer != null && this.mPreviewPlayer.mProject != null) {
          if (p0) {
             this.mPreviewPlayer.mProject.setMuteFlags((this.mPreviewPlayer.mProject.muteFlags() & 0xfe));
          }
          this.mPreviewPlayer.mProject.setMuteFlags((this.mPreviewPlayer.mProject.muteFlags() & 0xfd));
          boolean b = false;
          EditorSdk2V2$AudioAsset uAudioAsset = AudioAssetUtils.c(b, this.mPreviewPlayer.mProject);
          if (uAudioAsset != null) {
             PreviewPlayer mProject = this.mPreviewPlayer.mProject;
             if (!PatchProxy.isSupport(d0.class) || !PatchProxy.applyVoidThreeRefs(uAudioAsset, mProject, Float.valueOf(0.40f), null, d0.class, "34")) {
                try{
                   EditorSdk2V2$TrackAsset[] trackAssetAr = mProject.trackAssets().toNormalArray();
                   if (j.h(trackAssetAr)) {
                      i1.c(new RuntimeException("makeAudioLowVolumeFromTrackAsset error track asset is empty"));
                   }else if(trackAssetAr[b].volume() > 0 && (mProject.muteFlags() & 1) != 1){
                      trackAssetAr = 1;
                   }else {
                      trackAssetAr = 0;
                   }
                   ArrayList uArrayList = new ArrayList();
                   i1 = 0;
                   for (int i = 0; i < mProject.trackAssetsSize(); i = i + 1) {
                      EditorSdk2V2$TrackAsset trackAsset = mProject.trackAssets(i);
                      EditorSdk2$TimeRange trackAssetRe = EditorSdk2UtilsV2.getTrackAssetRenderPosRangeByIndex(mProject, i);
                      if (trackAsset.isVocal()) {
                         if (i1) {
                            i1 = uArrayList.size() - 1;
                            Minecraft$Range range = uArrayList.get(i1).timeRange();
                            double d = range.duration() + trackAssetRe.duration();
                            range.setDuration(d);
                         }else {
                            Minecraft$AudioVolumeRange uAudioVolume = new Minecraft$AudioVolumeRange();
                            Minecraft$Range range1 = new Minecraft$Range();
                            range1.setStart(trackAssetRe.start());
                            range1.setDuration(trackAssetRe.duration());
                            uAudioVolume.setTimeRange(range1);
                            double d1 = (trackAssetAr)? (double)0.40f * uAudioAsset.volume(): uAudioAsset.volume();
                            uAudioVolume.setVolume(d1);
                            uAudioVolume.setFadeTime(0x3fe0000000000000);
                            uArrayList.add(uAudioVolume);
                         }
                      }
                      i1 = trackAsset.isVocal();
                   }
                   Minecraft$AudioVolumeRange[] uAudioVolume1 = new Minecraft$AudioVolumeRange[b];
                   uAudioAsset.setAudioVolumeRanges(uArrayList.toArray(uAudioVolume1));
                }catch(java.lang.Exception e15){
                   PostUtils.D("PostEditorSdkUtil", "makeAudioLowVolumeFromTrackAsset", e15);
                }
             }
          }
       }
    label_0130 :
       return;
    }
    public void storeMagicTouchDataToProject(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "44")) {
          return;
       }
       try{
          if (this.mPreviewPlayer != null) {
             this.mPreviewPlayer.storeMagicTouchDataToProject();
             if (p0) {
                this.sendChangeToPlayer();
             }else if(this.mThumbnailGenerator != null){
                this.reloadThumbnailGenerator();
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void updateDebugInfo(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "4")) {
          return;
       }
       if (this.mPreviewPlayer == null || (this.mPreviewPlayer.mProject != null && g.i0())) {
          double d = (double)System.currentTimeMillis();
          if (d - (this.mLastDebugTimestamp + 0x3faeb851eb851eb8) < 0) {
             return;
          }else {
             this.mLastDebugTimestamp = d;
             String debugInfo = this.mPreviewPlayer.getDebugInfo();
             if (!TextUtils.x(this.mExtraDebugInfo)) {
                debugInfo = debugInfo+"\n\nextraInfo:\n"+this.mExtraDebugInfo;
             }
             this.mVideoInfoText.setText(debugInfo);
             Rect rect = b0.a((long)a.s(this.mPreviewPlayer.mProject), (long)a.r(this.mPreviewPlayer.mProject), (long)this.mPreviewView.getWidth(), (long)this.mPreviewView.getHeight());
             ViewGroup$MarginLayoutParams layoutParams = this.mVideoInfoText.getLayoutParams();
             layoutParams.leftMargin = rect.left + n.c(this.getContext(), 10.00f);
             layoutParams.topMargin = rect.top + n.c(this.getContext(), 0x41f00000);
             this.mVideoInfoText.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void updateFakeVideoProject(EditorSdk2V2$VideoEditorProject p0){
       this.mFakeEditorProject = p0;
    }
    public void updatePlayerStatusView(boolean p0){
       if (PatchProxy.isSupport(VideoSDKPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoSDKPlayerView.class, "92")) {
          return;
       }
       if (this.mIsEnablePlayerStatusChanged == null) {
          return;
       }
       if (p0) {
          this.mPlayerStatus.setVisibility(8);
       }else {
          this.mPlayerStatus.setVisibility(0);
       }
       return;
    }
    public void updateTemplateExceptionInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView.class, "90")) {
          return;
       }
       this.mTemplateExceptionLogHelper.c(p0);
       this.mTemplateExceptionLogHelper.d(p1);
       this.mTemplateExceptionLogHelper.b();
       return;
    }
    public void updateThumbnailGeneratorExternalFilter(){
       if (PatchProxy.applyVoid(null, this, VideoSDKPlayerView.class, "84")) {
          return;
       }
       if (this.mThumbnailGenerator != null) {
          this.mThumbnailGenerator.setExternalFilterRequestListerV2(this.mThumbnailMvFilterDelegate.g);
       }
       return;
    }
}
