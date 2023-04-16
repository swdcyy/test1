package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AdWebCardInfo$$Parcelable implements Parcelable, d	// class@0008bb
{
    public PhotoAdvertisement$AdWebCardInfo adWebCardInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdWebCardInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdWebCardInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdWebCardInfo$$Parcelable(PhotoAdvertisement$AdWebCardInfo p0){
       super();
       this.adWebCardInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdWebCardInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdWebCardInfo uAdWebCardIn = new PhotoAdvertisement$AdWebCardInfo();
          p1.f(p1.g(), uAdWebCardIn);
          uAdWebCardIn.mCardShowTime = p0.readLong();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uAdWebCardIn.mCardDelayReplay = b1;
          uAdWebCardIn.mCardType = p0.readInt();
          uAdWebCardIn.mCardUrl = p0.readString();
          uAdWebCardIn.mCardDelayTime = p0.readLong();
          uAdWebCardIn.mCardData = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uAdWebCardIn.mHideCloseButton = b;
          p1.f(i, uAdWebCardIn);
          return uAdWebCardIn;
       }
    }
    public static void write(PhotoAdvertisement$AdWebCardInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mCardShowTime);
          p1.writeInt(p0.mCardDelayReplay);
          p1.writeInt(p0.mCardType);
          p1.writeString(p0.mCardUrl);
          p1.writeLong(p0.mCardDelayTime);
          p1.writeString(p0.mCardData);
          p1.writeInt(p0.mHideCloseButton);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdWebCardInfo getParcel(){
       return this.adWebCardInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdWebCardInfo$$Parcelable.write(this.adWebCardInfo$$0, p0, p1, new a());
    }
}
