package com.yxcorp.gifshow.profile.model.IpLocation;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.LocationDescInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IpLocation implements Serializable	// class@00138b
{
    public final String ipDarkIconUrl;
    public final String ipIconUrl;
    public String ipLocationCode;
    public final LocationDescInfo ipLocationDesc;
    public String ipLocationName;
    public final LocationDescInfo locationDesc;
    public String tipMsg;
    public String tipTitle;

    public void IpLocation(String p0,String p1,String p2,String p3,LocationDescInfo p4,LocationDescInfo p5,String p6,String p7){
       a.p(p4, "locationDesc");
       a.p(p5, "ipLocationDesc");
       super();
       this.ipLocationName = p0;
       this.ipLocationCode = p1;
       this.tipTitle = p2;
       this.tipMsg = p3;
       this.locationDesc = p4;
       this.ipLocationDesc = p5;
       this.ipIconUrl = p6;
       this.ipDarkIconUrl = p7;
    }
    public void IpLocation(String p0,String p1,String p2,String p3,LocationDescInfo p4,LocationDescInfo p5,String p6,String p7,int p8,u p9){
       int i = p8;
       String str = (i & 0x01)? null: p0;
       String str1 = (i & 0x02)? null: p1;
       String str2 = (i & 0x04)? null: p2;
       String str3 = (i & 0x08)? null: p3;
       String str4 = (i & 0x40)? null: p6;
       String str5 = (i & 0x0080)? null: p7;
       super(str, str1, str2, str3, p4, p5, str4, str5);
       return;
    }
    public static IpLocation copy$default(IpLocation p0,String p1,String p2,String p3,String p4,LocationDescInfo p5,LocationDescInfo p6,String p7,String p8,int p9,Object p10){
       IpLocation ipLocation = p0;
       int i = p9;
       IpLocation ipLocationNa = (i & 0x01)? ipLocation.ipLocationName: p1;
       IpLocation ipLocationCo = (i & 0x02)? ipLocation.ipLocationCode: p2;
       IpLocation tipTitle = (i & 0x04)? ipLocation.tipTitle: p3;
       IpLocation tipMsg = (i & 0x08)? ipLocation.tipMsg: p4;
       IpLocation locationDesc = (i & 0x10)? ipLocation.locationDesc: p5;
       IpLocation ipLocationDe = (i & 0x20)? ipLocation.ipLocationDesc: p6;
       IpLocation ipIconUrl = (i & 0x40)? ipLocation.ipIconUrl: p7;
       IpLocation ipDarkIconUr = (i & 0x0080)? ipLocation.ipDarkIconUrl: p8;
       return p0.copy(ipLocationNa, ipLocationCo, tipTitle, tipMsg, locationDesc, ipLocationDe, ipIconUrl, ipDarkIconUr);
    }
    public final String component1(){
       return this.ipLocationName;
    }
    public final String component2(){
       return this.ipLocationCode;
    }
    public final String component3(){
       return this.tipTitle;
    }
    public final String component4(){
       return this.tipMsg;
    }
    public final LocationDescInfo component5(){
       return this.locationDesc;
    }
    public final LocationDescInfo component6(){
       return this.ipLocationDesc;
    }
    public final String component7(){
       return this.ipIconUrl;
    }
    public final String component8(){
       return this.ipDarkIconUrl;
    }
    public final IpLocation copy(String p0,String p1,String p2,String p3,LocationDescInfo p4,LocationDescInfo p5,String p6,String p7){
       IpLocation obj;
       object oobject = p4;
       object oobject1 = p5;
       if (PatchProxy.isSupport(IpLocation.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,oobject,oobject1,p6,p7};
          obj = PatchProxy.apply(objArray, this, IpLocation.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "locationDesc");
       a.p(oobject1, "ipLocationDesc");
       obj = new IpLocation(p0, p1, p2, p3, p4, p5, p6, p7);
       return v10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IpLocation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IpLocation && (a.g(this.ipLocationName, p0.ipLocationName) && (a.g(this.ipLocationCode, p0.ipLocationCode) && (a.g(this.tipTitle, p0.tipTitle) && (a.g(this.tipMsg, p0.tipMsg) && (a.g(this.locationDesc, p0.locationDesc) && (a.g(this.ipLocationDesc, p0.ipLocationDesc) && (a.g(this.ipIconUrl, p0.ipIconUrl) && a.g(this.ipDarkIconUrl, p0.ipDarkIconUrl)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       IpLocation obj = PatchProxy.apply(null, this, IpLocation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ipLocationName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       IpLocation tipLocationC = this.ipLocationCode;
       int i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.tipTitle;
       i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.tipMsg;
       i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.locationDesc;
       i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.ipLocationDesc;
       i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.ipIconUrl;
       i2 = (tipLocationC != null)? tipLocationC.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tipLocationC = this.ipDarkIconUrl;
       if (tipLocationC != null) {
          i = tipLocationC.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IpLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IpLocation\(ipLocationName="+this.ipLocationName+", ipLocationCode="+this.ipLocationCode+", tipTitle="+this.tipTitle+", tipMsg="+this.tipMsg+", locationDesc="+this.locationDesc+", ipLocationDesc="+this.ipLocationDesc+", ipIconUrl="+this.ipIconUrl+", ipDarkIconUrl="+this.ipDarkIconUrl+"\)";
    }
}
