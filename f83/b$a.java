package f83.b$a;
import vb3.o;
import java.lang.Object;
import vb3.o$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class b$a implements o	// class@0028eb
{

    public void b$a(){
       super();
    }
    public boolean a(){
       return true;
    }
    public o$a b(int p0,int p1,int p2,int p3,int p4,boolean p5,boolean p6){
       if (PatchProxy.isSupport(b$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, b$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new o$a(0, 0, 0);
    }
}
