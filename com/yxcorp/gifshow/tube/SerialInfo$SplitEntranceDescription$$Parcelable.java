package com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription$$Parcelable$a;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SerialInfo$SplitEntranceDescription$$Parcelable implements Parcelable, d	// class@001dec
{
    public SerialInfo$SplitEntranceDescription splitEntranceDescription$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SerialInfo$SplitEntranceDescription$$Parcelable.CREATOR = new SerialInfo$SplitEntranceDescription$$Parcelable$a();
    }
    public void SerialInfo$SplitEntranceDescription$$Parcelable(SerialInfo$SplitEntranceDescription p0){
       super();
       this.splitEntranceDescription$$0 = p0;
    }
    public static SerialInfo$SplitEntranceDescription read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SerialInfo$SplitEntranceDescription splitEntranc = new SerialInfo$SplitEntranceDescription();
          p1.f(p1.g(), splitEntranc);
          splitEntranc.mContinueInfo = p0.readString();
          splitEntranc.mTitle = p0.readString();
          p1.f(i, splitEntranc);
          return splitEntranc;
       }
    }
    public static void write(SerialInfo$SplitEntranceDescription p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContinueInfo);
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SerialInfo$SplitEntranceDescription getParcel(){
       return this.splitEntranceDescription$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SerialInfo$SplitEntranceDescription$$Parcelable.write(this.splitEntranceDescription$$0, p0, p1, new a());
    }
}
