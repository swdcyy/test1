package dm1.i$a;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;

public class i$a	// class@001fc8
{
    public final List a;
    public final String b;
    public final String c;

    public void i$a(List p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b+File.separator+this.c;
    }
}
