package com.kwai.component.photo.detail.core.helper.VideoPlayProgressHelper;
import sd5.b;
import p5a.e;
import com.yxcorp.gifshow.entity.QPhoto;
import sd5.j;
import sd5.i;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Long;

public class VideoPlayProgressHelper extends b	// class@000a20
{
    public final int mHideDelaySeconds;
    public final IMediaPlayer$OnPreparedListener mOnPreparedListener;
    public final e mQPhotoSwitchMediaPlayer;
    public final IMediaPlayer$OnSeekCompleteListener mSeekCompleteListener;
    public Runnable mSeekRunnable;

    public void VideoPlayProgressHelper(e p0,QPhoto p1,int p2){
       super(p1);
       j oj = new j(this);
       this.mSeekCompleteListener = oj;
       i oi = new i(this);
       this.mOnPreparedListener = oi;
       this.mQPhotoSwitchMediaPlayer = p0;
       p0.addOnSeekCompleteListener(oj);
       p0.addOnPreparedListener(oi);
       this.mHideDelaySeconds = p2;
    }
    public static void a(VideoPlayProgressHelper p0,IMediaPlayer p1){
       p0.lambda$new$1(p1);
    }
    public static void b(VideoPlayProgressHelper p0,IMediaPlayer p1){
       p0.lambda$new$0(p1);
    }
    private void lambda$new$0(IMediaPlayer p0){
       VideoPlayProgressHelper tmSeekRunnab = this.mSeekRunnable;
       if (tmSeekRunnab != null) {
          tmSeekRunnab.run();
          this.mSeekRunnable = null;
       }
       return;
    }
    private void lambda$new$1(IMediaPlayer p0){
       VideoPlayProgressHelper tmSeekRunnab = this.mSeekRunnable;
       if (tmSeekRunnab != null) {
          tmSeekRunnab.run();
          this.mSeekRunnable = null;
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, VideoPlayProgressHelper.class, "8")) {
          return;
       }
       this.mQPhotoSwitchMediaPlayer.removeOnSeekCompleteListener(this.mSeekCompleteListener);
       return;
    }
    public long getAutoHideControllerDelay(){
       return ((long)this.mHideDelaySeconds * 1000);
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, VideoPlayProgressHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mQPhotoSwitchMediaPlayer.getCurrentPosition();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, VideoPlayProgressHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mQPhotoSwitchMediaPlayer.getDuration();
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, VideoPlayProgressHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mQPhotoSwitchMediaPlayer.isPlaying();
    }
    public boolean isPrepared(){
       Object obj = PatchProxy.apply(null, this, VideoPlayProgressHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mQPhotoSwitchMediaPlayer.isPrepared();
    }
    public void onStartTouchProgress(){
       if (PatchProxy.applyVoid(null, this, VideoPlayProgressHelper.class, "5")) {
          return;
       }
       a.d().k(new PlayEvent(this.mPhoto, PlayEvent$Status.PAUSE, 18));
       return;
    }
    public void onStopTouchProgress(){
       if (PatchProxy.applyVoid(null, this, VideoPlayProgressHelper.class, "6")) {
          return;
       }
       a.d().k(new PlayEvent(this.mPhoto, PlayEvent$Status.RESUME, 18));
       return;
    }
    public void pausePlayer(){
       if (PatchProxy.applyVoid(null, this, VideoPlayProgressHelper.class, "4")) {
          return;
       }
       a.d().k(new PlayEvent(this.mPhoto, PlayEvent$Status.PAUSE, 1, "VideoPlayProgress"));
       return;
    }
    public void seekAndRun(long p0,Runnable p1){
       VideoPlayProgressHelper videoPlayPro = VideoPlayProgressHelper.class;
       if (PatchProxy.isSupport(videoPlayPro) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, videoPlayPro, "10")) {
          return;
       }
       this.mSeekRunnable = p1;
       this.mQPhotoSwitchMediaPlayer.seekTo(p0);
       return;
    }
    public void seekTo(long p0){
       VideoPlayProgressHelper videoPlayPro = VideoPlayProgressHelper.class;
       if (PatchProxy.isSupport(videoPlayPro) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, videoPlayPro, "3")) {
          return;
       }
       this.mSeekRunnable = null;
       this.mQPhotoSwitchMediaPlayer.seekTo(p0);
       return;
    }
    public void startPlayer(){
       if (PatchProxy.applyVoid(null, this, VideoPlayProgressHelper.class, "11")) {
          return;
       }
       a.d().k(new PlayEvent(this.mPhoto, PlayEvent$Status.RESUME, 1, "VideoPlayProgress"));
       return;
    }
}
