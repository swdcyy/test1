package com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnInfoListener;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.media.MediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.kwai_player.KwaiSystemPlayerQos;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$PlayerState;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.concurrent.atomic.AtomicBoolean;

public class KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder implements MediaPlayer$OnPreparedListener, MediaPlayer$OnCompletionListener, MediaPlayer$OnBufferingUpdateListener, MediaPlayer$OnSeekCompleteListener, MediaPlayer$OnVideoSizeChangedListener, MediaPlayer$OnErrorListener, MediaPlayer$OnInfoListener	// class@000b47
{
    public final WeakReference mWeakMediaPlayer;
    public final KwaiSystemMediaPlayer this$0;

    public void KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder(KwaiSystemMediaPlayer p0,KwaiSystemMediaPlayer p1){
       this.this$0 = p0;
       super();
       this.mWeakMediaPlayer = new WeakReference(p1);
    }
    public void onBufferingUpdate(MediaPlayer p0,int p1){
       if (PatchProxy.isSupport(KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "5")) {
          return;
       }
       KwaiSystemMediaPlayer kwaiSystemMe = this.mWeakMediaPlayer.get();
       if (kwaiSystemMe == null) {
          return;
       }
       kwaiSystemMe.getKwaiQos().onBufferingPercent(p1);
       this.this$0.notifyOnBufferingUpdate(p1);
       return;
    }
    public void onCompletion(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "6")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       if (!this.this$0.isLooping()) {
          p0.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE;
       }
       this.this$0.notifyOnCompletion();
       return;
    }
    public boolean onError(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       KwaiSystemMediaPlayer kwaiSystemMe = this.mWeakMediaPlayer.get();
       boolean b = false;
       if (kwaiSystemMe == null) {
          return b;
       }else {
          kwaiSystemMe.getKwaiQos().onError(p1);
          KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder tthis$0 = this.this$0;
          tthis$0.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_ERROR;
          if (tthis$0.notifyOnError(p1, p2)) {
             b = true;
          }
          return b;
       }
    }
    public boolean onInfo(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       KwaiSystemMediaPlayer kwaiSystemMe = this.mWeakMediaPlayer.get();
       if (kwaiSystemMe == null) {
          return false;
       }else if(p1 != 3){
          if (p1 != 701) {
             if (p1 == 702) {
                kwaiSystemMe.getKwaiQos().onBlockEnd();
             }
          }else {
             kwaiSystemMe.getKwaiQos().onBlockStart();
          }
       }else {
          kwaiSystemMe.getKwaiQos().onVideoRenderStart();
       }
       return this.this$0.notifyOnInfo(p1, p2);
    }
    public void onPrepared(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "7")) {
          return;
       }
       KwaiSystemMediaPlayer kwaiSystemMe = this.mWeakMediaPlayer.get();
       if (kwaiSystemMe == null) {
          return;
       }
       this.this$0.mOnPrepared.set(true);
       this.this$0.mPlayerState = KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED;
       kwaiSystemMe.getKwaiQos().onPrepareEnd();
       this.this$0.notifyOnPrepared();
       return;
    }
    public void onSeekComplete(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "4")) {
          return;
       }
       KwaiSystemMediaPlayer kwaiSystemMe = this.mWeakMediaPlayer.get();
       if (kwaiSystemMe == null) {
          return;
       }
       kwaiSystemMe.getKwaiQos().onSeekComplete();
       this.this$0.notifyOnSeekComplete();
       return;
    }
    public void onVideoSizeChanged(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiSystemMediaPlayer$AndroidMediaPlayerListenerHolder.class, "3")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnVideoSizeChanged(p1, p2, 1, 1);
       return;
    }
}
