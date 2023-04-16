package android.support.v4.media.MediaBrowserCompat$g;
import android.support.v4.media.MediaBrowserCompat$f;
import android.content.Context;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$b;
import android.os.Bundle;
import java.lang.String;
import android.support.v4.media.MediaBrowserCompat$d;
import android.media.browse.MediaBrowser$ItemCallback;
import android.media.browse.MediaBrowser;

public class MediaBrowserCompat$g extends MediaBrowserCompat$f	// class@0003cc
{

    public void MediaBrowserCompat$g(Context p0,ComponentName p1,MediaBrowserCompat$b p2,Bundle p3){
       super(p0, p1, p2, p3);
    }
    public void l(String p0,MediaBrowserCompat$d p1){
       if (this.g == null) {
          this.b.getItem(p0, p1.a);
       }else {
          super.l(p0, p1);
       }
       return;
    }
}
