package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$PrivacyData$$Parcelable implements Parcelable, d	// class@0009e6
{
    public PhotoAdvertisement$PrivacyData privacyData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PrivacyData$$Parcelable.CREATOR = new PhotoAdvertisement$PrivacyData$$Parcelable$a();
    }
    public void PhotoAdvertisement$PrivacyData$$Parcelable(PhotoAdvertisement$PrivacyData p0){
       super();
       this.privacyData$$0 = p0;
    }
    public static PhotoAdvertisement$PrivacyData read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PrivacyData privacyData = new PhotoAdvertisement$PrivacyData();
          p1.f(p1.g(), privacyData);
          privacyData.mPackageSize = p0.readDouble();
          privacyData.mAppVersion = p0.readString();
          privacyData.mDeveloper = p0.readString();
          privacyData.mAppName = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$HalfPrivacyLink$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          privacyData.mLinks = list;
          p1.f(i, privacyData);
          return privacyData;
       }
    }
    public static void write(PhotoAdvertisement$PrivacyData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeDouble(p0.mPackageSize);
          p1.writeString(p0.mAppVersion);
          p1.writeString(p0.mDeveloper);
          p1.writeString(p0.mAppName);
          PhotoAdvertisement$PrivacyData mLinks = p0.mLinks;
          if (mLinks == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLinks.size());
             Iterator iterator = p0.mLinks.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$HalfPrivacyLink$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PrivacyData getParcel(){
       return this.privacyData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PrivacyData$$Parcelable.write(this.privacyData$$0, p0, p1, new a());
    }
}
