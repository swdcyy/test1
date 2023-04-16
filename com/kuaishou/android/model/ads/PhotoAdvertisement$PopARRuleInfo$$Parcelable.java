package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$PopARRuleInfo$$Parcelable implements Parcelable, d	// class@0009cc
{
    public PhotoAdvertisement$PopARRuleInfo popARRuleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopARRuleInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PopARRuleInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopARRuleInfo$$Parcelable(PhotoAdvertisement$PopARRuleInfo p0){
       super();
       this.popARRuleInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PopARRuleInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PopARRuleInfo popARRuleInf = new PhotoAdvertisement$PopARRuleInfo();
          p1.f(p1.g(), popARRuleInf);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$PopARRules$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          popARRuleInf.mPopARRules = list;
          p1.f(i, popARRuleInf);
          return popARRuleInf;
       }
    }
    public static void write(PhotoAdvertisement$PopARRuleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$PopARRuleInfo mPopARRules = p0.mPopARRules;
          if (mPopARRules == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mPopARRules.size());
             Iterator iterator = p0.mPopARRules.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$PopARRules$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopARRuleInfo getParcel(){
       return this.popARRuleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopARRuleInfo$$Parcelable.write(this.popARRuleInfo$$0, p0, p1, new a());
    }
}
