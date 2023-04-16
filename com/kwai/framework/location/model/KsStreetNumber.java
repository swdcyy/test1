package com.kwai.framework.location.model.KsStreetNumber;
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

public final class KsStreetNumber	// class@001653
{
    public String direction;
    public float distance;
    public KsLocation location;
    public String number;
    public String street;

    public void KsStreetNumber(){
       super(null, null, null, null, 0, 31, null);
    }
    public void KsStreetNumber(String p0,String p1,String p2,KsLocation p3,float p4){
       super();
       this.direction = p0;
       this.number = p1;
       this.street = p2;
       this.location = p3;
       this.distance = p4;
    }
    public void KsStreetNumber(String p0,String p1,String p2,KsLocation p3,float p4,int p5,u p6){
       int i = 0;
       int i1 = (p5 & 0x01)? i: p0;
       int i2 = (p5 & 0x02)? i: p1;
       int i3 = (p5 & 0x04)? i: p2;
       if (!(p5 & 0x08)) {
          i = p3;
       }
       float f = (p5 & 0x10)? 0: p4;
       super(i1, i2, i3, i, f);
       return;
    }
    public static KsStreetNumber copy$default(KsStreetNumber p0,String p1,String p2,String p3,KsLocation p4,float p5,int p6,Object p7){
       KsStreetNumber direction;
       KsStreetNumber number;
       KsStreetNumber street;
       KsStreetNumber location;
       KsStreetNumber distance;
       if (p6 & 0x01) {
          direction = p0.direction;
       }
       if (p6 & 0x02) {
          number = p0.number;
       }
       p7 = number;
       if (p6 & 0x04) {
          street = p0.street;
       }
       KsStreetNumber ksStreetNumb = street;
       if (p6 & 0x08) {
          location = p0.location;
       }
       KsStreetNumber ksStreetNumb1 = location;
       if (p6 & 0x10) {
          distance = p0.distance;
       }
       return p0.copy(direction, p7, ksStreetNumb, ksStreetNumb1, distance);
    }
    public final String component1(){
       return this.direction;
    }
    public final String component2(){
       return this.number;
    }
    public final String component3(){
       return this.street;
    }
    public final KsLocation component4(){
       return this.location;
    }
    public final float component5(){
       return this.distance;
    }
    public final KsStreetNumber copy(String p0,String p1,String p2,KsLocation p3,float p4){
       Object obj;
       KsStreetNumber ksStreetNumb = KsStreetNumber.class;
       if (PatchProxy.isSupport(ksStreetNumb)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, ksStreetNumb, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KsStreetNumber ksStreetNumb1 = new KsStreetNumber(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsStreetNumber.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsStreetNumber && (a.g(this.direction, p0.direction) && (a.g(this.number, p0.number) && (a.g(this.street, p0.street) && (a.g(this.location, p0.location) && !Float.compare(this.distance, p0.distance))))))) {
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
    public final String getNumber(){
       return this.number;
    }
    public final String getStreet(){
       return this.street;
    }
    public int hashCode(){
       KsStreetNumber obj = PatchProxy.apply(null, this, KsStreetNumber.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.direction;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsStreetNumber tnumber = this.number;
       int i2 = (tnumber != null)? tnumber.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnumber = this.street;
       i2 = (tnumber != null)? tnumber.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnumber = this.location;
       if (tnumber != null) {
          i = tnumber.hashCode();
       }
       return (((i1 + i) * 31) + Float.floatToIntBits(this.distance));
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
    public final void setNumber(String p0){
       this.number = p0;
    }
    public final void setStreet(String p0){
       this.street = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsStreetNumber.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsStreetNumber\(direction="+this.direction+", number="+this.number+", street="+this.street+", location="+this.location+", distance="+this.distance+"\)";
    }
}
