package android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaControllerCompat$b;
import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import android.media.session.MediaController;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.b;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.lang.UnsupportedOperationException;
import java.util.List;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat$d;
import android.support.v4.media.session.MediaControllerCompat$e;
import android.media.session.MediaController$TransportControls;
import android.view.KeyEvent;
import android.support.v4.media.session.MediaControllerCompat$a;
import android.os.Handler;
import android.media.session.MediaController$Callback;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a;
import android.support.v4.media.session.a;
import android.support.v4.media.session.PlaybackStateCompat;
import android.media.session.PlaybackState;
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaMetadata;
import android.support.v4.media.session.MediaControllerCompat$c;
import android.media.session.MediaController$PlaybackInfo;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;

public class MediaControllerCompat$MediaControllerImplApi21 implements MediaControllerCompat$b	// class@0003e0
{
    public final MediaController a;
    public final Object b;
    public final List c;
    public HashMap d;
    public Bundle e;
    public final MediaSessionCompat$Token f;

    public void MediaControllerCompat$MediaControllerImplApi21(Context p0,MediaSessionCompat$Token p1){
       super();
       this.b = new Object();
       this.c = new ArrayList();
       this.d = new HashMap();
       this.f = p1;
       this.a = new MediaController(p0, p1.e());
       if (p1.c() == null) {
          this.s();
       }
       return;
    }
    public void D(MediaDescriptionCompat p0){
       if (!(this.getFlags() & 4)) {
          throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
       }
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", p0);
       this.i("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", uBundle, null);
       return;
    }
    public void E(MediaDescriptionCompat p0){
       if (!(this.getFlags() & 4)) {
          throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
       }
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", p0);
       this.i("android.support.v4.media.session.command.ADD_QUEUE_ITEM", uBundle, null);
       return;
    }
    public List G(){
       List queue = this.a.getQueue();
       queue = (queue != null)? MediaSessionCompat$QueueItem.b(queue): null;
       return queue;
    }
    public void a(MediaDescriptionCompat p0,int p1){
       if (!(this.getFlags() & 4)) {
          throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
       }
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", p0);
       uBundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", p1);
       this.i("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", uBundle, null);
       return;
    }
    public PendingIntent b(){
       return this.a.getSessionActivity();
    }
    public boolean c(){
       boolean b = (this.f.c() != null)? true: false;
       return b;
    }
    public MediaControllerCompat$d d(){
       return new MediaControllerCompat$e(this.a.getTransportControls());
    }
    public boolean e(KeyEvent p0){
       return this.a.dispatchMediaButtonEvent(p0);
    }
    public final void f(MediaControllerCompat$a p0,Handler p1){
       this.a.registerCallback(p0.a, p1);
       MediaControllerCompat$MediaControllerImplApi21 tb = this.b;
       _monitor_enter(tb);
       if (this.f.c() != null) {
          MediaControllerCompat$MediaControllerImplApi21$a mediaControl = new MediaControllerCompat$MediaControllerImplApi21$a(p0);
          this.d.put(p0, mediaControl);
          try{
             p0.c = mediaControl;
             this.f.c().Y0(mediaControl);
             p0.a(13, null, null);
          }catch(android.os.RemoteException e0){
          }
       }else {
          p0.c = null;
          this.c.add(p0);
       }
       _monitor_exit(tb);
       return;
    }
    public PlaybackStateCompat g(){
       PlaybackState playbackStat;
       PlaybackStateCompat playbackStat1;
       if (this.f.c() != null) {
          return this.f.c().g();
       }
    }
    public Bundle getExtras(){
       return this.a.getExtras();
    }
    public long getFlags(){
       return this.a.getFlags();
    }
    public MediaMetadataCompat getMetadata(){
       MediaMetadata metadata = this.a.getMetadata();
       MediaMetadataCompat mediaMetadat = (metadata != null)? MediaMetadataCompat.b(metadata): null;
       return mediaMetadat;
    }
    public String getPackageName(){
       return this.a.getPackageName();
    }
    public final void h(MediaControllerCompat$a p0){
       this.a.unregisterCallback(p0.a);
       MediaControllerCompat$MediaControllerImplApi21 tb = this.b;
       _monitor_enter(tb);
       if (this.f.c() != null) {
          try{
             MediaControllerCompat$MediaControllerImplApi21$a mediaControl = this.d.remove(p0);
             if (mediaControl != null) {
                p0.c = null;
                this.f.c().c1(mediaControl);
             }
          }catch(android.os.RemoteException e0){
          }
       }else {
          this.c.remove(p0);
       }
       _monitor_exit(e0);
       return;
    }
    public void i(String p0,Bundle p1,ResultReceiver p2){
       this.a.sendCommand(p0, p1, p2);
    }
    public boolean j(){
       if (this.f.c() != null) {
          return this.f.c().j();
       }
       return false;
    }
    public void k(int p0,int p1){
       this.a.setVolumeTo(p0, p1);
    }
    public MediaControllerCompat$c l(){
       MediaController$PlaybackInfo playbackInfo = this.a.getPlaybackInfo();
       if (playbackInfo != null) {
          MediaControllerCompat$c uoc = new MediaControllerCompat$c(playbackInfo.getPlaybackType(), AudioAttributesCompat.i(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
       }else {
          MediaControllerCompat$c uoc1 = null;
       }
       return v7;
    }
    public CharSequence m(){
       return this.a.getQueueTitle();
    }
    public void n(int p0,int p1){
       this.a.adjustVolume(p0, p1);
    }
    public Object o(){
       return this.a;
    }
    public int p(){
       if (Build$VERSION.SDK_INT < 22 && this.f.c() != null) {
          return this.f.c().p();
       }
       return this.a.getRatingType();
    }
    public void q(){
       if (this.f.c() == null) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          MediaControllerCompat$a uoa = iterator.next();
          MediaControllerCompat$MediaControllerImplApi21$a mediaControl = new MediaControllerCompat$MediaControllerImplApi21$a(uoa);
          this.d.put(uoa, mediaControl);
          try{
             uoa.c = mediaControl;
             this.f.c().Y0(mediaControl);
             uoa.a(13, null, null);
          }catch(android.os.RemoteException e0){
          }
       }
       this.c.clear();
       return;
    }
    public int r(){
       if (this.f.c() != null) {
          return this.f.c().r();
       }
       return -1;
    }
    public final void s(){
       this.i("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(this));
    }
    public int w(){
       if (this.f.c() != null) {
          return this.f.c().w();
       }
       return -1;
    }
    public Bundle z(){
       Bundle uBundle;
       if (this.e != null) {
          return new Bundle(this.e);
       }
       if (Build$VERSION.SDK_INT >= 29) {
          this.e = this.a.getSessionInfo();
       }else if(this.f.c() != null){
          try{
             this.e = this.f.c().z();
          }catch(android.os.RemoteException e0){
             this.e = Bundle.EMPTY;
          }
       }
    }
}
