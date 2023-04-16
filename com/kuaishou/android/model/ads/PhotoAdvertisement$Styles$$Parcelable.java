package com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$Styles$$Parcelable implements Parcelable, d	// class@000a26
{
    public PhotoAdvertisement$Styles styles$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$Styles$$Parcelable.CREATOR = new PhotoAdvertisement$Styles$$Parcelable$a();
    }
    public void PhotoAdvertisement$Styles$$Parcelable(PhotoAdvertisement$Styles p0){
       super();
       this.styles$$0 = p0;
    }
    public static PhotoAdvertisement$Styles read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$Styles styles = new PhotoAdvertisement$Styles();
          p1.f(p1.g(), styles);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
             list = uArrayList;
          }
          styles.mTemplates = list;
          p1.f(i, styles);
          return styles;
       }
    }
    public static void write(PhotoAdvertisement$Styles p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$Styles mTemplates = p0.mTemplates;
          if (mTemplates == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTemplates.size());
             Iterator iterator = p0.mTemplates.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$Styles getParcel(){
       return this.styles$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$Styles$$Parcelable.write(this.styles$$0, p0, p1, new a());
    }
}
