package com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$JumpLiveInfo$$Parcelable implements Parcelable, d	// class@000987
{
    public PhotoAdvertisement$JumpLiveInfo jumpLiveInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$JumpLiveInfo$$Parcelable.CREATOR = new PhotoAdvertisement$JumpLiveInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$JumpLiveInfo$$Parcelable(PhotoAdvertisement$JumpLiveInfo p0){
       super();
       this.jumpLiveInfo$$0 = p0;
    }
    public static PhotoAdvertisement$JumpLiveInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$JumpLiveInfo jumpLiveInfo = new PhotoAdvertisement$JumpLiveInfo();
          p1.f(p1.g(), jumpLiveInfo);
          jumpLiveInfo.mBindAdToLiveStreamIds = p0.readString();
          jumpLiveInfo.mLiveStreamIds = p0.readString();
          jumpLiveInfo.mToLiveType = p0.readInt();
          p1.f(i, jumpLiveInfo);
          return jumpLiveInfo;
       }
    }
    public static void write(PhotoAdvertisement$JumpLiveInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mBindAdToLiveStreamIds);
          p1.writeString(p0.mLiveStreamIds);
          p1.writeInt(p0.mToLiveType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$JumpLiveInfo getParcel(){
       return this.jumpLiveInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$JumpLiveInfo$$Parcelable.write(this.jumpLiveInfo$$0, p0, p1, new a());
    }
}
