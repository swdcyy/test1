package com.kwai.components.nearbymodel.model.NearbyMapFeed$MapDarkLightModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$MapDarkLightModel$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$MapDarkLightModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NearbyMapFeed$MapDarkLightModel$$Parcelable implements Parcelable, d	// class@000ca2
{
    public NearbyMapFeed$MapDarkLightModel mapDarkLightModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$MapDarkLightModel$$Parcelable.CREATOR = new NearbyMapFeed$MapDarkLightModel$$Parcelable$a();
    }
    public void NearbyMapFeed$MapDarkLightModel$$Parcelable(NearbyMapFeed$MapDarkLightModel p0){
       super();
       this.mapDarkLightModel$$0 = p0;
    }
    public static NearbyMapFeed$MapDarkLightModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyMapFeed$MapDarkLightModel mapDarkLight = new NearbyMapFeed$MapDarkLightModel();
          p1.f(p1.g(), mapDarkLight);
          mapDarkLight.mDark = p0.readString();
          mapDarkLight.mLight = p0.readString();
          p1.f(i, mapDarkLight);
          return mapDarkLight;
       }
    }
    public static void write(NearbyMapFeed$MapDarkLightModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDark);
          p1.writeString(p0.mLight);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed$MapDarkLightModel getParcel(){
       return this.mapDarkLightModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$MapDarkLightModel$$Parcelable.write(this.mapDarkLightModel$$0, p0, p1, new a());
    }
}
