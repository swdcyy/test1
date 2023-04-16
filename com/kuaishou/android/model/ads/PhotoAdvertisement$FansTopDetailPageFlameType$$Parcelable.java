package com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import java.lang.Enum;

public class PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable implements Parcelable, d	// class@000933
{
    public PhotoAdvertisement$FansTopDetailPageFlameType fansTopDetailPageFlameType$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable.CREATOR = new PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable$a();
    }
    public void PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable(PhotoAdvertisement$FansTopDetailPageFlameType p0){
       super();
       this.fansTopDetailPageFlameType$$0 = p0;
    }
    public static PhotoAdvertisement$FansTopDetailPageFlameType read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          String str = p0.readString();
          PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta = (str == null)? null: Enum.valueOf(PhotoAdvertisement$FansTopDetailPageFlameType.class, str);
          p1.f(i, uFansTopDeta);
          return uFansTopDeta;
       }
    }
    public static void write(PhotoAdvertisement$FansTopDetailPageFlameType p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          String str = (p0 == null)? null: p0.name();
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$FansTopDetailPageFlameType getParcel(){
       return this.fansTopDetailPageFlameType$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$FansTopDetailPageFlameType$$Parcelable.write(this.fansTopDetailPageFlameType$$0, p0, p1, new a());
    }
}
