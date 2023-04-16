package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import r2.c;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d implements Runnable	// class@00082b
{
    public final c b;
    public final String c;
    public final Bundle d;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 e;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 p0,c p1,String p2,Bundle p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       int i = 0;
       while (i < this.e.d.e.size()) {
          MediaBrowserServiceCompat$f uof = this.e.d.e.valueAt(i);
          if (uof.d.equals(this.b)) {
             this.e.h(uof, this.c, this.d);
          }
          i = i + 1;
       }
       return;
    }
}
