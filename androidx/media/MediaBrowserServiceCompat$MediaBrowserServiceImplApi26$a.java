package androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26;
import java.lang.Object;
import androidx.media.MediaBrowserServiceCompat$j;
import android.os.Bundle;
import java.util.List;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Parcel;

public class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a extends MediaBrowserServiceCompat$i	// class@000831
{
    public final MediaBrowserServiceCompat$j f;
    public final Bundle g;
    public final MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 h;

    public void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a(MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 p0,Object p1,MediaBrowserServiceCompat$j p2,Bundle p3){
       this.h = p0;
       this.f = p2;
       this.g = p3;
       super(p1);
    }
    public void d(Object p0){
       this.h(p0);
    }
    public void h(List p0){
       if (p0 == null) {
          this.f.b(null);
          return;
       }else if(this.a() & 0x01){
          p0 = this.h.f.b(p0, this.g);
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Parcel parcel = Parcel.obtain();
          iterator.next().writeToParcel(parcel, 0);
          uArrayList.add(parcel);
       }
       this.f.b(uArrayList);
       return;
    }
}
