package android.support.v4.media.MediaBrowserCompat$m$a;
import android.media.browse.MediaBrowser$SubscriptionCallback;
import android.support.v4.media.MediaBrowserCompat$m;
import java.util.List;
import android.os.Bundle;
import java.lang.String;
import java.util.Collections;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.support.v4.media.MediaBrowserCompat$l;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.Objects;

public class MediaBrowserCompat$m$a extends MediaBrowser$SubscriptionCallback	// class@0003d2
{
    public final MediaBrowserCompat$m a;

    public void MediaBrowserCompat$m$a(MediaBrowserCompat$m p0){
       this.a = p0;
       super();
    }
    public List a(List p0,Bundle p1){
       if (p0 == null) {
          return null;
       }
       int i = -1;
       int intx = p1.getInt("android.media.browse.extra.PAGE", i);
       int intx1 = p1.getInt("android.media.browse.extra.PAGE_SIZE", i);
       if (intx == i && intx1 == i) {
          return p0;
       }
       i = intx1 * intx;
       int i1 = i + intx1;
       if (intx >= 0 && (intx1 < 1 || i >= p0.size())) {
          return Collections.emptyList();
       }
       if (i1 > p0.size()) {
          i1 = p0.size();
       }
       return p0.subList(i, i1);
    }
    public void onChildrenLoaded(String p0,List p1){
       MediaBrowserCompat$m c = this.a.c;
       MediaBrowserCompat$m$a om$a = (c == null)? null: c.get();
       if (om$a == null) {
          MediaBrowserCompat$MediaItem.b(p1);
          Objects.requireNonNull(this.a);
       }else {
          p1 = MediaBrowserCompat$MediaItem.b(p1);
          List list = om$a.b();
          List list1 = om$a.c();
          int i = 0;
          while (i < list.size()) {
             Bundle uBundle = list1.get(i);
             if (uBundle == null) {
                Objects.requireNonNull(this.a);
             }else {
                this.a(p1, uBundle);
                Objects.requireNonNull(this.a);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void onError(String p0){
       Objects.requireNonNull(this.a);
    }
}
