package com.kwai.component.photo.detail.core.media.MediaButtonService$a;
import java.lang.Runnable;
import com.kwai.component.photo.detail.core.media.MediaButtonService;
import android.content.ComponentName;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.support.v4.media.session.MediaSessionCompat;
import android.app.Service;
import android.content.Context;
import android.app.PendingIntent;
import com.kwai.logger.KwaiLog;
import android.support.v4.media.session.PlaybackStateCompat$b;
import android.support.v4.media.session.PlaybackStateCompat;
import com.kwai.component.photo.detail.core.media.MediaButtonService$a$a;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat$b;
import java.lang.SecurityException;
import k2b.u1;
import java.lang.NullPointerException;

public class MediaButtonService$a implements Runnable	// class@000a32
{
    public final ComponentName b;
    public final MediaButtonService c;

    public void MediaButtonService$a(MediaButtonService p0,ComponentName p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MediaButtonService$a.class, "1")) {
          return;
       }
       int i = 0;
       try{
          MediaButtonService$a tc = this.c;
          tc.j = new MediaSessionCompat(tc, tc.getPackageName(), this.b, objArray);
          objArray = new Object[i];
          KwaiLog.b("MediaButtonService", "mSession created", objArray);
          PlaybackStateCompat$b uob = new PlaybackStateCompat$b();
          uob.b(518);
          uob.c(3, 0, 0x3f800000);
          this.c.j.k(uob.a());
          this.c.j.i(3);
          this.c.j.l(3);
          objArray = new Object[i];
          KwaiLog.b("MediaButtonService", "mSession set callback", objArray);
          MediaButtonService j = this.c.j;
          MediaButtonService$a$a uoa$a = new MediaButtonService$a$a(this);
          Handler handler = new Handler(this.c.getMainLooper());
          try{
             j.h(uoa$a, handler);
             Object[] objArray2 = new Object[i];
             KwaiLog.b("MediaButtonService", "mSession set active", objArray2);
             this.c.j.f(true);
          }catch(java.lang.SecurityException e2){
             objArray1 = new Object[i];
             KwaiLog.e("MediaButtonService", e2.toString(), objArray1);
             u1.Q("MediaButtonService", e2.toString());
          }
          return;
       }catch(java.lang.NullPointerException e2){
          objArray1 = new Object[i];
          KwaiLog.e("MediaButtonService", e2.toString(), objArray1);
          u1.Q("MediaButtonService", e2.toString());
          return;
       }
    }
}
