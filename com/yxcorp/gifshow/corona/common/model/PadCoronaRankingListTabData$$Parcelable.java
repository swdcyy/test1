package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import java.lang.Class;
import org.parceler.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
import org.parceler.a$c;
import java.util.Iterator;

public class PadCoronaRankingListTabData$$Parcelable implements Parcelable, d	// class@001241
{
    public PadCoronaRankingListTabData padCoronaRankingListTabData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PadCoronaRankingListTabData$$Parcelable.CREATOR = new PadCoronaRankingListTabData$$Parcelable$a();
    }
    public void PadCoronaRankingListTabData$$Parcelable(PadCoronaRankingListTabData p0){
       super();
       this.padCoronaRankingListTabData$$0 = p0;
    }
    public static PadCoronaRankingListTabData read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PadCoronaRankingListTabData padCoronaRan = new PadCoronaRankingListTabData();
          p1.f(p1.g(), padCoronaRan);
          a.d(PadCoronaRankingListTabData.class, padCoronaRan, "coronaInfo", CoronaInfo$$Parcelable.read(p0, p1));
          a.d(PadCoronaRankingListTabData.class, padCoronaRan, "scheme", p0.readString());
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(QPhoto$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          a.d(PadCoronaRankingListTabData.class, padCoronaRan, "feeds", uArrayList);
          a.d(PadCoronaRankingListTabData.class, padCoronaRan, "type", Integer.valueOf(p0.readInt()));
          a.d(PadCoronaRankingListTabData.class, padCoronaRan, "coronaZoneId", Integer.valueOf(p0.readInt()));
          PadCoronaRankingListTabData padCoronaRan1 = PadCoronaRankingListTabData.class;
          if (p0.readInt() == 1) {
             b = true;
          }
          a.d(padCoronaRan1, padCoronaRan, "canSlideToScheme", Boolean.valueOf(b));
          a.d(PadCoronaRankingListTabInfo.class, padCoronaRan, "tabId", Integer.valueOf(p0.readInt()));
          a.d(PadCoronaRankingListTabInfo.class, padCoronaRan, "tabName", p0.readString());
          p1.f(i, padCoronaRan);
          return padCoronaRan;
       }
    }
    public static void write(PadCoronaRankingListTabData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaInfo$$Parcelable.write(a.b(CoronaInfo.class, PadCoronaRankingListTabData.class, p0, "coronaInfo"), p1, p2, p3);
          p1.writeString(a.b(String.class, PadCoronaRankingListTabData.class, p0, "scheme"));
          if (a.c(new a$c(), PadCoronaRankingListTabData.class, p0, "feeds") == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(a.c(new a$c(), PadCoronaRankingListTabData.class, p0, "feeds").size());
             Iterator iterator = a.c(new a$c(), PadCoronaRankingListTabData.class, p0, "feeds").iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          Class tYPE = Integer.TYPE;
          p1.writeInt(a.b(tYPE, PadCoronaRankingListTabData.class, p0, "type").intValue());
          p1.writeInt(a.b(tYPE, PadCoronaRankingListTabData.class, p0, "coronaZoneId").intValue());
          p1.writeInt(a.b(Boolean.TYPE, PadCoronaRankingListTabData.class, p0, "canSlideToScheme").booleanValue());
          p1.writeInt(a.b(tYPE, PadCoronaRankingListTabInfo.class, p0, "tabId").intValue());
          p1.writeString(a.b(String.class, PadCoronaRankingListTabInfo.class, p0, "tabName"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PadCoronaRankingListTabData getParcel(){
       return this.padCoronaRankingListTabData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PadCoronaRankingListTabData$$Parcelable.write(this.padCoronaRankingListTabData$$0, p0, p1, new a());
    }
}
