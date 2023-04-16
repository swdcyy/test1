package com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$VideoClipInfo$$Parcelable implements Parcelable, d	// class@000a59
{
    public PhotoAdvertisement$VideoClipInfo videoClipInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$VideoClipInfo$$Parcelable.CREATOR = new PhotoAdvertisement$VideoClipInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$VideoClipInfo$$Parcelable(PhotoAdvertisement$VideoClipInfo p0){
       super();
       this.videoClipInfo$$0 = p0;
    }
    public static PhotoAdvertisement$VideoClipInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$VideoClipInfo videoClipInf = new PhotoAdvertisement$VideoClipInfo();
          p1.f(p1.g(), videoClipInf);
          videoClipInf.mClipType = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          videoClipInf.mNormalPlayerUseAdClipRule = b;
          p1.f(i, videoClipInf);
          return videoClipInf;
       }
    }
    public static void write(PhotoAdvertisement$VideoClipInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mClipType);
          p1.writeInt(p0.mNormalPlayerUseAdClipRule);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$VideoClipInfo getParcel(){
       return this.videoClipInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$VideoClipInfo$$Parcelable.write(this.videoClipInfo$$0, p0, p1, new a());
    }
}
