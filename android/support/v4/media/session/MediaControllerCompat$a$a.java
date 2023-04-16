package android.support.v4.media.session.MediaControllerCompat$a$a;
import android.media.session.MediaController$Callback;
import android.support.v4.media.session.MediaControllerCompat$a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.media.session.MediaController$PlaybackInfo;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.media.MediaMetadata;
import android.support.v4.media.MediaMetadataCompat;
import android.media.session.PlaybackState;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.lang.CharSequence;
import java.lang.String;
import android.os.Build$VERSION;

public class MediaControllerCompat$a$a extends MediaController$Callback	// class@0003e1
{
    public final WeakReference a;

    public void MediaControllerCompat$a$a(MediaControllerCompat$a p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void onAudioInfoChanged(MediaController$PlaybackInfo p0){
       if (this.a.get() != null) {
          p0.getPlaybackType();
          AudioAttributesCompat.i(p0.getAudioAttributes());
          p0.getVolumeControl();
          p0.getMaxVolume();
          p0.getCurrentVolume();
       }
       return;
    }
    public void onExtrasChanged(Bundle p0){
       MediaSessionCompat.b(p0);
       this.a.get();
    }
    public void onMetadataChanged(MediaMetadata p0){
       if (this.a.get() != null) {
          MediaMetadataCompat.b(p0);
       }
       return;
    }
    public void onPlaybackStateChanged(PlaybackState p0){
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null && uoa.c == null) {
          PlaybackStateCompat.a(p0);
       }
       return;
    }
    public void onQueueChanged(List p0){
       if (this.a.get() != null) {
          MediaSessionCompat$QueueItem.b(p0);
       }
       return;
    }
    public void onQueueTitleChanged(CharSequence p0){
       this.a.get();
    }
    public void onSessionDestroyed(){
       this.a.get();
    }
    public void onSessionEvent(String p0,Bundle p1){
       MediaSessionCompat.b(p1);
       MediaControllerCompat$a uoa = this.a.get();
       if (uoa != null && (uoa.c == null || Build$VERSION.SDK_INT >= 23)) {
          uoa.onSessionEvent(p0, p1);
       }
       return;
    }
}
