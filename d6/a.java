package d6.a;
import d6.i;
import d6.j;
import java.lang.Object;
import java.util.ArrayList;
import d6.f;
import java.lang.reflect.Type;
import java.lang.Class;
import org.json.alipay.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Array;
import d6.e;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class a implements i, j	// class@001e0f
{

    public void a(){
       super();
    }
    public final Object a(Object p0){
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(f.b(p0[i]));
       }
       return uArrayList;
    }
    public final Object a(Object p0,Type p1){
       if (!p0.getClass().equals(a.class)) {
          return null;
       }
       if (p1 instanceof GenericArrayType) {
          throw new IllegalArgumentException("Does not support generic array!");
       }
       Class componentTyp = p1.getComponentType();
       int i = p0.a();
       Object obj = Array.newInstance(componentTyp, i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Array.set(obj, i1, e.a(p0.a(i1), componentTyp));
       }
       return obj;
    }
    public final boolean a(Class p0){
       return p0.isArray();
    }
}
