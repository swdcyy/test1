package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$AdWeakData$$Parcelable implements Parcelable, d	// class@0008b7
{
    public PhotoAdvertisement$AdWeakData adWeakData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdWeakData$$Parcelable.CREATOR = new PhotoAdvertisement$AdWeakData$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdWeakData$$Parcelable(PhotoAdvertisement$AdWeakData p0){
       super();
       this.adWeakData$$0 = p0;
    }
    public static PhotoAdvertisement$AdWeakData read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdWeakData uAdWeakData = new PhotoAdvertisement$AdWeakData();
          p1.f(p1.g(), uAdWeakData);
          uAdWeakData.mWeakStyleType = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$DownloadInfo$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uAdWeakData.mDownloadInfo = list;
          uAdWeakData.mActionIconUrl = p0.readString();
          uAdWeakData.mIconUrl = p0.readString();
          p1.f(i, uAdWeakData);
          return uAdWeakData;
       }
    }
    public static void write(PhotoAdvertisement$AdWeakData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mWeakStyleType);
          PhotoAdvertisement$AdWeakData mDownloadInf = p0.mDownloadInfo;
          if (mDownloadInf == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDownloadInf.size());
             Iterator iterator = p0.mDownloadInfo.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$DownloadInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mActionIconUrl);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdWeakData getParcel(){
       return this.adWeakData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdWeakData$$Parcelable.write(this.adWeakData$$0, p0, p1, new a());
    }
}
