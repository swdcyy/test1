package com.kuaishou.merchant.live.cart.onsale.model.ProcessInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.model.ProcessInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProcessInfo implements Serializable	// class@0019b5
{
    public String processDesc;
    public List processValue;
    public static final ProcessInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ProcessInfo.Companion = new ProcessInfo$a(null);
    }
    public void ProcessInfo(String p0,List p1){
       super();
       this.processDesc = p0;
       this.processValue = p1;
    }
    public static ProcessInfo copy$default(ProcessInfo p0,String p1,List p2,int p3,Object p4){
       ProcessInfo processDesc;
       ProcessInfo processValue;
       if (p3 & 0x01) {
          processDesc = p0.processDesc;
       }
       if (p3 & 0x02) {
          processValue = p0.processValue;
       }
       return p0.copy(processDesc, processValue);
    }
    public final String component1(){
       return this.processDesc;
    }
    public final List component2(){
       return this.processValue;
    }
    public final ProcessInfo copy(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ProcessInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProcessInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProcessInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProcessInfo && (a.g(this.processDesc, p0.processDesc) && a.g(this.processValue, p0.processValue)))) {
          return true;
       }
       return false;
    }
    public final String getProcessDesc(){
       return this.processDesc;
    }
    public final List getProcessValue(){
       return this.processValue;
    }
    public int hashCode(){
       ProcessInfo obj = PatchProxy.apply(null, this, ProcessInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.processDesc;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ProcessInfo tprocessValu = this.processValue;
       if (tprocessValu != null) {
          i = tprocessValu.hashCode();
       }
       return (i1 + i);
    }
    public final void setProcessDesc(String p0){
       this.processDesc = p0;
    }
    public final void setProcessValue(List p0){
       this.processValue = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProcessInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProcessInfo\(processDesc="+this.processDesc+", processValue="+this.processValue+"\)";
    }
}
