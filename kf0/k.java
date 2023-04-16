package kf0.k;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.manager.f$a;
import com.kuaishou.growth.pendant.core.manager.f;

public final class k implements Callable	// class@002d12
{
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public void k(String p0,String p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object call(){
       f$a uoa = PatchProxy.apply(null, this, k.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = f.d(this.b, this.c, this.d, this.e);
       }
       return uoa;
    }
}
