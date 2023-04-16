package y49.g;
import y49.d;
import tx4.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yx.j0;

public abstract class g extends d	// class@004104
{
    public final h b;
    public final String c;

    public void g(h p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object b(Object p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       j0.f("adtk", "function name = "+this.c+" args = "+p0, objArray);
       obj = this.b;
       if (obj == null) {
          return null;
       }
       objArray = new Object[]{p0};
       return obj.call(objArray);
    }
}
