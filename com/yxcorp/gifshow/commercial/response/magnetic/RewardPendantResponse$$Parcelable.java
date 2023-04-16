package com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data$$Parcelable;

public class RewardPendantResponse$$Parcelable implements Parcelable, d	// class@001170
{
    public RewardPendantResponse rewardPendantResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPendantResponse$$Parcelable.CREATOR = new RewardPendantResponse$$Parcelable$a();
    }
    public void RewardPendantResponse$$Parcelable(RewardPendantResponse p0){
       super();
       this.rewardPendantResponse$$0 = p0;
    }
    public static RewardPendantResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardPendantResponse rewardPendan = new RewardPendantResponse();
          p1.f(p1.g(), rewardPendan);
          rewardPendan.mData = RewardPendantResponse$Data$$Parcelable.read(p0, p1);
          p1.f(i, rewardPendan);
          return rewardPendan;
       }
    }
    public static void write(RewardPendantResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RewardPendantResponse$Data$$Parcelable.write(p0.mData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPendantResponse getParcel(){
       return this.rewardPendantResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPendantResponse$$Parcelable.write(this.rewardPendantResponse$$0, p0, p1, new a());
    }
}
