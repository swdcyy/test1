package com.kwai.framework.location.model.KsCrossroad;
import java.lang.String;
import com.kwai.framework.location.model.KsLocation;
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

public final class KsCrossroad	// class@00164e
{
    public String direction;
    public float distance;
    public String firstId;
    public String firstName;
    public KsLocation location;
    public String secondId;
    public String secondName;

    public void KsCrossroad(){
       super(null, null, null, null, null, 0, null, 127, null);
    }
    public void KsCrossroad(String p0,String p1,String p2,String p3,KsLocation p4,float p5,String p6){
       super();
       this.firstId = p0;
       this.secondId = p1;
       this.firstName = p2;
       this.secondName = p3;
       this.location = p4;
       this.distance = p5;
       this.direction = p6;
    }
    public void KsCrossroad(String p0,String p1,String p2,String p3,KsLocation p4,float p5,String p6,int p7,u p8){
       int i = (p7 & 0x01)? 0: p0;
       int i1 = (p7 & 0x02)? 0: p1;
       int i2 = (p7 & 0x04)? 0: p2;
       int i3 = (p7 & 0x08)? 0: p3;
       int i4 = (p7 & 0x10)? 0: p4;
       int i5 = (p7 & 0x20)? 0: p5;
       String str = (p7 & 0x40)? null: p6;
       super(i, i1, i2, i3, i4, i5, str);
       return;
    }
    public static KsCrossroad copy$default(KsCrossroad p0,String p1,String p2,String p3,String p4,KsLocation p5,float p6,String p7,int p8,Object p9){
       KsCrossroad firstId;
       KsCrossroad secondId;
       KsCrossroad firstName;
       KsCrossroad secondName;
       KsCrossroad location;
       KsCrossroad distance;
       KsCrossroad direction;
       if (p8 & 0x01) {
          firstId = p0.firstId;
       }
       if (p8 & 0x02) {
          secondId = p0.secondId;
       }
       p9 = secondId;
       if (p8 & 0x04) {
          firstName = p0.firstName;
       }
       KsCrossroad ksCrossroad = firstName;
       if (p8 & 0x08) {
          secondName = p0.secondName;
       }
       KsCrossroad ksCrossroad1 = secondName;
       if (p8 & 0x10) {
          location = p0.location;
       }
       KsCrossroad ksCrossroad2 = location;
       if (p8 & 0x20) {
          distance = p0.distance;
       }
       KsCrossroad ksCrossroad3 = distance;
       if (p8 & 0x40) {
          direction = p0.direction;
       }
       return p0.copy(firstId, p9, ksCrossroad, ksCrossroad1, ksCrossroad2, ksCrossroad3, direction);
    }
    public final String component1(){
       return this.firstId;
    }
    public final String component2(){
       return this.secondId;
    }
    public final String component3(){
       return this.firstName;
    }
    public final String component4(){
       return this.secondName;
    }
    public final KsLocation component5(){
       return this.location;
    }
    public final float component6(){
       return this.distance;
    }
    public final String component7(){
       return this.direction;
    }
    public final KsCrossroad copy(String p0,String p1,String p2,String p3,KsLocation p4,float p5,String p6){
       Object obj;
       KsCrossroad ksCrossroad = KsCrossroad.class;
       if (PatchProxy.isSupport(ksCrossroad)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Float.valueOf(p5),p6};
          obj = PatchProxy.apply(objArray, this, ksCrossroad, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KsCrossroad ksCrossroad1 = new KsCrossroad(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsCrossroad.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsCrossroad && (a.g(this.firstId, p0.firstId) && (a.g(this.secondId, p0.secondId) && (a.g(this.firstName, p0.firstName) && (a.g(this.secondName, p0.secondName) && (a.g(this.location, p0.location) && (!Float.compare(this.distance, p0.distance) && a.g(this.direction, p0.direction))))))))) {
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
    public final String getFirstId(){
       return this.firstId;
    }
    public final String getFirstName(){
       return this.firstName;
    }
    public final KsLocation getLocation(){
       return this.location;
    }
    public final String getSecondId(){
       return this.secondId;
    }
    public final String getSecondName(){
       return this.secondName;
    }
    public int hashCode(){
       KsCrossroad obj = PatchProxy.apply(null, this, KsCrossroad.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.firstId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsCrossroad tsecondId = this.secondId;
       int i2 = (tsecondId != null)? tsecondId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsecondId = this.firstName;
       i2 = (tsecondId != null)? tsecondId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsecondId = this.secondName;
       i2 = (tsecondId != null)? tsecondId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsecondId = this.location;
       i2 = (tsecondId != null)? tsecondId.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.distance)) * 31;
       tsecondId = this.direction;
       if (tsecondId != null) {
          i = tsecondId.hashCode();
       }
       return (i1 + i);
    }
    public final void setDirection(String p0){
       this.direction = p0;
    }
    public final void setDistance(float p0){
       this.distance = p0;
    }
    public final void setFirstId(String p0){
       this.firstId = p0;
    }
    public final void setFirstName(String p0){
       this.firstName = p0;
    }
    public final void setLocation(KsLocation p0){
       this.location = p0;
    }
    public final void setSecondId(String p0){
       this.secondId = p0;
    }
    public final void setSecondName(String p0){
       this.secondName = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsCrossroad.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsCrossroad\(firstId="+this.firstId+", secondId="+this.secondId+", firstName="+this.firstName+", secondName="+this.secondName+", location="+this.location+", distance="+this.distance+", direction="+this.direction+"\)";
    }
}
