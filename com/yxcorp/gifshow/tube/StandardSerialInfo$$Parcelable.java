package com.yxcorp.gifshow.tube.StandardSerialInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.StandardSerialInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.yxcorp.gifshow.tube.SerialInfo$$Parcelable;
import com.yxcorp.gifshow.tube.SerialPhoto;
import com.yxcorp.gifshow.tube.SerialPhoto$$Parcelable;

public class StandardSerialInfo$$Parcelable implements Parcelable, d	// class@001df7
{
    public StandardSerialInfo standardSerialInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       StandardSerialInfo$$Parcelable.CREATOR = new StandardSerialInfo$$Parcelable$a();
    }
    public void StandardSerialInfo$$Parcelable(StandardSerialInfo p0){
       super();
       this.standardSerialInfo$$0 = p0;
    }
    public static StandardSerialInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          StandardSerialInfo standardSeri = new StandardSerialInfo();
          p1.f(p1.g(), standardSeri);
          standardSeri.mSerialInfo = SerialInfo$$Parcelable.read(p0, p1);
          standardSeri.mTubePageUrl = p0.readString();
          standardSeri.mSerialPhoto = SerialPhoto$$Parcelable.read(p0, p1);
          p1.f(i, standardSeri);
          return standardSeri;
       }
    }
    public static void write(StandardSerialInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SerialInfo$$Parcelable.write(p0.mSerialInfo, p1, p2, p3);
          p1.writeString(p0.mTubePageUrl);
          SerialPhoto$$Parcelable.write(p0.mSerialPhoto, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public StandardSerialInfo getParcel(){
       return this.standardSerialInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       StandardSerialInfo$$Parcelable.write(this.standardSerialInfo$$0, p0, p1, new a());
    }
}
