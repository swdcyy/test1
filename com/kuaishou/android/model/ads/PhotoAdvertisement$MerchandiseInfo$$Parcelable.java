package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$MerchandiseInfo$$Parcelable implements Parcelable, d	// class@000998
{
    public PhotoAdvertisement$MerchandiseInfo merchandiseInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$MerchandiseInfo$$Parcelable.CREATOR = new PhotoAdvertisement$MerchandiseInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$MerchandiseInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo p0){
       super();
       this.merchandiseInfo$$0 = p0;
    }
    public static PhotoAdvertisement$MerchandiseInfo read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$MerchandiseInfo merchandiseI = new PhotoAdvertisement$MerchandiseInfo();
          p1.f(p1.g(), merchandiseI);
          merchandiseI.mCarouselTime = p0.readLong();
          boolean i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable.read(p0, p1));
             }
          }
          merchandiseI.mDiscountInfoList = list1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable.read(p0, p1));
             }
          }
          merchandiseI.mMerchandiseItemInfoList = list;
          merchandiseI.mCardShowTime = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          merchandiseI.mCardDelayReplay = i1;
          merchandiseI.mCardType = p0.readInt();
          merchandiseI.mCardUrl = p0.readString();
          merchandiseI.mCardDelayTime = p0.readLong();
          merchandiseI.mCardData = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          merchandiseI.mHideCloseButton = b;
          p1.f(i, merchandiseI);
          return merchandiseI;
       }
    }
    public static void write(PhotoAdvertisement$MerchandiseInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mCarouselTime);
          PhotoAdvertisement$MerchandiseInfo mDiscountInf = p0.mDiscountInfoList;
          if (mDiscountInf == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDiscountInf.size());
             iterator = p0.mDiscountInfoList.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mDiscountInf = p0.mMerchandiseItemInfoList;
          if (mDiscountInf == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDiscountInf.size());
             iterator = p0.mMerchandiseItemInfoList.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
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
    public PhotoAdvertisement$MerchandiseInfo getParcel(){
       return this.merchandiseInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$MerchandiseInfo$$Parcelable.write(this.merchandiseInfo$$0, p0, p1, new a());
    }
}
