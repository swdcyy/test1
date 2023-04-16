package android.support.v4.media.MediaBrowserCompat$d;
import java.lang.Object;
import android.os.Build$VERSION;
import android.support.v4.media.MediaBrowserCompat$d$a;

public abstract class MediaBrowserCompat$d	// class@0003c4
{
    public final MediaBrowser$ItemCallback a;

    public void MediaBrowserCompat$d(){
       super();
       this.a = (Build$VERSION.SDK_INT >= 23)? new MediaBrowserCompat$d$a(this): null;
       return;
    }
}
