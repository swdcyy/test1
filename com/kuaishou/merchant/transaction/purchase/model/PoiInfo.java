package com.kuaishou.merchant.transaction.purchase.model.PoiInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.purchase.model.PoiInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class PoiInfo implements Serializable	// class@000948
{
    public final String address;
    public final String distance;
    public final String id;
    public final String listJumpUrl;
    public final String msg;
    public final String name;
    public final boolean needRefreshPoi;
    public static final PoiInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PoiInfo.Companion = new PoiInfo$a(null);
    }
    public void PoiInfo(String p0,String p1,String p2,String p3,boolean p4,String p5,String p6){
       super();
       this.id = p0;
       this.name = p1;
       this.address = p2;
       this.distance = p3;
       this.needRefreshPoi = p4;
       this.msg = p5;
       this.listJumpUrl = p6;
    }
    public void PoiInfo(String p0,String p1,String p2,String p3,boolean p4,String p5,String p6,int p7,u p8){
       String str = (p7 & 0x01)? null: p0;
       String str1 = (p7 & 0x02)? null: p1;
       String str2 = (p7 & 0x04)? null: p2;
       String str3 = (p7 & 0x08)? null: p3;
       String str4 = (p7 & 0x20)? null: p5;
       String str5 = (p7 & 0x40)? null: p6;
       super(str, str1, str2, str3, p4, str4, str5);
       return;
    }
    public static PoiInfo copy$default(PoiInfo p0,String p1,String p2,String p3,String p4,boolean p5,String p6,String p7,int p8,Object p9){
       PoiInfo id;
       PoiInfo name;
       PoiInfo address;
       PoiInfo distance;
       PoiInfo needRefreshP;
       PoiInfo msg;
       PoiInfo listJumpUrl;
       if (p8 & 0x01) {
          id = p0.id;
       }
       if (p8 & 0x02) {
          name = p0.name;
       }
       p9 = name;
       if (p8 & 0x04) {
          address = p0.address;
       }
       PoiInfo poiInfo = address;
       if (p8 & 0x08) {
          distance = p0.distance;
       }
       PoiInfo poiInfo1 = distance;
       if (p8 & 0x10) {
          needRefreshP = p0.needRefreshPoi;
       }
       PoiInfo poiInfo2 = needRefreshP;
       if (p8 & 0x20) {
          msg = p0.msg;
       }
       PoiInfo poiInfo3 = msg;
       if (p8 & 0x40) {
          listJumpUrl = p0.listJumpUrl;
       }
       return p0.copy(id, p9, poiInfo, poiInfo1, poiInfo2, poiInfo3, listJumpUrl);
    }
    public final String component1(){
       return this.id;
    }
    public final String component2(){
       return this.name;
    }
    public final String component3(){
       return this.address;
    }
    public final String component4(){
       return this.distance;
    }
    public final boolean component5(){
       return this.needRefreshPoi;
    }
    public final String component6(){
       return this.msg;
    }
    public final String component7(){
       return this.listJumpUrl;
    }
    public final PoiInfo copy(String p0,String p1,String p2,String p3,boolean p4,String p5,String p6){
       Object obj;
       if (PatchProxy.isSupport(PoiInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6};
          obj = PatchProxy.apply(objArray, this, PoiInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       PoiInfo poiInfo = new PoiInfo(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PoiInfo && (a.g(this.id, p0.id) && (a.g(this.name, p0.name) && (a.g(this.address, p0.address) && (a.g(this.distance, p0.distance) && (this.needRefreshPoi == p0.needRefreshPoi && (a.g(this.msg, p0.msg) && a.g(this.listJumpUrl, p0.listJumpUrl))))))))) {
          return true;
       }
       return false;
    }
    public final String getAddress(){
       return this.address;
    }
    public final String getDistance(){
       return this.distance;
    }
    public final String getListJumpUrl(){
       return this.listJumpUrl;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final String getName(){
       return this.name;
    }
    public final boolean getNeedRefreshPoi(){
       return this.needRefreshPoi;
    }
    public int hashCode(){
       PoiInfo obj = PatchProxy.apply(null, this, PoiInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PoiInfo tname = this.name;
       int i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tname = this.address;
       i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tname = this.distance;
       i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tname = this.needRefreshPoi;
       if (tname != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tname = this.msg;
       i2 = (tname != null)? tname.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tname = this.listJumpUrl;
       if (tname != null) {
          i = tname.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isValid(){
       PoiInfo obj = PatchProxy.apply(null, this, PoiInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.id;
       int i = (obj == null || !obj.length())? 1: 0;
       return (i ^ 1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PoiInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiInfo\(id="+this.id+", name="+this.name+", address="+this.address+", distance="+this.distance+", needRefreshPoi="+this.needRefreshPoi+", msg="+this.msg+", listJumpUrl="+this.listJumpUrl+"\)";
    }
}
