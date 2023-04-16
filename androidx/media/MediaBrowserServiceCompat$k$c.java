package androidx.media.MediaBrowserServiceCompat$k$c;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.os.IBinder;
import android.os.Bundle;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$k$c implements Runnable	// class@000840
{
    public final MediaBrowserServiceCompat$l b;
    public final String c;
    public final IBinder d;
    public final Bundle e;
    public final MediaBrowserServiceCompat$k f;

    public void MediaBrowserServiceCompat$k$c(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,String p2,IBinder p3,Bundle p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       MediaBrowserServiceCompat$f uof = this.f.a.e.get(this.b.asBinder());
       if (uof == null) {
          return;
       }
       this.f.a.a(this.c, uof, this.d, this.e);
       return;
    }
}
