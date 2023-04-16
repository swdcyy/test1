package com.kwai.framework.location.model.KsLocation;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsLocation	// class@00164f
{
    public double latitude;
    public double longitude;

    public void KsLocation(){
       super(0, 0, 3, null);
    }
    public void KsLocation(double p0,double p1){
       super();
       this.latitude = p0;
       this.longitude = p1;
    }
    public void KsLocation(double p0,double p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static KsLocation copy$default(KsLocation p0,double p1,double p2,int p3,Object p4){
       KsLocation latitude;
       KsLocation longitude;
       if (p3 & 0x01) {
          latitude = p0.latitude;
       }
       if (p3 & 0x02) {
          longitude = p0.longitude;
       }
       return p0.copy(latitude, longitude);
    }
    public final double component1(){
       return this.latitude;
    }
    public final double component2(){
       return this.longitude;
    }
    public final KsLocation copy(double p0,double p1){
       KsLocation ksLocation = KsLocation.class;
       if (PatchProxy.isSupport(ksLocation)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), this, ksLocation, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KsLocation(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLocation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsLocation && (!Double.compare(this.latitude, p0.latitude) && !Double.compare(this.longitude, p0.longitude)))) {
          return true;
       }
       return false;
    }
    public final double getLatitude(){
       return this.latitude;
    }
    public final double getLongitude(){
       return this.longitude;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KsLocation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.latitude);
       long l1 = Double.doubleToLongBits(this.longitude);
       return (((int)(l ^ (l >> 32)) * 31) + (int)(l1 ^ (l1 >> 32)));
    }
    public final void setLatitude(double p0){
       this.latitude = p0;
    }
    public final void setLongitude(double p0){
       this.longitude = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsLocation\(latitude="+this.latitude+", longitude="+this.longitude+"\)";
    }
}
