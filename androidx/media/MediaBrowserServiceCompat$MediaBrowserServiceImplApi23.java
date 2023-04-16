package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.String;
import androidx.media.MediaBrowserServiceCompat$j;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
import android.content.Context;
import android.service.media.MediaBrowserService;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi21	// class@00082f
{
    public final MediaBrowserServiceCompat e;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat p0){
       this.e = p0;
       super(p0);
    }
    public void l(String p0,MediaBrowserServiceCompat$j p1){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 te = this.e;
       te.f = te.c;
       te.h(p0, new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a(this, p0, p1));
       p0.f = null;
    }
    public void onCreate(){
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 mediaBrowser = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(this, this.e);
       this.b = mediaBrowser;
       mediaBrowser.onCreate();
    }
}
