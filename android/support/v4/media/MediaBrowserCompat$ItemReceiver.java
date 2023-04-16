package android.support.v4.media.MediaBrowserCompat$ItemReceiver;
import android.support.v4.os.ResultReceiver;
import java.lang.String;
import android.support.v4.media.MediaBrowserCompat$d;
import android.os.Handler;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.lang.Object;
import java.util.Objects;

public class MediaBrowserCompat$ItemReceiver extends ResultReceiver	// class@0003ba
{
    public final String e;
    public final MediaBrowserCompat$d f;

    public void MediaBrowserCompat$ItemReceiver(String p0,MediaBrowserCompat$d p1,Handler p2){
       super(p2);
       this.e = p0;
       this.f = p1;
    }
    public void a(int p0,Bundle p1){
       if (p1 != null) {
          p1 = MediaSessionCompat.m(p1);
       }
       if (!p0 && p1 != null) {
          String str = "media_item";
          if (p1.containsKey(str)) {
             Parcelable parcelable = p1.getParcelable(str);
             if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
                Objects.requireNonNull(this.f);
             }else {
                Objects.requireNonNull(this.f);
             }
             return;
          }
       }
       Objects.requireNonNull(this.f);
       return;
    }
}
