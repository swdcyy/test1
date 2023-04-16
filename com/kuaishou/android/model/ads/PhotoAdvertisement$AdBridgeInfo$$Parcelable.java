package com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import java.lang.Boolean;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class PhotoAdvertisement$AdBridgeInfo$$Parcelable implements Parcelable, d	// class@000890
{
    public PhotoAdvertisement$AdBridgeInfo adBridgeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdBridgeInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdBridgeInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdBridgeInfo$$Parcelable(PhotoAdvertisement$AdBridgeInfo p0){
       super();
       this.adBridgeInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdBridgeInfo read(Parcel p0,a p1){
       Map map1;
       boolean b;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdBridgeInfo uAdBridgeInf = new PhotoAdvertisement$AdBridgeInfo();
          p1.f(p1.g(), uAdBridgeInf);
          int i1 = p0.readInt();
          Map map = null;
          if (i1 >= 0) {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                String str = p0.readString();
                if (p0.readInt() < 0) {
                   map1 = map;
                }else {
                   b = true;
                   if (p0.readInt() != b) {
                      b = false;
                   }
                   map1 = Boolean.valueOf(b);
                }
                hashMap.put(str, map1);
             }
             map = hashMap;
          }
          uAdBridgeInf.mAdThirdBridgeBlockList = map;
          p1.f(i, uAdBridgeInf);
          return uAdBridgeInf;
       }
    }
    public static void write(PhotoAdvertisement$AdBridgeInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$AdBridgeInfo mAdThirdBrid = p0.mAdThirdBridgeBlockList;
          if (mAdThirdBrid == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAdThirdBrid.size());
             Iterator iterator = p0.mAdThirdBridgeBlockList.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                if (uEntry.getValue() == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(uEntry.getValue().booleanValue());
                }
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdBridgeInfo getParcel(){
       return this.adBridgeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdBridgeInfo$$Parcelable.write(this.adBridgeInfo$$0, p0, p1, new a());
    }
}
