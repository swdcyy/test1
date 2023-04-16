package com.yxcorp.gifshow.magic.data.repo.response.ActivityCountResponse;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityCountResponse implements Serializable	// class@001b8b
{
    public final Long count;
    public final Integer result;

    public void ActivityCountResponse(Integer p0,Long p1){
       super();
       this.result = p0;
       this.count = p1;
    }
    public static ActivityCountResponse copy$default(ActivityCountResponse p0,Integer p1,Long p2,int p3,Object p4){
       ActivityCountResponse result;
       ActivityCountResponse count;
       if (p3 & 0x01) {
          result = p0.result;
       }
       if (p3 & 0x02) {
          count = p0.count;
       }
       return p0.copy(result, count);
    }
    public final Integer component1(){
       return this.result;
    }
    public final Long component2(){
       return this.count;
    }
    public final ActivityCountResponse copy(Integer p0,Long p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ActivityCountResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActivityCountResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityCountResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActivityCountResponse && (a.g(this.result, p0.result) && a.g(this.count, p0.count)))) {
          return true;
       }
       return false;
    }
    public final Long getCount(){
       return this.count;
    }
    public final Integer getResult(){
       return this.result;
    }
    public final Long getValidCount(){
       Object[] objArray = null;
       ActivityCountResponse obj = PatchProxy.apply(objArray, this, ActivityCountResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.result;
       if (obj != null && obj.intValue() == 1) {
          objArray = this.count;
       }
       return objArray;
    }
    public int hashCode(){
       ActivityCountResponse obj = PatchProxy.apply(null, this, ActivityCountResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.result;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ActivityCountResponse tcount = this.count;
       if (tcount != null) {
          i = tcount.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityCountResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityCountResponse\(result="+this.result+", count="+this.count+"\)";
    }
}
