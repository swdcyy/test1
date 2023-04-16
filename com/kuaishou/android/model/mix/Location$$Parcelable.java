package com.kuaishou.android.model.mix.Location$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.Location$$Parcelable$a;
import com.kuaishou.android.model.mix.Location;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;

public class Location$$Parcelable implements Parcelable, d	// class@000d0c
{
    public Location location$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Location$$Parcelable.CREATOR = new Location$$Parcelable$a();
    }
    public void Location$$Parcelable(Location p0){
       super();
       this.location$$0 = p0;
    }
    public static Location read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Location location = new Location();
          p1.f(p1.g(), location);
          location.mOverrideTitle = p0.readString();
          location.mPoiOwnerType = p0.readInt();
          location.latitude = p0.readDouble();
          location.mId = p0.readLong();
          location.mCheckType = p0.readInt();
          location.mDistance = p0.readLong();
          location.mLinkUrl = p0.readString();
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
          location.mTypeList = list;
          location.mAddress = p0.readString();
          location.mCity = p0.readString();
          location.mLocationImg = p0.readInt();
          location.mTitle = p0.readString();
          location.mExtParams = p0.readString();
          location.longitude = p0.readDouble();
          p1.f(i, location);
          return location;
       }
    }
    public static void write(Location p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mOverrideTitle);
          p1.writeInt(p0.mPoiOwnerType);
          p1.writeDouble(p0.latitude);
          p1.writeLong(p0.mId);
          p1.writeInt(p0.mCheckType);
          p1.writeLong(p0.mDistance);
          p1.writeString(p0.mLinkUrl);
          Location mTypeList = p0.mTypeList;
          if (mTypeList == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTypeList.size());
             Iterator iterator = p0.mTypeList.iterator();
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
          p1.writeString(p0.mAddress);
          p1.writeString(p0.mCity);
          p1.writeInt(p0.mLocationImg);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mExtParams);
          p1.writeDouble(p0.longitude);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Location getParcel(){
       return this.location$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Location$$Parcelable.write(this.location$$0, p0, p1, new a());
    }
}
