package com.kwai.components.nearbymodel.model.PoiLocation$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.PoiLocation$$Parcelable$a;
import com.kwai.components.nearbymodel.model.PoiLocation;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PoiLocation$$Parcelable implements Parcelable, d	// class@000cbd
{
    public PoiLocation poiLocation$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PoiLocation$$Parcelable.CREATOR = new PoiLocation$$Parcelable$a();
    }
    public void PoiLocation$$Parcelable(PoiLocation p0){
       super();
       this.poiLocation$$0 = p0;
    }
    public static PoiLocation read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PoiLocation poiLocation = new PoiLocation();
          p1.f(p1.g(), poiLocation);
          p1.f(i, poiLocation);
          return poiLocation;
       }
    }
    public static void write(PoiLocation p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PoiLocation getParcel(){
       return this.poiLocation$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PoiLocation$$Parcelable.write(this.poiLocation$$0, p0, p1, new a());
    }
}
