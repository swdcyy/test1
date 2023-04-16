package bb6.e$a;
import bb6.e$a$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class e$a	// class@0002d2
{
    public String host;
    public String weight;
    public static final e$a$a a;

    static {
       e$a.a = new e$a$a(null);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CdnHost\(host=\'"+this.host+"\', weight=\'"+this.weight+"\'\)";
    }
}
