package com.yxcorp.gifshow.ad.webview.jshandler.ReportData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportData$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.ad.webview.jshandler.ReportParams;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReportData implements Serializable	// class@0018ed
{
    public final ReportParams params;
    public final String sessionId;
    public static final ReportData$a Companion;
    public static final long serialVersionUID;

    static {
       ReportData.Companion = new ReportData$a(null);
    }
    public void ReportData(String p0,ReportParams p1){
       a.p(p0, "sessionId");
       super();
       this.sessionId = p0;
       this.params = p1;
    }
    public void ReportData(String p0,ReportParams p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       super(p0, p1);
       return;
    }
    public static ReportData copy$default(ReportData p0,String p1,ReportParams p2,int p3,Object p4){
       ReportData sessionId;
       ReportData params;
       if (p3 & 0x01) {
          sessionId = p0.sessionId;
       }
       if (p3 & 0x02) {
          params = p0.params;
       }
       return p0.copy(sessionId, params);
    }
    public final String component1(){
       return this.sessionId;
    }
    public final ReportParams component2(){
       return this.params;
    }
    public final ReportData copy(String p0,ReportParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReportData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sessionId");
       return new ReportData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReportData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReportData && (a.g(this.sessionId, p0.sessionId) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public final ReportParams getParams(){
       return this.params;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public int hashCode(){
       ReportData obj = PatchProxy.apply(null, this, ReportData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sessionId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ReportData tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReportData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportData\(sessionId="+this.sessionId+", params="+this.params+"\)";
    }
}
