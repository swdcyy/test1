package com.kuaishou.android.live.model.Horse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.Horse$$Parcelable$a;
import com.kuaishou.android.live.model.Horse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class Horse$$Parcelable implements Parcelable, d	// class@0007df
{
    public Horse horse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Horse$$Parcelable.CREATOR = new Horse$$Parcelable$a();
    }
    public void Horse$$Parcelable(Horse p0){
       super();
       this.horse$$0 = p0;
    }
    public static Horse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Horse horse = new Horse();
          p1.f(p1.g(), horse);
          horse.mHostAndPort = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          horse.mChosen = b1;
          horse.mErrorDescription = p0.readString();
          horse.mCost = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          horse.mSuccess = b;
          horse.mStartRealTime = p0.readLong();
          horse.mStartTime = p0.readLong();
          horse.mTag = p0.readString();
          p1.f(i, horse);
          return horse;
       }
    }
    public static void write(Horse p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mHostAndPort);
          p1.writeInt(p0.mChosen);
          p1.writeString(p0.mErrorDescription);
          p1.writeLong(p0.mCost);
          p1.writeInt(p0.mSuccess);
          p1.writeLong(p0.mStartRealTime);
          p1.writeLong(p0.mStartTime);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Horse getParcel(){
       return this.horse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Horse$$Parcelable.write(this.horse$$0, p0, p1, new a());
    }
}
