package com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$$Parcelable;

public class PhotoAdvertisement$InteractionInfo$$Parcelable implements Parcelable, d	// class@00096b
{
    public PhotoAdvertisement$InteractionInfo interactionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$InteractionInfo$$Parcelable.CREATOR = new PhotoAdvertisement$InteractionInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$InteractionInfo$$Parcelable(PhotoAdvertisement$InteractionInfo p0){
       super();
       this.interactionInfo$$0 = p0;
    }
    public static PhotoAdvertisement$InteractionInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$InteractionInfo interactionI = new PhotoAdvertisement$InteractionInfo();
          p1.f(p1.g(), interactionI);
          interactionI.mShakeInfo = PhotoAdvertisement$ShakeInfo$$Parcelable.read(p0, p1);
          interactionI.mRotationInfo = PhotoAdvertisement$RotationInfo$$Parcelable.read(p0, p1);
          interactionI.mTemplateId = p0.readString();
          p1.f(i, interactionI);
          return interactionI;
       }
    }
    public static void write(PhotoAdvertisement$InteractionInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$ShakeInfo$$Parcelable.write(p0.mShakeInfo, p1, p2, p3);
          PhotoAdvertisement$RotationInfo$$Parcelable.write(p0.mRotationInfo, p1, p2, p3);
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$InteractionInfo getParcel(){
       return this.interactionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$InteractionInfo$$Parcelable.write(this.interactionInfo$$0, p0, p1, new a());
    }
}
