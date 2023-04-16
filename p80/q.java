package p80.q;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q	// class@0028db
{
    public final boolean enableKsWebView;
    public final String optimizePolicy;
    public final int processMode;

    public void q(){
       super(true, 3, "");
    }
    public void q(boolean p0,int p1,String p2){
       a.p(p2, "optimizePolicy");
       super();
       this.enableKsWebView = p0;
       this.processMode = p1;
       this.optimizePolicy = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof q && (this.enableKsWebView == p0.enableKsWebView && (this.processMode == p0.processMode && a.g(this.optimizePolicy, p0.optimizePolicy))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       q obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableKsWebView;
       if (obj != null) {
          i = 1;
       }
       i = ((i * 31) + this.processMode) * 31;
       q toptimizePol = this.optimizePolicy;
       int i1 = (toptimizePol != null)? toptimizePol.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewSwitchInfo\(enableKsWebView="+this.enableKsWebView+", processMode="+this.processMode+", optimizePolicy="+this.optimizePolicy+"\)";
    }
}
