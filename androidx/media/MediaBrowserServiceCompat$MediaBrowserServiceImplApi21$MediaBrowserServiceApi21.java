package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import android.service.media.MediaBrowserService$BrowserRoot;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat$e;
import android.service.media.MediaBrowserService$Result;
import androidx.media.MediaBrowserServiceCompat$j;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 extends MediaBrowserService	// class@000827
{
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 b;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 p0,Context p1){
       this.b = p0;
       super();
       this.attachBaseContext(p1);
    }
    public MediaBrowserService$BrowserRoot onGetRoot(String p0,int p1,Bundle p2){
       MediaSessionCompat.b(p2);
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 tb = this.b;
       MediaBrowserService$BrowserRoot uBrowserRoot = null;
       Bundle uBundle = (p2 == null)? uBrowserRoot: new Bundle(p2);
       MediaBrowserServiceCompat$e uoe = tb.j(p0, p1, uBundle);
       if (uoe != null) {
          uBrowserRoot = new MediaBrowserService$BrowserRoot(uoe.a, uoe.b);
       }
       return uBrowserRoot;
    }
    public void onLoadChildren(String p0,MediaBrowserService$Result p1){
       this.b.k(p0, new MediaBrowserServiceCompat$j(p1));
    }
}
