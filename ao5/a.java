package ao5.a;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ao5.b;
import java.lang.StringBuilder;

public class a	// class@00030a
{
    public final TabIdentifier a;
    public final TabIdentifier b;
    public final int c;

    public void a(TabIdentifier p0,TabIdentifier p1,int p2){
       super();
       this.a = p1;
       this.c = p2;
       this.b = p0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return " Tab { parent = "+this.b+" , child = "+this.a+", reason = "+this.c+'}';
    }
}
