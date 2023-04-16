package com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse$$Parcelable$a;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class DownloadPhotoInfoResponse$$Parcelable implements Parcelable, d	// class@000ecd
{
    public DownloadPhotoInfoResponse downloadPhotoInfoResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DownloadPhotoInfoResponse$$Parcelable.CREATOR = new DownloadPhotoInfoResponse$$Parcelable$a();
    }
    public void DownloadPhotoInfoResponse$$Parcelable(DownloadPhotoInfoResponse p0){
       super();
       this.downloadPhotoInfoResponse$$0 = p0;
    }
    public static DownloadPhotoInfoResponse read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DownloadPhotoInfoResponse uDownloadPho = new DownloadPhotoInfoResponse();
          p1.f(p1.g(), uDownloadPho);
          uDownloadPho.mDownloadUrl = p0.readString();
          uDownloadPho.mVideoSize = p0.readLong();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uDownloadPho.mShowCancelButton = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDownloadPho.mHasWatermark = b1;
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (int i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uDownloadPho.mDownloadUrls = uCDNUrlArray1;
          b1 = (p0.readInt() == 1)? true: false;
          uDownloadPho.mShowDownloadGuide = b1;
          uDownloadPho.mSharePlatform = p0.readString();
          uDownloadPho.mErrorMsg = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          uDownloadPho.mNotNeedWaterMark = b1;
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uDownloadPho.mVideoUrls = uCDNUrlArray;
          b1 = (p0.readInt() == 1)? true: false;
          uDownloadPho.mIsRedPack = b1;
          uDownloadPho.mVideoUrl = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uDownloadPho.mPhotoDownloadDeny = b;
          p1.f(i, uDownloadPho);
          return uDownloadPho;
       }
    }
    public static void write(DownloadPhotoInfoResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDownloadUrl);
          p1.writeLong(p0.mVideoSize);
          p1.writeInt(p0.mShowCancelButton);
          p1.writeInt(p0.mHasWatermark);
          DownloadPhotoInfoResponse mDownloadUrl = p0.mDownloadUrls;
          int i2 = 0;
          if (mDownloadUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDownloadUrl.length);
             mDownloadUrl = p0.mDownloadUrls;
             int len = mDownloadUrl.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mDownloadUrl[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mShowDownloadGuide);
          p1.writeString(p0.mSharePlatform);
          p1.writeString(p0.mErrorMsg);
          p1.writeInt(p0.mNotNeedWaterMark);
          mDownloadUrl = p0.mVideoUrls;
          if (mDownloadUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDownloadUrl.length);
             mDownloadUrl = p0.mVideoUrls;
             i1 = mDownloadUrl.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mDownloadUrl[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsRedPack);
          p1.writeString(p0.mVideoUrl);
          p1.writeInt(p0.mPhotoDownloadDeny);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DownloadPhotoInfoResponse getParcel(){
       return this.downloadPhotoInfoResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DownloadPhotoInfoResponse$$Parcelable.write(this.downloadPhotoInfoResponse$$0, p0, p1, new a());
    }
}
