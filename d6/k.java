package d6.k;
import d6.i;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.Class;
import org.json.alipay.a;
import java.util.HashSet;
import java.lang.reflect.ParameterizedType;
import d6.e;
import java.util.Set;

public final class k implements i	// class@001e19
{

    public void k(){
       super();
    }
    public final Object a(Object p0,Type p1){
       if (!p0.getClass().equals(a.class)) {
          return null;
       }
       HashSet hashSet = new HashSet();
       int i = 0;
       object oobject = (p1 instanceof ParameterizedType)? p1.getActualTypeArguments()[i]: Object.class;
       while (i < p0.a()) {
          hashSet.add(e.a(p0.a(i), oobject));
          i = i + 1;
       }
       return hashSet;
    }
    public final boolean a(Class p0){
       return Set.class.isAssignableFrom(p0);
    }
}
