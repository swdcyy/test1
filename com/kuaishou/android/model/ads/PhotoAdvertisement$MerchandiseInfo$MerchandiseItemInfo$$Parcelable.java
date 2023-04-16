package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable implements Parcelable, d	// class@00099e
{
    public PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable.CREATOR = new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo p0){
       super();
       this.merchandiseItemInfo$$0 = p0;
    }
    public static PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseI = new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo();
          p1.f(p1.g(), merchandiseI);
          merchandiseI.mPrice = p0.readString();
          merchandiseI.mUrl = p0.readString();
          merchandiseI.mAction = p0.readString();
          merchandiseI.mSubtitle = p0.readString();
          merchandiseI.mId = p0.readString();
          merchandiseI.mUnit = p0.readString();
          merchandiseI.mTitle = p0.readString();
          merchandiseI.mIconUrl = p0.readString();
          merchandiseI.mScheme = p0.readString();
          p1.f(i, merchandiseI);
          return merchandiseI;
       }
    }
    public static void write(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPrice);
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mAction);
          p1.writeString(p0.mSubtitle);
          p1.writeString(p0.mId);
          p1.writeString(p0.mUnit);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mScheme);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo getParcel(){
       return this.merchandiseItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable.write(this.merchandiseItemInfo$$0, p0, p1, new a());
    }
}
