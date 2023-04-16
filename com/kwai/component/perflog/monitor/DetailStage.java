package com.kwai.component.perflog.monitor.DetailStage;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DetailStage	// class@000a06
{
    public final List detail;
    public long stageDuration;

    public void DetailStage(long p0,List p1){
       a.p(p1, "detail");
       super();
       this.stageDuration = p0;
       this.detail = p1;
    }
    public static DetailStage copy$default(DetailStage p0,long p1,List p2,int p3,Object p4){
       DetailStage stageDuratio;
       DetailStage detail;
       if (p3 & 0x01) {
          stageDuratio = p0.stageDuration;
       }
       if (p3 & 0x02) {
          detail = p0.detail;
       }
       return p0.copy(stageDuratio, detail);
    }
    public final long component1(){
       return this.stageDuration;
    }
    public final List component2(){
       return this.detail;
    }
    public final DetailStage copy(long p0,List p1){
       DetailStage uDetailStage = DetailStage.class;
       if (PatchProxy.isSupport(uDetailStage)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, uDetailStage, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "detail");
       return new DetailStage(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailStage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DetailStage && (!this.stageDuration - p0.stageDuration && a.g(this.detail, p0.detail)))) {
          return true;
       }
       return false;
    }
    public final List getDetail(){
       return this.detail;
    }
    public final long getStageDuration(){
       return this.stageDuration;
    }
    public int hashCode(){
       DetailStage obj = PatchProxy.apply(null, this, DetailStage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.stageDuration;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.detail;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (i + i1);
    }
    public final void setStageDuration(long p0){
       this.stageDuration = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DetailStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailStage\(stageDuration="+this.stageDuration+", detail="+this.detail+"\)";
    }
}
