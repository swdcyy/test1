package co5.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class n	// class@000721
{
    public final boolean a;
    public final String b;

    public void n(boolean p0,String p1){
       super();
       this.a = p0;
       this.b = null;
    }
    public static n a(){
       Object obj = PatchProxy.apply(null, null, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n(false, null);
    }
    public static n b(){
       Object obj = PatchProxy.apply(null, null, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n(true, null);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TopTabRedDotNotify{mShow="+this.a+'}';
    }
}
