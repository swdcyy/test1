package c53.e;
import v32.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Integer;
import ekd.j;

public class e extends a	// class@0004d1
{

    public void e(){
       super();
    }
    public List e(){
       ArrayList obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(8);
       obj.add(Integer.valueOf(1025));
       obj.add(Integer.valueOf(1029));
       obj.add(Integer.valueOf(1035));
       obj.add(Integer.valueOf(1013));
       return obj;
    }
    public List k(){
       ArrayList obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       obj.add(this.j());
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(1013)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray));
       obj.add(this.g());
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(4003)};
       obj.add(j.a(integerArray1));
       return obj;
    }
    public List l(){
       ArrayList obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1013)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       obj.add(this.j());
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray));
       obj.add(this.g());
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(4003)};
       obj.add(j.a(integerArray1));
       return obj;
    }
}
