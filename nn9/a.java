package nn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@0031e3
{
    public final LoadingStatus a;
    public final Throwable b;

    public void a(LoadingStatus p0,Throwable p1){
       a.p(p0, "mLoadingStatus");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(LoadingStatus p0,Throwable p1,int p2,u p3){
       super(p0, null);
    }
    public final LoadingStatus a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostDataListPanelSubState\(mLoadingStatus="+this.a+", mError="+this.b+"\)";
    }
}
