package com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AppLinkToastInfo$$Parcelable implements Parcelable, d	// class@0008c7
{
    public PhotoAdvertisement$AppLinkToastInfo appLinkToastInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AppLinkToastInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AppLinkToastInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AppLinkToastInfo$$Parcelable(PhotoAdvertisement$AppLinkToastInfo p0){
       super();
       this.appLinkToastInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AppLinkToastInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AppLinkToastInfo uAppLinkToas = new PhotoAdvertisement$AppLinkToastInfo();
          p1.f(p1.g(), uAppLinkToas);
          uAppLinkToas.mDuration = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uAppLinkToas.mEnableShowToast = b;
          uAppLinkToas.mText = p0.readString();
          p1.f(i, uAppLinkToas);
          return uAppLinkToas;
       }
    }
    public static void write(PhotoAdvertisement$AppLinkToastInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mDuration);
          p1.writeInt(p0.mEnableShowToast);
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AppLinkToastInfo getParcel(){
       return this.appLinkToastInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AppLinkToastInfo$$Parcelable.write(this.appLinkToastInfo$$0, p0, p1, new a());
    }
}
