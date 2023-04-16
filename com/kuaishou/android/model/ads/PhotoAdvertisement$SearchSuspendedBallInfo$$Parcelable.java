package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$$Parcelable;

public class PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable implements Parcelable, d	// class@000a10
{
    public PhotoAdvertisement$SearchSuspendedBallInfo searchSuspendedBallInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable.CREATOR = new PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable(PhotoAdvertisement$SearchSuspendedBallInfo p0){
       super();
       this.searchSuspendedBallInfo$$0 = p0;
    }
    public static PhotoAdvertisement$SearchSuspendedBallInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$SearchSuspendedBallInfo searchSuspen = new PhotoAdvertisement$SearchSuspendedBallInfo();
          p1.f(p1.g(), searchSuspen);
          searchSuspen.mWeakStyle = PhotoAdvertisement$WeakStyle$$Parcelable.read(p0, p1);
          searchSuspen.mStrongStyle = PhotoAdvertisement$StrongStyle$$Parcelable.read(p0, p1);
          p1.f(i, searchSuspen);
          return searchSuspen;
       }
    }
    public static void write(PhotoAdvertisement$SearchSuspendedBallInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$WeakStyle$$Parcelable.write(p0.mWeakStyle, p1, p2, p3);
          PhotoAdvertisement$StrongStyle$$Parcelable.write(p0.mStrongStyle, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SearchSuspendedBallInfo getParcel(){
       return this.searchSuspendedBallInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable.write(this.searchSuspendedBallInfo$$0, p0, p1, new a());
    }
}
