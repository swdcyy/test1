package com.yxcorp.gifshow.rankgather.api.HometownCity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HometownCity	// class@0016eb
{
    public final String mLocationId;
    public final String mLocationName;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HometownCity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HometownCity && (a.g(this.mLocationId, p0.mLocationId) && a.g(this.mLocationName, p0.mLocationName)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       HometownCity obj = PatchProxy.apply(null, this, HometownCity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLocationId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HometownCity tmLocationNa = this.mLocationName;
       if (tmLocationNa != null) {
          i = tmLocationNa.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HometownCity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HometownCity\(mLocationId="+this.mLocationId+", mLocationName="+this.mLocationName+"\)";
    }
}
