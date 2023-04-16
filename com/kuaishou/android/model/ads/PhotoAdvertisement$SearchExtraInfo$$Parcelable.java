package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$$Parcelable;

public class PhotoAdvertisement$SearchExtraInfo$$Parcelable implements Parcelable, d	// class@000a0c
{
    public PhotoAdvertisement$SearchExtraInfo searchExtraInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SearchExtraInfo$$Parcelable.CREATOR = new PhotoAdvertisement$SearchExtraInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$SearchExtraInfo$$Parcelable(PhotoAdvertisement$SearchExtraInfo p0){
       super();
       this.searchExtraInfo$$0 = p0;
    }
    public static PhotoAdvertisement$SearchExtraInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$SearchExtraInfo searchExtraI = new PhotoAdvertisement$SearchExtraInfo();
          p1.f(p1.g(), searchExtraI);
          searchExtraI.mLiveGoodsInfo = PhotoAdvertisement$LiveGoodsInfo$$Parcelable.read(p0, p1);
          p1.f(i, searchExtraI);
          return searchExtraI;
       }
    }
    public static void write(PhotoAdvertisement$SearchExtraInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$LiveGoodsInfo$$Parcelable.write(p0.mLiveGoodsInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SearchExtraInfo getParcel(){
       return this.searchExtraInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SearchExtraInfo$$Parcelable.write(this.searchExtraInfo$$0, p0, p1, new a());
    }
}
