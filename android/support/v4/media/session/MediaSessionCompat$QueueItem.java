package android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem$a;
import android.media.session.MediaSession$QueueItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.media.MediaDescription;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.StringBuilder;

public final class MediaSessionCompat$QueueItem implements Parcelable	// class@0003eb
{
    public final MediaDescriptionCompat b;
    public final long c;
    public MediaSession$QueueItem d;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaSessionCompat$QueueItem.CREATOR = new MediaSessionCompat$QueueItem$a();
    }
    public void MediaSessionCompat$QueueItem(MediaSession$QueueItem p0,MediaDescriptionCompat p1,long p2){
       super();
       if (p1 == null) {
          throw new IllegalArgumentException("Description cannot be null");
       }
       if (!p2 - -1) {
          throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
       }
       this.b = p1;
       this.c = p2;
       this.d = p0;
       return;
    }
    public void MediaSessionCompat$QueueItem(Parcel p0){
       super();
       this.b = MediaDescriptionCompat.CREATOR.createFromParcel(p0);
       this.c = p0.readLong();
    }
    public static MediaSessionCompat$QueueItem a(Object p0){
       if (p0 != null) {
          return new MediaSessionCompat$QueueItem(p0, MediaDescriptionCompat.a(p0.getDescription()), p0.getQueueId());
       }
       return null;
    }
    public static List b(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(MediaSessionCompat$QueueItem.a(iterator.next()));
       }
       return uArrayList;
    }
    public Object c(){
       MediaSessionCompat$QueueItem td = this.d;
       if (td == null) {
          td = new MediaSession$QueueItem(this.b.d(), this.c);
          this.d = td;
       }
       return td;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "MediaSession.QueueItem {Description="+this.b+", Id="+this.c+" }";
    }
    public void writeToParcel(Parcel p0,int p1){
       this.b.writeToParcel(p0, p1);
       p0.writeLong(this.c);
    }
}
