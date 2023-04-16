package com.yxcorp.gifshow.profile.model.Hometown;
import java.io.Serializable;
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

public final class Hometown implements Serializable	// class@001388
{
    public final String cityCode;
    public final String cityName;

    public void Hometown(){
       super(null, null, 3, null);
    }
    public void Hometown(String p0,String p1){
       super();
       this.cityName = p0;
       this.cityCode = p1;
    }
    public void Hometown(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static Hometown copy$default(Hometown p0,String p1,String p2,int p3,Object p4){
       Hometown cityName;
       Hometown cityCode;
       if (p3 & 0x01) {
          cityName = p0.cityName;
       }
       if (p3 & 0x02) {
          cityCode = p0.cityCode;
       }
       return p0.copy(cityName, cityCode);
    }
    public final String component1(){
       return this.cityName;
    }
    public final String component2(){
       return this.cityCode;
    }
    public final Hometown copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Hometown.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Hometown(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Hometown.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Hometown && (a.g(this.cityName, p0.cityName) && a.g(this.cityCode, p0.cityCode)))) {
          return true;
       }
       return false;
    }
    public final String getCityCode(){
       return this.cityCode;
    }
    public final String getCityName(){
       return this.cityName;
    }
    public int hashCode(){
       Hometown obj = PatchProxy.apply(null, this, Hometown.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cityName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Hometown tcityCode = this.cityCode;
       if (tcityCode != null) {
          i = tcityCode.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Hometown.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Hometown\(cityName="+this.cityName+", cityCode="+this.cityCode+"\)";
    }
}
