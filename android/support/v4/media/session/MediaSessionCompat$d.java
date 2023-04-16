package android.support.v4.media.session.MediaSessionCompat$d;
import android.support.v4.media.session.MediaSessionCompat$c;
import android.media.session.MediaSession;
import g3.c;
import android.os.Bundle;
import java.lang.Object;
import android.os.RemoteCallbackList;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.MediaSessionCompat$d$a;
import android.support.v4.media.session.b;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.support.v4.media.session.MediaSessionCompat$b;
import android.os.IInterface;
import android.support.v4.media.session.a;
import android.os.Build$VERSION;
import android.os.Handler;
import android.media.session.MediaSession$Callback;
import android.support.v4.media.session.PlaybackStateCompat;
import android.media.session.PlaybackState;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import java.lang.CharSequence;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.media.session.MediaSession$QueueItem;
import r2.c;
import java.lang.Class;
import java.lang.reflect.Method;
import r2.g;
import android.media.VolumeProvider;
import android.app.PendingIntent;
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaMetadata;
import java.lang.reflect.Field;

public class MediaSessionCompat$d implements MediaSessionCompat$c	// class@0003f6
{
    public final MediaSession a;
    public final MediaSessionCompat$Token b;
    public final Object c;
    public Bundle d;
    public boolean e;
    public final RemoteCallbackList f;
    public PlaybackStateCompat g;
    public List h;
    public MediaMetadataCompat i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public MediaSessionCompat$b n;
    public c o;

    public void MediaSessionCompat$d(MediaSession p0,c p1,Bundle p2){
       super();
       this.c = new Object();
       this.e = false;
       this.f = new RemoteCallbackList();
       this.a = p0;
       this.b = new MediaSessionCompat$Token(p0.getSessionToken(), new MediaSessionCompat$d$a(this), p1);
       this.d = p2;
       this.G(3);
    }
    public void MediaSessionCompat$d(Object p0){
       super();
       this.c = new Object();
       this.e = false;
       this.f = new RemoteCallbackList();
       if (!p0 instanceof MediaSession) {
          throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
       }
       this.a = p0;
       this.b = new MediaSessionCompat$Token(p0.getSessionToken(), new MediaSessionCompat$d$a(this));
       this.d = null;
       this.G(3);
       return;
    }
    public boolean E(){
       return this.a.isActive();
    }
    public void F(boolean p0){
       this.a.setActive(p0);
    }
    public void G(int p0){
       this.a.setFlags(((p0 | 0x01) | 0x02));
    }
    public MediaSessionCompat$b H(){
       MediaSessionCompat$d tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return this.n;
    }
    public void I(int p0){
       if (this.l != p0) {
          this.l = p0;
          int i = this.f.beginBroadcast() - 1;
          while (i >= 0) {
             a broadcastIte = this.f.getBroadcastItem(i);
             try{
                broadcastIte.J1(p0);
                i = e0 - 1;
             }catch(android.os.RemoteException e0){
             }
          }
          this.f.finishBroadcast();
       }
       return;
    }
    public void J(String p0,Bundle p1){
       if (Build$VERSION.SDK_INT < 23) {
          int i = this.f.beginBroadcast() - 1;
          while (i >= 0) {
             a broadcastIte = this.f.getBroadcastItem(i);
             try{
                broadcastIte.onEvent(p0, p1);
                i = e0 - 1;
             }catch(android.os.RemoteException e0){
             }
          }
          this.f.finishBroadcast();
       }
       this.a.sendSessionEvent(p0, p1);
       return;
    }
    public void K(MediaSessionCompat$b p0,Handler p1){
       MediaSessionCompat$d tc = this.c;
       _monitor_enter(tc);
       this.n = p0;
       MediaSessionCompat$d ta = this.a;
       MediaSession$Callback uCallback = (p0 == null)? null: p0.b;
       ta.setCallback(uCallback, p1);
       if (p0 != null) {
          p0.d(this, p1);
       }
       _monitor_exit(tc);
       return;
    }
    public void L(int p0){
       if (Build$VERSION.SDK_INT < 22) {
          this.j = p0;
       }else {
          this.a.setRatingType(p0);
       }
       return;
    }
    public void M(PlaybackStateCompat p0){
       this.g = p0;
       int i = this.f.beginBroadcast() - 1;
       while (i >= 0) {
          a broadcastIte = this.f.getBroadcastItem(i);
          try{
             broadcastIte.C0(p0);
             i = e0 - 1;
          }catch(android.os.RemoteException e0){
          }
       }
       this.f.finishBroadcast();
       MediaSessionCompat$d ta = this.a;
       PlaybackState playbackStat = (p0 == null)? null: p0.d();
       ta.setPlaybackState(playbackStat);
       return;
    }
    public void N(int p0){
       AudioAttributes$Builder uBuilder = new AudioAttributes$Builder();
       uBuilder.setLegacyStreamType(p0);
       this.a.setPlaybackToLocal(uBuilder.build());
    }
    public void O(CharSequence p0){
       this.a.setQueueTitle(p0);
    }
    public void P(List p0){
       this.h = p0;
       if (p0 == null) {
          this.a.setQueue(null);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().c());
          }
          this.a.setQueue(uArrayList);
          return;
       }
    }
    public void Q(c p0){
       MediaSessionCompat$d tc = this.c;
       _monitor_enter(tc);
       this.o = p0;
       _monitor_exit(tc);
    }
    public Object R(){
       return this.a;
    }
    public c S(){
       MediaSessionCompat$d tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return this.o;
    }
    public String T(){
       if (Build$VERSION.SDK_INT < 24) {
          return null;
       }
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return this.a.getClass().getMethod("getCallingPackage", uClassArray).invoke(this.a, objArray);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public void U(g p0){
       this.a.setPlaybackToRemote(p0.a());
    }
    public void V(PendingIntent p0){
       this.a.setMediaButtonReceiver(p0);
    }
    public Object W(){
       return null;
    }
    public void X(MediaMetadataCompat p0){
       this.i = p0;
       MediaSessionCompat$d ta = this.a;
       MediaMetadata mediaMetadat = (p0 == null)? null: p0.f();
       ta.setMetadata(mediaMetadat);
       return;
    }
    public void Y(PendingIntent p0){
       this.a.setSessionActivity(p0);
    }
    public MediaSessionCompat$Token a(){
       return this.b;
    }
    public PlaybackStateCompat g(){
       return this.g;
    }
    public void n(boolean p0){
       if (this.k != p0) {
          this.k = p0;
          int i = this.f.beginBroadcast() - 1;
          while (i >= 0) {
             a broadcastIte = this.f.getBroadcastItem(i);
             try{
                broadcastIte.B1(p0);
                i = e0 - 1;
             }catch(android.os.RemoteException e0){
             }
          }
          this.f.finishBroadcast();
       }
       return;
    }
    public void release(){
       try{
          boolean b = true;
          this.e = b;
          this.f.kill();
          if (Build$VERSION.SDK_INT == 27) {
             Field declaredFiel = this.a.getClass().getDeclaredField("mCallback");
             declaredFiel.setAccessible(b);
             Handler handler = declaredFiel.get(this.a);
             if (handler != null) {
                handler.removeCallbacksAndMessages(null);
             }
          }
          this.a.setCallback(null);
          this.a.release();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void s(int p0){
       if (this.m != p0) {
          this.m = p0;
          int i = this.f.beginBroadcast() - 1;
          while (i >= 0) {
             a broadcastIte = this.f.getBroadcastItem(i);
             try{
                broadcastIte.p0(p0);
                i = e0 - 1;
             }catch(android.os.RemoteException e0){
             }
          }
          this.f.finishBroadcast();
       }
       return;
    }
    public void setExtras(Bundle p0){
       this.a.setExtras(p0);
    }
}
