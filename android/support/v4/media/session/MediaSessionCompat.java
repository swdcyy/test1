package android.support.v4.media.session.MediaSessionCompat;
import android.content.Context;
import java.lang.String;
import android.content.ComponentName;
import android.app.PendingIntent;
import android.os.Bundle;
import g3.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.media.session.MediaButtonReceiver;
import android.content.Intent;
import android.os.Build$VERSION;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$f;
import android.support.v4.media.session.MediaSessionCompat$e;
import android.support.v4.media.session.MediaSessionCompat$d;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat$a;
import android.support.v4.media.session.MediaSessionCompat$b;
import android.support.v4.media.session.MediaSessionCompat$c;
import android.support.v4.media.session.MediaControllerCompat;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import java.lang.IllegalArgumentException;
import java.lang.ClassLoader;
import java.lang.Class;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat$b;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.Iterator;
import android.support.v4.media.session.MediaSessionCompat$g;

public class MediaSessionCompat	// class@0003fa
{
    public final MediaSessionCompat$c a;
    public final MediaControllerCompat b;
    public final ArrayList c;
    public static final int d = 1;
    public static final int e = 2;
    public static int f;

    public void MediaSessionCompat(Context p0,String p1){
       super(p0, p1, null, null);
    }
    public void MediaSessionCompat(Context p0,String p1,ComponentName p2,PendingIntent p3){
       super(p0, p1, p2, null, null);
    }
    public void MediaSessionCompat(Context p0,String p1,ComponentName p2,PendingIntent p3,Bundle p4){
       super(p0, p1, p2, p3, null, null);
    }
    public void MediaSessionCompat(Context p0,String p1,ComponentName p2,PendingIntent p3,Bundle p4,c p5){
       Intent intent;
       super();
       this.c = new ArrayList();
       if (p0 == null) {
          throw new IllegalArgumentException("context must not be null");
       }
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalArgumentException("tag must not be null or empty");
       }
       if (p2 == null) {
          p2 = MediaButtonReceiver.c(p0);
       }
       if (p2 != null && p3 == null) {
          intent = new Intent("android.intent.action.MEDIA_BUTTON");
          intent.setComponent(p2);
          intent = PendingIntent.getBroadcast(p0, 0, intent, 0);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       MediaSession mediaSession = this.a(p0, p1, p4);
       if (sDK_INT >= 29) {
          this.a = new MediaSessionCompat$f(mediaSession, null, p4);
       }else if(sDK_INT >= 28){
          this.a = new MediaSessionCompat$e(mediaSession, null, p4);
       }else {
          this.a = new MediaSessionCompat$d(mediaSession, null, p4);
       }
       Looper looper = (Looper.myLooper() != null)? Looper.myLooper(): Looper.getMainLooper();
       this.h(new MediaSessionCompat$a(this), new Handler(looper));
       this.a.V(intent);
       this.b = new MediaControllerCompat(p0, this);
       if (!MediaSessionCompat.f) {
          MediaSessionCompat.f = (int)(TypedValue.applyDimension(1, 320.00f, c.c(p0.getResources())) + 0x3f000000);
       }
       return;
    }
    public static void b(Bundle p0){
       if (p0 != null) {
          p0.setClassLoader(MediaSessionCompat.class.getClassLoader());
       }
       return;
    }
    public static PlaybackStateCompat d(PlaybackStateCompat p0,MediaMetadataCompat p1){
       long l3;
       if (p0 != null) {
          long l = -1;
          if (p0.e() - l && (p0.f() != 3 && (p0.f() == 4 || p0.f() == 5))) {
             long l1 = p0.b();
             if (l1 > 0) {
                long l2 = SystemClock.elapsedRealtime();
                l1 = (long)(p0.c() * (float)(l2 - l1)) + p0.e();
                if (p1 != null && p1.a("android.media.metadata.DURATION")) {
                   l = p1.e("android.media.metadata.DURATION");
                }
                if (l >= 0 && l1 - l > 0) {
                   l3 = l;
                }else if(l1 < 0){
                   l3 = 0;
                }else {
                   l3 = l1;
                }
                PlaybackStateCompat$b uob = new PlaybackStateCompat$b(p0);
                uob.d(p0.f(), l3, p0.c(), l2);
                p0 = uob.a();
             }
          }
       }
       return p0;
    }
    public static Bundle m(Bundle p0){
       if (p0 == null) {
          return null;
       }
       try{
          MediaSessionCompat.b(p0);
          p0.isEmpty();
          return p0;
       }catch(android.os.BadParcelableException e0){
          return e0;
       }
    }
    public final MediaSession a(Context p0,String p1,Bundle p2){
       if (Build$VERSION.SDK_INT >= 29) {
          return new MediaSession(p0, p1, p2);
       }
       return new MediaSession(p0, p1);
    }
    public MediaSessionCompat$Token c(){
       return this.a.a();
    }
    public void e(){
       this.a.release();
    }
    public void f(boolean p0){
       this.a.F(p0);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void g(MediaSessionCompat$b p0){
       this.h(p0, null);
    }
    public void h(MediaSessionCompat$b p0,Handler p1){
       if (p0 == null) {
          this.a.K(null, null);
       }else {
          MediaSessionCompat ta = this.a;
          if (p1 == null) {
             p1 = new Handler();
          }
          ta.K(p0, p1);
       }
       return;
    }
    public void i(int p0){
       this.a.G(p0);
    }
    public void j(MediaMetadataCompat p0){
       this.a.X(p0);
    }
    public void k(PlaybackStateCompat p0){
       this.a.M(p0);
    }
    public void l(int p0){
       this.a.N(p0);
    }
}
