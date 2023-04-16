package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26;
import android.content.Context;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import java.lang.String;
import android.service.media.MediaBrowserService$Result;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$j;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23	// class@000830
{
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 d;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26(MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 p0,Context p1){
       this.d = p0;
       super(p0, p1);
    }
    public void onLoadChildren(String p0,MediaBrowserService$Result p1,Bundle p2){
       MediaSessionCompat.b(p2);
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26 td = this.d;
       MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 f = td.f;
       f.f = f.c;
       td.m(p0, new MediaBrowserServiceCompat$j(p1), p2);
       p0.f = null;
    }
}
