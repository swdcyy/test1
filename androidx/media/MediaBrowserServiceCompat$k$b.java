package androidx.media.MediaBrowserServiceCompat$k$b;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;
import android.os.IBinder$DeathRecipient;

public class MediaBrowserServiceCompat$k$b implements Runnable	// class@00083f
{
    public final MediaBrowserServiceCompat$l b;
    public final MediaBrowserServiceCompat$k c;

    public void MediaBrowserServiceCompat$k$b(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       MediaBrowserServiceCompat$f uof = this.c.a.e.remove(this.b.asBinder());
       if (uof != null) {
          uof.f.asBinder().unlinkToDeath(uof, 0);
       }
       return;
    }
}
