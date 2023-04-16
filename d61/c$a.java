package d61.c$a;
import d61.c;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c$a extends c	// class@001f12
{
    public final x b;

    public void c$a(x p0){
       this.b = p0;
       super();
    }
    public Object c(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
}
