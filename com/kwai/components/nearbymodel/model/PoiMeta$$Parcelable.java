package com.kwai.components.nearbymodel.model.PoiMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.PoiMeta$$Parcelable$a;
import com.kwai.components.nearbymodel.model.PoiMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.PoiCollectInfo;

public class PoiMeta$$Parcelable implements Parcelable, d	// class@000cc0
{
    public PoiMeta poiMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PoiMeta$$Parcelable.CREATOR = new PoiMeta$$Parcelable$a();
    }
    public void PoiMeta$$Parcelable(PoiMeta p0){
       super();
       this.poiMeta$$0 = p0;
    }
    public static PoiMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PoiMeta poiMeta = new PoiMeta();
          p1.f(p1.g(), poiMeta);
          poiMeta.mCollectInfo = p0.readSerializable();
          p1.f(i, poiMeta);
          return poiMeta;
       }
    }
    public static void write(PoiMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mCollectInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PoiMeta getParcel(){
       return this.poiMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PoiMeta$$Parcelable.write(this.poiMeta$$0, p0, p1, new a());
    }
}
