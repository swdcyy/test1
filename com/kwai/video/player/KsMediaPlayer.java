package com.kwai.video.player.KsMediaPlayer;
import ci7.a;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import com.kwai.video.player.KsPlayerCore;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.KsMediaPlayer$Builder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.KsMediaPlayerImpl;
import android.os.Bundle;
import java.lang.Boolean;
import com.kwai.video.player.pragma.DebugLog;
import java.lang.ref.WeakReference;
import java.lang.IllegalStateException;
import com.kwai.video.player.KlogObserver$KlogParam;
import java.lang.Number;
import com.kwai.player.qos.AppLiveAdaptiveRealtimeInfo;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import android.content.Context;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.video.player.MediaInfo;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.kwai_player.ProductContext;
import android.graphics.Bitmap;
import java.lang.Float;
import com.kwai.player.qos.KwaiQosInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.KsTrackInfo;
import android.os.Message;
import com.kwai.player.KwaiPlayerConfig;
import android.net.Uri;
import java.util.Map;
import com.kwai.video.player.misc.IMediaDataSource;
import java.io.FileDescriptor;
import android.view.SurfaceHolder;
import com.kwai.video.player.KsMediaPlayer$OnControlMessageListener;
import com.kwai.video.player.KsMediaPlayer$OnNativeInvokeListener;
import com.kwai.video.player.IMediaPlayer$OnLiveAdaptiveQosStatListener;
import com.kwai.video.player.IMediaPlayer$OnQosStatListener;
import com.kwai.video.player.KsMediaPlayer$OnVideoTextureListener;
import android.graphics.SurfaceTexture;

public abstract class KsMediaPlayer extends AbstractNativeMediaPlayer implements a, KwaiPlayerDebugInfoProvider	// class@000ada
{
    public Context mContext;
    public static KsPlayerCore gLastPlayerCore;

    static {
       KsMediaPlayer.gLastPlayerCore = PlayerLibraryLoader.getKsCoreBuiltIn();
    }
    public void KsMediaPlayer(KsMediaPlayer$Builder p0){
       super();
       this.mContext = p0.mContext;
    }
    public static String getColorFormatName(int p0){
       KsPlayerCore obj;
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ksMediaPlaye, "89");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(obj)) {
          return AemonMediaPlayerAdapter.getStaticMethod(obj).getColorFormatName(p0);
       }else {
          return KsMediaPlayerImpl._getColorFormatName(p0);
       }
    }
    public static String getVersion(){
       KsPlayerCore obj = PatchProxy.apply(null, null, KsMediaPlayer.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(obj)) {
          return AemonMediaPlayerAdapter.getStaticMethod(obj).getVersion();
       }
       return KsMediaPlayerImpl._getVersion();
    }
    public static String getVersionExt(){
       KsPlayerCore obj = PatchProxy.apply(null, null, KsMediaPlayer.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(obj)) {
          return AemonMediaPlayerAdapter.getStaticMethod(obj).getVersionExt();
       }
       return KsMediaPlayerImpl._getVersionExt();
    }
    public static void native_init(){
       if (PatchProxy.applyVoid(null, null, KsMediaPlayer.class, "88")) {
          return;
       }
       if (PlayerLibraryLoader.isKwaiplayerLoaded()) {
          KsMediaPlayerImpl._native_init();
       }
       return;
    }
    public static void native_profileBegin(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayer.class, "84")) {
          return;
       }
       if (!KsPlayerCore.isKindOfAemon(KsMediaPlayer.gLastPlayerCore)) {
          KsMediaPlayerImpl._native_profileBegin(p0);
       }
       return;
    }
    public static void native_profileEnd(){
       if (PatchProxy.applyVoid(null, null, KsMediaPlayer.class, "85")) {
          return;
       }
       if (!KsPlayerCore.isKindOfAemon(KsMediaPlayer.gLastPlayerCore)) {
          KsMediaPlayerImpl._native_profileEnd();
       }
       return;
    }
    public static void native_setKwaiLogLevel(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, ksMediaPlaye, "87")) {
          return;
       }
       KsPlayerCore gLastPlayerC = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(gLastPlayerC)) {
          AemonMediaPlayerAdapter.getStaticMethod(gLastPlayerC).native_setKwaiLogLevel(p0);
       }else {
          KsMediaPlayerImpl._native_setKwaiLogLevel(p0);
       }
       return;
    }
    public static void native_setLogLevel(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, ksMediaPlaye, "86")) {
          return;
       }
       KsPlayerCore gLastPlayerC = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(gLastPlayerC)) {
          AemonMediaPlayerAdapter.getStaticMethod(gLastPlayerC).native_setLogLevel(p0);
       }else {
          KsMediaPlayerImpl._native_setLogLevel(p0);
       }
       return;
    }
    public static boolean onNativeInvoke(Object p0,int p1,Bundle p2){
       Object[] obj;
       if (PatchProxy.isSupport(KsMediaPlayer.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, KsMediaPlayer.class, "77");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new Object[]{Integer.valueOf(p1)};
       DebugLog.ifmt("KsMediaPlayer", "onNativeInvoke %d", obj);
       if (p0 != null && p0 instanceof WeakReference) {
          p0 = p0.get();
          if (p0 != null) {
             return p0.onNativeInvokeInternal(p1, p2);
          }else {
             throw new IllegalStateException("<null weakPlayer>.onNativeInvoke\(\)");
          }
       }else {
          throw new IllegalStateException("<null weakThiz>.onNativeInvoke\(\)");
       }
    }
    public static void setKlogParam(KlogObserver$KlogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayer.class, "90")) {
          return;
       }
       KsPlayerCore gLastPlayerC = KsMediaPlayer.gLastPlayerCore;
       if (KsPlayerCore.isKindOfAemon(gLastPlayerC)) {
          AemonMediaPlayerAdapter.getStaticMethod(gLastPlayerC).native_setKlogParam(p0);
       }else {
          KsMediaPlayerImpl._setKlogParam(p0);
       }
       return;
    }
    public abstract void abortNativeCacheIO();
    public abstract void addVideoRawBuffer(byte[] p0);
    public abstract void audioOnly(boolean p0);
    public int bufferEmptyCount(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getPropertyLong(0x7535, 0);
    }
    public abstract int bufferEmptyCountOld();
    public long bufferEmptyDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7534, 0);
    }
    public abstract long bufferEmptyDurationOld();
    public abstract void deselectTrack(int p0);
    public abstract void disableSoftVideoDecode(boolean p0);
    public abstract void enableMediacodecDummy(boolean p0);
    public abstract void enableVideoRawDataCallback(boolean p0);
    public abstract boolean getAdaptiveQosTimerStarted();
    public abstract AppLiveAdaptiveRealtimeInfo getAppLiveAdaptiveRealtimeInfo();
    public abstract AppLiveQosDebugInfo getAppLiveQosDebugInfo();
    public long getAudioCachedBytes(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e28, 0);
    }
    public long getAudioCachedDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e26, 0);
    }
    public long getAudioCachedPackets(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e2a, 0);
    }
    public float getAudioRawLatencySeconds(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x7547, 0);
    }
    public abstract int getAudioSessionId();
    public float getAverageDisplayFps(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x7544, 0);
    }
    public long getBitrate(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e84, 0);
    }
    public float getBufferTimeMax(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x753d, 0);
    }
    public final Context getContext(){
       return this.mContext;
    }
    public long getCpuUsage(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7532, 0);
    }
    public long getCurAbsTime(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x753a, 0);
    }
    public int getCurPlayingId(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getPropertyLong(0x75f9, 0);
    }
    public String getCurPlayingUrl(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPropertyString(0x7599);
    }
    public abstract long getCurrentPosition();
    public abstract String getDataSource();
    public abstract KwaiPlayerDebugInfo getDebugInfo();
    public long getDecodeVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7542, 0);
    }
    public long getDecodedDataSize(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x753b, 0);
    }
    public long getDecodedVideoHeight(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7538, 0);
    }
    public long getDecodedVideoWidth(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7537, 0);
    }
    public long getDisplayFrameCount(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7543, 0);
    }
    public long getDownloadDataSize(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x753c, 0);
    }
    public long getDroppedDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7541, 0);
    }
    public long getDtsDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x753f, 0);
    }
    public abstract long getDuration();
    public abstract boolean getEnableLiveAdaptiveQos();
    public String getKflvVideoPlayingUrl(){
       return this.getCurPlayingUrl();
    }
    public abstract String getKwaiLiveVoiceComment(long p0);
    public abstract String getKwaiSign();
    public abstract String getKwaivppFilters();
    public abstract long getLiveAdaptiveTickDuration();
    public abstract String getLiveRealTimeQosJson(int p0,int p1,long p2,long p3,long p4);
    public abstract MediaInfo getMediaInfo();
    public abstract Bundle getMediaMeta();
    public long getMemorySize(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7533, 0);
    }
    public abstract IMediaPlayer$OnLiveVoiceCommentListener getOnLiveVoiceCommentListener();
    public ProductContext getPlayerProductContext(){
       return null;
    }
    public abstract float getProbeFps();
    public abstract float getPropertyFloat(int p0,float p1);
    public abstract long getPropertyLong(int p0,long p1);
    public abstract String getPropertyString(int p0);
    public abstract boolean getQosTimerStarted();
    public long getReadVideoFrameCount(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7545, 0);
    }
    public abstract Bitmap getScreenShot();
    public abstract int getSelectedTrack(int p0);
    public String getServerAddress(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPropertyString(0x7594);
    }
    public long getSourceDeviceType(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7546, 0);
    }
    public float getSpeed(float p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, ksMediaPlaye, "39");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.getPropertyFloat(0x2713, 0);
    }
    public abstract String getStatJson();
    public String getStreamId(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPropertyString(0x7596);
    }
    public abstract KwaiQosInfo getStreamQosInfo();
    public abstract Surface getSurface();
    public abstract long getTickDuration();
    public ITrackInfo[] getTrackInfo(){
       return this.getTrackInfo();
    }
    public abstract KsTrackInfo[] getTrackInfo();
    public float getVideoAvgFps(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x7536, 0);
    }
    public long getVideoCachedBytes(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e27, 0);
    }
    public long getVideoCachedDuration(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e25, 0);
    }
    public long getVideoCachedPackets(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x4e29, 0);
    }
    public long getVideoDecErrorCount(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7540, 0);
    }
    public float getVideoDecodeFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x2711, 0);
    }
    public int getVideoDecoder(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getPropertyLong(0x4e23, 0);
    }
    public abstract int getVideoHeight();
    public float getVideoOutputFramesPerSecond(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.getPropertyFloat(0x2712, 0);
    }
    public abstract int getVideoSarDen();
    public abstract int getVideoSarNum();
    public abstract String getVideoStatJson();
    public abstract int getVideoWidth();
    public abstract String getVodAdaptiveCacheKey();
    public abstract String getVodAdaptiveHdrType();
    public abstract String getVodAdaptiveHostName();
    public int getVodAdaptiveRepID(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getPropertyLong(0x75f8, 0);
    }
    public abstract String getVodAdaptiveUrl();
    public abstract String getXksCache();
    public long hasNativeCdnRetry(){
       Object obj = PatchProxy.apply(null, this, KsMediaPlayer.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getPropertyLong(0x7549, 0);
    }
    public final void initPlayer(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayer.class, "33")) {
          return;
       }
       super.initPlayer();
       this.initPlayerInternal();
       return;
    }
    public abstract void initPlayerInternal();
    public abstract void initProcessPCMBuffer();
    public abstract boolean isCacheEnabled();
    public abstract boolean isLiveManifest();
    public abstract boolean isLooping();
    public abstract boolean isMediaPlayerValid();
    public boolean isPlayable(){
       return true;
    }
    public abstract boolean isPlaying();
    public abstract boolean onNativeInvokeInternal(int p0,Bundle p1);
    public abstract void onReceivePostEvent(Message p0);
    public abstract void pause();
    public abstract void prepareAsync();
    public final void release(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayer.class, "32")) {
          return;
       }
       this.unInitPlayer();
       this.unInitPlayerInternal();
       return;
    }
    public abstract void reload(String p0,boolean p1);
    public void reset(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayer.class, "34")) {
          return;
       }
       this.resetInternal();
       super.reset();
       return;
    }
    public abstract void resetInternal();
    public final void resetListeners(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayer.class, "78")) {
          return;
       }
       super.resetListeners();
       this.resetListenersInternal();
       return;
    }
    public abstract void resetListenersInternal();
    public abstract void seekTo(long p0);
    public abstract void selectTrack(int p0);
    public void setAegonMTRequestDelayTime(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "28")) {
          return;
       }
       long l = (p0 < 0)? -1: (long)p0;
       this.setOption(1, "mt_request_delay_ms", l);
       return;
    }
    public void setAsyncCacheByteRangeSize(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "3")) {
          return;
       }
       this.setOption(1, "byte-range-size", (long)p0);
       return;
    }
    public void setAsyncCacheFirstByteRangeSize(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "4")) {
          return;
       }
       this.setOption(1, "first-byte-range-size", (long)p0);
       return;
    }
    public void setAudioStreamType(int p0){
    }
    public void setBizExtra(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "38")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          this.setOption(1, "biz-extra", p0);
       }
       return;
    }
    public void setBizFt(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "37")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          this.setOption(1, "biz-ft", p0);
       }
       return;
    }
    public void setBufferTimeMax(float p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ksMediaPlaye, "75")) {
          return;
       }
       this.setPropertyFloat(0x753d, p0);
       return;
    }
    public void setBufferedDataSourceSizeKB(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "8")) {
          return;
       }
       this.setOption(1, "buffered-datasource-size-kb", (long)p0);
       return;
    }
    public void setBufferedDataSourceType(int p0){
       this.setOption(1, "buffered-datasource-type", (long)p0);
    }
    public void setCacheDownloadConnectTimeoutMs(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "5")) {
          return;
       }
       this.setOption(1, "cache-connect-timeout-ms", (long)p0);
       return;
    }
    public void setCacheDownloadReadTimeoutMs(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "6")) {
          return;
       }
       this.setOption(1, "cache-read-timeout-ms", (long)p0);
       return;
    }
    public void setCacheHttpConnectRetryCount(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "10")) {
          return;
       }
       this.setOption(1, "cache-http-connect-retry-cnt", (long)p0);
       return;
    }
    public void setCacheKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "1")) {
          return;
       }
       this.setOption(4, "cache-key", p0);
       return;
    }
    public void setCacheMode(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "2")) {
          return;
       }
       this.setOption(1, "cache-mode", (long)p0);
       return;
    }
    public void setCacheProgressCallbackIntervalMs(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "23")) {
          return;
       }
       this.setOption(1, "progress_cb_interval_ms", (long)p0);
       return;
    }
    public void setCacheSocketBufferSizeKb(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "11")) {
          return;
       }
       this.setOption(1, "cache-socket-buf-size-kb", (long)p0);
       return;
    }
    public void setCacheUpstreamType(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "7")) {
          return;
       }
       this.setOption(1, "cache-upstream-type", (long)p0);
       return;
    }
    public abstract void setCodecFlag(int p0);
    public abstract void setConfig(KwaiPlayerConfig p0);
    public abstract void setConfigJson(String p0);
    public void setCurlBufferSizeKb(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "12")) {
          return;
       }
       this.setOption(1, "curl-buffer-size-kb", (long)p0);
       return;
    }
    public abstract void setDataReadTimeout(int p0);
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsMediaPlayer.class, "31")) {
          return;
       }
       this.setDataSource(p0, p1, null);
       return;
    }
    public abstract void setDataSource(Context p0,Uri p1,Map p2);
    public abstract void setDataSource(IMediaDataSource p0);
    public abstract void setDataSource(FileDescriptor p0);
    public abstract void setDataSource(String p0);
    public abstract void setDataSource(String p0,Map p1);
    public void setDataSourceSeekReopenThresholdKB(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "9")) {
          return;
       }
       this.setOption(1, "datasource-seek-reopen-threshold-kb", (long)p0);
       return;
    }
    public final void setDccAlgMBTh_10(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "80")) {
          return;
       }
       this.setOption(4, "dcc-alg.config_mark_bitrate_th_10", (long)p0);
       return;
    }
    public final void setDccAlgPreReadMs(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "81")) {
          return;
       }
       this.setOption(4, "dcc-alg.config_dcc_pre_read_ms", (long)p0);
       return;
    }
    public final void setDccAlgorithm(boolean p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "79")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "dcc-alg.config_enabled", l);
       return;
    }
    public void setDisableHodorCache(boolean p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "30")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "disable_hodor_cache", l);
       return;
    }
    public abstract void setDisplay(SurfaceHolder p0);
    public void setEnableAudioSpectrum(boolean p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "25")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "enable-audio-spectrum", l);
       return;
    }
    public void setEnableHodorDownloadDebug(boolean p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "27")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "enable_hodor_download_debug", l);
       return;
    }
    public void setEnablePlayAudioGain(boolean p0,String p1){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ksMediaPlaye, "24")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(4, "audio-gain.enable", l);
       if (p0) {
          this.setOption(4, "audio-gain.audio_str", p1);
       }
       return;
    }
    public abstract void setEnableQosStat(boolean p0);
    public abstract void setHevcCodecName(String p0);
    public void setHodorCdnLogExtraMsg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "29")) {
          return;
       }
       this.setOption(1, "extra_msg", p0);
       return;
    }
    public void setHodorTaskRetryType(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "26")) {
          return;
       }
       this.setOption(1, "hodor_task_retry_type", (long)p0);
       return;
    }
    public abstract void setIsLive(boolean p0);
    public void setKeepInBackground(boolean p0){
    }
    public abstract void setKwaivppExtJson(int p0,String p1);
    public abstract void setKwaivppFilters(int p0,String p1);
    public abstract void setKwaivppKswitchJson(int p0,String p1);
    public abstract void setLiveManifestSwitchMode(int p0);
    public abstract void setLooping(boolean p0);
    public abstract void setNetWorkConnectionTimeout(int p0);
    public abstract void setOnControlMessageListener(KsMediaPlayer$OnControlMessageListener p0);
    public abstract void setOnLiveVoiceCommentListener(IMediaPlayer$OnLiveVoiceCommentListener p0);
    public abstract void setOnNativeInvokeListener(KsMediaPlayer$OnNativeInvokeListener p0);
    public abstract void setOnPeriodicalLiveAdaptiveQosStatListener(IMediaPlayer$OnLiveAdaptiveQosStatListener p0);
    public abstract void setOnPeriodicalQosStatListener(IMediaPlayer$OnQosStatListener p0);
    public abstract void setOnVideoTextureListener(KsMediaPlayer$OnVideoTextureListener p0);
    public abstract void setOption(int p0,String p1,long p2);
    public abstract void setOption(int p0,String p1,String p2);
    public abstract void setPlayerMute(int p0);
    public void setProductContext(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "36")) {
          return;
       }
       this.setOption(1, "product-context", p0);
       return;
    }
    public abstract void setPropertyFloat(int p0,float p1);
    public abstract void setQosTickDuration(int p0);
    public abstract boolean setRotateDegree(int p0);
    public abstract void setScreenOnWhilePlaying(boolean p0);
    public abstract void setSpeed(float p0);
    public abstract void setStartPlayBlockBufferMs(int p0,int p1);
    public abstract void setSurface(Surface p0);
    public abstract void setSurfaceTexture(SurfaceTexture p0);
    public void setTag1(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "35")) {
          return;
       }
       this.setOption(4, "tag1", (long)p0);
       return;
    }
    public abstract void setTone(int p0);
    public abstract void setVideoScalingMode(int p0);
    public void setVodP2spCdnRequestInitialSize(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "19")) {
          return;
       }
       this.setOption(1, "vod-p2sp-cdn-request-initial-size", (long)p0);
       return;
    }
    public void setVodP2spCdnRequestMaxSize(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "18")) {
          return;
       }
       this.setOption(1, "vod-p2sp-cdn-request-max-size", (long)p0);
       return;
    }
    public void setVodP2spDisable(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayer.class, "13")) {
          return;
       }
       this.setOption(1, "vod-p2sp-disable", "1");
       return;
    }
    public void setVodP2spHoleIgnoreSpeedcal(boolean p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksMediaPlaye, "22")) {
          return;
       }
       long l = (p0)? 1: 0;
       this.setOption(1, "vod-p2sp-hole-ignore-speedcal", l);
       return;
    }
    public void setVodP2spOffThreshold(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "21")) {
          return;
       }
       this.setOption(1, "vod-p2sp-off-threshold", (long)p0);
       return;
    }
    public void setVodP2spOnThreshold(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "20")) {
          return;
       }
       this.setOption(1, "vod-p2sp-on-threshold", (long)p0);
       return;
    }
    public void setVodP2spParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "15")) {
          return;
       }
       this.setOption(1, "vod-p2sp-params", p0);
       return;
    }
    public void setVodP2spPolicy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "14")) {
          return;
       }
       this.setOption(1, "vod-p2sp-policy", p0);
       return;
    }
    public void setVodP2spTaskMaxSize(int p0){
       KsMediaPlayer ksMediaPlaye = KsMediaPlayer.class;
       if (PatchProxy.isSupport(ksMediaPlaye) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksMediaPlaye, "17")) {
          return;
       }
       this.setOption(1, "vod-p2sp-task-max-size", (long)p0);
       return;
    }
    public void setVodP2spTaskVersion(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayer.class, "16")) {
          return;
       }
       this.setOption(1, "vod-p2sp-task-version", p0);
       return;
    }
    public abstract void setVolume(float p0,float p1);
    public abstract void setWakeMode(Context p0,int p1);
    public abstract void shutdownWaitStop();
    public abstract void start();
    public abstract void step_frame();
    public abstract void stop();
    public abstract void stopStatTimer();
    public abstract void unInitPlayerInternal();
    public abstract void updateCurrentMaxWallClockOffset(long p0);
    public abstract void updateCurrentWallClock(long p0);
}
