package com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ActionbarInfo$$Parcelable implements Parcelable, d	// class@000884
{
    public PhotoAdvertisement$ActionbarInfo actionbarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ActionbarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ActionbarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ActionbarInfo$$Parcelable(PhotoAdvertisement$ActionbarInfo p0){
       super();
       this.actionbarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ActionbarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ActionbarInfo uActionbarIn = new PhotoAdvertisement$ActionbarInfo();
          p1.f(p1.g(), uActionbarIn);
          uActionbarIn.mActionBarHideProportion = p0.readDouble();
          uActionbarIn.mColorDelayTime = p0.readLong();
          uActionbarIn.mTemplateId = p0.readString();
          uActionbarIn.mActionBarLoadTime = p0.readInt();
          uActionbarIn.mActionbarTag = p0.readString();
          uActionbarIn.mAnimationStyle = p0.readInt();
          uActionbarIn.mAnimationDelayTime = p0.readLong();
          uActionbarIn.mActionbarStyle = p0.readString();
          uActionbarIn.mDisplayInfo = p0.readString();
          uActionbarIn.mDownloadedBarLoadTime = p0.readInt();
          uActionbarIn.mActionBarLocation = p0.readInt();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uActionbarIn.mEnableHideActionBar = b1;
          uActionbarIn.mActionBarColor = p0.readString();
          uActionbarIn.mConvertedDescription = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uActionbarIn.mWithoutFloatingToComment = b;
          p1.f(i, uActionbarIn);
          return uActionbarIn;
       }
    }
    public static void write(PhotoAdvertisement$ActionbarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeDouble(p0.mActionBarHideProportion);
          p1.writeLong(p0.mColorDelayTime);
          p1.writeString(p0.mTemplateId);
          p1.writeInt(p0.mActionBarLoadTime);
          p1.writeString(p0.mActionbarTag);
          p1.writeInt(p0.mAnimationStyle);
          p1.writeLong(p0.mAnimationDelayTime);
          p1.writeString(p0.mActionbarStyle);
          p1.writeString(p0.mDisplayInfo);
          p1.writeInt(p0.mDownloadedBarLoadTime);
          p1.writeInt(p0.mActionBarLocation);
          p1.writeInt(p0.mEnableHideActionBar);
          p1.writeString(p0.mActionBarColor);
          p1.writeString(p0.mConvertedDescription);
          p1.writeInt(p0.mWithoutFloatingToComment);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ActionbarInfo getParcel(){
       return this.actionbarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ActionbarInfo$$Parcelable.write(this.actionbarInfo$$0, p0, p1, new a());
    }
}
