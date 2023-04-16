package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable implements Parcelable, d	// class@00099a
{
    public PhotoAdvertisement$MerchandiseInfo$DiscountInfo discountInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable.CREATOR = new PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo$DiscountInfo p0){
       super();
       this.discountInfo$$0 = p0;
    }
    public static PhotoAdvertisement$MerchandiseInfo$DiscountInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$MerchandiseInfo$DiscountInfo merchandiseI = new PhotoAdvertisement$MerchandiseInfo$DiscountInfo();
          p1.f(p1.g(), merchandiseI);
          merchandiseI.mPrice = p0.readString();
          merchandiseI.mUrl = p0.readString();
          merchandiseI.mMerchandiseTitle = p0.readString();
          merchandiseI.mAction = p0.readString();
          merchandiseI.mUnit = p0.readString();
          merchandiseI.mTitle = p0.readString();
          merchandiseI.mLeftTopLabel = p0.readString();
          merchandiseI.mSubTitle = p0.readString();
          merchandiseI.mBgUrl = p0.readString();
          merchandiseI.mScheme = p0.readString();
          p1.f(i, merchandiseI);
          return merchandiseI;
       }
    }
    public static void write(PhotoAdvertisement$MerchandiseInfo$DiscountInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPrice);
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mMerchandiseTitle);
          p1.writeString(p0.mAction);
          p1.writeString(p0.mUnit);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mLeftTopLabel);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mBgUrl);
          p1.writeString(p0.mScheme);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$MerchandiseInfo$DiscountInfo getParcel(){
       return this.discountInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable.write(this.discountInfo$$0, p0, p1, new a());
    }
}
