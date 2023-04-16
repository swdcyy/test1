package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Set;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import android.os.IBinder;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c implements Runnable	// class@00082a
{
    public final String b;
    public final Bundle c;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 d;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 p0,String p1,Bundle p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Iterator iterator = this.d.d.e.keySet().iterator();
       while (iterator.hasNext()) {
          this.d.h(this.d.d.e.get(iterator.next()), this.b, this.c);
       }
       return;
    }
}
