package com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TVCActionBarInfo$$Parcelable implements Parcelable, d	// class@000a2a
{
    public PhotoAdvertisement$TVCActionBarInfo tVCActionBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TVCActionBarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$TVCActionBarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$TVCActionBarInfo$$Parcelable(PhotoAdvertisement$TVCActionBarInfo p0){
       super();
       this.tVCActionBarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$TVCActionBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TVCActionBarInfo tVCActionBar = new PhotoAdvertisement$TVCActionBarInfo();
          p1.f(p1.g(), tVCActionBar);
          tVCActionBar.mDisplayInfo = p0.readString();
          tVCActionBar.mActionBarColor = p0.readString();
          tVCActionBar.mTitle = p0.readString();
          tVCActionBar.mBackgroundUrl = p0.readString();
          tVCActionBar.mIconUrl = p0.readString();
          tVCActionBar.mSubTitle = p0.readString();
          p1.f(i, tVCActionBar);
          return tVCActionBar;
       }
    }
    public static void write(PhotoAdvertisement$TVCActionBarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDisplayInfo);
          p1.writeString(p0.mActionBarColor);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mBackgroundUrl);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$TVCActionBarInfo getParcel(){
       return this.tVCActionBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TVCActionBarInfo$$Parcelable.write(this.tVCActionBarInfo$$0, p0, p1, new a());
    }
}
