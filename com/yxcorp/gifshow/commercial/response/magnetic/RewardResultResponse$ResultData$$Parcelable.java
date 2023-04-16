package com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$ResultData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$ResultData$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$ResultData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RewardResultResponse$ResultData$$Parcelable implements Parcelable, d	// class@001179
{
    public RewardResultResponse$ResultData resultData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardResultResponse$ResultData$$Parcelable.CREATOR = new RewardResultResponse$ResultData$$Parcelable$a();
    }
    public void RewardResultResponse$ResultData$$Parcelable(RewardResultResponse$ResultData p0){
       super();
       this.resultData$$0 = p0;
    }
    public static RewardResultResponse$ResultData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardResultResponse$ResultData resultData = new RewardResultResponse$ResultData();
          p1.f(p1.g(), resultData);
          resultData.mAmount = p0.readLong();
          p1.f(i, resultData);
          return resultData;
       }
    }
    public static void write(RewardResultResponse$ResultData p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mAmount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardResultResponse$ResultData getParcel(){
       return this.resultData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardResultResponse$ResultData$$Parcelable.write(this.resultData$$0, p0, p1, new a());
    }
}
