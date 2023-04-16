package androidx.media.MediaBrowserServiceCompat$k$a;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;
import androidx.media.MediaBrowserServiceCompat$e;
import android.os.IBinder$DeathRecipient;
import android.support.v4.media.session.MediaSessionCompat$Token;

public class MediaBrowserServiceCompat$k$a implements Runnable	// class@00083e
{
    public final MediaBrowserServiceCompat$l b;
    public final String c;
    public final int d;
    public final int e;
    public final Bundle f;
    public final MediaBrowserServiceCompat$k g;

    public void MediaBrowserServiceCompat$k$a(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,String p2,int p3,int p4,Bundle p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       IBinder iBinder = this.b.asBinder();
       this.g.a.e.remove(iBinder);
       MediaBrowserServiceCompat$f uof = new MediaBrowserServiceCompat$f(this.g.a, this.c, this.d, this.e, this.f, this.b);
       MediaBrowserServiceCompat$k a = this.g.a;
       a.f = v1;
       MediaBrowserServiceCompat$e uoe = a.e(this.c, this.e, this.f);
       v1.h = uoe;
       MediaBrowserServiceCompat$k a1 = this.g.a;
       a1.f = null;
       if (uoe == null) {
          MediaBrowserServiceCompat$k$a ok$a = MediaBrowserServiceCompat$k$a.class;
          try{
             this.b.b();
          }catch(android.os.RemoteException e0){
          }
       }else {
          try{
             a1.e.put(iBinder, v1);
             iBinder.linkToDeath(v1, 0);
             if (this.g.a.h != null) {
                this.b.d(v1.h.b(), this.g.a.h, v1.h.a());
             }
          }catch(android.os.RemoteException e0){
             this.g.a.e.remove(e0);
          }
       }
    }
}
