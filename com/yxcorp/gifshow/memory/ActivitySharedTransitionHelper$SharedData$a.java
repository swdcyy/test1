package com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$SharedData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$SharedData;
import java.lang.ClassLoader;
import android.os.Parcelable;

public final class ActivitySharedTransitionHelper$SharedData$a implements Parcelable$Creator	// class@001d3a
{

    public void ActivitySharedTransitionHelper$SharedData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivitySharedTransitionHelper$SharedData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new ActivitySharedTransitionHelper$SharedData(p0.readInt(), p0.readParcelable(ActivitySharedTransitionHelper$SharedData.class.getClassLoader()));
    }
    public final Object[] newArray(int p0){
       ActivitySharedTransitionHelper$SharedData[] sharedDataAr = new ActivitySharedTransitionHelper$SharedData[p0];
       return sharedDataAr;
    }
}
