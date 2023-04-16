package com.kuaishou.android.model.mix.LogParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.LogParam$$Parcelable$a;
import com.kuaishou.android.model.mix.LogParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LogParam$$Parcelable implements Parcelable, d	// class@000d11
{
    public LogParam logParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LogParam$$Parcelable.CREATOR = new LogParam$$Parcelable$a();
    }
    public void LogParam$$Parcelable(LogParam p0){
       super();
       this.logParam$$0 = p0;
    }
    public static LogParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LogParam logParam = new LogParam();
          p1.f(p1.g(), logParam);
          logParam.mPrsid = p0.readString();
          logParam.mAppletPage = p0.readString();
          logParam.mAuthorId = p0.readLong();
          p1.f(i, logParam);
          return logParam;
       }
    }
    public static void write(LogParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPrsid);
          p1.writeString(p0.mAppletPage);
          p1.writeLong(p0.mAuthorId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LogParam getParcel(){
       return this.logParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LogParam$$Parcelable.write(this.logParam$$0, p0, p1, new a());
    }
}
