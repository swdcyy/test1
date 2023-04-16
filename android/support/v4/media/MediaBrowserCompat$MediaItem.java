package android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem$a;
import android.os.Parcel;
import java.lang.Object;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import android.media.browse.MediaBrowser$MediaItem;
import android.media.MediaDescription;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.StringBuilder;

public class MediaBrowserCompat$MediaItem implements Parcelable	// class@0003bc
{
    public final int b;
    public final MediaDescriptionCompat c;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaBrowserCompat$MediaItem.CREATOR = new MediaBrowserCompat$MediaItem$a();
    }
    public void MediaBrowserCompat$MediaItem(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = MediaDescriptionCompat.CREATOR.createFromParcel(p0);
    }
    public void MediaBrowserCompat$MediaItem(MediaDescriptionCompat p0,int p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("description cannot be null");
       }
       if (TextUtils.isEmpty(p0.e())) {
          throw new IllegalArgumentException("description must have a non-empty media id");
       }
       this.b = p1;
       this.c = p0;
       return;
    }
    public static MediaBrowserCompat$MediaItem a(Object p0){
       if (p0 != null) {
          return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.a(p0.getDescription()), p0.getFlags());
       }
       return null;
    }
    public static List b(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(MediaBrowserCompat$MediaItem.a(iterator.next()));
       }
       return uArrayList;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "MediaItem{"+"mFlags="+this.b+", mDescription="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       this.c.writeToParcel(p0, p1);
    }
}
