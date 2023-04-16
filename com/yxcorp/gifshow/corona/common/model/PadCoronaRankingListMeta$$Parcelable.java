package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$$Parcelable;
import java.util.Iterator;

public class PadCoronaRankingListMeta$$Parcelable implements Parcelable, d	// class@001238
{
    public PadCoronaRankingListMeta padCoronaRankingListMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PadCoronaRankingListMeta$$Parcelable.CREATOR = new PadCoronaRankingListMeta$$Parcelable$a();
    }
    public void PadCoronaRankingListMeta$$Parcelable(PadCoronaRankingListMeta p0){
       super();
       this.padCoronaRankingListMeta$$0 = p0;
    }
    public static PadCoronaRankingListMeta read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PadCoronaRankingListMeta padCoronaRan = new PadCoronaRankingListMeta();
          p1.f(p1.g(), padCoronaRan);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(PadCoronaRankingListTabData$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          padCoronaRan.hotTabList = uArrayList;
          padCoronaRan.title = p0.readString();
          padCoronaRan.coronaZoneId = p0.readLong();
          padCoronaRan.rightZoneText = p0.readString();
          p1.f(i, padCoronaRan);
          return padCoronaRan;
       }
    }
    public static void write(PadCoronaRankingListMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PadCoronaRankingListMeta hotTabList = p0.hotTabList;
          if (hotTabList == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(hotTabList.size());
             Iterator iterator = p0.hotTabList.iterator();
             while (iterator.hasNext()) {
                PadCoronaRankingListTabData$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.title);
          p1.writeLong(p0.coronaZoneId);
          p1.writeString(p0.rightZoneText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PadCoronaRankingListMeta getParcel(){
       return this.padCoronaRankingListMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PadCoronaRankingListMeta$$Parcelable.write(this.padCoronaRankingListMeta$$0, p0, p1, new a());
    }
}
