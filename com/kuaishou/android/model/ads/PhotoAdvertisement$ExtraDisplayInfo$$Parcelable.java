package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$ExtraDisplayInfo$$Parcelable implements Parcelable, d	// class@000927
{
    public PhotoAdvertisement$ExtraDisplayInfo extraDisplayInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ExtraDisplayInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ExtraDisplayInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ExtraDisplayInfo$$Parcelable(PhotoAdvertisement$ExtraDisplayInfo p0){
       super();
       this.extraDisplayInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ExtraDisplayInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ExtraDisplayInfo uExtraDispla = new PhotoAdvertisement$ExtraDisplayInfo();
          p1.f(p1.g(), uExtraDispla);
          uExtraDispla.mExposeTag = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$ExtraDisplayTag$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uExtraDispla.mTagInfoList = list;
          uExtraDispla.mShowStyle = p0.readInt();
          p1.f(i, uExtraDispla);
          return uExtraDispla;
       }
    }
    public static void write(PhotoAdvertisement$ExtraDisplayInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mExposeTag);
          PhotoAdvertisement$ExtraDisplayInfo mTagInfoList = p0.mTagInfoList;
          if (mTagInfoList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTagInfoList.size());
             Iterator iterator = p0.mTagInfoList.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$ExtraDisplayTag$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mShowStyle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ExtraDisplayInfo getParcel(){
       return this.extraDisplayInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ExtraDisplayInfo$$Parcelable.write(this.extraDisplayInfo$$0, p0, p1, new a());
    }
}
