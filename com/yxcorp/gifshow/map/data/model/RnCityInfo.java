package com.yxcorp.gifshow.map.data.model.RnCityInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RnCityInfo	// class@001c7b
{
    public final String city;
    public final String displayCity;
    public final String province;

    public void RnCityInfo(String p0,String p1,String p2){
       super();
       this.displayCity = p0;
       this.city = p1;
       this.province = p2;
    }
    public static RnCityInfo copy$default(RnCityInfo p0,String p1,String p2,String p3,int p4,Object p5){
       RnCityInfo displayCity;
       RnCityInfo city;
       RnCityInfo province;
       if (p4 & 0x01) {
          displayCity = p0.displayCity;
       }
       if (p4 & 0x02) {
          city = p0.city;
       }
       if (p4 & 0x04) {
          province = p0.province;
       }
       return p0.copy(displayCity, city, province);
    }
    public final String component1(){
       return this.displayCity;
    }
    public final String component2(){
       return this.city;
    }
    public final String component3(){
       return this.province;
    }
    public final RnCityInfo copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RnCityInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RnCityInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnCityInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RnCityInfo && (a.g(this.displayCity, p0.displayCity) && (a.g(this.city, p0.city) && a.g(this.province, p0.province))))) {
          return true;
       }
       return false;
    }
    public final String getCity(){
       return this.city;
    }
    public final String getDisplayCity(){
       return this.displayCity;
    }
    public final String getProvince(){
       return this.province;
    }
    public int hashCode(){
       RnCityInfo obj = PatchProxy.apply(null, this, RnCityInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.displayCity;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RnCityInfo tcity = this.city;
       int i2 = (tcity != null)? tcity.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcity = this.province;
       if (tcity != null) {
          i = tcity.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RnCityInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RnCityInfo\(displayCity="+this.displayCity+", city="+this.city+", province="+this.province+"\)";
    }
}
