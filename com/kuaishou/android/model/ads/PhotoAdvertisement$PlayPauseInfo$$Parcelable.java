package com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$PlayPauseInfo$$Parcelable implements Parcelable, d	// class@0009c4
{
    public PhotoAdvertisement$PlayPauseInfo playPauseInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PlayPauseInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PlayPauseInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PlayPauseInfo$$Parcelable(PhotoAdvertisement$PlayPauseInfo p0){
       super();
       this.playPauseInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PlayPauseInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PlayPauseInfo playPauseInf = new PhotoAdvertisement$PlayPauseInfo();
          p1.f(p1.g(), playPauseInf);
          playPauseInf.mTemplateId = p0.readString();
          p1.f(i, playPauseInf);
          return playPauseInf;
       }
    }
    public static void write(PhotoAdvertisement$PlayPauseInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PlayPauseInfo getParcel(){
       return this.playPauseInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PlayPauseInfo$$Parcelable.write(this.playPauseInfo$$0, p0, p1, new a());
    }
}