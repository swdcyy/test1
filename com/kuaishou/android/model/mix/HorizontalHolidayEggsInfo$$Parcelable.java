package com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class HorizontalHolidayEggsInfo$$Parcelable implements Parcelable, d	// class@000c9c
{
    public HorizontalHolidayEggsInfo horizontalHolidayEggsInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HorizontalHolidayEggsInfo$$Parcelable.CREATOR = new HorizontalHolidayEggsInfo$$Parcelable$a();
    }
    public void HorizontalHolidayEggsInfo$$Parcelable(HorizontalHolidayEggsInfo p0){
       super();
       this.horizontalHolidayEggsInfo$$0 = p0;
    }
    public static HorizontalHolidayEggsInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HorizontalHolidayEggsInfo horizontalHo = new HorizontalHolidayEggsInfo();
          p1.f(p1.g(), horizontalHo);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(HorizontalHolidayEggsResource$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          horizontalHo.mResource = list;
          p1.f(i, horizontalHo);
          return horizontalHo;
       }
    }
    public static void write(HorizontalHolidayEggsInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          HorizontalHolidayEggsInfo mResource = p0.mResource;
          if (mResource == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mResource.size());
             Iterator iterator = p0.mResource.iterator();
             while (iterator.hasNext()) {
                HorizontalHolidayEggsResource$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HorizontalHolidayEggsInfo getParcel(){
       return this.horizontalHolidayEggsInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HorizontalHolidayEggsInfo$$Parcelable.write(this.horizontalHolidayEggsInfo$$0, p0, p1, new a());
    }
}
