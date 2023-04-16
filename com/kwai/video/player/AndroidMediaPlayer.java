package com.kwai.video.player.AndroidMediaPlayer;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.surface.KwaiSurfaceManager;
import java.lang.Object;
import android.media.MediaPlayer;
import com.kwai.video.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnInfoListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Throwable;
import com.kwai.video.player.pragma.DebugLog;
import com.kwai.video.player.MediaInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.AndroidTrackInfo;
import java.lang.Boolean;
import android.media.MediaDataSource;
import java.io.IOException;
import java.lang.Long;
import java.lang.Integer;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.video.player.AndroidMediaPlayer$MediaDataSourceProxy;
import java.io.FileDescriptor;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import java.lang.Float;

public class AndroidMediaPlayer extends AbstractMediaPlayer	// class@000aaa
{
    public String mDataSource;
    public final Object mInitLock;
    public final AndroidMediaPlayer$AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    public final MediaPlayer mInternalMediaPlayer;
    public boolean mIsReleased;
    public MediaDataSource mMediaDataSource;
    public final KwaiSurfaceManager mSurfaceManager;
    public static MediaInfo sMediaInfo;

    public void AndroidMediaPlayer(){
       super();
       this.mSurfaceManager = new KwaiSurfaceManager();
       Object obj = new Object();
       this.mInitLock = obj;
       _monitor_enter(obj);
       MediaPlayer mediaPlayer = new MediaPlayer();
       this.mInternalMediaPlayer = mediaPlayer;
       _monitor_exit(obj);
       mediaPlayer.setAudioStreamType(3);
       this.mInternalListenerAdapter = new AndroidMediaPlayer$AndroidMediaPlayerListenerHolder(this, this);
       this.attachInternalListeners();
    }
    public void addVideoRawBuffer(byte[] p0){
    }
    public final void attachInternalListeners(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "32")) {
          return;
       }
       this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
       this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
       return;
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getAudioSessionId();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return (long)this.mInternalMediaPlayer.getCurrentPosition();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
          return 0;
       }
    }
    public String getDataSource(){
       return this.mDataSource;
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return (long)this.mInternalMediaPlayer.getDuration();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
          return 0;
       }
    }
    public MediaPlayer getInternalMediaPlayer(){
       return this.mInternalMediaPlayer;
    }
    public MediaInfo getMediaInfo(){
       MediaInfo obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (AndroidMediaPlayer.sMediaInfo == null) {
          obj = new MediaInfo();
          obj.mVideoDecoder = "android";
          obj.mVideoDecoderImpl = "HW";
          obj.mAudioDecoder = "android";
          obj.mAudioDecoderImpl = "HW";
          AndroidMediaPlayer.sMediaInfo = obj;
       }
       return AndroidMediaPlayer.sMediaInfo;
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSurfaceManager.getSurface();
    }
    public ITrackInfo[] getTrackInfo(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getVideoHeight();
    }
    public int getVideoSarDen(){
       return 1;
    }
    public int getVideoSarNum(){
       return 1;
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mInternalMediaPlayer.getVideoWidth();
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mInternalMediaPlayer.isLooping();
    }
    public boolean isPlayable(){
       return true;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return this.mInternalMediaPlayer.isPlaying();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
          return false;
       }
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "14")) {
          return;
       }
       this.mInternalMediaPlayer.pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "11")) {
          return;
       }
       this.mInternalMediaPlayer.prepareAsync();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "23")) {
          return;
       }
       this.mIsReleased = true;
       this.mInternalMediaPlayer.release();
       this.releaseMediaDataSource();
       this.resetListeners();
       this.attachInternalListeners();
       return;
    }
    public final void releaseMediaDataSource(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "10")) {
          return;
       }
       AndroidMediaPlayer tmMediaDataS = this.mMediaDataSource;
       if (tmMediaDataS != null) {
          try{
             tmMediaDataS.close();
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
          this.mMediaDataSource = null;
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "24")) {
          return;
       }
       try{
          this.mInternalMediaPlayer.reset();
       }catch(java.lang.IllegalStateException e0){
          DebugLog.printStackTrace(e0);
       }
       this.releaseMediaDataSource();
       this.resetListeners();
       this.attachInternalListeners();
       return;
    }
    public void seekTo(long p0){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAndroidMedi, "20")) {
          return;
       }
       this.mInternalMediaPlayer.seekTo((int)p0);
       return;
    }
    public void setAudioStreamType(int p0){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAndroidMedi, "31")) {
          return;
       }
       this.mInternalMediaPlayer.setAudioStreamType(p0);
       return;
    }
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AndroidMediaPlayer.class, "5")) {
          return;
       }
       this.mInternalMediaPlayer.setDataSource(p0, p1);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AndroidMediaPlayer.class, "6")) {
          return;
       }
       this.mInternalMediaPlayer.setDataSource(p0, p1, p2);
       return;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "9")) {
          return;
       }
       this.releaseMediaDataSource();
       AndroidMediaPlayer$MediaDataSourceProxy mediaDataSou = new AndroidMediaPlayer$MediaDataSourceProxy(p0);
       this.mMediaDataSource = mediaDataSou;
       this.mInternalMediaPlayer.setDataSource(mediaDataSou);
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "7")) {
          return;
       }
       this.mInternalMediaPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "8")) {
          return;
       }
       this.mDataSource = p0;
       Uri uri = Uri.parse(p0);
       String scheme = uri.getScheme();
       if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
          this.mInternalMediaPlayer.setDataSource(uri.getPath());
       }else {
          this.mInternalMediaPlayer.setDataSource(p0);
       }
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "1")) {
          return;
       }
       AndroidMediaPlayer tmInitLock = this.mInitLock;
       _monitor_enter(tmInitLock);
       if (this.mIsReleased == null) {
          this.mSurfaceManager.asSurfaceHolder(p0);
          this.mInternalMediaPlayer.setDisplay(p0);
       }
       _monitor_exit(tmInitLock);
       return;
    }
    public void setKeepInBackground(boolean p0){
    }
    public void setLooping(boolean p0){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAndroidMedi, "25")) {
          return;
       }
       this.mInternalMediaPlayer.setLooping(p0);
       return;
    }
    public void setScreenOnWhilePlaying(boolean p0){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAndroidMedi, "15")) {
          return;
       }
       this.mInternalMediaPlayer.setScreenOnWhilePlaying(p0);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "2")) {
          return;
       }
       this.mSurfaceManager.asSurface(p0);
       this.mInternalMediaPlayer.setSurface(p0);
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer.class, "4")) {
          return;
       }
       this.mSurfaceManager.asSurfaceTexture(p0);
       this.mInternalMediaPlayer.setSurface(this.mSurfaceManager.getSurface());
       return;
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
    }
    public void setVolume(float p0,float p1){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uAndroidMedi, "27")) {
          return;
       }
       this.mInternalMediaPlayer.setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       AndroidMediaPlayer uAndroidMedi = AndroidMediaPlayer.class;
       if (PatchProxy.isSupport(uAndroidMedi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAndroidMedi, "30")) {
          return;
       }
       this.mInternalMediaPlayer.setWakeMode(p0, p1);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "12")) {
          return;
       }
       this.mInternalMediaPlayer.start();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer.class, "13")) {
          return;
       }
       this.mInternalMediaPlayer.stop();
       return;
    }
}
