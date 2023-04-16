package com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam$$Parcelable$a;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$$Parcelable;

public class LiveAdNeoParam$TaskInfoParam$$Parcelable implements Parcelable, d	// class@000866
{
    public LiveAdNeoParam$TaskInfoParam taskInfoParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAdNeoParam$TaskInfoParam$$Parcelable.CREATOR = new LiveAdNeoParam$TaskInfoParam$$Parcelable$a();
    }
    public void LiveAdNeoParam$TaskInfoParam$$Parcelable(LiveAdNeoParam$TaskInfoParam p0){
       super();
       this.taskInfoParam$$0 = p0;
    }
    public static LiveAdNeoParam$TaskInfoParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveAdNeoParam$TaskInfoParam taskInfoPara = new LiveAdNeoParam$TaskInfoParam();
          p1.f(p1.g(), taskInfoPara);
          taskInfoPara.mNeoNextUnsealTimestampMs = p0.readLong();
          taskInfoPara.mExtData = p0.readString();
          taskInfoPara.mTopPendantType = p0.readInt();
          taskInfoPara.mCouponExpireTimestampMs = p0.readLong();
          taskInfoPara.mNeoLiveBottomPendantInfo = NeoLiveBottomPendantInfo$$Parcelable.read(p0, p1);
          p1.f(i, taskInfoPara);
          return taskInfoPara;
       }
    }
    public static void write(LiveAdNeoParam$TaskInfoParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mNeoNextUnsealTimestampMs);
          p1.writeString(p0.mExtData);
          p1.writeInt(p0.mTopPendantType);
          p1.writeLong(p0.mCouponExpireTimestampMs);
          NeoLiveBottomPendantInfo$$Parcelable.write(p0.mNeoLiveBottomPendantInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAdNeoParam$TaskInfoParam getParcel(){
       return this.taskInfoParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAdNeoParam$TaskInfoParam$$Parcelable.write(this.taskInfoParam$$0, p0, p1, new a());
    }
}
