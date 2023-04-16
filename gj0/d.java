package gj0.d;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.krn.instance.JsExecutorConfig;
import com.kuaishou.krn.instance.BaseJsExecutorType$Type;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import zsd.u;
import java.lang.Boolean;
import java.lang.Number;

public final class d	// class@0024f2
{
    public final String bundleId;
    public final List componentList;
    public JsExecutorConfig executorConfig;
    public final String framework;
    public int minVersion;
    public int preloadType;

    public void d(){
       super("", "", CollectionsKt__CollectionsKt.E(), new JsExecutorConfig(BaseJsExecutorType$Type.V8_JIT, false));
    }
    public void d(String p0,String p1,List p2){
       a.p(p0, "bundleId");
       a.p(p2, "componentList");
       super(p0, p1, p2, new JsExecutorConfig(BaseJsExecutorType$Type.V8_JIT, false));
    }
    public void d(String p0,String p1,List p2,JsExecutorConfig p3){
       a.p(p0, "bundleId");
       a.p(p2, "componentList");
       a.p(p3, "executorConfig");
       super();
       this.bundleId = p0;
       this.framework = p1;
       this.componentList = p2;
       this.executorConfig = p3;
    }
    public final String a(){
       return this.bundleId;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return '''+this.bundleId+"\'_"+this.executorConfig.mType;
    }
    public final JsExecutorConfig c(){
       return this.executorConfig;
    }
    public final JsFramework d(){
       JsFramework obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = JsFramework.VUE;
       if (!u.I1(obj.name(), this.framework, true)) {
          obj = JsFramework.REACT;
       }
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.bundleId, p0.bundleId) && (a.g(this.framework, p0.framework) && (a.g(this.componentList, p0.componentList) && a.g(this.executorConfig, p0.executorConfig)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tframework = this.framework;
       int i2 = (tframework != null)? tframework.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tframework = this.componentList;
       i2 = (tframework != null)? tframework.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tframework = this.executorConfig;
       if (tframework != null) {
          i = tframework.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnPreloadBundle\(bundleId="+this.bundleId+", framework="+this.framework+", componentList="+this.componentList+", executorConfig="+this.executorConfig+"\)";
    }
}
