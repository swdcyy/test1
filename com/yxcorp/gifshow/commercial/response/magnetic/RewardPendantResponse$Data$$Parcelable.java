package com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.RewardPendantResponse$Data;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RewardPendantResponse$Data$$Parcelable implements Parcelable, d	// class@001172
{
    public RewardPendantResponse$Data data$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPendantResponse$Data$$Parcelable.CREATOR = new RewardPendantResponse$Data$$Parcelable$a();
    }
    public void RewardPendantResponse$Data$$Parcelable(RewardPendantResponse$Data p0){
       super();
       this.data$$0 = p0;
    }
    public static RewardPendantResponse$Data read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardPendantResponse$Data uData = new RewardPendantResponse$Data();
          p1.f(p1.g(), uData);
          uData.mStatus = p0.readInt();
          uData.mRewardTime = p0.readLong();
          uData.mCoolDownTime = p0.readLong();
          uData.mRemainingCount = p0.readInt();
          p1.f(i, uData);
          return uData;
       }
    }
    public static void write(RewardPendantResponse$Data p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mStatus);
          p1.writeLong(p0.mRewardTime);
          p1.writeLong(p0.mCoolDownTime);
          p1.writeInt(p0.mRemainingCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPendantResponse$Data getParcel(){
       return this.data$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPendantResponse$Data$$Parcelable.write(this.data$$0, p0, p1, new a());
    }
}
