package androidx.media.MediaBrowserServiceCompat$f$a;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat$l;
import androidx.collection.SimpleArrayMap;

public class MediaBrowserServiceCompat$f$a implements Runnable	// class@000838
{
    public final MediaBrowserServiceCompat$f b;

    public void MediaBrowserServiceCompat$f$a(MediaBrowserServiceCompat$f p0){
       this.b = p0;
       super();
    }
    public void run(){
       MediaBrowserServiceCompat$f$a tb = this.b;
       tb.i.e.remove(tb.f.asBinder());
    }
}
