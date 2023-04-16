package com.yxcorp.gifshow.corona.common.model.CoronaBannerFeedMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeedMeta$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeedMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;

public class CoronaBannerFeedMeta$$Parcelable implements Parcelable, d	// class@0011fe
{
    public CoronaBannerFeedMeta coronaBannerFeedMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaBannerFeedMeta$$Parcelable.CREATOR = new CoronaBannerFeedMeta$$Parcelable$a();
    }
    public void CoronaBannerFeedMeta$$Parcelable(CoronaBannerFeedMeta p0){
       super();
       this.coronaBannerFeedMeta$$0 = p0;
    }
    public static CoronaBannerFeedMeta read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaBannerFeedMeta uCoronaBanne = new CoronaBannerFeedMeta();
          p1.f(p1.g(), uCoronaBanne);
          uCoronaBanne.mUrl = p0.readString();
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
          uCoronaBanne.mImageUrls = uCDNUrlArray;
          uCoronaBanne.mBannerId = p0.readString();
          uCoronaBanne.mQPhoto = QPhoto$$Parcelable.read(p0, p1);
          uCoronaBanne.mMiniAppServerParams = p0.readString();
          uCoronaBanne.mEventName = p0.readString();
          uCoronaBanne.mName = p0.readString();
          uCoronaBanne.mExtLogParams = p0.readString();
          p1.f(i, uCoronaBanne);
          return uCoronaBanne;
       }
    }
    public static void write(CoronaBannerFeedMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          CoronaBannerFeedMeta mImageUrls = p0.mImageUrls;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.length);
             mImageUrls = p0.mImageUrls;
             i1 = mImageUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mImageUrls[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mBannerId);
          QPhoto$$Parcelable.write(p0.mQPhoto, p1, p2, p3);
          p1.writeString(p0.mMiniAppServerParams);
          p1.writeString(p0.mEventName);
          p1.writeString(p0.mName);
          p1.writeString(p0.mExtLogParams);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaBannerFeedMeta getParcel(){
       return this.coronaBannerFeedMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaBannerFeedMeta$$Parcelable.write(this.coronaBannerFeedMeta$$0, p0, p1, new a());
    }
}
