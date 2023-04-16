package com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$LiveGoodsInfo$$Parcelable implements Parcelable, d	// class@000994
{
    public PhotoAdvertisement$LiveGoodsInfo liveGoodsInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$LiveGoodsInfo$$Parcelable.CREATOR = new PhotoAdvertisement$LiveGoodsInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$LiveGoodsInfo$$Parcelable(PhotoAdvertisement$LiveGoodsInfo p0){
       super();
       this.liveGoodsInfo$$0 = p0;
    }
    public static PhotoAdvertisement$LiveGoodsInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$LiveGoodsInfo liveGoodsInf = new PhotoAdvertisement$LiveGoodsInfo();
          p1.f(p1.g(), liveGoodsInf);
          liveGoodsInf.mCoverUrl = p0.readString();
          liveGoodsInf.mExplainStatus = p0.readString();
          liveGoodsInf.mSuffixTag = p0.readString();
          liveGoodsInf.mTitle = p0.readString();
          liveGoodsInf.mPricePrefix = p0.readString();
          liveGoodsInf.mPriceNum = p0.readString();
          p1.f(i, liveGoodsInf);
          return liveGoodsInf;
       }
    }
    public static void write(PhotoAdvertisement$LiveGoodsInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCoverUrl);
          p1.writeString(p0.mExplainStatus);
          p1.writeString(p0.mSuffixTag);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mPricePrefix);
          p1.writeString(p0.mPriceNum);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$LiveGoodsInfo getParcel(){
       return this.liveGoodsInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$LiveGoodsInfo$$Parcelable.write(this.liveGoodsInfo$$0, p0, p1, new a());
    }
}
