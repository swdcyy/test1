package com.kwai.nearby.startup.local.model.NearbyInnerSlideGuideParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyInnerSlideGuideParam	// class@001024
{
    public final int x;
    public final int y;
    public final int z;

    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof NearbyInnerSlideGuideParam && (this.x == p0.x && (this.y == p0.y && this.z == p0.z)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyInnerSlideGuideParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((this.x * 31) + this.y) * 31) + this.z);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyInnerSlideGuideParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyInnerSlideGuideParam\(x="+this.x+", y="+this.y+", z="+this.z+"\)";
    }
}
