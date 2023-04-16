package androidx.media.MediaBrowserServiceCompat$k$g;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;
import android.os.IBinder$DeathRecipient;

public class MediaBrowserServiceCompat$k$g implements Runnable	// class@000844
{
    public final MediaBrowserServiceCompat$l b;
    public final MediaBrowserServiceCompat$k c;

    public void MediaBrowserServiceCompat$k$g(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       IBinder iBinder = this.b.asBinder();
       MediaBrowserServiceCompat$f uof = this.c.a.e.remove(iBinder);
       if (uof != null) {
          iBinder.unlinkToDeath(uof, 0);
       }
       return;
    }
}
