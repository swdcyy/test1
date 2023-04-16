package com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$H5ControlInfo$$Parcelable implements Parcelable, d	// class@00093f
{
    public PhotoAdvertisement$H5ControlInfo h5ControlInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$H5ControlInfo$$Parcelable.CREATOR = new PhotoAdvertisement$H5ControlInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$H5ControlInfo$$Parcelable(PhotoAdvertisement$H5ControlInfo p0){
       super();
       this.h5ControlInfo$$0 = p0;
    }
    public static PhotoAdvertisement$H5ControlInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$H5ControlInfo h5ControlInf = new PhotoAdvertisement$H5ControlInfo();
          p1.f(p1.g(), h5ControlInf);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          h5ControlInf.mEnableProfileRealTimeOpenDetailPage = b1;
          b1 = (p0.readInt() == 1)? true: false;
          h5ControlInf.mDisallowShowSslErrorDialog = b1;
          b1 = (p0.readInt() == 1)? true: false;
          h5ControlInf.mHideH5ReportEntrance = b1;
          h5ControlInf.mH5AutoJumpLimitedTimeMs = p0.readLong();
          h5ControlInf.mH5PreloadType = p0.readInt();
          h5ControlInf.mPreloadDelayTime = p0.readLong();
          b1 = (p0.readInt() == 1)? true: false;
          h5ControlInf.mIsDownloadLandingPageMould = b1;
          b1 = (p0.readInt() == 1)? true: false;
          h5ControlInf.mDisallowShowDownloadDialog = b1;
          h5ControlInf.mDeepLinkControlType = p0.readInt();
          h5ControlInf.mH5DisplayType = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          h5ControlInf.mShouldSuspendDeepLink = b;
          p1.f(i, h5ControlInf);
          return h5ControlInf;
       }
    }
    public static void write(PhotoAdvertisement$H5ControlInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableProfileRealTimeOpenDetailPage);
          p1.writeInt(p0.mDisallowShowSslErrorDialog);
          p1.writeInt(p0.mHideH5ReportEntrance);
          p1.writeLong(p0.mH5AutoJumpLimitedTimeMs);
          p1.writeInt(p0.mH5PreloadType);
          p1.writeLong(p0.mPreloadDelayTime);
          p1.writeInt(p0.mIsDownloadLandingPageMould);
          p1.writeInt(p0.mDisallowShowDownloadDialog);
          p1.writeInt(p0.mDeepLinkControlType);
          p1.writeInt(p0.mH5DisplayType);
          p1.writeInt(p0.mShouldSuspendDeepLink);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$H5ControlInfo getParcel(){
       return this.h5ControlInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$H5ControlInfo$$Parcelable.write(this.h5ControlInfo$$0, p0, p1, new a());
    }
}
