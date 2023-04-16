package com.kuaishou.live.pullrequest.http.data.PullRequestResponse;
import java.io.Serializable;
import com.kuaishou.live.pullrequest.http.data.PullRequestResponse$a;
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

public final class PullRequestResponse implements Serializable	// class@000e68
{
    public final List dataList;
    public static final PullRequestResponse$a Companion;
    public static final long serialVersionUID;

    static {
       PullRequestResponse.Companion = new PullRequestResponse$a(null);
    }
    public void PullRequestResponse(List p0){
       super();
       this.dataList = p0;
    }
    public static PullRequestResponse copy$default(PullRequestResponse p0,List p1,int p2,Object p3){
       PullRequestResponse dataList;
       if (p2 & 0x01) {
          dataList = p0.dataList;
       }
       return p0.copy(dataList);
    }
    public final List component1(){
       return this.dataList;
    }
    public final PullRequestResponse copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PullRequestResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PullRequestResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PullRequestResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PullRequestResponse && a.g(this.dataList, p0.dataList))) {
          return true;
       }
       return false;
    }
    public final List getDataList(){
       return this.dataList;
    }
    public int hashCode(){
       PullRequestResponse obj = PatchProxy.apply(null, this, PullRequestResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dataList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PullRequestResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PullRequestResponse\(dataList="+this.dataList+"\)";
    }
}
