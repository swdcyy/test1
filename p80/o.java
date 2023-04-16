package p80.o;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class o	// class@0028d8
{
    public List mWebKernelPreLoad;

    public void o(List p0){
       super();
       this.mWebKernelPreLoad = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof o && a.g(this.mWebKernelPreLoad, p0.mWebKernelPreLoad))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       o obj = PatchProxy.apply(null, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mWebKernelPreLoad;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewPreInitPolicyConfig\(mWebKernelPreLoad="+this.mWebKernelPreLoad+"\)";
    }
}
