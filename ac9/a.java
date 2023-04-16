package ac9.a;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.resource.p;

public final class a implements Callable	// class@000079
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object call(){
       String str = PatchProxy.apply(null, this, a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = p.b();
       }
       return str;
    }
}
