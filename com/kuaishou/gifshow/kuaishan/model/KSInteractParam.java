package com.kuaishou.gifshow.kuaishan.model.KSInteractParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KSInteractParam implements Serializable	// class@001a93
{
    public final long templateId;
    public final long time;

    public void KSInteractParam(long p0,long p1){
       super();
       this.templateId = p0;
       this.time = p1;
    }
    public static KSInteractParam copy$default(KSInteractParam p0,long p1,long p2,int p3,Object p4){
       KSInteractParam templateId;
       KSInteractParam time;
       if (p3 & 0x01) {
          templateId = p0.templateId;
       }
       if (p3 & 0x02) {
          time = p0.time;
       }
       return p0.copy(templateId, time);
    }
    public final long component1(){
       return this.templateId;
    }
    public final long component2(){
       return this.time;
    }
    public final KSInteractParam copy(long p0,long p1){
       if (PatchProxy.isSupport(KSInteractParam.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, KSInteractParam.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KSInteractParam(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof KSInteractParam && (!this.templateId - p0.templateId && !this.time - p0.time))) {
          return true;
       }
       return false;
    }
    public final long getTemplateId(){
       return this.templateId;
    }
    public final long getTime(){
       return this.time;
    }
    public int hashCode(){
       KSInteractParam obj = PatchProxy.apply(null, this, KSInteractParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.templateId;
       KSInteractParam ttime = this.time;
       return (((int)(obj ^ (obj >> 32)) * 31) + (int)(ttime ^ (ttime >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KSInteractParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSInteractParam\(templateId="+this.templateId+", time="+this.time+"\)";
    }
}
