package com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams$$Parcelable$a;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$LogParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RealtimeMeta$LogParams$$Parcelable implements Parcelable, d	// class@001065
{
    public RealtimeMeta$LogParams logParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RealtimeMeta$LogParams$$Parcelable.CREATOR = new RealtimeMeta$LogParams$$Parcelable$a();
    }
    public void RealtimeMeta$LogParams$$Parcelable(RealtimeMeta$LogParams p0){
       super();
       this.logParams$$0 = p0;
    }
    public static RealtimeMeta$LogParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RealtimeMeta$LogParams logParams = new RealtimeMeta$LogParams();
          p1.f(p1.g(), logParams);
          logParams.mFriendCount = p0.readLong();
          p1.f(i, logParams);
          return logParams;
       }
    }
    public static void write(RealtimeMeta$LogParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mFriendCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RealtimeMeta$LogParams getParcel(){
       return this.logParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RealtimeMeta$LogParams$$Parcelable.write(this.logParams$$0, p0, p1, new a());
    }
}
