package com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable;

public class PhotoAdvertisement$PopPlayInfo$$Parcelable implements Parcelable, d	// class@0009d8
{
    public PhotoAdvertisement$PopPlayInfo popPlayInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopPlayInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PopPlayInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopPlayInfo$$Parcelable(PhotoAdvertisement$PopPlayInfo p0){
       super();
       this.popPlayInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PopPlayInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PopPlayInfo popPlayInfo = new PhotoAdvertisement$PopPlayInfo();
          p1.f(p1.g(), popPlayInfo);
          popPlayInfo.mDisplayDurMs = p0.readInt();
          popPlayInfo.mActionBarColorDelayMs = p0.readInt();
          popPlayInfo.mTemplateId = p0.readString();
          popPlayInfo.mShowWebDelayTimeMs = p0.readInt();
          popPlayInfo.mPopShowVideoInfo = PhotoAdvertisement$PopShowVideoInfo$$Parcelable.read(p0, p1);
          p1.f(i, popPlayInfo);
          return popPlayInfo;
       }
    }
    public static void write(PhotoAdvertisement$PopPlayInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mDisplayDurMs);
          p1.writeInt(p0.mActionBarColorDelayMs);
          p1.writeString(p0.mTemplateId);
          p1.writeInt(p0.mShowWebDelayTimeMs);
          PhotoAdvertisement$PopShowVideoInfo$$Parcelable.write(p0.mPopShowVideoInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopPlayInfo getParcel(){
       return this.popPlayInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopPlayInfo$$Parcelable.write(this.popPlayInfo$$0, p0, p1, new a());
    }
}
