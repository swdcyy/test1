package com.yxcorp.gifshow.performance.monitor.page.model.PageConfigResponse;
import java.io.Serializable;
import java.lang.Integer;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PageConfigResponse implements Serializable	// class@000eb9
{
    public final List data;
    public final Integer result;

    public void PageConfigResponse(Integer p0,List p1){
       super();
       this.result = p0;
       this.data = p1;
    }
    public static PageConfigResponse copy$default(PageConfigResponse p0,Integer p1,List p2,int p3,Object p4){
       PageConfigResponse result;
       PageConfigResponse data;
       if (p3 & 0x01) {
          result = p0.result;
       }
       if (p3 & 0x02) {
          data = p0.data;
       }
       return p0.copy(result, data);
    }
    public final Integer component1(){
       return this.result;
    }
    public final List component2(){
       return this.data;
    }
    public final PageConfigResponse copy(Integer p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PageConfigResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PageConfigResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PageConfigResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PageConfigResponse && (a.g(this.result, p0.result) && a.g(this.data, p0.data)))) {
          return true;
       }
       return false;
    }
    public final List getData(){
       return this.data;
    }
    public final Integer getResult(){
       return this.result;
    }
    public int hashCode(){
       PageConfigResponse obj = PatchProxy.apply(null, this, PageConfigResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.result;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PageConfigResponse tdata = this.data;
       if (tdata != null) {
          i = tdata.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PageConfigResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageConfigResponse\(result="+this.result+", data="+this.data+"\)";
    }
}
