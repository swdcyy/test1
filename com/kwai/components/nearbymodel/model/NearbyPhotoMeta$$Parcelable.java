package com.kwai.components.nearbymodel.model.NearbyPhotoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyPhotoMeta$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyPhotoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.LocalSimpleLabelInfo;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi;

public class NearbyPhotoMeta$$Parcelable implements Parcelable, d	// class@000cb9
{
    public NearbyPhotoMeta nearbyPhotoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyPhotoMeta$$Parcelable.CREATOR = new NearbyPhotoMeta$$Parcelable$a();
    }
    public void NearbyPhotoMeta$$Parcelable(NearbyPhotoMeta p0){
       super();
       this.nearbyPhotoMeta$$0 = p0;
    }
    public static NearbyPhotoMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyPhotoMeta nearbyPhotoM = new NearbyPhotoMeta();
          p1.f(p1.g(), nearbyPhotoM);
          nearbyPhotoM.mLocalSimpleLabelInfo = p0.readSerializable();
          nearbyPhotoM.mLocalLifestylePoi = p0.readSerializable();
          p1.f(i, nearbyPhotoM);
          return nearbyPhotoM;
       }
    }
    public static void write(NearbyPhotoMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mLocalSimpleLabelInfo);
          p1.writeSerializable(p0.mLocalLifestylePoi);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyPhotoMeta getParcel(){
       return this.nearbyPhotoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyPhotoMeta$$Parcelable.write(this.nearbyPhotoMeta$$0, p0, p1, new a());
    }
}
