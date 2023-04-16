package pa.f;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.JsonElement;
import yx.j0;

public final class f implements g	// class@0028fa
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public void accept(Object p0){
       StringBuilder str = "DiverseAdRequester ad response : ";
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
