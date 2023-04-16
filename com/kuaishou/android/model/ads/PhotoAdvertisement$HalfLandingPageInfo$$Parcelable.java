package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$$Parcelable;

public class PhotoAdvertisement$HalfLandingPageInfo$$Parcelable implements Parcelable, d	// class@00094b
{
    public PhotoAdvertisement$HalfLandingPageInfo halfLandingPageInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HalfLandingPageInfo$$Parcelable.CREATOR = new PhotoAdvertisement$HalfLandingPageInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$HalfLandingPageInfo$$Parcelable(PhotoAdvertisement$HalfLandingPageInfo p0){
       super();
       this.halfLandingPageInfo$$0 = p0;
    }
    public static PhotoAdvertisement$HalfLandingPageInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$HalfLandingPageInfo halfLandingP = new PhotoAdvertisement$HalfLandingPageInfo();
          p1.f(p1.g(), halfLandingP);
          halfLandingP.mActionbarColor = p0.readString();
          halfLandingP.mSiteId = p0.readLong();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          halfLandingP.preLoad = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          halfLandingP.mShowHalfLandingPage = b;
          halfLandingP.mHalfLandingData = PhotoAdvertisement$HalfLandingData$$Parcelable.read(p0, p1);
          p1.f(i, halfLandingP);
          return halfLandingP;
       }
    }
    public static void write(PhotoAdvertisement$HalfLandingPageInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mActionbarColor);
          p1.writeLong(p0.mSiteId);
          p1.writeInt(p0.preLoad);
          p1.writeInt(p0.mShowHalfLandingPage);
          PhotoAdvertisement$HalfLandingData$$Parcelable.write(p0.mHalfLandingData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$HalfLandingPageInfo getParcel(){
       return this.halfLandingPageInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HalfLandingPageInfo$$Parcelable.write(this.halfLandingPageInfo$$0, p0, p1, new a());
    }
}
