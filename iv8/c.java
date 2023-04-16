package iv8.c;
import erd.o;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iv8.b;

public class c implements o	// class@00272d
{
    public final int b;
    public final int c;
    public int d;

    public void c(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
       this.d = 0;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new b(this));
       }
       return ot;
    }
}
