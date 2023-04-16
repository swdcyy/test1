package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$NegativeMenu$$Parcelable implements Parcelable, d	// class@0009a8
{
    public PhotoAdvertisement$NegativeMenu negativeMenu$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$NegativeMenu$$Parcelable.CREATOR = new PhotoAdvertisement$NegativeMenu$$Parcelable$a();
    }
    public void PhotoAdvertisement$NegativeMenu$$Parcelable(PhotoAdvertisement$NegativeMenu p0){
       super();
       this.negativeMenu$$0 = p0;
    }
    public static PhotoAdvertisement$NegativeMenu read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$NegativeMenu negativeMenu = new PhotoAdvertisement$NegativeMenu();
          p1.f(p1.g(), negativeMenu);
          negativeMenu.name = p0.readString();
          negativeMenu.icon = p0.readString();
          negativeMenu.id = p0.readInt();
          negativeMenu.negativeType = p0.readInt();
          negativeMenu.url = p0.readString();
          negativeMenu.desc = p0.readString();
          negativeMenu.clickAction = p0.readInt();
          p1.f(i, negativeMenu);
          return negativeMenu;
       }
    }
    public static void write(PhotoAdvertisement$NegativeMenu p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.name);
          p1.writeString(p0.icon);
          p1.writeInt(p0.id);
          p1.writeInt(p0.negativeType);
          p1.writeString(p0.url);
          p1.writeString(p0.desc);
          p1.writeInt(p0.clickAction);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$NegativeMenu getParcel(){
       return this.negativeMenu$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$NegativeMenu$$Parcelable.write(this.negativeMenu$$0, p0, p1, new a());
    }
}
