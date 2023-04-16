package com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.video.wayne.player.main._0_AbstractPlayerHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import kotlin.jvm.internal.a;
import com.kwai.video.player.kwai_player.AspectKwaiVodAdaptive;
import java.lang.Number;
import android.graphics.Bitmap;
import java.lang.Float;
import com.kwai.player.qos.KwaiQosInfo;
import android.view.Surface;
import android.view.MotionEvent;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import android.graphics.SurfaceTexture;

public abstract class _1_AbstractMediaPlayerApiDelegate extends _0_AbstractPlayerHolder implements IMediaPlayerApi	// class@000da6
{
    public boolean mLoop;
    public boolean mMute;
    public boolean mUseDeprecatedMethod;

    public void _1_AbstractMediaPlayerApiDelegate(){
       super();
       this.mLoop = true;
    }
    public boolean checkCanStartPlay(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiMediaPlayer;
       boolean b = (obj != null)? obj.checkCanStartPlay(): false;
       return b;
    }
    public final void configKwaiMediaPlayerAfterCreate(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "63")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setLooping(this.mLoop);
       }
       tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setPlayerMute(this.mMute);
       }
       return;
    }
    public void enableLoopOnBlock(int p0,int p1,long p2){
       if (PatchProxy.isSupport(_1_AbstractMediaPlayerApiDelegate.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, _1_AbstractMediaPlayerApiDelegate.class, "34")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.enableLoopOnBlock(p0, p1, p2);
       }
       return;
    }
    public boolean getAPJoySoundSwitchStatus(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiMediaPlayer;
       boolean aPJoySoundSw = (obj != null)? obj.getAPJoySoundSwitchStatus(): false;
       return aPJoySoundSw;
    }
    public AspectAwesomeCache getAspectAwesomeCache(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getAspectAwesomeCache();
       }
       a.m(objArray);
       return objArray;
    }
    public AspectKwaiVodAdaptive getAspectVodAdaptive(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getAspectVodAdaptive();
       }
       return objArray;
    }
    public long getCurrentPosition(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long currentPosit = (obj != null)? obj.getCurrentPosition(): 0;
       return currentPosit;
    }
    public String getCurrentTranscodeType(){
       String currentTrans;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          currentTrans = obj.getCurrentTranscodeType();
          if (currentTrans != null) {
          label_001d :
             return currentTrans;
          }
       }
       currentTrans = "";
       goto label_001d ;
    }
    public long getCurrentVideoPosition(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long currentVideo = (obj != null)? obj.getCurrentVideoPosition(): 0;
       return currentVideo;
    }
    public int getDownloadedPercent(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int downloadedPe = (obj != null)? obj.getDownloadedPercent(): 0;
       return downloadedPe;
    }
    public long getDuration(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long duration = (obj != null)? obj.getDuration(): 0;
       return duration;
    }
    public long getFirstVideoPts(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long firstVideoPt = (obj != null)? obj.getFirstVideoPts(): 0;
       return firstVideoPt;
    }
    public long getKernalPlayedDuration(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       if (obj == null) {
          return 0;
       }
       a.m(obj);
       return (long)obj.getTotalPlayBackDuration();
    }
    public long getLastVideoPts(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mKwaiMediaPlayer;
       long lastVideoPts = (obj != null)? obj.getLastVideoPts(): 0;
       return lastVideoPts;
    }
    public final boolean getMUseDeprecatedMethod(){
       return this.mUseDeprecatedMethod;
    }
    public int getOrientationDegrees(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int orientationD = (obj != null)? obj.getOrientationDegrees(): 0;
       return orientationD;
    }
    public Bitmap getScreenShot(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getScreenShot();
       }
       a.m(objArray);
       return objArray;
    }
    public float getSpeed(float p0){
       _0_AbstractPlayerHolder obj;
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, _1_AbstractM, "22");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.mKwaiMediaPlayer;
       p0 = (obj != null)? obj.getSpeed(p0): 0x3f800000;
       return p0;
    }
    public KwaiQosInfo getStreamQosInfo(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getStreamQosInfo();
       }
       a.m(objArray);
       return objArray;
    }
    public Surface getSurface(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = obj.getSurface();
       }
       return objArray;
    }
    public int getVideoAlphaType(){
       Object[] objArray = null;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(objArray, this, _1_AbstractMediaPlayerApiDelegate.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          objArray = Integer.valueOf(obj.getVideoAlphaType());
       }
       a.m(objArray);
       return objArray.intValue();
    }
    public int getVideoHeight(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int videoHeight = (obj != null)? obj.getVideoHeight(): 0;
       return videoHeight;
    }
    public int getVideoSarDen(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int videoSarDen = (obj != null)? obj.getVideoSarDen(): 0;
       return videoSarDen;
    }
    public int getVideoSarNum(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int videoSarNum = (obj != null)? obj.getVideoSarNum(): 0;
       return videoSarNum;
    }
    public int getVideoWidth(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int videoWidth = (obj != null)? obj.getVideoWidth(): 0;
       return videoWidth;
    }
    public String getVodAdaptiveCacheKey(){
       String vodAdaptiveC;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          vodAdaptiveC = obj.getVodAdaptiveCacheKey();
          if (vodAdaptiveC != null) {
          label_001d :
             return vodAdaptiveC;
          }
       }
       vodAdaptiveC = "";
       goto label_001d ;
    }
    public int getVodAdaptiveRepID(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mKwaiMediaPlayer;
       int vodAdaptiveR = (obj != null)? obj.getVodAdaptiveRepID(): 0;
       return vodAdaptiveR;
    }
    public String getVodAdaptiveUrl(){
       String vodAdaptiveU;
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKwaiMediaPlayer;
       if (obj != null) {
          vodAdaptiveU = obj.getVodAdaptiveUrl();
          if (vodAdaptiveU != null) {
          label_001d :
             return vodAdaptiveU;
          }
       }
       vodAdaptiveU = "";
       goto label_001d ;
    }
    public boolean handleTouchEvent(MotionEvent p0){
       _0_AbstractPlayerHolder obj = PatchProxy.applyOneRefs(p0, this, _1_AbstractMediaPlayerApiDelegate.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiMediaPlayer;
       boolean b = (obj != null)? obj.handleTouchEvent(p0): false;
       return b;
    }
    public boolean isMediaPlayerValid(){
       _0_AbstractPlayerHolder obj = PatchProxy.apply(null, this, _1_AbstractMediaPlayerApiDelegate.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mKwaiMediaPlayer;
       boolean b = (obj != null)? obj.isMediaPlayerValid(): false;
       return b;
    }
    public boolean isRepresentationEnableAdaptive(int p0){
       _0_AbstractPlayerHolder obj;
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "40");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mKwaiMediaPlayer;
       boolean b = (obj != null)? obj.isRepresentationEnableAdaptive(p0): false;
       return b;
    }
    public void onPrepareAsyncCalled(){
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "4")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.pause();
       }
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "1")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.prepareAsync();
       }
       this.onPrepareAsyncCalled();
       return;
    }
    public void registerSensorEvent(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "43")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.registerSensorEvent();
       }
       return;
    }
    public void releaseAsync(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "13")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.releaseAsync();
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "10")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.reset();
       }
       return;
    }
    public void seekTo(long p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, _1_AbstractM, "5")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.seekTo(p0);
       }
       return;
    }
    public void setAPJoySoundSwitchStatus(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "62")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setAPJoySoundSwitchStatus(p0);
       }
       return;
    }
    public void setAbLoop(long p0,long p1,int p2){
       if (PatchProxy.isSupport(_1_AbstractMediaPlayerApiDelegate.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, _1_AbstractMediaPlayerApiDelegate.class, "47")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setAbLoop(p0, p1, p2);
       }
       return;
    }
    public void setAbLoop(long p0,long p1,int p2,boolean p3){
       if (PatchProxy.isSupport(_1_AbstractMediaPlayerApiDelegate.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, _1_AbstractMediaPlayerApiDelegate.class, "48")) {
          return;
       }
       this.mUseDeprecatedMethod = true;
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setAbLoop(p0, p1, p2, p3);
       }
       return;
    }
    public void setCencKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _1_AbstractMediaPlayerApiDelegate.class, "32")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setCencKey(p0);
       }
       return;
    }
    public void setDrmKeyInfo(String p0,int p1,int p2){
       if (PatchProxy.isSupport(_1_AbstractMediaPlayerApiDelegate.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, _1_AbstractMediaPlayerApiDelegate.class, "33")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setDrmKeyInfo(p0, p1, p2);
       }
       return;
    }
    public void setEnableAudioSpectrum(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "28")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setEnableAudioSpectrum(p0);
       }
       return;
    }
    public void setInteractiveMode(int p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "41")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setInteractiveMode(p0);
       }
       return;
    }
    public void setKwaivppExtJson(int p0,String p1){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, _1_AbstractM, "49")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setKwaivppExtJson(p0, p1);
       }
       return;
    }
    public void setKwaivppFilters(int p0,String p1){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, _1_AbstractM, "50")) {
          return;
       }
       a.p(p1, "filters");
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setKwaivppFilters(p0, p1);
       }
       return;
    }
    public void setLastTryFlag(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "31")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setLastTryFlag(p0);
       }
       return;
    }
    public void setLooping(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "11")) {
          return;
       }
       this.mLoop = p0;
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setLooping(p0);
       }
       return;
    }
    public final void setMUseDeprecatedMethod(boolean p0){
       this.mUseDeprecatedMethod = p0;
    }
    public void setMediacodecDummyEnable(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "53")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP instanceof KwaiMediaPlayer) {
          tmKwaiMediaP.enableMediacodecDummy(p0);
       }
       return;
    }
    public void setPlayerMute(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "30")) {
          return;
       }
       this.mMute = p0;
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setPlayerMute(p0);
       }
       return;
    }
    public void setScreenOnWhilePlaying(boolean p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, _1_AbstractM, "12")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setScreenOnWhilePlaying(p0);
       }
       return;
    }
    public void setSpeed(float p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, _1_AbstractM, "21")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setSpeed(p0);
       }
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, _1_AbstractMediaPlayerApiDelegate.class, "51")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setSurfaceTexture(p0);
       }
       return;
    }
    public void setTag1(int p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "29")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setTag1(p0);
       }
       return;
    }
    public void setTone(int p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "20")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setTone(p0);
       }
       return;
    }
    public void setVideoScalingMode(int p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "16")) {
          return;
       }
       this.mKwaiMediaPlayer.setVideoScalingMode(p0);
       return;
    }
    public void setViewSize(int p0,int p1){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, _1_AbstractM, "17")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setViewSize(p0, p1);
       }
       return;
    }
    public void setVolume(float p0,float p1){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, _1_AbstractM, "9")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.setVolume(p0, p1);
       }
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "2")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.start();
       }
       return;
    }
    public void stepFrame(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "19")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.stepFrame();
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "3")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.stop();
       }
       return;
    }
    public void unRegisterSensorEvent(){
       if (PatchProxy.applyVoid(null, this, _1_AbstractMediaPlayerApiDelegate.class, "44")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.unRegisterSensorEvent();
       }
       return;
    }
    public void updateAdaptiveMode(int p0){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, _1_AbstractM, "57")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.updateAdaptiveMode(p0);
       }
       return;
    }
    public void updateRepresentationAdaptiveFlag(int p0,boolean p1){
       _1_AbstractMediaPlayerApiDelegate _1_AbstractM = _1_AbstractMediaPlayerApiDelegate.class;
       if (PatchProxy.isSupport(_1_AbstractM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, _1_AbstractM, "39")) {
          return;
       }
       _0_AbstractPlayerHolder tmKwaiMediaP = this.mKwaiMediaPlayer;
       if (tmKwaiMediaP != null) {
          tmKwaiMediaP.updateRepresentationAdaptiveFlag(p0, p1);
       }
       return;
    }
}
