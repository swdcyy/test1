package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$j;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Parcel;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a extends MediaBrowserServiceCompat$i	// class@00082e
{
    public final MediaBrowserServiceCompat$j f;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 g;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a(MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 p0,Object p1,MediaBrowserServiceCompat$j p2){
       this.g = p0;
       this.f = p2;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(MediaBrowserCompat$MediaItem p0){
       if (p0 == null) {
          this.f.b(null);
       }else {
          Parcel parcel = Parcel.obtain();
          p0.writeToParcel(parcel, 0);
          this.f.b(parcel);
       }
       return;
    }
}
