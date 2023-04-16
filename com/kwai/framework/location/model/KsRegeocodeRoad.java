package com.kwai.framework.location.model.KsRegeocodeRoad;
import com.kwai.framework.location.model.KsLocation;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsRegeocodeRoad	// class@001652
{
    public String direction;
    public float distance;
    public KsLocation location;
    public String name;
    public String uid;

    public void KsRegeocodeRoad(){
       super(null, null, null, 0, null, 31, null);
    }
    public void KsRegeocodeRoad(KsLocation p0,String p1,String p2,float p3,String p4){
       super();
       this.location = p0;
       this.uid = p1;
       this.name = p2;
       this.distance = p3;
       this.direction = p4;
    }
    public void KsRegeocodeRoad(KsLocation p0,String p1,String p2,float p3,String p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       String str = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, str);
       return;
    }
    public static KsRegeocodeRoad copy$default(KsRegeocodeRoad p0,KsLocation p1,String p2,String p3,float p4,String p5,int p6,Object p7){
       KsRegeocodeRoad location;
       KsRegeocodeRoad uid;
       KsRegeocodeRoad name;
       KsRegeocodeRoad distance;
       KsRegeocodeRoad direction;
       if (p6 & 0x01) {
          location = p0.location;
       }
       if (p6 & 0x02) {
          uid = p0.uid;
       }
       p7 = uid;
       if (p6 & 0x04) {
          name = p0.name;
       }
       KsRegeocodeRoad ksRegeocodeR = name;
       if (p6 & 0x08) {
          distance = p0.distance;
       }
       KsRegeocodeRoad ksRegeocodeR1 = distance;
       if (p6 & 0x10) {
          direction = p0.direction;
       }
       return p0.copy(location, p7, ksRegeocodeR, ksRegeocodeR1, direction);
    }
    public final KsLocation component1(){
       return this.location;
    }
    public final String component2(){
       return this.uid;
    }
    public final String component3(){
       return this.name;
    }
    public final float component4(){
       return this.distance;
    }
    public final String component5(){
       return this.direction;
    }
    public final KsRegeocodeRoad copy(KsLocation p0,String p1,String p2,float p3,String p4){
       Object obj;
       KsRegeocodeRoad ksRegeocodeR = KsRegeocodeRoad.class;
       if (PatchProxy.isSupport(ksRegeocodeR)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, ksRegeocodeR, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KsRegeocodeRoad ksRegeocodeR1 = new KsRegeocodeRoad(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsRegeocodeRoad.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsRegeocodeRoad && (a.g(this.location, p0.location) && (a.g(this.uid, p0.uid) && (a.g(this.name, p0.name) && (!Float.compare(this.distance, p0.distance) && a.g(this.direction, p0.direction))))))) {
          return true;
       }
       return false;
    }
    public final String getDirection(){
       return this.direction;
    }
    public final float getDistance(){
       return this.distance;
    }
    public final KsLocation getLocation(){
       return this.location;
    }
    public final String getName(){
       return this.name;
    }
    public final String getUid(){
       return this.uid;
    }
    public int hashCode(){
       KsRegeocodeRoad obj = PatchProxy.apply(null, this, KsRegeocodeRoad.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.location;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsRegeocodeRoad tuid = this.uid;
       int i2 = (tuid != null)? tuid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuid = this.name;
       i2 = (tuid != null)? tuid.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.distance)) * 31;
       tuid = this.direction;
       if (tuid != null) {
          i = tuid.hashCode();
       }
       return (i1 + i);
    }
    public final void setDirection(String p0){
       this.direction = p0;
    }
    public final void setDistance(float p0){
       this.distance = p0;
    }
    public final void setLocation(KsLocation p0){
       this.location = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setUid(String p0){
       this.uid = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsRegeocodeRoad.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsRegeocodeRoad\(location="+this.location+", uid="+this.uid+", name="+this.name+", distance="+this.distance+", direction="+this.direction+"\)";
    }
}
