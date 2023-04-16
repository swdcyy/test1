package com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$DanmakuInfo$$Parcelable implements Parcelable, d	// class@00091b
{
    public PhotoAdvertisement$DanmakuInfo danmakuInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$DanmakuInfo$$Parcelable.CREATOR = new PhotoAdvertisement$DanmakuInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$DanmakuInfo$$Parcelable(PhotoAdvertisement$DanmakuInfo p0){
       super();
       this.danmakuInfo$$0 = p0;
    }
    public static PhotoAdvertisement$DanmakuInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$DanmakuInfo uDanmakuInfo = new PhotoAdvertisement$DanmakuInfo();
          p1.f(p1.g(), uDanmakuInfo);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uDanmakuInfo.mEnableDanmaku = b;
          uDanmakuInfo.mAdInfo = p0.readString();
          p1.f(i, uDanmakuInfo);
          return uDanmakuInfo;
       }
    }
    public static void write(PhotoAdvertisement$DanmakuInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableDanmaku);
          p1.writeString(p0.mAdInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$DanmakuInfo getParcel(){
       return this.danmakuInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$DanmakuInfo$$Parcelable.write(this.danmakuInfo$$0, p0, p1, new a());
    }
}
