package com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$SharedData;
import android.os.Parcelable;
import com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$SharedData$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class ActivitySharedTransitionHelper$SharedData implements Parcelable	// class@001d3b
{
    public final int b;
    public final Parcelable c;
    public static final Parcelable$Creator CREATOR;

    static {
       ActivitySharedTransitionHelper$SharedData.CREATOR = new ActivitySharedTransitionHelper$SharedData$a();
    }
    public void ActivitySharedTransitionHelper$SharedData(int p0,Parcelable p1){
       a.p(p1, "data");
       super();
       this.b = p0;
       this.c = p1;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivitySharedTransitionHelper$SharedData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActivitySharedTransitionHelper$SharedData && (this.b == p0.b && a.g(this.c, p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ActivitySharedTransitionHelper$SharedData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.b * 31;
       ActivitySharedTransitionHelper$SharedData tc = this.c;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivitySharedTransitionHelper$SharedData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SharedData\(id="+this.b+", data="+this.c+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ActivitySharedTransitionHelper$SharedData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ActivitySharedTransitionHelper$SharedData.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeParcelable(this.c, p1);
       return;
    }
}
