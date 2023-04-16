package com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam$$Parcelable$a;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveAdNeoParam$ExperimentParam$$Parcelable implements Parcelable, d	// class@000860
{
    public LiveAdNeoParam$ExperimentParam experimentParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAdNeoParam$ExperimentParam$$Parcelable.CREATOR = new LiveAdNeoParam$ExperimentParam$$Parcelable$a();
    }
    public void LiveAdNeoParam$ExperimentParam$$Parcelable(LiveAdNeoParam$ExperimentParam p0){
       super();
       this.experimentParam$$0 = p0;
    }
    public static LiveAdNeoParam$ExperimentParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveAdNeoParam$ExperimentParam uExperimentP = new LiveAdNeoParam$ExperimentParam();
          p1.f(p1.g(), uExperimentP);
          uExperimentP.mAutoOpenShopCartDelayMs = p0.readLong();
          p1.f(i, uExperimentP);
          return uExperimentP;
       }
    }
    public static void write(LiveAdNeoParam$ExperimentParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mAutoOpenShopCartDelayMs);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAdNeoParam$ExperimentParam getParcel(){
       return this.experimentParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAdNeoParam$ExperimentParam$$Parcelable.write(this.experimentParam$$0, p0, p1, new a());
    }
}
