package com.yxcorp.gifshow.tube.TubeDateInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeDateInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeDateInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Long;
import java.io.Serializable;
import java.util.Date;

public class TubeDateInfo$$Parcelable implements Parcelable, d	// class@001e0a
{
    public TubeDateInfo tubeDateInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeDateInfo$$Parcelable.CREATOR = new TubeDateInfo$$Parcelable$a();
    }
    public void TubeDateInfo$$Parcelable(TubeDateInfo p0){
       super();
       this.tubeDateInfo$$0 = p0;
    }
    public static TubeDateInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubeDateInfo tubeDateInfo = new TubeDateInfo();
          p1.f(p1.g(), tubeDateInfo);
          tubeDateInfo.mMonthCn = p0.readInt();
          tubeDateInfo.mDayOfMonth = p0.readInt();
          tubeDateInfo.mWeekday = p0.readString();
          tubeDateInfo.mMonthEn = p0.readString();
          tubeDateInfo.mYear = p0.readInt();
          tubeDateInfo.mStartOfDay = p0.readString();
          Long longx = null;
          Long longx1 = (p0.readInt() < 0)? longx: Long.valueOf(p0.readLong());
          tubeDateInfo.mEndTime = longx1;
          tubeDateInfo.mDate = p0.readString();
          tubeDateInfo.mIndex = p0.readInt();
          if (p0.readInt() >= 0) {
             longx = Long.valueOf(p0.readLong());
          }
          tubeDateInfo.mStartTime = longx;
          tubeDateInfo.mCurDate = p0.readSerializable();
          p1.f(i, tubeDateInfo);
          return tubeDateInfo;
       }
    }
    public static void write(TubeDateInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mMonthCn);
          p1.writeInt(p0.mDayOfMonth);
          p1.writeString(p0.mWeekday);
          p1.writeString(p0.mMonthEn);
          p1.writeInt(p0.mYear);
          p1.writeString(p0.mStartOfDay);
          if (p0.mEndTime == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mEndTime.longValue());
          }
          p1.writeString(p0.mDate);
          p1.writeInt(p0.mIndex);
          if (p0.mStartTime == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mStartTime.longValue());
          }
          p1.writeSerializable(p0.mCurDate);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeDateInfo getParcel(){
       return this.tubeDateInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeDateInfo$$Parcelable.write(this.tubeDateInfo$$0, p0, p1, new a());
    }
}
