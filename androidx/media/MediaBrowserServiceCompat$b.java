package androidx.media.MediaBrowserServiceCompat$b;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.Object;
import android.support.v4.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;

public class MediaBrowserServiceCompat$b extends MediaBrowserServiceCompat$i	// class@000834
{
    public final ResultReceiver f;
    public final MediaBrowserServiceCompat g;

    public void MediaBrowserServiceCompat$b(MediaBrowserServiceCompat p0,Object p1,ResultReceiver p2){
       this.g = p0;
       this.f = p2;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(MediaBrowserCompat$MediaItem p0){
       if (this.a() & 0x02) {
          this.f.b(-1, null);
          return;
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("media_item", p0);
          this.f.b(0, uBundle);
          return;
       }
    }
}
