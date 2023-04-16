package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$1;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import tv.acfun.core.player.mask.KSDanmakuMaskManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.datasource.IDatasource;
import tv.acfun.core.player.mask.view.DanmakuMaskLayout;
import gyd.a_f;
import jyd.a;
import jyd.c_f;
import com.kwai.video.wayne.player.danmakumask.KSDanmakuMaskListener;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$3;
import tv.acfun.core.player.mask.view.MaskPathRender;
import jyd.f_f;
import com.kwai.video.wayne.player.danmakumask.KSDanamkuMaskType;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$5;
import java.lang.Enum;
import gyd.b_f;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.Choreographer;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$4;
import android.view.Choreographer$FrameCallback;
import android.graphics.RectF;
import com.kwai.video.wayne.player.danmakumask.KSRenderType;
import java.lang.Float;
import tv.acfun.core.player.mask.RenderType;

public class DanmakuProcessor extends AbsKpMidProcessor	// class@000d13
{
    public String TAG;
    public boolean isMaskInvalid;
    public AtomicBoolean isStartedTimmer;
    public long lastPosition;
    public Context mContext;
    public String mDanmakuVttUrl;
    public boolean mEnableDanmakuMask;
    public KSDanmakuMaskManager mMaskManager;
    public OnBuildDataChangedListener onBuildDataChangedListener;
    public OnPlayerLoadingChangedListener onPlayerLoadingChangedListener;
    public String videoId;

    public void DanmakuProcessor(Context p0){
       super();
       this.TAG = "DanmakuProcessor";
       this.isMaskInvalid = true;
       this.mDanmakuVttUrl = "";
       this.isStartedTimmer = new AtomicBoolean(false);
       this.onPlayerLoadingChangedListener = new DanmakuProcessor$1(this);
       this.onBuildDataChangedListener = new DanmakuProcessor$2(this);
       this.mContext = p0;
    }
    public static boolean isIncludeDanmakuMaskFeat(){
       return true;
    }
    public void enableDanmakuMask(boolean p0){
       DanmakuProcessor uDanmakuProc = DanmakuProcessor.class;
       if (PatchProxy.isSupport(uDanmakuProc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuProc, "18")) {
          return;
       }
       DebugLog.e(this.TAG, "enableDanmakuMask is "+p0);
       this.mEnableDanmakuMask = p0;
       uDanmakuProc = this.mMaskManager;
       if (uDanmakuProc != null) {
          uDanmakuProc.y(p0);
          if (p0) {
             this.lastPosition = 0;
             this.startMaskTimer(false);
          }
       }
       return;
    }
    public long getDanmakuPosition(){
       Object obj = PatchProxy.apply(null, this, DanmakuProcessor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       try{
          long l1 = this.getLastVideoPts() - this.getFirstVideoPts();
          if (l1 - l >= 0) {
             l = l1;
          }
          return l;
       }catch(java.lang.NullPointerException e0){
          DebugLog.e(this.TAG, "getDanmakuPosition NullPointerException");
          return e0;
       }
    }
    public final long getFirstVideoPts(){
       Object obj = PatchProxy.apply(null, this, DanmakuProcessor.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.getMediaPlayer() != null) {
          return this.getMediaPlayer().getFirstVideoPts();
       }
       return 0;
    }
    public final long getLastVideoPts(){
       Object obj = PatchProxy.apply(null, this, DanmakuProcessor.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.getMediaPlayer() != null) {
          return this.getMediaPlayer().getLastVideoPts();
       }
       return 0;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "3")) {
          return;
       }
       if (this.getMediaPlayer().getBuildData().getDataSourceModule() != null) {
          this.videoId = this.getMediaPlayer().getBuildData().getDataSourceModule().getVideoId();
       }
       this.mEnableDanmakuMask = this.getMediaPlayer().getBuildData().mEnableDanmakuMask;
       this.initDanmakuMask();
       DebugLog.i(this.TAG, "videoId:"+this.videoId+" mEnableDanmakuMask:"+this.mEnableDanmakuMask+" maskType:"+this.getMediaPlayer().getBuildData().mKSDanamkuMaskType);
       return;
    }
    public final void initDMWithLayout(DanmakuMaskLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor.class, "6")) {
          return;
       }
       a_f uoa_f = new a_f();
       uoa_f.f(true);
       uoa_f.h(false);
       this.mMaskManager = new KSDanmakuMaskManager(this.mContext, new a(p0), uoa_f);
       return;
    }
    public final void initDMWithOriginData(KSDanmakuMaskListener p0,boolean p1){
       DanmakuProcessor uDanmakuProc = DanmakuProcessor.class;
       if (PatchProxy.isSupport(uDanmakuProc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uDanmakuProc, "5")) {
          return;
       }
       a_f uoa_f = new a_f();
       uoa_f.f(p1);
       uoa_f.h(false);
       this.mMaskManager = new KSDanmakuMaskManager(this.mContext, new DanmakuProcessor$3(this, p0), uoa_f);
       return;
    }
    public final void initDMWithTransformPath(MaskPathRender p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a_f uoa_f = new a_f();
       uoa_f.h(true);
       uoa_f.f(true);
       this.mMaskManager = new KSDanmakuMaskManager(this.mContext, new f_f(p0), uoa_f);
       return;
    }
    public final void initDanmakuMask(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "4")) {
          return;
       }
       if (this.getMediaPlayer().getBuildData().mKSDanamkuMaskType == KSDanamkuMaskType.TYPE_UNKNOWN || this.mContext == null) {
          DebugLog.e(this.TAG, "KSDanamkuMaskType is TYPE_UNKNOWN or Context is null");
          return;
       }else {
          int i = DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType[this.getMediaPlayer().getBuildData().mKSDanamkuMaskType.ordinal()];
          boolean b = true;
          if (i != b) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      this.initDMWithTransformPath(this.getMediaPlayer().getBuildData().mMaskPathRender);
                   }
                }else {
                   this.initDMWithLayout(this.getMediaPlayer().getBuildData().mDanmakuMaskLayout);
                }
             }else {
                this.initDMWithOriginData(this.getMediaPlayer().getBuildData().mKwaiDanmakuMaskListener, b);
             }
          }else {
             this.initDMWithOriginData(this.getMediaPlayer().getBuildData().mKwaiDanmakuMaskListener, false);
          }
          b_f.d(false);
          return;
       }
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "1")) {
          return;
       }
       this.TAG = this.getMediaPlayer().getLogTag()+this.TAG;
       this.init();
       this.getMediaPlayer().addOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().removeOnPlayerLoadingChangedListener(this.onPlayerLoadingChangedListener);
       this.releaseDanmakuMask();
       return;
    }
    public void refreshDatasource(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor.class, "11")) {
          return;
       }
       this.videoId = p0.getDataSourceModule().getVideoId();
       if (this.mEnableDanmakuMask != null) {
          this.isMaskInvalid = false;
          this.setMaskVttUrl(this.mDanmakuVttUrl);
       }
       return;
    }
    public final void releaseDanmakuMask(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "10")) {
          return;
       }
       this.isMaskInvalid = true;
       DanmakuProcessor tmMaskManage = this.mMaskManager;
       if (tmMaskManage != null) {
          tmMaskManage.v();
       }
       return;
    }
    public void resetDanmakuMask(){
       if (PatchProxy.applyVoid(null, this, DanmakuProcessor.class, "19")) {
          return;
       }
       DanmakuProcessor tmMaskManage = this.mMaskManager;
       if (tmMaskManage != null) {
          tmMaskManage.w();
       }
       return;
    }
    public boolean setMaskVttUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuProcessor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mMaskManager != null) {
          if (TextUtils.isEmpty(this.videoId) || TextUtils.isEmpty(p0)) {
             this.isMaskInvalid = true;
             DebugLog.e(this.TAG, "setMaskVttUrl error,mVideoId or url is empty");
          }else {
             this.isMaskInvalid = false;
             this.mDanmakuVttUrl = p0;
             this.mMaskManager.C(this.videoId, p0);
             this.startMaskTimer(false);
             return true;
          }
       }
       return false;
    }
    public void startMaskTimer(boolean p0){
       DanmakuProcessor uDanmakuProc = DanmakuProcessor.class;
       if (PatchProxy.isSupport(uDanmakuProc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuProc, "8")) {
          return;
       }
       if (!p0 && this.isStartedTimmer.get()) {
          DebugLog.i(this.TAG, "timer has started , return ");
          return;
       }else if(this.isMaskInvalid != null || this.mEnableDanmakuMask == null){
          this.isStartedTimmer.set(false);
          DebugLog.i(this.TAG, "isMaskInvalid is true,MaskTimer has to be stopped");
          return;
       }else {
          this.isStartedTimmer.set(true);
          Choreographer.getInstance().postFrameCallback(new DanmakuProcessor$4(this));
          return;
       }
    }
    public void updateDanmakuRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor.class, "15")) {
          return;
       }
       DanmakuProcessor tmMaskManage = this.mMaskManager;
       if (tmMaskManage != null) {
          tmMaskManage.E(p0);
       }
       return;
    }
    public void updateRenderType(KSRenderType p0,KSRenderType p1,float p2){
       RenderType oTHER;
       RenderType oTHER1;
       if (PatchProxy.isSupport(DanmakuProcessor.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, DanmakuProcessor.class, "17")) {
          return;
       }
       if (this.mMaskManager != null) {
          DebugLog.d(this.TAG, "updateRenderType: videoRenderType="+p0+" maskRenderType="+p1+" frameRate="+p2);
          int[] $SwitchMap$c = DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType;
          int i = $SwitchMap$c[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                oTHER = (i != 3)? RenderType.OTHER: RenderType.TEXTURE;
             }else {
                oTHER = RenderType.SURFACE;
             }
          }else {
             oTHER = RenderType.NORMAL;
          }
          int i1 = $SwitchMap$c[p1.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                oTHER1 = (i1 != 3)? RenderType.OTHER: RenderType.TEXTURE;
             }else {
                oTHER1 = RenderType.SURFACE;
             }
          }else {
             oTHER1 = RenderType.NORMAL;
          }
          this.mMaskManager.F(oTHER, oTHER1, p2);
       }
       return;
    }
    public void updateVideoRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor.class, "16")) {
          return;
       }
       DanmakuProcessor tmMaskManage = this.mMaskManager;
       if (tmMaskManage != null) {
          tmMaskManage.G(p0);
       }
       return;
    }
}
