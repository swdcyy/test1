package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import android.content.Context;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import java.lang.String;
import android.service.media.MediaBrowserService$Result;
import androidx.media.MediaBrowserServiceCompat$j;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21	// class@00082d
{
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 c;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 p0,Context p1){
       this.c = p0;
       super(p0, p1);
    }
    public void onLoadItem(String p0,MediaBrowserService$Result p1){
       this.c.l(p0, new MediaBrowserServiceCompat$j(p1));
    }
}
