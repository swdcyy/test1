package hf9.b;
import hf9.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class b	// class@00263d
{
    public final boolean a;
    public static final b b;
    public static final b$a c;

    static {
       b.c = new b$a(null);
       b.b = new b(false);
    }
    public void b(boolean p0){
       super();
       this.a = p0;
    }
    public final boolean a(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof b && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b ta = this.a;
       if (ta != null) {
          ta = 1;
       }
       return ta;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SlipModeData\(isSlipModeData="+this.a+"\)";
    }
}
