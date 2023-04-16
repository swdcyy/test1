package android.support.v4.media.MediaBrowserCompat$MediaItem$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

public class MediaBrowserCompat$MediaItem$a implements Parcelable$Creator	// class@0003bb
{

    public void MediaBrowserCompat$MediaItem$a(){
       super();
    }
    public MediaBrowserCompat$MediaItem a(Parcel p0){
       return new MediaBrowserCompat$MediaItem(p0);
    }
    public MediaBrowserCompat$MediaItem[] b(int p0){
       MediaBrowserCompat$MediaItem[] mediaItemArr = new MediaBrowserCompat$MediaItem[p0];
       return mediaItemArr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
