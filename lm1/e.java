package lm1.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@002fa0
{
    public final String a;
    public final int b;
    public final int c;

    public void e(String p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.a, p0.a) && (this.b == p0.b && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + this.b) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftSendPanelInfo\(tabId="+this.a+", giftIndex="+this.b+", pageIndex="+this.c+"\)";
    }
}
