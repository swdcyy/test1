package cj4.e;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@000484
{
    public String bundleId;
    public String componentName;
    public String minBundleVersion;
    public JsonElement rnData;

    public void e(){
       super();
       this.bundleId = null;
       this.componentName = null;
       this.minBundleVersion = null;
       this.rnData = null;
    }
    public final String a(){
       return this.bundleId;
    }
    public final String b(){
       return this.componentName;
    }
    public final String c(){
       return this.minBundleVersion;
    }
    public final JsonElement d(){
       return this.rnData;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.bundleId, p0.bundleId) && (a.g(this.componentName, p0.componentName) && (a.g(this.minBundleVersion, p0.minBundleVersion) && a.g(this.rnData, p0.rnData)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e tcomponentNa = this.componentName;
       int i2 = (tcomponentNa != null)? tcomponentNa.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcomponentNa = this.minBundleVersion;
       i2 = (tcomponentNa != null)? tcomponentNa.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcomponentNa = this.rnData;
       if (tcomponentNa != null) {
          i = tcomponentNa.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MtppPriceDetailModel\(bundleId="+this.bundleId+", componentName="+this.componentName+", minBundleVersion="+this.minBundleVersion+", rnData="+this.rnData+"\)";
    }
}
