package com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$AdApkMd5Info$$Parcelable implements Parcelable, d	// class@000888
{
    public PhotoAdvertisement$AdApkMd5Info adApkMd5Info$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdApkMd5Info$$Parcelable.CREATOR = new PhotoAdvertisement$AdApkMd5Info$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdApkMd5Info$$Parcelable(PhotoAdvertisement$AdApkMd5Info p0){
       super();
       this.adApkMd5Info$$0 = p0;
    }
    public static PhotoAdvertisement$AdApkMd5Info read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdApkMd5Info uAdApkMd5Inf = new PhotoAdvertisement$AdApkMd5Info();
          p1.f(p1.g(), uAdApkMd5Inf);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          uAdApkMd5Inf.mApkMd5s = list;
          uAdApkMd5Inf.mUnexpectedMd5Strategy = p0.readInt();
          p1.f(i, uAdApkMd5Inf);
          return uAdApkMd5Inf;
       }
    }
    public static void write(PhotoAdvertisement$AdApkMd5Info p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$AdApkMd5Info mApkMd5s = p0.mApkMd5s;
          if (mApkMd5s == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mApkMd5s.size());
             Iterator iterator = p0.mApkMd5s.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mUnexpectedMd5Strategy);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdApkMd5Info getParcel(){
       return this.adApkMd5Info$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdApkMd5Info$$Parcelable.write(this.adApkMd5Info$$0, p0, p1, new a());
    }
}
