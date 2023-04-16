package com.kwai.roampanel.krn.bridge.RecentCitiesParams;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RecentCitiesParams implements Serializable	// class@0013d1
{
    public final List cities;

    public void RecentCitiesParams(List p0){
       a.p(p0, "cities");
       super();
       this.cities = p0;
    }
    public static RecentCitiesParams copy$default(RecentCitiesParams p0,List p1,int p2,Object p3){
       RecentCitiesParams cities;
       if (p2 & 0x01) {
          cities = p0.cities;
       }
       return p0.copy(cities);
    }
    public final List component1(){
       return this.cities;
    }
    public final RecentCitiesParams copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecentCitiesParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cities");
       return new RecentCitiesParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecentCitiesParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RecentCitiesParams && a.g(this.cities, p0.cities))) {
          return true;
       }
       return false;
    }
    public final List getCities(){
       return this.cities;
    }
    public int hashCode(){
       RecentCitiesParams obj = PatchProxy.apply(null, this, RecentCitiesParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cities;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecentCitiesParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecentCitiesParams\(cities="+this.cities+"\)";
    }
}
