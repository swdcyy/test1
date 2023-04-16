package com.kuaishou.growth.pendant.model.PendantReportResponseV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantReportResponseV2$a;
import nsd.u;
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

public final class PendantReportResponseV2 implements Serializable	// class@00067d
{
    public List mTimerOffBizIdList;
    public static final PendantReportResponseV2$a Companion;
    public static final long serialVersionUID;

    static {
       PendantReportResponseV2.Companion = new PendantReportResponseV2$a(null);
    }
    public void PendantReportResponseV2(){
       super(null, 1, null);
    }
    public void PendantReportResponseV2(List p0){
       super();
       this.mTimerOffBizIdList = p0;
    }
    public void PendantReportResponseV2(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static PendantReportResponseV2 copy$default(PendantReportResponseV2 p0,List p1,int p2,Object p3){
       PendantReportResponseV2 mTimerOffBiz;
       if (p2 & 0x01) {
          mTimerOffBiz = p0.mTimerOffBizIdList;
       }
       return p0.copy(mTimerOffBiz);
    }
    public final List component1(){
       return this.mTimerOffBizIdList;
    }
    public final PendantReportResponseV2 copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantReportResponseV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PendantReportResponseV2(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantReportResponseV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantReportResponseV2 && a.g(this.mTimerOffBizIdList, p0.mTimerOffBizIdList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PendantReportResponseV2 obj = PatchProxy.apply(null, this, PendantReportResponseV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTimerOffBizIdList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantReportResponseV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantReportResponseV2\(mTimerOffBizIdList="+this.mTimerOffBizIdList+"\)";
    }
}
