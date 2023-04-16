package androidx.media.MediaBrowserServiceCompat$j;
import android.service.media.MediaBrowserService$Result;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import android.media.browse.MediaBrowser$MediaItem;
import android.os.Parcelable$Creator;

public class MediaBrowserServiceCompat$j	// class@00083d
{
    public MediaBrowserService$Result a;

    public void MediaBrowserServiceCompat$j(MediaBrowserService$Result p0){
       super();
       this.a = p0;
    }
    public List a(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Parcel parcel = iterator.next();
          parcel.setDataPosition(0);
          uArrayList.add(MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
          parcel.recycle();
       }
       return uArrayList;
    }
    public void b(Object p0){
       if (p0 instanceof List) {
          this.a.sendResult(this.a(p0));
       }else if(p0 instanceof Parcel){
          p0.setDataPosition(0);
          this.a.sendResult(MediaBrowser$MediaItem.CREATOR.createFromParcel(p0));
          p0.recycle();
       }else {
          this.a.sendResult(null);
       }
       return;
    }
}
