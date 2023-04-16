package com.kwai.framework.business_priority.model.Config;
import com.kwai.framework.business_priority.model.Config$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Config	// class@0014df
{
    public final List sortedFtList;
    public final int statusCode;
    public static final Config$a a;

    static {
       Config.a = new Config$a(null);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Config.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Config && (a.g(this.sortedFtList, p0.sortedFtList) && this.statusCode == p0.statusCode))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Config obj = PatchProxy.apply(null, this, Config.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sortedFtList;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.statusCode);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Config.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Config\(sortedFtList="+this.sortedFtList+", statusCode="+this.statusCode+"\)";
    }
}
