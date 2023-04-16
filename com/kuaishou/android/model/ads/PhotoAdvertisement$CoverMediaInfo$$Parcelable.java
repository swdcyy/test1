package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$CoverMediaInfo$$Parcelable implements Parcelable, d	// class@000907
{
    public PhotoAdvertisement$CoverMediaInfo coverMediaInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CoverMediaInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CoverMediaInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CoverMediaInfo$$Parcelable(PhotoAdvertisement$CoverMediaInfo p0){
       super();
       this.coverMediaInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CoverMediaInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CoverMediaInfo uCoverMediaI = new PhotoAdvertisement$CoverMediaInfo();
          p1.f(p1.g(), uCoverMediaI);
          uCoverMediaI.mCoverDuration = p0.readLong();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$CoverUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uCoverMediaI.mCoverUrls = list;
          uCoverMediaI.materialType = p0.readInt();
          uCoverMediaI.coverStart = p0.readLong();
          uCoverMediaI.mediaType = p0.readInt();
          p1.f(i, uCoverMediaI);
          return uCoverMediaI;
       }
    }
    public static void write(PhotoAdvertisement$CoverMediaInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mCoverDuration);
          PhotoAdvertisement$CoverMediaInfo mCoverUrls = p0.mCoverUrls;
          if (mCoverUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoverUrls.size());
             Iterator iterator = p0.mCoverUrls.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$CoverUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.materialType);
          p1.writeLong(p0.coverStart);
          p1.writeInt(p0.mediaType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CoverMediaInfo getParcel(){
       return this.coverMediaInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CoverMediaInfo$$Parcelable.write(this.coverMediaInfo$$0, p0, p1, new a());
    }
}
