package fk0.a;
import java.lang.String;
import com.kwai.kxb.BundleSource;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.instance.JsFramework;
import java.util.LinkedHashSet;
import com.kuaishou.krn.c;
import kj0.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Enum;

public final class a	// class@002361
{
    public File a;
    public Set b;
    public final String bundleId;
    public boolean c;
    public final String componentName;
    public String d;
    public String e;
    public final BundleSource f;
    public final String instanceId;
    public final String md5;
    public JsFramework platform;
    public long taskId;
    public String version;
    public final int versionCode;

    public void a(){
       super(null, null, null, 0, null, 31, null);
    }
    public void a(String p0,String p1,String p2,int p3,BundleSource p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = null;
       }
       if (p5 & 0x08) {
          p3 = 0;
       }
       if (p5 & 0x10) {
          p4 = BundleSource.REMOTE;
       }
       a.p(p4, "source");
       super();
       this.bundleId = p0;
       this.componentName = null;
       this.md5 = null;
       this.versionCode = p3;
       this.f = p4;
       this.taskId = -1;
       this.platform = JsFramework.REACT;
       this.b = new LinkedHashSet();
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       this.c = uoc.f().b();
       return;
    }
    public final String a(){
       return this.d;
    }
    public final String b(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.bundleId, p0.bundleId) && (a.g(this.componentName, p0.componentName) && (a.g(this.md5, p0.md5) && (this.versionCode == p0.versionCode && a.g(this.f, p0.f))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tcomponentNa = this.componentName;
       int i2 = (tcomponentNa != null)? tcomponentNa.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcomponentNa = this.md5;
       i2 = (tcomponentNa != null)? tcomponentNa.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.versionCode) * 31;
       tcomponentNa = this.f;
       if (tcomponentNa != null) {
          i = tcomponentNa.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BundleMeta\("+"bundleId="+this.bundleId+", source="+this.f.name()+", md5="+this.md5+", versionCode="+this.versionCode+", taskId="+this.taskId+", version="+this.version+", bundleFile="+this.a+", componentList="+this.b+"\)";
    }
}
