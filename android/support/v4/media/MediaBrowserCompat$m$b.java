package android.support.v4.media.MediaBrowserCompat$m$b;
import android.support.v4.media.MediaBrowserCompat$m$a;
import android.support.v4.media.MediaBrowserCompat$m;
import java.lang.String;
import java.util.List;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.lang.Object;
import java.util.Objects;

public class MediaBrowserCompat$m$b extends MediaBrowserCompat$m$a	// class@0003d3
{
    public final MediaBrowserCompat$m b;

    public void MediaBrowserCompat$m$b(MediaBrowserCompat$m p0){
       this.b = p0;
       super(p0);
    }
    public void onChildrenLoaded(String p0,List p1,Bundle p2){
       MediaSessionCompat.b(p2);
       MediaBrowserCompat$MediaItem.b(p1);
       Objects.requireNonNull(this.b);
    }
    public void onError(String p0,Bundle p1){
       MediaSessionCompat.b(p1);
       Objects.requireNonNull(this.b);
    }
}
