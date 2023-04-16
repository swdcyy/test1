package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class PhotoAdvertisement$AdCover$$Parcelable implements Parcelable, d	// class@00089c
{
    public PhotoAdvertisement$AdCover adCover$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdCover$$Parcelable.CREATOR = new PhotoAdvertisement$AdCover$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdCover$$Parcelable(PhotoAdvertisement$AdCover p0){
       super();
       this.adCover$$0 = p0;
    }
    public static PhotoAdvertisement$AdCover read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdCover uAdCover = new PhotoAdvertisement$AdCover();
          p1.f(p1.g(), uAdCover);
          uAdCover.mHeight = p0.readInt();
          uAdCover.mWidth = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          uAdCover.mCoverUrls = uCDNUrlArray;
          p1.f(i, uAdCover);
          return uAdCover;
       }
    }
    public static void write(PhotoAdvertisement$AdCover p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mWidth);
          PhotoAdvertisement$AdCover mCoverUrls = p0.mCoverUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.length);
             p0 = p0.mCoverUrls;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdCover getParcel(){
       return this.adCover$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdCover$$Parcelable.write(this.adCover$$0, p0, p1, new a());
    }
}
