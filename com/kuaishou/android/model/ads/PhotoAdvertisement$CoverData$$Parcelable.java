package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$CoverData$$Parcelable implements Parcelable, d	// class@0008ff
{
    public PhotoAdvertisement$CoverData coverData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CoverData$$Parcelable.CREATOR = new PhotoAdvertisement$CoverData$$Parcelable$a();
    }
    public void PhotoAdvertisement$CoverData$$Parcelable(PhotoAdvertisement$CoverData p0){
       super();
       this.coverData$$0 = p0;
    }
    public static PhotoAdvertisement$CoverData read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CoverData uCoverData = new PhotoAdvertisement$CoverData();
          p1.f(p1.g(), uCoverData);
          uCoverData.mCoverWidth = p0.readInt();
          uCoverData.mCoverHeight = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$CoverItem$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uCoverData.mCoverItems = list;
          p1.f(i, uCoverData);
          return uCoverData;
       }
    }
    public static void write(PhotoAdvertisement$CoverData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mCoverWidth);
          p1.writeInt(p0.mCoverHeight);
          PhotoAdvertisement$CoverData mCoverItems = p0.mCoverItems;
          if (mCoverItems == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCoverItems.size());
             Iterator iterator = p0.mCoverItems.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$CoverItem$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CoverData getParcel(){
       return this.coverData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CoverData$$Parcelable.write(this.coverData$$0, p0, p1, new a());
    }
}
