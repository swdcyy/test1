package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$PopARWinInfo$$Parcelable implements Parcelable, d	// class@0009d4
{
    public PhotoAdvertisement$PopARWinInfo popARWinInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopARWinInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PopARWinInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopARWinInfo$$Parcelable(PhotoAdvertisement$PopARWinInfo p0){
       super();
       this.popARWinInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PopARWinInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PopARWinInfo popARWinInfo = new PhotoAdvertisement$PopARWinInfo();
          p1.f(p1.g(), popARWinInfo);
          popARWinInfo.mWinImageUrl = p0.readString();
          popARWinInfo.mButtonTitle = p0.readString();
          popARWinInfo.mTitle = p0.readString();
          popARWinInfo.mSubTitle = p0.readString();
          p1.f(i, popARWinInfo);
          return popARWinInfo;
       }
    }
    public static void write(PhotoAdvertisement$PopARWinInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mWinImageUrl);
          p1.writeString(p0.mButtonTitle);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopARWinInfo getParcel(){
       return this.popARWinInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopARWinInfo$$Parcelable.write(this.popARWinInfo$$0, p0, p1, new a());
    }
}
