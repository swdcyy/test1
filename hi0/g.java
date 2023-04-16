package hi0.g;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class g implements Cloneable	// class@0026d0
{
    public int avg;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int incr;
    public int max;

    public void g(){
       super();
       this.max = Integer.MIN_VALUE;
       this.f = Integer.MAX_VALUE;
    }
    public final int a(){
       return this.b;
    }
    public final int b(){
       return this.c;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
}
