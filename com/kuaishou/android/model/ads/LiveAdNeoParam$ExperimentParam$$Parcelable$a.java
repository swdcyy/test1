package com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam;

public class LiveAdNeoParam$ExperimentParam$$Parcelable$a implements Parcelable$Creator	// class@00085f
{

    public void LiveAdNeoParam$ExperimentParam$$Parcelable$a(){
       super();
    }
    public LiveAdNeoParam$ExperimentParam$$Parcelable a(Parcel p0){
       return new LiveAdNeoParam$ExperimentParam$$Parcelable(LiveAdNeoParam$ExperimentParam$$Parcelable.read(p0, new a()));
    }
    public LiveAdNeoParam$ExperimentParam$$Parcelable[] b(int p0){
       LiveAdNeoParam$ExperimentParam$$Parcelable[] uExperimentP = new LiveAdNeoParam$ExperimentParam$$Parcelable[p0];
       return uExperimentP;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
