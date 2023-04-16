package android.support.v4.media.MediaBrowserCompat$SearchResultReceiver;
import android.support.v4.os.ResultReceiver;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$j;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcelable;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

public class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver	// class@0003bd
{
    public final String e;
    public final Bundle f;
    public final MediaBrowserCompat$j g;

    public void MediaBrowserCompat$SearchResultReceiver(String p0,Bundle p1,MediaBrowserCompat$j p2,Handler p3){
       super(p3);
       this.e = p0;
       this.f = p1;
    }
    public void a(int p0,Bundle p1){
       if (p1 != null) {
          p1 = MediaSessionCompat.m(p1);
       }
       if (!p0 && p1 != null) {
          String str = "search_results";
          if (p1.containsKey(str)) {
             Parcelable[] parcelableAr = p1.getParcelableArray(str);
             Objects.requireNonNull(parcelableAr);
             ArrayList uArrayList = new ArrayList();
             int len = parcelableAr.length;
             for (int i = 0; i < len; i = i + 1) {
                uArrayList.add(parcelableAr[i]);
             }
             throw null;
          }
       }
       throw null;
    }
}
