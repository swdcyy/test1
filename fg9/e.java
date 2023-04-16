package fg9.e;
import fg9.e$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@002317
{
    public final int a;
    public static final e b;
    public static final e$a c;

    static {
       e.c = new e$a(null);
       e.b = new e(0);
    }
    public void e(int p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof e && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PanelShowData\(actionBarOriginTranslateY="+this.a+"\)";
    }
}
