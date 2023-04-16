package androidx.media.MediaBrowserServiceCompat$k$e;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.support.v4.os.ResultReceiver;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$k$e implements Runnable	// class@000842
{
    public final MediaBrowserServiceCompat$l b;
    public final String c;
    public final ResultReceiver d;
    public final MediaBrowserServiceCompat$k e;

    public void MediaBrowserServiceCompat$k$e(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,String p2,ResultReceiver p3){
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
       this.e.a.l(this.c, uof, this.d);
       return;
    }
}
