package od6.n;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class n	// class@00200b
{
    public final String buildType;
    public final boolean injectSoPath;
    public final boolean linkNamespace;
    public final String name;
    public final String pkgId;
    public final String runPluginType;
    public final boolean useSysClassLoader;

    public void n(String p0,String p1,String p2,String p3,boolean p4,boolean p5,boolean p6){
       a.p(p0, "name");
       a.p(p1, "buildType");
       a.p(p2, "pkgId");
       a.p(p3, "runPluginType");
       super();
       this.name = p0;
       this.buildType = p1;
       this.pkgId = p2;
       this.runPluginType = p3;
       this.injectSoPath = p4;
       this.linkNamespace = p5;
       this.useSysClassLoader = p6;
    }
    public final String a(){
       return this.name;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof n && (a.g(this.name, p0.name) && (a.g(this.buildType, p0.buildType) && (a.g(this.pkgId, p0.pkgId) && (a.g(this.runPluginType, p0.runPluginType) && (this.injectSoPath == p0.injectSoPath && (this.linkNamespace == p0.linkNamespace && this.useSysClassLoader == p0.useSysClassLoader)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       n obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       n tbuildType = this.buildType;
       int i2 = (tbuildType != null)? tbuildType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuildType = this.pkgId;
       i2 = (tbuildType != null)? tbuildType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuildType = this.runPluginType;
       if (tbuildType != null) {
          i = tbuildType.hashCode();
       }
       i1 = (i1 + i) * 31;
       n tinjectSoPat = this.injectSoPath;
       i2 = 1;
       if (tinjectSoPat != null) {
          tinjectSoPat = 1;
       }
       i1 = (i1 + tinjectSoPat) * 31;
       tinjectSoPat = this.linkNamespace;
       if (tinjectSoPat != null) {
          i = 1;
       }
       i1 = (i1 + i) * 31;
       tinjectSoPat = this.useSysClassLoader;
       if (tinjectSoPat == null) {
          tbuildType = tinjectSoPat;
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ModuleConfig\(name="+this.name+", buildType="+this.buildType+", pkgId="+this.pkgId+", runPluginType="+this.runPluginType+", injectSoPath="+this.injectSoPath+", linkNamespace="+this.linkNamespace+", useSysClassLoader="+this.useSysClassLoader+"\)";
    }
}
