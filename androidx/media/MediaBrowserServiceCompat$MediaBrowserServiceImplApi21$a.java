package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a;
import java.lang.Runnable;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.Object;
import java.util.List;
import android.support.v4.media.session.b;
import java.util.Iterator;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.String;
import l1.d;
import android.media.session.MediaSession$Token;
import android.service.media.MediaBrowserService;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a implements Runnable	// class@000828
{
    public final MediaSessionCompat$Token b;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 c;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 p0,MediaSessionCompat$Token p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (!this.c.a.isEmpty()) {
          b uob = this.b.c();
          if (uob != null) {
             Iterator iterator = this.c.a.iterator();
             while (iterator.hasNext()) {
                d.b(iterator.next(), "extra_session_binder", uob.asBinder());
             }
          }
          this.c.a.clear();
       }
       this.c.b.setSessionToken(this.b.e());
       return;
    }
}
