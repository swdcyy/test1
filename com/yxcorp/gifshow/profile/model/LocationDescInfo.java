package com.yxcorp.gifshow.profile.model.LocationDescInfo;
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

public final class LocationDescInfo implements Serializable	// class@00138d
{
    public String buttonDesc;
    public String buttonUrl;
    public String desc;
    public String leftDarkIcon;
    public String leftIcon;

    public void LocationDescInfo(){
       super(null, null, null, null, null, 31, null);
    }
    public void LocationDescInfo(String p0,String p1,String p2,String p3,String p4){
       super();
       this.leftIcon = p0;
       this.leftDarkIcon = p1;
       this.desc = p2;
       this.buttonDesc = p3;
       this.buttonUrl = p4;
    }
    public void LocationDescInfo(String p0,String p1,String p2,String p3,String p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       String str = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, str);
       return;
    }
    public static LocationDescInfo copy$default(LocationDescInfo p0,String p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       LocationDescInfo leftIcon;
       LocationDescInfo leftDarkIcon;
       LocationDescInfo desc;
       LocationDescInfo buttonDesc;
       LocationDescInfo buttonUrl;
       if (p6 & 0x01) {
          leftIcon = p0.leftIcon;
       }
       if (p6 & 0x02) {
          leftDarkIcon = p0.leftDarkIcon;
       }
       p7 = leftDarkIcon;
       if (p6 & 0x04) {
          desc = p0.desc;
       }
       LocationDescInfo locationDesc = desc;
       if (p6 & 0x08) {
          buttonDesc = p0.buttonDesc;
       }
       LocationDescInfo locationDesc1 = buttonDesc;
       if (p6 & 0x10) {
          buttonUrl = p0.buttonUrl;
       }
       return p0.copy(leftIcon, p7, locationDesc, locationDesc1, buttonUrl);
    }
    public final String component1(){
       return this.leftIcon;
    }
    public final String component2(){
       return this.leftDarkIcon;
    }
    public final String component3(){
       return this.desc;
    }
    public final String component4(){
       return this.buttonDesc;
    }
    public final String component5(){
       return this.buttonUrl;
    }
    public final LocationDescInfo copy(String p0,String p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(LocationDescInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, LocationDescInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LocationDescInfo locationDesc = new LocationDescInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocationDescInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LocationDescInfo && (a.g(this.leftIcon, p0.leftIcon) && (a.g(this.leftDarkIcon, p0.leftDarkIcon) && (a.g(this.desc, p0.desc) && (a.g(this.buttonDesc, p0.buttonDesc) && a.g(this.buttonUrl, p0.buttonUrl))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LocationDescInfo obj = PatchProxy.apply(null, this, LocationDescInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.leftIcon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LocationDescInfo tleftDarkIco = this.leftDarkIcon;
       int i2 = (tleftDarkIco != null)? tleftDarkIco.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftDarkIco = this.desc;
       i2 = (tleftDarkIco != null)? tleftDarkIco.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftDarkIco = this.buttonDesc;
       i2 = (tleftDarkIco != null)? tleftDarkIco.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftDarkIco = this.buttonUrl;
       if (tleftDarkIco != null) {
          i = tleftDarkIco.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LocationDescInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocationDescInfo\(leftIcon="+this.leftIcon+", leftDarkIcon="+this.leftDarkIcon+", desc="+this.desc+", buttonDesc="+this.buttonDesc+", buttonUrl="+this.buttonUrl+"\)";
    }
}
