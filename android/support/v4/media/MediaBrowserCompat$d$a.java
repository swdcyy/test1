package android.support.v4.media.MediaBrowserCompat$d$a;
import android.media.browse.MediaBrowser$ItemCallback;
import android.support.v4.media.MediaBrowserCompat$d;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.media.browse.MediaBrowser$MediaItem;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

public class MediaBrowserCompat$d$a extends MediaBrowser$ItemCallback	// class@0003c3
{
    public final MediaBrowserCompat$d a;

    public void MediaBrowserCompat$d$a(MediaBrowserCompat$d p0){
       this.a = p0;
       super();
    }
    public void onError(String p0){
       Objects.requireNonNull(this.a);
    }
    public void onItemLoaded(MediaBrowser$MediaItem p0){
       MediaBrowserCompat$MediaItem.a(p0);
       Objects.requireNonNull(this.a);
    }
}
