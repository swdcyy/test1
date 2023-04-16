package com.kwai.video.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnInfoListener;
import com.kwai.video.player.AndroidMediaPlayer;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.media.MediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.AbstractMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class AndroidMediaPlayer$AndroidMediaPlayerListenerHolder implements MediaPlayer$OnPreparedListener, MediaPlayer$OnCompletionListener, MediaPlayer$OnBufferingUpdateListener, MediaPlayer$OnSeekCompleteListener, MediaPlayer$OnVideoSizeChangedListener, MediaPlayer$OnErrorListener, MediaPlayer$OnInfoListener	// class@000aa8
{
    public final WeakReference mWeakMediaPlayer;
    public final AndroidMediaPlayer this$0;

    public void AndroidMediaPlayer$AndroidMediaPlayerListenerHolder(AndroidMediaPlayer p0,AndroidMediaPlayer p1){
       this.this$0 = p0;
       super();
       this.mWeakMediaPlayer = new WeakReference(p1);
    }
    public void onBufferingUpdate(MediaPlayer p0,int p1){
       if (PatchProxy.isSupport(AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "5")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnBufferingUpdate(p1);
       return;
    }
    public void onCompletion(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "6")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnCompletion();
       return;
    }
    public boolean onError(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.mWeakMediaPlayer.get() != null && this.this$0.notifyOnError(p1, p2))? true: false;
       return b;
    }
    public boolean onInfo(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.mWeakMediaPlayer.get() != null && this.this$0.notifyOnInfo(p1, p2))? true: false;
       return b;
    }
    public void onPrepared(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "7")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnPrepared();
       return;
    }
    public void onSeekComplete(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "4")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnSeekComplete();
       return;
    }
    public void onVideoSizeChanged(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class, "3")) {
          return;
       }
       if (this.mWeakMediaPlayer.get() == null) {
          return;
       }
       this.this$0.notifyOnVideoSizeChanged(p1, p2, 1, 1);
       return;
    }
}
