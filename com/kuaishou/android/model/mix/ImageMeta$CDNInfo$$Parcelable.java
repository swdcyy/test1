package com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ImageMeta$CDNInfo$$Parcelable implements Parcelable, d	// class@000cd1
{
    public ImageMeta$CDNInfo cDNInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImageMeta$CDNInfo$$Parcelable.CREATOR = new ImageMeta$CDNInfo$$Parcelable$a();
    }
    public void ImageMeta$CDNInfo$$Parcelable(ImageMeta$CDNInfo p0){
       super();
       this.cDNInfo$$0 = p0;
    }
    public static ImageMeta$CDNInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ImageMeta$CDNInfo uCDNInfo = new ImageMeta$CDNInfo();
          p1.f(p1.g(), uCDNInfo);
          uCDNInfo.mCdn = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCDNInfo.mUseHttps = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uCDNInfo.mIsFreeTraffic = b;
          p1.f(i, uCDNInfo);
          return uCDNInfo;
       }
    }
    public static void write(ImageMeta$CDNInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCdn);
          p1.writeInt(p0.mUseHttps);
          p1.writeInt(p0.mIsFreeTraffic);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImageMeta$CDNInfo getParcel(){
       return this.cDNInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImageMeta$CDNInfo$$Parcelable.write(this.cDNInfo$$0, p0, p1, new a());
    }
}