package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$Result;
import java.io.Serializable;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$Result$a;
import nsd.u;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GcManageInitModule$Result implements Serializable	// class@000e75
{
    public final Map beginMap;
    public final Map endMap;
    public final int freeThresholdMB;
    public final float gcPerMinute;
    public final boolean isCheckSizeFail;
    public final Map map;
    public final String name;
    public final String uuid;
    public static final GcManageInitModule$Result$a Companion;
    public static final long serialVersionUID;

    static {
       GcManageInitModule$Result.Companion = new GcManageInitModule$Result$a(null);
    }
    public void GcManageInitModule$Result(String p0,float p1,String p2,int p3,boolean p4,Map p5,Map p6,Map p7){
       a.p(p0, "name");
       a.p(p2, "uuid");
       a.p(p5, "map");
       a.p(p6, "beginMap");
       a.p(p7, "endMap");
       super();
       this.name = p0;
       this.gcPerMinute = p1;
       this.uuid = p2;
       this.freeThresholdMB = p3;
       this.isCheckSizeFail = p4;
       this.map = p5;
       this.beginMap = p6;
       this.endMap = p7;
    }
    public static GcManageInitModule$Result copy$default(GcManageInitModule$Result p0,String p1,float p2,String p3,int p4,boolean p5,Map p6,Map p7,Map p8,int p9,Object p10){
       GcManageInitModule$Result result = p0;
       int i = p9;
       GcManageInitModule$Result name = (i & 0x01)? result.name: p1;
       GcManageInitModule$Result gcPerMinute = (i & 0x02)? result.gcPerMinute: p2;
       GcManageInitModule$Result uuid = (i & 0x04)? result.uuid: p3;
       GcManageInitModule$Result freeThreshol = (i & 0x08)? result.freeThresholdMB: p4;
       GcManageInitModule$Result isCheckSizeF = (i & 0x10)? result.isCheckSizeFail: p5;
       GcManageInitModule$Result map = (i & 0x20)? result.map: p6;
       GcManageInitModule$Result beginMap = (i & 0x40)? result.beginMap: p7;
       GcManageInitModule$Result endMap = (i & 0x0080)? result.endMap: p8;
       return p0.copy(name, gcPerMinute, uuid, freeThreshol, isCheckSizeF, map, beginMap, endMap);
    }
    public final String component1(){
       return this.name;
    }
    public final float component2(){
       return this.gcPerMinute;
    }
    public final String component3(){
       return this.uuid;
    }
    public final int component4(){
       return this.freeThresholdMB;
    }
    public final boolean component5(){
       return this.isCheckSizeFail;
    }
    public final Map component6(){
       return this.map;
    }
    public final Map component7(){
       return this.beginMap;
    }
    public final Map component8(){
       return this.endMap;
    }
    public final GcManageInitModule$Result copy(String p0,float p1,String p2,int p3,boolean p4,Map p5,Map p6,Map p7){
       GcManageInitModule$Result obj;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p5;
       object oobject3 = p6;
       object oobject4 = p7;
       if (PatchProxy.isSupport(GcManageInitModule$Result.class)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),oobject1,Integer.valueOf(p3),Boolean.valueOf(p4),oobject2,oobject3,oobject4};
          obj = PatchProxy.apply(objArray, this, GcManageInitModule$Result.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "name");
       a.p(p2, "uuid");
       a.p(oobject2, "map");
       a.p(oobject3, "beginMap");
       a.p(oobject4, "endMap");
       obj = new GcManageInitModule$Result(p0, p1, p2, p3, p4, p5, p6, p7);
       return v10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GcManageInitModule$Result.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GcManageInitModule$Result && (a.g(this.name, p0.name) && (!Float.compare(this.gcPerMinute, p0.gcPerMinute) && (a.g(this.uuid, p0.uuid) && (this.freeThresholdMB == p0.freeThresholdMB && (this.isCheckSizeFail == p0.isCheckSizeFail && (a.g(this.map, p0.map) && (a.g(this.beginMap, p0.beginMap) && a.g(this.endMap, p0.endMap)))))))))) {
          return true;
       }
       return false;
    }
    public final Map getBeginMap(){
       return this.beginMap;
    }
    public final Map getEndMap(){
       return this.endMap;
    }
    public final int getFreeThresholdMB(){
       return this.freeThresholdMB;
    }
    public final float getGcPerMinute(){
       return this.gcPerMinute;
    }
    public final Map getMap(){
       return this.map;
    }
    public final String getName(){
       return this.name;
    }
    public final String getUuid(){
       return this.uuid;
    }
    public int hashCode(){
       GcManageInitModule$Result obj = PatchProxy.apply(null, this, GcManageInitModule$Result.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + Float.floatToIntBits(this.gcPerMinute)) * 31;
       GcManageInitModule$Result tuuid = this.uuid;
       int i2 = (tuuid != null)? tuuid.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.freeThresholdMB) * 31;
       tuuid = this.isCheckSizeFail;
       if (tuuid != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tuuid = this.map;
       i2 = (tuuid != null)? tuuid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuuid = this.beginMap;
       i2 = (tuuid != null)? tuuid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuuid = this.endMap;
       if (tuuid != null) {
          i = tuuid.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isCheckSizeFail(){
       return this.isCheckSizeFail;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GcManageInitModule$Result.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(name="+this.name+", gcPerMinute="+this.gcPerMinute+", uuid="+this.uuid+", freeThresholdMB="+this.freeThresholdMB+", isCheckSizeFail="+this.isCheckSizeFail+", map="+this.map+", beginMap="+this.beginMap+", endMap="+this.endMap+"\)";
    }
}
