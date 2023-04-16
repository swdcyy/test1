package com.kuaishou.live.pullrequest.http.data.PullRequestResponseData;
import java.io.Serializable;
import com.kuaishou.live.pullrequest.http.data.PullRequestResponseData$a;
import nsd.u;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PullRequestResponseData implements Serializable	// class@000e6a
{
    public final String data;
    public final Integer payloadType;
    public static final PullRequestResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       PullRequestResponseData.Companion = new PullRequestResponseData$a(null);
    }
    public void PullRequestResponseData(Integer p0,String p1){
       super();
       this.payloadType = p0;
       this.data = p1;
    }
    public static PullRequestResponseData copy$default(PullRequestResponseData p0,Integer p1,String p2,int p3,Object p4){
       PullRequestResponseData payloadType;
       PullRequestResponseData data;
       if (p3 & 0x01) {
          payloadType = p0.payloadType;
       }
       if (p3 & 0x02) {
          data = p0.data;
       }
       return p0.copy(payloadType, data);
    }
    public final Integer component1(){
       return this.payloadType;
    }
    public final String component2(){
       return this.data;
    }
    public final PullRequestResponseData copy(Integer p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PullRequestResponseData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PullRequestResponseData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PullRequestResponseData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PullRequestResponseData && (a.g(this.payloadType, p0.payloadType) && a.g(this.data, p0.data)))) {
          return true;
       }
       return false;
    }
    public final String getData(){
       return this.data;
    }
    public final Integer getPayloadType(){
       return this.payloadType;
    }
    public int hashCode(){
       PullRequestResponseData obj = PatchProxy.apply(null, this, PullRequestResponseData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.payloadType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PullRequestResponseData tdata = this.data;
       if (tdata != null) {
          i = tdata.hashCode();
       }
       return (i1 + i);
    }
    public final boolean invalid(){
       boolean b = (this.payloadType == null || this.data == null)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PullRequestResponseData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PullRequestResponseData\(payloadType="+this.payloadType+", data="+this.data+"\)";
    }
}
