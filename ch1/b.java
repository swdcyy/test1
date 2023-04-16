package ch1.b;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@0004b5
{
    public final int actionType;
    public final String actionUrl;

    public void b(int p0,String p1,int p2,u p3){
       super();
       this.actionType = p0;
       this.actionUrl = null;
    }
    public final int a(){
       return this.actionType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.actionType == p0.actionType && a.g(this.actionUrl, p0.actionUrl)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.actionType * 31;
       b tactionUrl = this.actionUrl;
       int i1 = (tactionUrl != null)? tactionUrl.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftPanelItemAction\(actionType="+this.actionType+", actionUrl="+this.actionUrl+"\)";
    }
}
