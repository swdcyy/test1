package com.kuaishou.live.external.invoke.krn.LiveJsContainerParams;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsContainerParams	// class@001b96
{
    public final String liveId;
    public final String pageId;

    public final String a(){
       return this.liveId;
    }
    public final String b(){
       return this.pageId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsContainerParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsContainerParams && (a.g(this.liveId, p0.liveId) && a.g(this.pageId, p0.pageId)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsContainerParams obj = PatchProxy.apply(null, this, LiveJsContainerParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsContainerParams tpageId = this.pageId;
       if (tpageId != null) {
          i = tpageId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsContainerParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsContainerParams\(liveId="+this.liveId+", pageId="+this.pageId+"\)";
    }
}
