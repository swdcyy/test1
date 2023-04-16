package android.support.v4.media.session.MediaSessionCompat$QueueItem$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;

public class MediaSessionCompat$QueueItem$a implements Parcelable$Creator	// class@0003ea
{

    public void MediaSessionCompat$QueueItem$a(){
       super();
    }
    public MediaSessionCompat$QueueItem a(Parcel p0){
       return new MediaSessionCompat$QueueItem(p0);
    }
    public MediaSessionCompat$QueueItem[] b(int p0){
       MediaSessionCompat$QueueItem[] queueItemArr = new MediaSessionCompat$QueueItem[p0];
       return queueItemArr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
