package nm1.e$b;
import java.lang.ThreadLocal;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class e$b extends ThreadLocal	// class@003374
{
    public final x a;

    public void e$b(x p0){
       super();
       this.a = p0;
    }
    public Object initialValue(){
       Object obj = PatchProxy.apply(null, this, e$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get();
    }
}
