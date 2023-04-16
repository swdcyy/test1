package qa.b;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.JsonElement;
import yx.j0;

public final class b implements g	// class@0029b6
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       StringBuilder str = "Diverse ad response : ";
       if (p0 != null) {
          p0 = p0.i();
          if (p0 != null) {
             p0 = p0.toString();
          label_001a :
             Object[] objArray = new Object[0];
             j0.f("AdBaseDataRequester", str+p0, objArray);
             return;
          }
       }
       p0 = null;
       goto label_001a ;
    }
}
