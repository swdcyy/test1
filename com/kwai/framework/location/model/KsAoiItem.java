package com.kwai.framework.location.model.KsAoiItem;
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

public final class KsAoiItem	// class@00164c
{
    public String adcode;
    public float area;
    public KsLocation location;
    public String name;
    public String uid;

    public void KsAoiItem(){
       super(0, null, null, null, null, 31, null);
    }
    public void KsAoiItem(float p0,String p1,String p2,KsLocation p3,String p4){
       super();
       this.area = p0;
       this.uid = p1;
       this.name = p2;
       this.location = p3;
       this.adcode = p4;
    }
    public void KsAoiItem(float p0,String p1,String p2,KsLocation p3,String p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       int i = 0;
       int i1 = (p5 & 0x02)? i: p1;
       int i2 = (p5 & 0x04)? i: p2;
       int i3 = (p5 & 0x08)? i: p3;
       if (!(p5 & 0x10)) {
          i = p4;
       }
       super(p0, i1, i2, i3, i);
       return;
    }
    public static KsAoiItem copy$default(KsAoiItem p0,float p1,String p2,String p3,KsLocation p4,String p5,int p6,Object p7){
       KsAoiItem area;
       KsAoiItem uid;
       KsAoiItem name;
       KsAoiItem location;
       KsAoiItem adcode;
       if (p6 & 0x01) {
          area = p0.area;
       }
       if (p6 & 0x02) {
          uid = p0.uid;
       }
       p7 = uid;
       if (p6 & 0x04) {
          name = p0.name;
       }
       KsAoiItem ksAoiItem = name;
       if (p6 & 0x08) {
          location = p0.location;
       }
       KsAoiItem ksAoiItem1 = location;
       if (p6 & 0x10) {
          adcode = p0.adcode;
       }
       return p0.copy(area, p7, ksAoiItem, ksAoiItem1, adcode);
    }
    public final float component1(){
       return this.area;
    }
    public final String component2(){
       return this.uid;
    }
    public final String component3(){
       return this.name;
    }
    public final KsLocation component4(){
       return this.location;
    }
    public final String component5(){
       return this.adcode;
    }
    public final KsAoiItem copy(float p0,String p1,String p2,KsLocation p3,String p4){
       Object obj;
       KsAoiItem ksAoiItem = KsAoiItem.class;
       if (PatchProxy.isSupport(ksAoiItem)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, ksAoiItem, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KsAoiItem ksAoiItem1 = new KsAoiItem(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsAoiItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsAoiItem && (!Float.compare(this.area, p0.area) && (a.g(this.uid, p0.uid) && (a.g(this.name, p0.name) && (a.g(this.location, p0.location) && a.g(this.adcode, p0.adcode))))))) {
          return true;
       }
       return false;
    }
    public final String getAdcode(){
       return this.adcode;
    }
    public final float getArea(){
       return this.area;
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
       Object obj = PatchProxy.apply(null, this, KsAoiItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Float.floatToIntBits(this.area) * 31;
       KsAoiItem tuid = this.uid;
       int i1 = 0;
       int i2 = (tuid != null)? tuid.hashCode(): 0;
       i = (i + i2) * 31;
       tuid = this.name;
       i2 = (tuid != null)? tuid.hashCode(): 0;
       i = (i + i2) * 31;
       tuid = this.location;
       i2 = (tuid != null)? tuid.hashCode(): 0;
       i = (i + i2) * 31;
       tuid = this.adcode;
       if (tuid != null) {
          i1 = tuid.hashCode();
       }
       return (i + i1);
    }
    public final void setAdcode(String p0){
       this.adcode = p0;
    }
    public final void setArea(float p0){
       this.area = p0;
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
       Object obj = PatchProxy.apply(null, this, KsAoiItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsAoiItem\(area="+this.area+", uid="+this.uid+", name="+this.name+", location="+this.location+", adcode="+this.adcode+"\)";
    }
}
