package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$NegativeReason$$Parcelable implements Parcelable, d	// class@0009b0
{
    public PhotoAdvertisement$NegativeReason negativeReason$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$NegativeReason$$Parcelable.CREATOR = new PhotoAdvertisement$NegativeReason$$Parcelable$a();
    }
    public void PhotoAdvertisement$NegativeReason$$Parcelable(PhotoAdvertisement$NegativeReason p0){
       super();
       this.negativeReason$$0 = p0;
    }
    public static PhotoAdvertisement$NegativeReason read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$NegativeReason negativeReas = new PhotoAdvertisement$NegativeReason();
          p1.f(p1.g(), negativeReas);
          negativeReas.subTitle = p0.readString();
          negativeReas.menuId = p0.readInt();
          negativeReas.title = p0.readString();
          int i1 = p0.readInt();
          List list = null;
          if (i1 >= 0) {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                List list1 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list1);
             }
             list = uArrayList;
          }
          negativeReas.subMenuIds = list;
          p1.f(i, negativeReas);
          return negativeReas;
       }
    }
    public static void write(PhotoAdvertisement$NegativeReason p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.subTitle);
          p1.writeInt(p0.menuId);
          p1.writeString(p0.title);
          PhotoAdvertisement$NegativeReason subMenuIds = p0.subMenuIds;
          if (subMenuIds == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(subMenuIds.size());
             Iterator iterator = p0.subMenuIds.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$NegativeReason getParcel(){
       return this.negativeReason$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$NegativeReason$$Parcelable.write(this.negativeReason$$0, p0, p1, new a());
    }
}
