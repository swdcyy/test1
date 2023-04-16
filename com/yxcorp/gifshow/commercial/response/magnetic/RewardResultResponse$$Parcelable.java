package com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$ResultData;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardResultResponse$ResultData$$Parcelable;

public class RewardResultResponse$$Parcelable implements Parcelable, d	// class@001177
{
    public RewardResultResponse rewardResultResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardResultResponse$$Parcelable.CREATOR = new RewardResultResponse$$Parcelable$a();
    }
    public void RewardResultResponse$$Parcelable(RewardResultResponse p0){
       super();
       this.rewardResultResponse$$0 = p0;
    }
    public static RewardResultResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardResultResponse rewardResult = new RewardResultResponse();
          p1.f(p1.g(), rewardResult);
          rewardResult.mResultData = RewardResultResponse$ResultData$$Parcelable.read(p0, p1);
          p1.f(i, rewardResult);
          return rewardResult;
       }
    }
    public static void write(RewardResultResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RewardResultResponse$ResultData$$Parcelable.write(p0.mResultData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardResultResponse getParcel(){
       return this.rewardResultResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardResultResponse$$Parcelable.write(this.rewardResultResponse$$0, p0, p1, new a());
    }
}
