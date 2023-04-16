package com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$$Parcelable;

public class PhotoAdvertisement$PendantInfo$$Parcelable implements Parcelable, d	// class@0009bc
{
    public PhotoAdvertisement$PendantInfo pendantInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PendantInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PendantInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PendantInfo$$Parcelable(PhotoAdvertisement$PendantInfo p0){
       super();
       this.pendantInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PendantInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PendantInfo pendantInfo = new PhotoAdvertisement$PendantInfo();
          p1.f(p1.g(), pendantInfo);
          pendantInfo.mCoverUrl = p0.readString();
          pendantInfo.mLayout = PhotoAdvertisement$Layout$$Parcelable.read(p0, p1);
          pendantInfo.mLandingPageUrl = p0.readString();
          pendantInfo.mDeepLink = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          pendantInfo.mIsUsePendantInfoInActionBar = b;
          p1.f(i, pendantInfo);
          return pendantInfo;
       }
    }
    public static void write(PhotoAdvertisement$PendantInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCoverUrl);
          PhotoAdvertisement$Layout$$Parcelable.write(p0.mLayout, p1, p2, p3);
          p1.writeString(p0.mLandingPageUrl);
          p1.writeString(p0.mDeepLink);
          p1.writeInt(p0.mIsUsePendantInfoInActionBar);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PendantInfo getParcel(){
       return this.pendantInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PendantInfo$$Parcelable.write(this.pendantInfo$$0, p0, p1, new a());
    }
}
