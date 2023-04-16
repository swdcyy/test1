package com.yxcorp.gifshow.model.RuntimeData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RuntimeData implements Serializable	// class@001e87
{
    public final String data;
    public final String uniqId;
    public final long userId;

    public void RuntimeData(long p0,String p1,String p2){
       a.p(p1, "uniqId");
       a.p(p2, "data");
       super();
       this.userId = p0;
       this.uniqId = p1;
       this.data = p2;
    }
    public static RuntimeData copy$default(RuntimeData p0,long p1,String p2,String p3,int p4,Object p5){
       RuntimeData userId;
       RuntimeData uniqId;
       RuntimeData data;
       if (p4 & 0x01) {
          userId = p0.userId;
       }
       if (p4 & 0x02) {
          uniqId = p0.uniqId;
       }
       if (p4 & 0x04) {
          data = p0.data;
       }
       return p0.copy(userId, uniqId, data);
    }
    public final long component1(){
       return this.userId;
    }
    public final String component2(){
       return this.uniqId;
    }
    public final String component3(){
       return this.data;
    }
    public final RuntimeData copy(long p0,String p1,String p2){
       if (PatchProxy.isSupport(RuntimeData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, RuntimeData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "uniqId");
       a.p(p2, "data");
       return new RuntimeData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RuntimeData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RuntimeData && (!this.userId - p0.userId && (a.g(this.uniqId, p0.uniqId) && a.g(this.data, p0.data))))) {
          return true;
       }
       return false;
    }
    public final String getData(){
       return this.data;
    }
    public final String getUniqId(){
       return this.uniqId;
    }
    public final long getUserId(){
       return this.userId;
    }
    public int hashCode(){
       RuntimeData obj = PatchProxy.apply(null, this, RuntimeData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.uniqId;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.data;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RuntimeData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RuntimeData\(userId="+this.userId+", uniqId="+this.uniqId+", data="+this.data+"\)";
    }
}
