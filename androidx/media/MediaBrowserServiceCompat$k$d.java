package androidx.media.MediaBrowserServiceCompat$k$d;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.os.IBinder;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$k$d implements Runnable	// class@000841
{
    public final MediaBrowserServiceCompat$l b;
    public final String c;
    public final IBinder d;
    public final MediaBrowserServiceCompat$k e;

    public void MediaBrowserServiceCompat$k$d(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,String p2,IBinder p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       MediaBrowserServiceCompat$f uof = this.e.a.e.get(this.b.asBinder());
       if (uof == null) {
          return;
       }
       this.e.a.n(this.c, uof, this.d);
       return;
    }
}
