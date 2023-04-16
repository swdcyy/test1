package com.kwai.feature.api.corona.model.CoronaVipPayFragmentParam;
import android.os.Parcelable;
import com.kwai.feature.api.corona.model.CoronaVipPayFragmentParam$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class CoronaVipPayFragmentParam implements Parcelable	// class@000e14
{
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaVipPayFragmentParam.CREATOR = new CoronaVipPayFragmentParam$a();
    }
    public void CoronaVipPayFragmentParam(String p0){
       a.p(p0, "source");
       super();
       this.b = p0;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaVipPayFragmentParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CoronaVipPayFragmentParam && a.g(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CoronaVipPayFragmentParam obj = PatchProxy.apply(null, this, CoronaVipPayFragmentParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CoronaVipPayFragmentParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoronaVipPayFragmentParam\(source="+this.b+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(CoronaVipPayFragmentParam.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CoronaVipPayFragmentParam.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.b);
       return;
    }
}
