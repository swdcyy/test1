package com.kwai.video.player.MediaPlayerProxy;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.MediaInfo;
import android.view.Surface;
import com.kwai.video.player.misc.ITrackInfo;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import com.kwai.video.player.misc.IMediaDataSource;
import java.io.FileDescriptor;
import android.view.SurfaceHolder;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.MediaPlayerProxy$3;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.MediaPlayerProxy$2;
import com.kwai.video.player.IMediaPlayer$OnDecodeFirstFrameListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.MediaPlayerProxy$6;
import com.kwai.video.player.IMediaPlayer$OnFftDataCaptureListener;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.MediaPlayerProxy$7;
import com.kwai.video.player.IMediaPlayer$OnLogEventListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.MediaPlayerProxy$1;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.MediaPlayerProxy$4;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.MediaPlayerProxy$5;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import java.lang.Float;

public class MediaPlayerProxy implements IMediaPlayer	// class@000afd
{
    public final IMediaPlayer mBackEndMediaPlayer;

    public void MediaPlayerProxy(IMediaPlayer p0){
       super();
       this.mBackEndMediaPlayer = p0;
    }
    public void addVideoRawBuffer(byte[] p0){
    }
    public int getAudioSessionId(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackEndMediaPlayer.getAudioSessionId();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mBackEndMediaPlayer.getCurrentPosition();
    }
    public String getDataSource(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackEndMediaPlayer.getDataSource();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mBackEndMediaPlayer.getDuration();
    }
    public IMediaPlayer getInternalMediaPlayer(){
       return this.mBackEndMediaPlayer;
    }
    public MediaInfo getMediaInfo(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackEndMediaPlayer.getMediaInfo();
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackEndMediaPlayer.getSurface();
    }
    public ITrackInfo[] getTrackInfo(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBackEndMediaPlayer.getTrackInfo();
    }
    public int getVideoHeight(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackEndMediaPlayer.getVideoHeight();
    }
    public int getVideoSarDen(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackEndMediaPlayer.getVideoSarDen();
    }
    public int getVideoSarNum(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackEndMediaPlayer.getVideoSarNum();
    }
    public int getVideoWidth(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBackEndMediaPlayer.getVideoWidth();
    }
    public boolean isLooping(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBackEndMediaPlayer.isLooping();
    }
    public boolean isPlayable(){
       return false;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, MediaPlayerProxy.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBackEndMediaPlayer.isPlaying();
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "14")) {
          return;
       }
       this.mBackEndMediaPlayer.pause();
       return;
    }
    public void prepareAsync(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "11")) {
          return;
       }
       this.mBackEndMediaPlayer.prepareAsync();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "22")) {
          return;
       }
       this.mBackEndMediaPlayer.release();
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "23")) {
          return;
       }
       this.mBackEndMediaPlayer.reset();
       return;
    }
    public void seekTo(long p0){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, mediaPlayerP, "19")) {
          return;
       }
       this.mBackEndMediaPlayer.seekTo(p0);
       return;
    }
    public void setAudioStreamType(int p0){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, mediaPlayerP, "34")) {
          return;
       }
       this.mBackEndMediaPlayer.setAudioStreamType(p0);
       return;
    }
    public void setDataSource(Context p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaPlayerProxy.class, "5")) {
          return;
       }
       this.mBackEndMediaPlayer.setDataSource(p0, p1);
       return;
    }
    public void setDataSource(Context p0,Uri p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MediaPlayerProxy.class, "6")) {
          return;
       }
       this.mBackEndMediaPlayer.setDataSource(p0, p1, p2);
       return;
    }
    public void setDataSource(IMediaDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "9")) {
          return;
       }
       this.mBackEndMediaPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(FileDescriptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "7")) {
          return;
       }
       this.mBackEndMediaPlayer.setDataSource(p0);
       return;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "8")) {
          return;
       }
       this.mBackEndMediaPlayer.setDataSource(p0);
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "1")) {
          return;
       }
       this.mBackEndMediaPlayer.setDisplay(p0);
       return;
    }
    public void setKeepInBackground(boolean p0){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaPlayerP, "35")) {
          return;
       }
       this.mBackEndMediaPlayer.setKeepInBackground(p0);
       return;
    }
    public void setLooping(boolean p0){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaPlayerP, "40")) {
          return;
       }
       this.mBackEndMediaPlayer.setLooping(p0);
       return;
    }
    public void setOnBufferingUpdateListener(IMediaPlayer$OnBufferingUpdateListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "29")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnBufferingUpdateListener(new MediaPlayerProxy$3(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnBufferingUpdateListener(null);
       }
       return;
    }
    public void setOnCompletionListener(IMediaPlayer$OnCompletionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "28")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnCompletionListener(new MediaPlayerProxy$2(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnCompletionListener(null);
       }
       return;
    }
    public void setOnDecodeFirstFrameListener(IMediaPlayer$OnDecodeFirstFrameListener p0){
    }
    public void setOnErrorListener(IMediaPlayer$OnErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "32")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnErrorListener(new MediaPlayerProxy$6(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnErrorListener(null);
       }
       return;
    }
    public void setOnFftDataCaptureListener(IMediaPlayer$OnFftDataCaptureListener p0){
    }
    public void setOnInfoExtraListener(IMediaPlayer$OnInfoExtraListener p0){
    }
    public void setOnInfoListener(IMediaPlayer$OnInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "33")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnInfoListener(new MediaPlayerProxy$7(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnInfoListener(null);
       }
       return;
    }
    public void setOnLogEventListener(IMediaPlayer$OnLogEventListener p0){
    }
    public void setOnPreparedListener(IMediaPlayer$OnPreparedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "27")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnPreparedListener(new MediaPlayerProxy$1(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnPreparedListener(null);
       }
       return;
    }
    public void setOnRenderingStartListener(IMediaPlayer$OnRenderingStartListener p0){
    }
    public void setOnSeekCompleteListener(IMediaPlayer$OnSeekCompleteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "30")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnSeekCompleteListener(new MediaPlayerProxy$4(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnSeekCompleteListener(null);
       }
       return;
    }
    public void setOnVideoSizeChangedListener(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "31")) {
          return;
       }
       if (p0 != null) {
          this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(new MediaPlayerProxy$5(this, p0));
       }else {
          this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(null);
       }
       return;
    }
    public void setScreenOnWhilePlaying(boolean p0){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mediaPlayerP, "15")) {
          return;
       }
       this.mBackEndMediaPlayer.setScreenOnWhilePlaying(p0);
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "2")) {
          return;
       }
       this.mBackEndMediaPlayer.setSurface(p0);
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerProxy.class, "4")) {
          return;
       }
       this.mBackEndMediaPlayer.setSurfaceTexture(p0);
       return;
    }
    public void setVideoRawDataListener(IMediaPlayer$OnVideoRawDataListener p0){
    }
    public void setVolume(float p0,float p1){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, mediaPlayerP, "24")) {
          return;
       }
       this.mBackEndMediaPlayer.setVolume(p0, p1);
       return;
    }
    public void setWakeMode(Context p0,int p1){
       MediaPlayerProxy mediaPlayerP = MediaPlayerProxy.class;
       if (PatchProxy.isSupport(mediaPlayerP) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, mediaPlayerP, "38")) {
          return;
       }
       this.mBackEndMediaPlayer.setWakeMode(p0, p1);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "12")) {
          return;
       }
       this.mBackEndMediaPlayer.start();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, MediaPlayerProxy.class, "13")) {
          return;
       }
       this.mBackEndMediaPlayer.stop();
       return;
    }
}
