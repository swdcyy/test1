package com.kwai.poi.service.model.KLocation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KLocation	// class@0013b3
{
    public final double lat;
    public final double lon;

    public void KLocation(double p0,double p1){
       super();
       this.lat = p0;
       this.lon = p1;
    }
    public final double a(){
       return this.lat;
    }
    public final double b(){
       return this.lon;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KLocation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KLocation && (!Double.compare(this.lat, p0.lat) && !Double.compare(this.lon, p0.lon)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KLocation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.lat);
       long l1 = Double.doubleToLongBits(this.lon);
       return (((int)(l ^ (l >> 32)) * 31) + (int)(l1 ^ (l1 >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KLocation\(lat="+this.lat+", lon="+this.lon+"\)";
    }
}
