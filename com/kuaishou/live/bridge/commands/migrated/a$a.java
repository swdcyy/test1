package com.kuaishou.live.bridge.commands.migrated.a$a;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsProvideCacheParams$Params;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@000e26
{
    public final LiveJsProvideCacheParams$Params param;

    public void a$a(){
       super(null);
    }
    public void a$a(LiveJsProvideCacheParams$Params p0){
       super();
       this.param = p0;
    }
    public final LiveJsProvideCacheParams$Params a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
