package com.yxcorp.gifshow.nearby.common.model.NearbyRedDotModel;
import com.yxcorp.gifshow.reddot.model.RedDotLogModelWithNotifyId;
import com.yxcorp.gifshow.nearby.common.model.NearbyRedDotModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.reddot.model.RedDotLogModel;

public final class NearbyRedDotModel extends RedDotLogModelWithNotifyId	// class@00212d
{
    public final boolean asDot;
    public final String combineType;
    public final boolean isCombine;
    public final int level;
    public final String location;
    public final String notifyId;
    public final int redPointType;
    public final int showNum;
    public static final NearbyRedDotModel$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyRedDotModel.Companion = new NearbyRedDotModel$a(null);
    }
    public void NearbyRedDotModel(String p0,int p1,int p2,boolean p3,boolean p4,String p5,String p6,int p7){
       a.p(p0, "location");
       a.p(p5, "combineType");
       a.p(p6, "notifyId");
       super(p0, p1, p2, p3, p4, p5, p6);
       this.location = p0;
       this.level = p1;
       this.showNum = p2;
       this.asDot = p3;
       this.isCombine = p4;
       this.combineType = p5;
       this.notifyId = p6;
       this.redPointType = p7;
    }
    public static NearbyRedDotModel copy$default(NearbyRedDotModel p0,String p1,int p2,int p3,boolean p4,boolean p5,String p6,String p7,int p8,int p9,Object p10){
       NearbyRedDotModel nearbyRedDot = p0;
       int i = p9;
       NearbyRedDotModel location = (i & 0x01)? nearbyRedDot.location: p1;
       NearbyRedDotModel level = (i & 0x02)? nearbyRedDot.level: p2;
       NearbyRedDotModel showNum = (i & 0x04)? nearbyRedDot.showNum: p3;
       NearbyRedDotModel asDot = (i & 0x08)? nearbyRedDot.asDot: p4;
       NearbyRedDotModel isCombine = (i & 0x10)? nearbyRedDot.isCombine: p5;
       NearbyRedDotModel combineType = (i & 0x20)? nearbyRedDot.combineType: p6;
       NearbyRedDotModel notifyId = (i & 0x40)? nearbyRedDot.notifyId: p7;
       NearbyRedDotModel redPointType = (i & 0x0080)? nearbyRedDot.redPointType: p8;
       return p0.copy(location, level, showNum, asDot, isCombine, combineType, notifyId, redPointType);
    }
    public final String component1(){
       return this.location;
    }
    public final int component2(){
       return this.level;
    }
    public final int component3(){
       return this.showNum;
    }
    public final boolean component4(){
       return this.asDot;
    }
    public final boolean component5(){
       return this.isCombine;
    }
    public final String component6(){
       return this.combineType;
    }
    public final String component7(){
       return this.notifyId;
    }
    public final int component8(){
       return this.redPointType;
    }
    public final NearbyRedDotModel copy(String p0,int p1,int p2,boolean p3,boolean p4,String p5,String p6,int p7){
       NearbyRedDotModel obj;
       object oobject = p0;
       object oobject1 = p5;
       object oobject2 = p6;
       if (PatchProxy.isSupport(NearbyRedDotModel.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4),oobject1,oobject2,Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, NearbyRedDotModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "location");
       a.p(oobject1, "combineType");
       a.p(oobject2, "notifyId");
       obj = new NearbyRedDotModel(p0, p1, p2, p3, p4, p5, p6, p7);
       return v10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyRedDotModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyRedDotModel && (a.g(this.location, p0.location) && (this.level == p0.level && (this.showNum == p0.showNum && (this.asDot == p0.asDot && (this.isCombine == p0.isCombine && (a.g(this.combineType, p0.combineType) && (a.g(this.notifyId, p0.notifyId) && this.redPointType == p0.redPointType))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getAsDot(){
       return this.asDot;
    }
    public final String getCombineType(){
       return this.combineType;
    }
    public final int getLevel(){
       return this.level;
    }
    public final String getLocation(){
       return this.location;
    }
    public final String getNotifyId(){
       return this.notifyId;
    }
    public final int getRedPointType(){
       return this.redPointType;
    }
    public final int getShowNum(){
       return this.showNum;
    }
    public int hashCode(){
       NearbyRedDotModel obj = PatchProxy.apply(null, this, NearbyRedDotModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.location;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.level) * 31) + this.showNum) * 31;
       NearbyRedDotModel tasDot = this.asDot;
       int i2 = 1;
       if (tasDot != null) {
          tasDot = 1;
       }
       i1 = (i1 + tasDot) * 31;
       tasDot = this.isCombine;
       if (tasDot == null) {
          i2 = tasDot;
       }
       i1 = (i1 + i2) * 31;
       tasDot = this.combineType;
       int i3 = (tasDot != null)? tasDot.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tasDot = this.notifyId;
       if (tasDot != null) {
          i = tasDot.hashCode();
       }
       return (((i1 + i) * 31) + this.redPointType);
    }
    public final boolean isCombine(){
       return this.isCombine;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, NearbyRedDotModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.toString();
       a.o(obj, "super.toString\(\)");
       return obj;
    }
}
