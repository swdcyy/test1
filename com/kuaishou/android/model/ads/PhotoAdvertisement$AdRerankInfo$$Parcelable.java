package com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRankType;
import java.lang.Class;
import java.lang.Enum;
import java.util.HashMap;
import xwd.b;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class PhotoAdvertisement$AdRerankInfo$$Parcelable implements Parcelable, d	// class@0008af
{
    public PhotoAdvertisement$AdRerankInfo adRerankInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdRerankInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdRerankInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdRerankInfo$$Parcelable(PhotoAdvertisement$AdRerankInfo p0){
       super();
       this.adRerankInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdRerankInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdRerankInfo uAdRerankInf = new PhotoAdvertisement$AdRerankInfo();
          p1.f(p1.g(), uAdRerankInf);
          uAdRerankInf.mSourceType = p0.readString();
          String str = p0.readString();
          Map map = null;
          PhotoAdvertisement$AdRankType uAdRankType = (str == null)? map: Enum.valueOf(PhotoAdvertisement$AdRankType.class, str);
          uAdRerankInf.mRankType = uAdRankType;
          int i1 = p0.readInt();
          if (i1 >= 0) {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                String str1 = p0.readString();
                Map map1 = (p0.readInt() < 0)? map: Integer.valueOf(p0.readInt());
                hashMap.put(str1, map1);
             }
             map = hashMap;
          }
          uAdRerankInf.mAvoidMap = map;
          uAdRerankInf.mTimeInterval = p0.readLong();
          p1.f(i, uAdRerankInf);
          return uAdRerankInf;
       }
    }
    public static void write(PhotoAdvertisement$AdRerankInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSourceType);
          PhotoAdvertisement$AdRerankInfo mRankType = p0.mRankType;
          String str = (mRankType == null)? null: mRankType.name();
          p1.writeString(str);
          mRankType = p0.mAvoidMap;
          if (mRankType == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mRankType.size());
             Iterator iterator = p0.mAvoidMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                if (uEntry.getValue() == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(uEntry.getValue().intValue());
                }
             }
          }
          p1.writeLong(p0.mTimeInterval);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdRerankInfo getParcel(){
       return this.adRerankInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdRerankInfo$$Parcelable.write(this.adRerankInfo$$0, p0, p1, new a());
    }
}
