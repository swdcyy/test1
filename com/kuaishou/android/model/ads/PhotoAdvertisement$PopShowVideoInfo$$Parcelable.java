package com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class PhotoAdvertisement$PopShowVideoInfo$$Parcelable implements Parcelable, d	// class@0009dc
{
    public PhotoAdvertisement$PopShowVideoInfo popShowVideoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopShowVideoInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PopShowVideoInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopShowVideoInfo$$Parcelable(PhotoAdvertisement$PopShowVideoInfo p0){
       super();
       this.popShowVideoInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PopShowVideoInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PopShowVideoInfo popShowVideo = new PhotoAdvertisement$PopShowVideoInfo();
          p1.f(p1.g(), popShowVideo);
          popShowVideo.mVideoWidth = p0.readInt();
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
          popShowVideo.mVideoUrls = uCDNUrlArray;
          popShowVideo.mVideoHeight = p0.readInt();
          p1.f(i, popShowVideo);
          return popShowVideo;
       }
    }
    public static void write(PhotoAdvertisement$PopShowVideoInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mVideoWidth);
          PhotoAdvertisement$PopShowVideoInfo mVideoUrls = p0.mVideoUrls;
          if (mVideoUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mVideoUrls.length);
             mVideoUrls = p0.mVideoUrls;
             i1 = mVideoUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mVideoUrls[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mVideoHeight);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopShowVideoInfo getParcel(){
       return this.popShowVideoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopShowVideoInfo$$Parcelable.write(this.popShowVideoInfo$$0, p0, p1, new a());
    }
}
