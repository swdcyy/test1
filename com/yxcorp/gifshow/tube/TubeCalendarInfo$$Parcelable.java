package com.yxcorp.gifshow.tube.TubeCalendarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeCalendarInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeCalendarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeCalendarInfo$$Parcelable implements Parcelable, d	// class@001e01
{
    public TubeCalendarInfo tubeCalendarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeCalendarInfo$$Parcelable.CREATOR = new TubeCalendarInfo$$Parcelable$a();
    }
    public void TubeCalendarInfo$$Parcelable(TubeCalendarInfo p0){
       super();
       this.tubeCalendarInfo$$0 = p0;
    }
    public static TubeCalendarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeCalendarInfo tubeCalendar = new TubeCalendarInfo();
          p1.f(p1.g(), tubeCalendar);
          tubeCalendar.calendarName = p0.readString();
          tubeCalendar.calendarId = p0.readString();
          p1.f(i, tubeCalendar);
          return tubeCalendar;
       }
    }
    public static void write(TubeCalendarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.calendarName);
          p1.writeString(p0.calendarId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeCalendarInfo getParcel(){
       return this.tubeCalendarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeCalendarInfo$$Parcelable.write(this.tubeCalendarInfo$$0, p0, p1, new a());
    }
}