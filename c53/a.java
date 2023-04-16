package c53.a;
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

public class a extends a	// class@0004cd
{

    public void a(){
       super();
    }
    public List e(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(8);
       obj.add(Integer.valueOf(1025));
       obj.add(Integer.valueOf(1029));
       obj.add(Integer.valueOf(1035));
       obj.add(Integer.valueOf(1013));
       obj.add(Integer.valueOf(1015));
       return obj;
    }
    public List k(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1015)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1019)};
       obj.add(j.a(integerArray));
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(1013)};
       obj.add(j.a(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray1));
       obj.add(this.g());
       return obj;
    }
    public List l(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1013)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       obj.add(this.c());
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray1));
       obj.add(this.g());
       return obj;
    }
}
