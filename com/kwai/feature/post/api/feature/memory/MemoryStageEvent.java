package com.kwai.feature.post.api.feature.memory.MemoryStageEvent;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MemoryStageEvent implements Serializable	// class@0013b6
{
    public final List cdnUrls;
    public final long cost;
    public final int count;
    public final String error;
    public final long fileSize;
    public final boolean isPreWarmed;
    public final MemorySceneType scene;
    public final String stage;

    public void MemoryStageEvent(MemorySceneType p0,String p1,long p2,List p3,long p4,int p5,boolean p6,String p7){
       a.p(p0, "scene");
       a.p(p1, "stage");
       a.p(p3, "cdnUrls");
       a.p(p7, "error");
       super();
       this.scene = p0;
       this.stage = p1;
       this.cost = p2;
       this.cdnUrls = p3;
       this.fileSize = p4;
       this.count = p5;
       this.isPreWarmed = p6;
       this.error = p7;
    }
    public void MemoryStageEvent(MemorySceneType p0,String p1,long p2,List p3,long p4,int p5,boolean p6,String p7,int p8,u p9){
       int i = p8;
       int i1 = 0;
       long l = (i & 0x04)? i1: p2;
       ArrayList uArrayList = (i & 0x08)? new ArrayList(): p3;
       long l1 = (i & 0x10)? i1: p4;
       int i2 = (i & 0x20)? 0: p5;
       boolean b = (i & 0x40)? false: p6;
       String str = (i & 0x0080)? "": p7;
       super(p0, p1, l, uArrayList, l1, i2, b, str);
       return;
    }
    public static MemoryStageEvent copy$default(MemoryStageEvent p0,MemorySceneType p1,String p2,long p3,List p4,long p5,int p6,boolean p7,String p8,int p9,Object p10){
       MemoryStageEvent memoryStageE = p0;
       int i = p9;
       MemoryStageEvent scene = (i & 0x01)? memoryStageE.scene: p1;
       MemoryStageEvent stage = (i & 0x02)? memoryStageE.stage: p2;
       MemoryStageEvent cost = (i & 0x04)? memoryStageE.cost: p3;
       MemoryStageEvent cdnUrls = (i & 0x08)? memoryStageE.cdnUrls: p4;
       MemoryStageEvent fileSize = (i & 0x10)? memoryStageE.fileSize: p5;
       MemoryStageEvent count = (i & 0x20)? memoryStageE.count: p6;
       MemoryStageEvent isPreWarmed = (i & 0x40)? memoryStageE.isPreWarmed: p7;
       MemoryStageEvent error = (i & 0x0080)? memoryStageE.error: p8;
       return p0.copy(scene, stage, cost, cdnUrls, fileSize, count, isPreWarmed, error);
    }
    public final MemorySceneType component1(){
       return this.scene;
    }
    public final String component2(){
       return this.stage;
    }
    public final long component3(){
       return this.cost;
    }
    public final List component4(){
       return this.cdnUrls;
    }
    public final long component5(){
       return this.fileSize;
    }
    public final int component6(){
       return this.count;
    }
    public final boolean component7(){
       return this.isPreWarmed;
    }
    public final String component8(){
       return this.error;
    }
    public final MemoryStageEvent copy(MemorySceneType p0,String p1,long p2,List p3,long p4,int p5,boolean p6,String p7){
       MemoryStageEvent obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p7;
       if (PatchProxy.isSupport(MemoryStageEvent.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),oobject2,Long.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6),oobject3};
          obj = PatchProxy.apply(objArray, this, MemoryStageEvent.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "scene");
       a.p(p1, "stage");
       a.p(oobject2, "cdnUrls");
       a.p(oobject3, "error");
       obj = new MemoryStageEvent(p0, p1, p2, p3, p4, p5, p6, p7);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemoryStageEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemoryStageEvent && (a.g(this.scene, p0.scene) && (a.g(this.stage, p0.stage) && (!this.cost - p0.cost && (a.g(this.cdnUrls, p0.cdnUrls) && (!this.fileSize - p0.fileSize && (this.count == p0.count && (this.isPreWarmed == p0.isPreWarmed && a.g(this.error, p0.error)))))))))) {
          return true;
       }
       return false;
    }
    public final List getCdnUrls(){
       return this.cdnUrls;
    }
    public final long getCost(){
       return this.cost;
    }
    public final int getCount(){
       return this.count;
    }
    public final String getError(){
       return this.error;
    }
    public final long getFileSize(){
       return this.fileSize;
    }
    public final MemorySceneType getScene(){
       return this.scene;
    }
    public final String getStage(){
       return this.stage;
    }
    public int hashCode(){
       MemoryStageEvent obj = PatchProxy.apply(null, this, MemoryStageEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.scene;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MemoryStageEvent tstage = this.stage;
       int i2 = (tstage != null)? tstage.hashCode(): 0;
       tstage = this.cost;
       long l = 32;
       i1 = (((i1 + i2) * 31) + (int)(tstage ^ (tstage >> l))) * 31;
       tstage = this.cdnUrls;
       i2 = (tstage != null)? tstage.hashCode(): 0;
       tstage = this.fileSize;
       i1 = (((((i1 + i2) * 31) + (int)(tstage ^ (tstage >> l))) * 31) + this.count) * 31;
       tstage = this.isPreWarmed;
       if (tstage != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tstage = this.error;
       if (tstage != null) {
          i = tstage.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isPreWarmed(){
       return this.isPreWarmed;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryStageEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MemoryStageEvent\(scene="+this.scene+", stage="+this.stage+", cost="+this.cost+", cdnUrls="+this.cdnUrls+", fileSize="+this.fileSize+", count="+this.count+", isPreWarmed="+this.isPreWarmed+", error="+this.error+"\)";
    }
}
