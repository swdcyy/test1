package com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import java.lang.Object;
import com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import com.kwai.video.waynelive.LivePlayerRegisterListenerHelper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$PCMAvailableListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$1;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl$LiveExtraInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import java.util.List;
import java.util.Set;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.listeners.LivePlayerKwaivppListener;
import com.kwai.video.waynelive.cache.LivePlayerCacheType;
import mw7.e;
import java.lang.Runnable;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import mw7.b;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import mw7.c;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.listeners.LivePlayerOnAudioProcessPCMAvailableListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.listeners.LivePlayerCompleteListener;
import mw7.d;
import com.kwai.video.waynelive.listeners.LivePlayerRenderAfterBufferStartListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.qosmoniter.LivePlayerQosListener;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.IMediaPlayer;

public abstract class LivePlayerStatusMonitorImpl implements ILivePlayerStatusMonitor	// class@000e2f
{
    public final List mCompletionListenerList;
    public int mCurrentLiveStreamType;
    public boolean mIsBuffering;
    public boolean mIsComplete;
    public final List mKwaivppListeners;
    public int mLatestKwaiVppRequestId;
    public SeiExtraData mLatestSeiExtraData;
    public LiveDataSourceFetcher mLiveDataSourceFetcher;
    public final List mLiveEventListenerList;
    public final List mLiveExtraInfoListeners;
    public final List mLiveInterActiveListenerList;
    public IKwaiMediaPlayer mLiveMediaPlayer;
    public final List mLivePlayerBufferListenerList;
    public final LivePlayerCacheControllerManager mLivePlayerCacheControllerManager;
    public final KsMediaPlayer$OnAudioProcessPCMListener mLivePlayerPcmListener;
    public final List mLivePlayerQosListenerList;
    public final List mLivePlayerSeiInfoListeners;
    public final List mLivePlayerTypeChangeListenerList;
    public final IKwaiMediaPlayer$OnLiveSrvTsptInfoListener mLiveSrvTsptInfoListener;
    public final List mLiveUrlSwitchListenerList;
    public IMediaPlayer$OnLiveVoiceCommentListener mLiveVoiceCommentListener;
    public final IKwaiMediaPlayer$OnLiveExtraInfoListener mOnLiveExtraInfoListener;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener mOnLiveSeiInfoListener;
    public final Set mOnLiveSrvTsptInfoListeners;
    public final List mPCMAvailableListeners;
    public int mPkLiveStreamTypeCache;
    public SeiExtraData mPkSeiCache;
    public IKwaiMediaPlayer$OnLiveSeiInfoListener mPkSeiListener;
    public LivePlayerTypeChangeListener mPkStreamTypeChangeListener;
    public final LivePlayerRegisterListenerHelper mRegisterListenerHelper;
    public final List mRenderAfterBufferStartList;
    public final List mRenderListenerList;
    public int mVideoHeight;
    public final List mVideoSizeChangedListenerList;
    public int mVideoWidth;

    public void LivePlayerStatusMonitorImpl(){
       super();
       this.mLivePlayerCacheControllerManager = new LivePlayerCacheControllerManager();
       this.mRegisterListenerHelper = new LivePlayerRegisterListenerHelper();
       this.mLiveInterActiveListenerList = new CopyOnWriteArrayList();
       this.mLivePlayerBufferListenerList = new ArrayList();
       this.mRenderListenerList = new CopyOnWriteArrayList();
       this.mKwaivppListeners = new CopyOnWriteArrayList();
       this.mCompletionListenerList = new CopyOnWriteArrayList();
       this.mLivePlayerTypeChangeListenerList = new CopyOnWriteArrayList();
       this.mLiveEventListenerList = new CopyOnWriteArrayList();
       this.mVideoSizeChangedListenerList = new CopyOnWriteArrayList();
       this.mLiveUrlSwitchListenerList = new CopyOnWriteArrayList();
       this.mLivePlayerQosListenerList = new CopyOnWriteArrayList();
       this.mPCMAvailableListeners = new CopyOnWriteArrayList();
       this.mLivePlayerSeiInfoListeners = new CopyOnWriteArrayList();
       this.mRenderAfterBufferStartList = new CopyOnWriteArrayList();
       this.mLiveExtraInfoListeners = new CopyOnWriteArrayList();
       this.mLivePlayerPcmListener = new LivePlayerStatusMonitorImpl$PCMAvailableListener(this, null);
       this.mOnLiveSrvTsptInfoListeners = new CopyOnWriteArraySet();
       this.mLiveSrvTsptInfoListener = new LivePlayerStatusMonitorImpl$LiveSrvTsptInfoListener(this, null);
       this.mOnLiveSeiInfoListener = new LivePlayerStatusMonitorImpl$MidOnLiveSeiInfoListener(this, null);
       this.mOnLiveExtraInfoListener = new LivePlayerStatusMonitorImpl$LiveExtraInfoListener(this, null);
    }
    public static void a(LivePlayerStatusMonitorImpl p0,IKwaiMediaPlayer$OnLiveSeiInfoListener p1){
       p0.lambda$addLiveSeiListener$3(p1);
    }
    public static void b(LivePlayerStatusMonitorImpl p0,IKwaiMediaPlayer$OnLiveInterActiveListener p1){
       p0.lambda$addLiveInterActiveTsptListener$0(p1);
    }
    public static void c(LivePlayerStatusMonitorImpl p0,IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p1){
       p0.lambda$addOnLiveSrvTsptInfoListener$1(p1);
    }
    public static void d(LivePlayerStatusMonitorImpl p0,LivePlayerEventListener p1){
       p0.lambda$addLiveEventListener$2(p1);
    }
    private void lambda$addLiveEventListener$2(LivePlayerEventListener p0){
       this.mLivePlayerCacheControllerManager.notifyAAC(p0);
       this.mLiveEventListenerList.add(p0);
    }
    private void lambda$addLiveInterActiveTsptListener$0(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       this.mLivePlayerCacheControllerManager.notifyInterActiveTspt(p0);
       this.mLiveInterActiveListenerList.add(p0);
    }
    private void lambda$addLiveSeiListener$3(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       this.mLivePlayerCacheControllerManager.notifySeiInfo(p0);
       this.mLivePlayerSeiInfoListeners.add(p0);
    }
    private void lambda$addOnLiveSrvTsptInfoListener$1(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       this.mLivePlayerCacheControllerManager.notifySrvTspt(p0);
       this.mOnLiveSrvTsptInfoListeners.add(p0);
    }
    public void addBufferListener(LivePlayerBufferListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLivePlayerBufferListenerList.add(p0);
       return;
    }
    public void addKwaivppListener(LivePlayerKwaivppListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "28")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mKwaivppListeners.add(p0);
       return;
    }
    public void addLiveEventListener(LivePlayerEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "22")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LivePlayerCacheType aAC = LivePlayerCacheType.AAC;
       this.mRegisterListenerHelper.cancelAsyncTask(aAC, p0);
       if (this.mLivePlayerCacheControllerManager.isStarted()) {
          this.mRegisterListenerHelper.startAsyncTask(aAC, p0, new e(this, p0));
       }else {
          this.mLiveEventListenerList.add(p0);
       }
       return;
    }
    public void addLiveExtraListener(IKwaiMediaPlayer$OnLiveExtraInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "34")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLiveExtraInfoListeners.add(p0);
       return;
    }
    public void addLiveInterActiveTsptListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "7")) {
          return;
       }
       if (p0 != null && !this.mLiveInterActiveListenerList.contains(p0)) {
          LivePlayerCacheType iNTER_ACTIVE = LivePlayerCacheType.INTER_ACTIVE_TSPT;
          this.mRegisterListenerHelper.cancelAsyncTask(iNTER_ACTIVE, p0);
          if (this.mLivePlayerCacheControllerManager.isStarted()) {
             this.mRegisterListenerHelper.startAsyncTask(iNTER_ACTIVE, p0, new b(this, p0));
          }else {
             this.mLiveInterActiveListenerList.add(p0);
          }
       }
       return;
    }
    public void addLivePlayerTypeChangeListener(LivePlayerTypeChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "18")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLivePlayerTypeChangeListenerList.add(p0);
       return;
    }
    public void addLiveSeiListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "32")) {
          return;
       }
       DebugLog.i("addLiveSeiListener", "seilistener-"+p0);
       if (p0 != null) {
          LivePlayerCacheType sEI_INFO = LivePlayerCacheType.SEI_INFO;
          this.mRegisterListenerHelper.cancelAsyncTask(sEI_INFO, p0);
          if (this.mLivePlayerCacheControllerManager.isStarted()) {
             this.mRegisterListenerHelper.startAsyncTask(sEI_INFO, p0, new c(this, p0));
          }else {
             this.mLivePlayerSeiInfoListeners.add(p0);
          }
       }
       return;
    }
    public void addLiveUrlSwitchListener(LiveUrlSwitchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "26")) {
          return;
       }
       if (p0 != null) {
          this.mLiveUrlSwitchListenerList.add(p0);
       }
       return;
    }
    public void addOnAudioProcessPCMAvailableListener(LivePlayerOnAudioProcessPCMAvailableListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "30")) {
          return;
       }
       if (p0 != null) {
          if (this.mPCMAvailableListeners.isEmpty()) {
             LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
             if (tmLiveMediaP != null) {
                tmLiveMediaP.setOnAudioProcessPCMAvailableListener(this.mLivePlayerPcmListener);
             }
          }
          this.mPCMAvailableListeners.add(p0);
       }
       return;
    }
    public void addOnCompletionListener(LivePlayerCompleteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mCompletionListenerList.add(p0);
       return;
    }
    public void addOnLiveSrvTsptInfoListener(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       LivePlayerCacheType sRV_TSPT = LivePlayerCacheType.SRV_TSPT;
       this.mRegisterListenerHelper.cancelAsyncTask(sRV_TSPT, p0);
       if (this.mLivePlayerCacheControllerManager.isStarted()) {
          this.mRegisterListenerHelper.startAsyncTask(sRV_TSPT, p0, new d(this, p0));
       }else {
          this.mOnLiveSrvTsptInfoListeners.add(p0);
       }
       return;
    }
    public void addOnVideoRendingStartAfterBufferingListener(LivePlayerRenderAfterBufferStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "5")) {
          return;
       }
       if (p0 != null) {
          this.mRenderAfterBufferStartList.add(p0);
       }
       return;
    }
    public void addOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mVideoSizeChangedListenerList.add(p0);
       return;
    }
    public void addQosMonitorListener(LivePlayerQosListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "24")) {
          return;
       }
       if (p0 != null) {
          this.mLivePlayerQosListenerList.add(p0);
       }
       return;
    }
    public void addRenderListener(LivePlayerRenderListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "16")) {
          return;
       }
       if (p0 != null && !this.mRenderListenerList.contains(p0)) {
          this.mRenderListenerList.add(p0);
       }
       return;
    }
    public void clearAllListener(){
       if (PatchProxy.applyVoid(null, this, LivePlayerStatusMonitorImpl.class, "4")) {
          return;
       }
       DebugLog.i("LivePlayerListenerImpl", "clearAllListener");
       this.mRenderListenerList.clear();
       this.mLivePlayerTypeChangeListenerList.clear();
       this.mLiveEventListenerList.clear();
       this.mLivePlayerBufferListenerList.clear();
       this.mCompletionListenerList.clear();
       this.mVideoSizeChangedListenerList.clear();
       this.mKwaivppListeners.clear();
       this.setLiveVoiceCommentListener(null);
       this.mLiveDataSourceFetcher = null;
       this.mLiveInterActiveListenerList.clear();
       this.mLivePlayerSeiInfoListeners.clear();
       this.mLiveExtraInfoListeners.clear();
       this.mLiveUrlSwitchListenerList.clear();
       this.mPCMAvailableListeners.clear();
       this.mRenderAfterBufferStartList.clear();
       this.mPkSeiListener = null;
       this.mPkStreamTypeChangeListener = null;
       return;
    }
    public int getVideoHeight(){
       LivePlayerStatusMonitorImpl obj = PatchProxy.apply(null, this, LivePlayerStatusMonitorImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLiveMediaPlayer;
       if (obj == null || !obj.getVideoHeight()) {
          return this.mVideoHeight;
       }
       int videoHeight = this.mLiveMediaPlayer.getVideoHeight();
       this.mVideoHeight = videoHeight;
       return videoHeight;
    }
    public int getVideoWidth(){
       LivePlayerStatusMonitorImpl obj = PatchProxy.apply(null, this, LivePlayerStatusMonitorImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLiveMediaPlayer;
       if (obj == null || !obj.getVideoWidth()) {
          return this.mVideoWidth;
       }
       int videoWidth = this.mLiveMediaPlayer.getVideoWidth();
       this.mVideoWidth = videoWidth;
       return videoWidth;
    }
    public void removeBufferListener(LivePlayerBufferListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "15")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLivePlayerBufferListenerList.remove(p0);
       return;
    }
    public void removeKwaivppListener(LivePlayerKwaivppListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "29")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mKwaivppListeners.remove(p0);
       return;
    }
    public void removeLiveEventListener(LivePlayerEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "23")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mRegisterListenerHelper.cancelAsyncTask(LivePlayerCacheType.AAC, p0);
       this.mLiveEventListenerList.remove(p0);
       return;
    }
    public void removeLiveExtraListener(IKwaiMediaPlayer$OnLiveExtraInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "35")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLiveExtraInfoListeners.remove(p0);
       return;
    }
    public void removeLiveInterActiveTsptListener(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mRegisterListenerHelper.cancelAsyncTask(LivePlayerCacheType.INTER_ACTIVE_TSPT, p0);
       this.mLiveInterActiveListenerList.remove(p0);
       return;
    }
    public void removeLivePlayerTypeChangeListener(LivePlayerTypeChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "19")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mLivePlayerTypeChangeListenerList.remove(p0);
       return;
    }
    public void removeLiveSeiListener(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "33")) {
          return;
       }
       DebugLog.i("removeLiveSeiListener", "seilistener-"+p0);
       if (p0 != null) {
          this.mRegisterListenerHelper.cancelAsyncTask(LivePlayerCacheType.SEI_INFO, p0);
          this.mLivePlayerSeiInfoListeners.remove(p0);
       }
       return;
    }
    public void removeLiveUrlSwitchListener(LiveUrlSwitchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "27")) {
          return;
       }
       if (p0 != null) {
          this.mLiveUrlSwitchListenerList.remove(p0);
       }
       return;
    }
    public void removeOnAudioProcessPCMAvailableListener(LivePlayerOnAudioProcessPCMAvailableListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "31")) {
          return;
       }
       if (p0 != null) {
          this.mPCMAvailableListeners.remove(p0);
          if (this.mPCMAvailableListeners.isEmpty()) {
             LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
             if (tmLiveMediaP != null) {
                tmLiveMediaP.setOnAudioProcessPCMAvailableListener(null);
             }
          }
       }
       return;
    }
    public void removeOnCompletionListener(LivePlayerCompleteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mCompletionListenerList.remove(p0);
       return;
    }
    public void removeOnLiveSrvTsptInfoListener(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mRegisterListenerHelper.cancelAsyncTask(LivePlayerCacheType.SRV_TSPT, p0);
       this.mOnLiveSrvTsptInfoListeners.remove(p0);
       return;
    }
    public void removeOnVideoRendingStartAfterBufferingListener(LivePlayerRenderAfterBufferStartListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "6")) {
          return;
       }
       if (p0 != null) {
          this.mRenderAfterBufferStartList.remove(p0);
       }
       return;
    }
    public void removeOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "21")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mVideoSizeChangedListenerList.remove(p0);
       return;
    }
    public void removeQosMonitorListener(LivePlayerQosListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "25")) {
          return;
       }
       if (p0 != null) {
          this.mLivePlayerQosListenerList.remove(p0);
       }
       return;
    }
    public void removeRenderListener(LivePlayerRenderListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "17")) {
          return;
       }
       if (p0 != null) {
          this.mRenderListenerList.remove(p0);
       }
       return;
    }
    public void setLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "11")) {
          return;
       }
       this.mLiveVoiceCommentListener = p0;
       LivePlayerStatusMonitorImpl tmLiveMediaP = this.mLiveMediaPlayer;
       if (tmLiveMediaP != null) {
          tmLiveMediaP.setOnLiveVoiceCommentListener(p0);
       }
       return;
    }
    public void setMediaPlayerListeners(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerStatusMonitorImpl.class, "3")) {
          return;
       }
       if (p0 == null) {
          DebugLog.e("setMediaPlayerListeners", "player == null");
          return;
       }else {
          p0.setOnLiveVoiceCommentListener(this.mLiveVoiceCommentListener);
          if (this.mPCMAvailableListeners.size() > 0) {
             p0.setOnAudioProcessPCMAvailableListener(this.mLivePlayerPcmListener);
          }
          p0.setOnLiveSrvTsptInfoListener(this.mLiveSrvTsptInfoListener);
          DebugLog.i("setOnLiveSeiInfoListener", this.mOnLiveSeiInfoListener.toString());
          p0.setOnLiveSeiInfoListener(this.mOnLiveSeiInfoListener);
          p0.setOnLiveExtraInfoListener(this.mOnLiveExtraInfoListener);
          return;
       }
    }
}
