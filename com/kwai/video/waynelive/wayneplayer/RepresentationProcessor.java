package com.kwai.video.waynelive.wayneplayer.RepresentationProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.RepresentationProcessor$Companion;
import nsd.u;
import com.kwai.video.waynelive.quality.LiveQualityManager;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.waynelive.quality.LiveQualityChangeListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.LivePlayerParam;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import java.util.List;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.video.waynelive.wayneplayer.RepresentationProcessor$onAttach$1;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import com.kwai.video.waynelive.LivePlayerUtils;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.lang.Math;
import com.kwai.video.player.IKwaiMediaPlayer;

public final class RepresentationProcessor extends AbsWayneProcessor	// class@000e37
{
    public final LiveQualityManager mLiveQualityManager;
    public final Set mOnQualityChangeListeners;
    public int mPriorLowQuality;
    public static final RepresentationProcessor$Companion Companion;

    static {
       RepresentationProcessor.Companion = new RepresentationProcessor$Companion(null);
    }
    public void RepresentationProcessor(){
       super();
       this.mLiveQualityManager = new LiveQualityManager();
       this.mOnQualityChangeListeners = new CopyOnWriteArraySet();
    }
    public static void getMPriorLowQuality$annotations(){
    }
    public final void addOnQualityChangedListener(LiveQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnQualityChangeListeners.add(p0);
       return;
    }
    public final LiveQualityItem getCurrentLiveQualityItem(){
       Object[] objArray = null;
       LiveQualityItem obj = PatchProxy.apply(objArray, this, RepresentationProcessor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isAttach()) {
          return this.mLiveQualityManager.getCurrentQualityItem();
       }
       if (this.getMediaPlayer().mPlayerParam.mIsForceUseLowestQuality != null) {
          obj = this.mLiveQualityManager.getLowestQualityItem();
          a.o(obj, "mLiveQualityManager.lowestQualityItem");
          DebugLog.i(this.getLogTag(), "getCurrentLiveQualityItem forceUseLowestQuality lowestQuality "+obj);
       }else {
          RepresentationProcessor tmPriorLowQu = this.mPriorLowQuality;
          if (tmPriorLowQu > null) {
             obj = this.mLiveQualityManager.getLowQualityItem(tmPriorLowQu);
             a.o(obj, "mLiveQualityManager.getL¡­ityItem\(mPriorLowQuality\)");
             DebugLog.i(this.getLogTag(), "getCurrentLiveQualityItem priorLowQuality "+this.mPriorLowQuality+" matchQuality "+obj);
          }else {
             obj = this.mLiveQualityManager.getCurrentQualityItem();
             a.o(obj, "mLiveQualityManager.currentQualityItem");
             DebugLog.i(this.getLogTag(), "getCurrentLiveQualityItem currentQuality "+obj);
          }
       }
       WayneLivePlayer mediaPlayer = this.getMediaPlayer();
       if (mediaPlayer != null) {
          objArray = mediaPlayer.fillRealResolutionName(obj);
       }
       return objArray;
    }
    public final List getLiveQualityList(){
       Object obj = PatchProxy.apply(null, this, RepresentationProcessor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mLiveQualityManager.getQualityItemList();
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, RepresentationProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getTag()+"::RepresentationProcessor": "RepresentationProcessor";
       return obj;
    }
    public final void initLiveQuality(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "7")) {
          return;
       }
       a.p(p0, "liveDataSource");
       if (p0.getCurrentDatasource().size() > 0) {
          int i = 0;
          if (p0.getCurrentDatasource().get(i) != null) {
             this.mLiveQualityManager.initialize(p0.getCurrentDatasource().get(i));
          label_003a :
             LiveQualityItem currentLiveQ = this.getCurrentLiveQualityItem();
             a.m(currentLiveQ);
             DebugLog.i(this.getLogTag(), "initLiveQuality qualityType "+currentLiveQ.mQualityType);
             return;
          }
       }
       this.mLiveQualityManager.reset();
       goto label_003a ;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "2")) {
          return;
       }
       WayneLivePlayer mPlayerParam = this.getMediaPlayer().mPlayerParam;
       a.o(mPlayerParam, "mediaPlayer.mPlayerParam");
       RepresentationProcessor tmLiveQualit = this.mLiveQualityManager;
       tmLiveQualit.mEnableLastSelectedQuality = mPlayerParam.mEnableLastSelectedQuality;
       tmLiveQualit.setLiveQualityChangeListener(new RepresentationProcessor$onAttach$1(this));
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "5")) {
          return;
       }
       this.mLiveQualityManager.destroy();
       return;
    }
    public final void removeOnQualityChangedListener(LiveQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnQualityChangeListeners.remove(p0);
       return;
    }
    public final void setLiveQualityItem(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "8")) {
          return;
       }
       a.p(p0, "liveQualityItem");
       if (q.f(this.getLiveQualityList())) {
          DebugLog.i(this.getLogTag(), "multiLiveResolution not supported");
          return;
       }else {
          this.mLiveQualityManager.setCurrentQualityItem(p0);
          this.updateLiveQuality();
          DebugLog.i(this.getLogTag(), "setLiveQuality liveQualityItem"+p0);
          return;
       }
    }
    public final void setPriorLowQuality(int p0){
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, representati, "10")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "setPriorLowQuality priorLowQuality"+p0);
       if (this.mPriorLowQuality == p0) {
          return;
       }
       this.mPriorLowQuality = p0;
       this.updateLiveQuality();
       return;
    }
    public final void updateAdaptiveLiveQuality(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RepresentationProcessor.class, "12")) {
          return;
       }
       WayneLivePlayer mediaPlayer = this.getMediaPlayer();
       LiveAdaptiveManifest currentAdapt = (mediaPlayer != null)? mediaPlayer.getCurrentAdaptiveManifest(): objArray;
       LiveQualityItem currentLiveQ = this.getCurrentLiveQualityItem();
       a.m(currentLiveQ);
       int adaptiveInde = LivePlayerUtils.getAdaptiveIndexTargetQuality(currentAdapt, currentLiveQ.mQualityType);
       WayneLivePlayer mediaPlayer1 = this.getMediaPlayer();
       if (mediaPlayer1 != null) {
          objArray = mediaPlayer1.mLiveMediaPlayer;
       }
       if (objArray != null) {
          adaptiveInde = Math.min(5, Math.max(-1, adaptiveInde));
          LivePlayerStatusMonitorImpl mLiveMediaPl = this.getMediaPlayer().mLiveMediaPlayer;
          if (mLiveMediaPl != null) {
             mLiveMediaPl.setLiveManifestSwitchMode(adaptiveInde);
          }
          DebugLog.i(this.getLogTag(), "updateAdaptiveLiveQuality");
       }
       return;
    }
    public final void updateLiveQuality(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "11")) {
          return;
       }
       this.updateAdaptiveLiveQuality();
       return;
    }
}
