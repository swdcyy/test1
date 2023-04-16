package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import org.parceler.a;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import org.parceler.a$c;
import java.util.Iterator;

public class PadCoronaRankingListResponse$$Parcelable implements Parcelable, d	// class@00123c
{
    public PadCoronaRankingListResponse padCoronaRankingListResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PadCoronaRankingListResponse$$Parcelable.CREATOR = new PadCoronaRankingListResponse$$Parcelable$a();
    }
    public void PadCoronaRankingListResponse$$Parcelable(PadCoronaRankingListResponse p0){
       super();
       this.padCoronaRankingListResponse$$0 = p0;
    }
    public static PadCoronaRankingListResponse read(Parcel p0,a p1){
       ArrayList uArrayList1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PadCoronaRankingListResponse padCoronaRan = new PadCoronaRankingListResponse();
          p1.f(p1.g(), padCoronaRan);
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "result", Integer.valueOf(p0.readInt()));
          int i1 = p0.readInt();
          ArrayList uArrayList = null;
          int i2 = 0;
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(p0.readSerializable());
             }
          }
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "tabList", uArrayList1);
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "errorCode", Integer.valueOf(p0.readInt()));
          i1 = p0.readInt();
          if (i1 >= 0) {
             uArrayList = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "feeds", uArrayList);
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "bgImageUrl", p0.readString());
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "updateText", p0.readString());
          a.d(PadCoronaRankingListResponse.class, padCoronaRan, "logoUrl", p0.readString());
          p1.f(i, padCoronaRan);
          return padCoronaRan;
       }
    }
    public static void write(PadCoronaRankingListResponse p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(a.b(Integer.TYPE, PadCoronaRankingListResponse.class, p0, "result").intValue());
          String str = "tabList";
          if (a.c(new a$c(), PadCoronaRankingListResponse.class, p0, str) == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(a.c(new a$c(), PadCoronaRankingListResponse.class, p0, str).size());
             iterator = a.c(new a$c(), PadCoronaRankingListResponse.class, p0, str).iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(a.b(Integer.TYPE, PadCoronaRankingListResponse.class, p0, "errorCode").intValue());
          if (a.c(new a$c(), PadCoronaRankingListResponse.class, p0, "feeds") == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(a.c(new a$c(), PadCoronaRankingListResponse.class, p0, "feeds").size());
             iterator = a.c(new a$c(), PadCoronaRankingListResponse.class, p0, "feeds").iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(a.b(String.class, PadCoronaRankingListResponse.class, p0, "bgImageUrl"));
          p1.writeString(a.b(String.class, PadCoronaRankingListResponse.class, p0, "updateText"));
          p1.writeString(a.b(String.class, PadCoronaRankingListResponse.class, p0, "logoUrl"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PadCoronaRankingListResponse getParcel(){
       return this.padCoronaRankingListResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PadCoronaRankingListResponse$$Parcelable.write(this.padCoronaRankingListResponse$$0, p0, p1, new a());
    }
}
