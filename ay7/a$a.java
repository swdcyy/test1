package ay7.a$a;
import java.util.concurrent.Callable;
import ay7.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.FunctionResultParams;

public final class a$a implements Callable	// class@0002e1
{
    public final a b;
    public final YodaBaseWebView c;
    public final String d;

    public void a$a(a p0,YodaBaseWebView p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       FunctionResultParams uFunctionRes = PatchProxy.apply(null, this, a$a.class, "1");
       if (uFunctionRes != PatchProxyResult.class) {
       }else {
          uFunctionRes = this.b.k(this.c, this.d);
       }
       return uFunctionRes;
    }
}
