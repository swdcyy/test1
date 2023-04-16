package com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TryGameInfo$$Parcelable implements Parcelable, d	// class@000a4c
{
    public PhotoAdvertisement$TryGameInfo tryGameInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TryGameInfo$$Parcelable.CREATOR = new PhotoAdvertisement$TryGameInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$TryGameInfo$$Parcelable(PhotoAdvertisement$TryGameInfo p0){
       super();
       this.tryGameInfo$$0 = p0;
    }
    public static PhotoAdvertisement$TryGameInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TryGameInfo tryGameInfo = new PhotoAdvertisement$TryGameInfo();
          p1.f(p1.g(), tryGameInfo);
          tryGameInfo.mPlayType = p0.readInt();
          tryGameInfo.mGameInfo = p0.readString();
          p1.f(i, tryGameInfo);
          return tryGameInfo;
       }
    }
    public static void write(PhotoAdvertisement$TryGameInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPlayType);
          p1.writeString(p0.mGameInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$TryGameInfo getParcel(){
       return this.tryGameInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TryGameInfo$$Parcelable.write(this.tryGameInfo$$0, p0, p1, new a());
    }
}
