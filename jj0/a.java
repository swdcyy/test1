package jj0.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@002bb3
{
    public final String degradeWebUrl;
    public final String minAppVersion;
    public final boolean shareEngine;

    public void a(boolean p0,String p1,String p2){
       super();
       this.shareEngine = p0;
       this.degradeWebUrl = p1;
       this.minAppVersion = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.shareEngine == p0.shareEngine && (a.g(this.degradeWebUrl, p0.degradeWebUrl) && a.g(this.minAppVersion, p0.minAppVersion))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.shareEngine;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       a tdegradeWebU = this.degradeWebUrl;
       int i1 = 0;
       int i2 = (tdegradeWebU != null)? tdegradeWebU.hashCode(): 0;
       i = (i + i2) * 31;
       tdegradeWebU = this.minAppVersion;
       if (tdegradeWebU != null) {
          i1 = tdegradeWebU.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BundleExtraInfo\(shareEngine="+this.shareEngine+", degradeWebUrl="+this.degradeWebUrl+", minAppVersion="+this.minAppVersion+"\)";
    }
}
