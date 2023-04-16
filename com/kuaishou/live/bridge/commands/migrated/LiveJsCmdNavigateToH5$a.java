package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdNavigateToH5$a	// class@000e13
{
    public Map params;
    public String type;
    public String url;

    public void LiveJsCmdNavigateToH5$a(){
       a.p("", "type");
       a.p("", "url");
       super();
       this.type = "";
       this.url = "";
       this.params = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdNavigateToH5$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdNavigateToH5$a && (a.g(this.type, p0.type) && (a.g(this.url, p0.url) && a.g(this.params, p0.params))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdNavigateToH5$a obj = PatchProxy.apply(null, this, LiveJsCmdNavigateToH5$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdNavigateToH5$a turl = this.url;
       int i2 = (turl != null)? turl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       turl = this.params;
       if (turl != null) {
          i = turl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdNavigateToH5$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(type="+this.type+", url="+this.url+", params="+this.params+"\)";
    }
}
