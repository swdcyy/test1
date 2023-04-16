package androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26;
import androidx.media.MediaBrowserServiceCompat;
import r2.c;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat$f;
import java.lang.IllegalStateException;
import java.lang.String;

public class MediaBrowserServiceCompat$h extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi26	// class@00083b
{
    public final MediaBrowserServiceCompat g;

    public void MediaBrowserServiceCompat$h(MediaBrowserServiceCompat p0){
       this.g = p0;
       super(p0);
    }
    public c b(){
       MediaBrowserServiceCompat$h tg = this.g;
       MediaBrowserServiceCompat f = tg.f;
       if (f == null) {
          throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
       }
       if (f == tg.c) {
          return new c(this.b.getCurrentBrowserInfo());
       }
       return f.d;
    }
}
