package com.kuaishou.android.model.ads.PhotoAdvertisement$Product$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$Product$$Parcelable implements Parcelable, d	// class@0009ee
{
    public PhotoAdvertisement$Product product$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$Product$$Parcelable.CREATOR = new PhotoAdvertisement$Product$$Parcelable$a();
    }
    public void PhotoAdvertisement$Product$$Parcelable(PhotoAdvertisement$Product p0){
       super();
       this.product$$0 = p0;
    }
    public static PhotoAdvertisement$Product read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$Product product = new PhotoAdvertisement$Product();
          p1.f(p1.g(), product);
          product.imgUrl = p0.readString();
          product.productId = p0.readString();
          product.price = p0.readString();
          product.linkUrl = p0.readString();
          product.tag = p0.readString();
          product.title = p0.readString();
          product.pricePrefix = p0.readString();
          p1.f(i, product);
          return product;
       }
    }
    public static void write(PhotoAdvertisement$Product p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.imgUrl);
          p1.writeString(p0.productId);
          p1.writeString(p0.price);
          p1.writeString(p0.linkUrl);
          p1.writeString(p0.tag);
          p1.writeString(p0.title);
          p1.writeString(p0.pricePrefix);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$Product getParcel(){
       return this.product$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$Product$$Parcelable.write(this.product$$0, p0, p1, new a());
    }
}
