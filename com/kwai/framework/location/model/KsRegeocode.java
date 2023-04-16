package com.kwai.framework.location.model.KsRegeocode;
import java.util.List;
import com.kwai.framework.location.model.KsAddressComponent;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsRegeocode	// class@001651
{
    public KsAddressComponent addressComponent;
    public List aois;
    public String formattedAddress;
    public List pois;
    public List roadinters;
    public List roads;

    public void KsRegeocode(){
       super(null, null, null, null, null, null, 63, null);
    }
    public void KsRegeocode(List p0,List p1,KsAddressComponent p2,String p3,List p4,List p5){
       super();
       this.roadinters = p0;
       this.roads = p1;
       this.addressComponent = p2;
       this.formattedAddress = p3;
       this.pois = p4;
       this.aois = p5;
    }
    public void KsRegeocode(List p0,List p1,KsAddressComponent p2,String p3,List p4,List p5,int p6,u p7){
       int i = (p6 & 0x01)? 0: p0;
       int i1 = (p6 & 0x02)? 0: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 0: p4;
       List list = (p6 & 0x20)? null: p5;
       super(i, i1, i2, i3, i4, list);
       return;
    }
    public static KsRegeocode copy$default(KsRegeocode p0,List p1,List p2,KsAddressComponent p3,String p4,List p5,List p6,int p7,Object p8){
       KsRegeocode roadinters;
       KsRegeocode roads;
       KsRegeocode addressCompo;
       KsRegeocode formattedAdd;
       KsRegeocode pois;
       KsRegeocode aois;
       if (p7 & 0x01) {
          roadinters = p0.roadinters;
       }
       if (p7 & 0x02) {
          roads = p0.roads;
       }
       p8 = roads;
       if (p7 & 0x04) {
          addressCompo = p0.addressComponent;
       }
       KsRegeocode ksRegeocode = addressCompo;
       if (p7 & 0x08) {
          formattedAdd = p0.formattedAddress;
       }
       KsRegeocode ksRegeocode1 = formattedAdd;
       if (p7 & 0x10) {
          pois = p0.pois;
       }
       KsRegeocode ksRegeocode2 = pois;
       if (p7 & 0x20) {
          aois = p0.aois;
       }
       return p0.copy(roadinters, p8, ksRegeocode, ksRegeocode1, ksRegeocode2, aois);
    }
    public final List component1(){
       return this.roadinters;
    }
    public final List component2(){
       return this.roads;
    }
    public final KsAddressComponent component3(){
       return this.addressComponent;
    }
    public final String component4(){
       return this.formattedAddress;
    }
    public final List component5(){
       return this.pois;
    }
    public final List component6(){
       return this.aois;
    }
    public final KsRegeocode copy(List p0,List p1,KsAddressComponent p2,String p3,List p4,List p5){
       Object obj;
       KsRegeocode ksRegeocode = KsRegeocode.class;
       if (PatchProxy.isSupport(ksRegeocode)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, ksRegeocode, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KsRegeocode ksRegeocode1 = new KsRegeocode(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsRegeocode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsRegeocode && (a.g(this.roadinters, p0.roadinters) && (a.g(this.roads, p0.roads) && (a.g(this.addressComponent, p0.addressComponent) && (a.g(this.formattedAddress, p0.formattedAddress) && (a.g(this.pois, p0.pois) && a.g(this.aois, p0.aois)))))))) {
          return true;
       }
       return false;
    }
    public final KsAddressComponent getAddressComponent(){
       return this.addressComponent;
    }
    public final List getAois(){
       return this.aois;
    }
    public final String getFormattedAddress(){
       return this.formattedAddress;
    }
    public final List getPois(){
       return this.pois;
    }
    public final List getRoadinters(){
       return this.roadinters;
    }
    public final List getRoads(){
       return this.roads;
    }
    public int hashCode(){
       KsRegeocode obj = PatchProxy.apply(null, this, KsRegeocode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.roadinters;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsRegeocode troads = this.roads;
       int i2 = (troads != null)? troads.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       troads = this.addressComponent;
       i2 = (troads != null)? troads.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       troads = this.formattedAddress;
       i2 = (troads != null)? troads.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       troads = this.pois;
       i2 = (troads != null)? troads.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       troads = this.aois;
       if (troads != null) {
          i = troads.hashCode();
       }
       return (i1 + i);
    }
    public final void setAddressComponent(KsAddressComponent p0){
       this.addressComponent = p0;
    }
    public final void setAois(List p0){
       this.aois = p0;
    }
    public final void setFormattedAddress(String p0){
       this.formattedAddress = p0;
    }
    public final void setPois(List p0){
       this.pois = p0;
    }
    public final void setRoadinters(List p0){
       this.roadinters = p0;
    }
    public final void setRoads(List p0){
       this.roads = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsRegeocode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsRegeocode\(roadinters="+this.roadinters+", roads="+this.roads+", addressComponent="+this.addressComponent+", formattedAddress="+this.formattedAddress+", pois="+this.pois+", aois="+this.aois+"\)";
    }
}
