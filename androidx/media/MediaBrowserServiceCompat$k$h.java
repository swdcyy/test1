package androidx.media.MediaBrowserServiceCompat$k$h;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$k;
import androidx.media.MediaBrowserServiceCompat$l;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.lang.Object;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.collection.SimpleArrayMap;
import androidx.media.MediaBrowserServiceCompat$f;

public class MediaBrowserServiceCompat$k$h implements Runnable	// class@000845
{
    public final MediaBrowserServiceCompat$l b;
    public final String c;
    public final Bundle d;
    public final ResultReceiver e;
    public final MediaBrowserServiceCompat$k f;

    public void MediaBrowserServiceCompat$k$h(MediaBrowserServiceCompat$k p0,MediaBrowserServiceCompat$l p1,String p2,Bundle p3,ResultReceiver p4){
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
       this.f.a.m(this.c, this.d, uof, this.e);
       return;
    }
}
