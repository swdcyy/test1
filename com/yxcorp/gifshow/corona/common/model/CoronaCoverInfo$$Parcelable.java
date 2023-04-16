package com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class CoronaCoverInfo$$Parcelable implements Parcelable, d	// class@00120e
{
    public CoronaCoverInfo coronaCoverInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaCoverInfo$$Parcelable.CREATOR = new CoronaCoverInfo$$Parcelable$a();
    }
    public void CoronaCoverInfo$$Parcelable(CoronaCoverInfo p0){
       super();
       this.coronaCoverInfo$$0 = p0;
    }
    public static CoronaCoverInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaCoverInfo uCoronaCover = new CoronaCoverInfo();
          p1.f(p1.g(), uCoronaCover);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaCover.mPhotoStaticCoverUrls = uCDNUrlArray1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaCover.mPhotoPlayingCoverUrls = uCDNUrlArray;
          p1.f(i, uCoronaCover);
          return uCoronaCover;
       }
    }
    public static void write(CoronaCoverInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaCoverInfo mPhotoStatic = p0.mPhotoStaticCoverUrls;
          int i2 = 0;
          if (mPhotoStatic == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoStatic.length);
             mPhotoStatic = p0.mPhotoStaticCoverUrls;
             int len = mPhotoStatic.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mPhotoStatic[i3], p1, p2, p3);
             }
          }
          mPhotoStatic = p0.mPhotoPlayingCoverUrls;
          if (mPhotoStatic == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoStatic.length);
             p0 = p0.mPhotoPlayingCoverUrls;
             i = p0.length;
             for (; i2 < i; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(p0[i2], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaCoverInfo getParcel(){
       return this.coronaCoverInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaCoverInfo$$Parcelable.write(this.coronaCoverInfo$$0, p0, p1, new a());
    }
}
