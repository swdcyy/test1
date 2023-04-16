package com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$HeaderData$$Parcelable implements Parcelable, d	// class@000957
{
    public PhotoAdvertisement$HeaderData headerData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HeaderData$$Parcelable.CREATOR = new PhotoAdvertisement$HeaderData$$Parcelable$a();
    }
    public void PhotoAdvertisement$HeaderData$$Parcelable(PhotoAdvertisement$HeaderData p0){
       super();
       this.headerData$$0 = p0;
    }
    public static PhotoAdvertisement$HeaderData read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$HeaderData headerData = new PhotoAdvertisement$HeaderData();
          p1.f(p1.g(), headerData);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          headerData.mLabels = list;
          headerData.mTitle = p0.readString();
          headerData.mButtonText = p0.readString();
          headerData.mDesc = p0.readString();
          headerData.mIconUrl = p0.readString();
          p1.f(i, headerData);
          return headerData;
       }
    }
    public static void write(PhotoAdvertisement$HeaderData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$HeaderData mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             Iterator iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mButtonText);
          p1.writeString(p0.mDesc);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$HeaderData getParcel(){
       return this.headerData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HeaderData$$Parcelable.write(this.headerData$$0, p0, p1, new a());
    }
}
