package com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$SmallShopConfig$$Parcelable implements Parcelable, d	// class@000a1e
{
    public PhotoAdvertisement$SmallShopConfig smallShopConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SmallShopConfig$$Parcelable.CREATOR = new PhotoAdvertisement$SmallShopConfig$$Parcelable$a();
    }
    public void PhotoAdvertisement$SmallShopConfig$$Parcelable(PhotoAdvertisement$SmallShopConfig p0){
       super();
       this.smallShopConfig$$0 = p0;
    }
    public static PhotoAdvertisement$SmallShopConfig read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$SmallShopConfig smallShopCon = new PhotoAdvertisement$SmallShopConfig();
          p1.f(p1.g(), smallShopCon);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$Product$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          smallShopCon.products = list;
          p1.f(i, smallShopCon);
          return smallShopCon;
       }
    }
    public static void write(PhotoAdvertisement$SmallShopConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$SmallShopConfig products = p0.products;
          if (products == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(products.size());
             Iterator iterator = p0.products.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$Product$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SmallShopConfig getParcel(){
       return this.smallShopConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SmallShopConfig$$Parcelable.write(this.smallShopConfig$$0, p0, p1, new a());
    }
}
