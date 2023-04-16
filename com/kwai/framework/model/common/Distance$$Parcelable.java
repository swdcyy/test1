package com.kwai.framework.model.common.Distance$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.common.Distance$$Parcelable$a;
import com.kwai.framework.model.common.Distance;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class Distance$$Parcelable implements Parcelable, d	// class@00168c
{
    public Distance distance$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Distance$$Parcelable.CREATOR = new Distance$$Parcelable$a();
    }
    public void Distance$$Parcelable(Distance p0){
       super();
       this.distance$$0 = p0;
    }
    public static Distance read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Distance uDistance = new Distance();
          p1.f(p1.g(), uDistance);
          uDistance.mLatitude = p0.readDouble();
          uDistance.mDistanceText = p0.readString();
          uDistance.mRegionText = p0.readString();
          uDistance.mRegion = p0.readString();
          uDistance.mName = p0.readString();
          uDistance.mDistance = p0.readDouble();
          uDistance.mLongtitude = p0.readDouble();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uDistance.mIsShowIcon = b;
          p1.f(i, uDistance);
          return uDistance;
       }
    }
    public static void write(Distance p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeDouble(p0.mLatitude);
          p1.writeString(p0.mDistanceText);
          p1.writeString(p0.mRegionText);
          p1.writeString(p0.mRegion);
          p1.writeString(p0.mName);
          p1.writeDouble(p0.mDistance);
          p1.writeDouble(p0.mLongtitude);
          p1.writeInt(p0.mIsShowIcon);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Distance getParcel(){
       return this.distance$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Distance$$Parcelable.write(this.distance$$0, p0, p1, new a());
    }
}
