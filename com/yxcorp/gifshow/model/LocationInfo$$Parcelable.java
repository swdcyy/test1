package com.yxcorp.gifshow.model.LocationInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.LocationInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.LocationInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LocationInfo$$Parcelable implements Parcelable, d	// class@001e40
{
    public LocationInfo locationInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LocationInfo$$Parcelable.CREATOR = new LocationInfo$$Parcelable$a();
    }
    public void LocationInfo$$Parcelable(LocationInfo p0){
       super();
       this.locationInfo$$0 = p0;
    }
    public static LocationInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LocationInfo locationInfo = new LocationInfo();
          p1.f(p1.g(), locationInfo);
          locationInfo.mLatitude = p0.readString();
          locationInfo.mLongitude = p0.readString();
          p1.f(i, locationInfo);
          return locationInfo;
       }
    }
    public static void write(LocationInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLatitude);
          p1.writeString(p0.mLongitude);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LocationInfo getParcel(){
       return this.locationInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LocationInfo$$Parcelable.write(this.locationInfo$$0, p0, p1, new a());
    }
}
