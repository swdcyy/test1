package kf0.g;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.manager.f$a;
import com.kuaishou.growth.pendant.core.manager.f;

public final class g implements Callable	// class@002d0e
{
    public final String b;
    public final String c;

    public void g(String p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       f$a uoa = PatchProxy.apply(null, this, g.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = f.c(this.b, this.c);
       }
       return uoa;
    }
}
