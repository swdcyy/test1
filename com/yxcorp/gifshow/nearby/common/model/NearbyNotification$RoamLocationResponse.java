package com.yxcorp.gifshow.nearby.common.model.NearbyNotification$RoamLocationResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyNotification$RoamLocationResponse	// class@002129
{
    public final int mLocationId;
    public final String mLocationName;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyNotification$RoamLocationResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyNotification$RoamLocationResponse && (this.mLocationId == p0.mLocationId && a.g(this.mLocationName, p0.mLocationName)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyNotification$RoamLocationResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.mLocationId * 31;
       NearbyNotification$RoamLocationResponse tmLocationNa = this.mLocationName;
       int i1 = (tmLocationNa != null)? tmLocationNa.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyNotification$RoamLocationResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RoamLocationResponse\(mLocationId="+this.mLocationId+", mLocationName="+this.mLocationName+"\)";
    }
}
