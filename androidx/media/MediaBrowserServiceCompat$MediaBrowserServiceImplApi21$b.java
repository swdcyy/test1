package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$j;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Parcel;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b extends MediaBrowserServiceCompat$i	// class@000829
{
    public final MediaBrowserServiceCompat$j f;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 g;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 p0,Object p1,MediaBrowserServiceCompat$j p2){
       this.g = p0;
       this.f = p2;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(List p0){
       ArrayList uArrayList;
       if (p0 != null) {
          uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Parcel parcel = Parcel.obtain();
             iterator.next().writeToParcel(parcel, 0);
             uArrayList.add(parcel);
          }
       }else {
          uArrayList = null;
       }
       this.f.b(uArrayList);
       return;
    }
}
