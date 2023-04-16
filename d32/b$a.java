package d32.b$a;
import d32.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class b$a implements c	// class@002434
{
    public final String b;

    public void b$a(String p0){
       this.b = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.b, "recruit");
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ROUTER:"+this.b;
    }
}
