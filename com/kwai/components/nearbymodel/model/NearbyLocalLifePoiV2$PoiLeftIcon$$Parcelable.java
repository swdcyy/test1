package com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$PoiLeftIcon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable implements Parcelable, d	// class@000c9b
{
    public NearbyLocalLifePoiV2$PoiLeftIcon poiLeftIcon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable.CREATOR = new NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable$a();
    }
    public void NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable(NearbyLocalLifePoiV2$PoiLeftIcon p0){
       super();
       this.poiLeftIcon$$0 = p0;
    }
    public static NearbyLocalLifePoiV2$PoiLeftIcon read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyLocalLifePoiV2$PoiLeftIcon poiLeftIcon = new NearbyLocalLifePoiV2$PoiLeftIcon();
          p1.f(p1.g(), poiLeftIcon);
          poiLeftIcon.mDark = p0.readString();
          poiLeftIcon.mLight = p0.readString();
          p1.f(i, poiLeftIcon);
          return poiLeftIcon;
       }
    }
    public static void write(NearbyLocalLifePoiV2$PoiLeftIcon p0,Parcel p1,int p2,a p3){
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
    public NearbyLocalLifePoiV2$PoiLeftIcon getParcel(){
       return this.poiLeftIcon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyLocalLifePoiV2$PoiLeftIcon$$Parcelable.write(this.poiLeftIcon$$0, p0, p1, new a());
    }
}
