package com.kwai.slide.play.detail.model.MoreOperationConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MoreOperationConfig implements Serializable	// class@00182b
{
    public final List feedbackDetails;
    public final List feedbackEntries;

    public void MoreOperationConfig(List p0,List p1){
       a.p(p0, "feedbackEntries");
       a.p(p1, "feedbackDetails");
       super();
       this.feedbackEntries = p0;
       this.feedbackDetails = p1;
    }
    public static MoreOperationConfig copy$default(MoreOperationConfig p0,List p1,List p2,int p3,Object p4){
       MoreOperationConfig moreOperatio;
       MoreOperationConfig moreOperatio1;
       if (p3 & 0x01) {
          moreOperatio = p0.feedbackEntries;
       }
       if (p3 & 0x02) {
          moreOperatio1 = p0.feedbackDetails;
       }
       return p0.copy(moreOperatio, moreOperatio1);
    }
    public final List component1(){
       return this.feedbackEntries;
    }
    public final List component2(){
       return this.feedbackDetails;
    }
    public final MoreOperationConfig copy(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MoreOperationConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feedbackEntries");
       a.p(p1, "feedbackDetails");
       return new MoreOperationConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoreOperationConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MoreOperationConfig && (a.g(this.feedbackEntries, p0.feedbackEntries) && a.g(this.feedbackDetails, p0.feedbackDetails)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MoreOperationConfig obj = PatchProxy.apply(null, this, MoreOperationConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.feedbackEntries;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MoreOperationConfig tMoreOperati = this.feedbackDetails;
       if (tMoreOperati != null) {
          i = tMoreOperati.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MoreOperationConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MoreOperationConfig\(feedbackEntries="+this.feedbackEntries+", feedbackDetails="+this.feedbackDetails+"\)";
    }
}
