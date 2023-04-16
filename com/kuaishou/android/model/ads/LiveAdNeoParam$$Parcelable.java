package com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable$a;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam$$Parcelable;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam$$Parcelable;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam$$Parcelable;

public class LiveAdNeoParam$$Parcelable implements Parcelable, d	// class@00085e
{
    public LiveAdNeoParam liveAdNeoParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAdNeoParam$$Parcelable.CREATOR = new LiveAdNeoParam$$Parcelable$a();
    }
    public void LiveAdNeoParam$$Parcelable(LiveAdNeoParam p0){
       super();
       this.liveAdNeoParam$$0 = p0;
    }
    public static LiveAdNeoParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveAdNeoParam liveAdNeoPar = new LiveAdNeoParam();
          p1.f(p1.g(), liveAdNeoPar);
          liveAdNeoPar.mTaskInfoParam = LiveAdNeoParam$TaskInfoParam$$Parcelable.read(p0, p1);
          liveAdNeoPar.mExperimentParam = LiveAdNeoParam$ExperimentParam$$Parcelable.read(p0, p1);
          liveAdNeoPar.mStartParam = LiveAdNeoParam$StartParam$$Parcelable.read(p0, p1);
          p1.f(i, liveAdNeoPar);
          return liveAdNeoPar;
       }
    }
    public static void write(LiveAdNeoParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveAdNeoParam$TaskInfoParam$$Parcelable.write(p0.mTaskInfoParam, p1, p2, p3);
          LiveAdNeoParam$ExperimentParam$$Parcelable.write(p0.mExperimentParam, p1, p2, p3);
          LiveAdNeoParam$StartParam$$Parcelable.write(p0.mStartParam, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAdNeoParam getParcel(){
       return this.liveAdNeoParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAdNeoParam$$Parcelable.write(this.liveAdNeoParam$$0, p0, p1, new a());
    }
}
