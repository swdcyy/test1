package com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$$Parcelable$a;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SerialInfo$RightTopCorner$$Parcelable implements Parcelable, d	// class@001de8
{
    public SerialInfo$RightTopCorner rightTopCorner$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SerialInfo$RightTopCorner$$Parcelable.CREATOR = new SerialInfo$RightTopCorner$$Parcelable$a();
    }
    public void SerialInfo$RightTopCorner$$Parcelable(SerialInfo$RightTopCorner p0){
       super();
       this.rightTopCorner$$0 = p0;
    }
    public static SerialInfo$RightTopCorner read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SerialInfo$RightTopCorner rightTopCorn = new SerialInfo$RightTopCorner();
          p1.f(p1.g(), rightTopCorn);
          rightTopCorn.mViewCountDescription = p0.readString();
          rightTopCorn.mHotViewIcon = p0.readString();
          p1.f(i, rightTopCorn);
          return rightTopCorn;
       }
    }
    public static void write(SerialInfo$RightTopCorner p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mViewCountDescription);
          p1.writeString(p0.mHotViewIcon);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SerialInfo$RightTopCorner getParcel(){
       return this.rightTopCorner$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SerialInfo$RightTopCorner$$Parcelable.write(this.rightTopCorner$$0, p0, p1, new a());
    }
}
