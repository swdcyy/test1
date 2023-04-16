package androidx.media.MediaBrowserServiceCompat$c;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import android.support.v4.os.ResultReceiver;
import java.util.List;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Parcelable;
import java.lang.String;

public class MediaBrowserServiceCompat$c extends MediaBrowserServiceCompat$i	// class@000835
{
    public final ResultReceiver f;
    public final MediaBrowserServiceCompat g;

    public void MediaBrowserServiceCompat$c(MediaBrowserServiceCompat p0,Object p1,ResultReceiver p2){
       this.g = p0;
       this.f = p2;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(List p0){
       if ((this.a() & 0x04) || p0 == null) {
          this.f.b(-1, null);
          return;
       }else {
          Bundle uBundle = new Bundle();
          MediaBrowserCompat$MediaItem[] mediaItemArr = new MediaBrowserCompat$MediaItem[0];
          uBundle.putParcelableArray("search_results", p0.toArray(mediaItemArr));
          this.f.b(0, uBundle);
          return;
       }
    }
}
