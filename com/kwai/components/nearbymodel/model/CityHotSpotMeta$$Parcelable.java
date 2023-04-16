package com.kwai.components.nearbymodel.model.CityHotSpotMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.CityHotSpotMeta$$Parcelable$a;
import com.kwai.components.nearbymodel.model.CityHotSpotMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class CityHotSpotMeta$$Parcelable implements Parcelable, d	// class@000c6d
{
    public CityHotSpotMeta cityHotSpotMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CityHotSpotMeta$$Parcelable.CREATOR = new CityHotSpotMeta$$Parcelable$a();
    }
    public void CityHotSpotMeta$$Parcelable(CityHotSpotMeta p0){
       super();
       this.cityHotSpotMeta$$0 = p0;
    }
    public static CityHotSpotMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CityHotSpotMeta uCityHotSpot = new CityHotSpotMeta();
          p1.f(p1.g(), uCityHotSpot);
          uCityHotSpot.mHotspotId = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uCityHotSpot.mUsers = list;
          uCityHotSpot.mIntroduction = p0.readString();
          p1.f(i, uCityHotSpot);
          return uCityHotSpot;
       }
    }
    public static void write(CityHotSpotMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mHotspotId);
          CityHotSpotMeta mUsers = p0.mUsers;
          if (mUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUsers.size());
             Iterator iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mIntroduction);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CityHotSpotMeta getParcel(){
       return this.cityHotSpotMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CityHotSpotMeta$$Parcelable.write(this.cityHotSpotMeta$$0, p0, p1, new a());
    }
}
