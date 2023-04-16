package bl.f;
import bl.p;
import bl.g;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.google.gson.internal.c;
import java.io.ObjectStreamClass;
import java.lang.Integer;
import com.google.gson.internal.d;
import java.io.ObjectInputStream;
import com.google.gson.internal.e;
import bl.s;
import com.google.gson.internal.f;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class f implements p	// class@0002f2
{
    public final f a;
    public final Class b;
    public final Type c;
    public final g d;

    public void f(g p0,Class p1,Type p2){
       Class[] uClassArray;
       c uoc;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
       try{
          int i = 1;
          Class uClass = Class.forName("sun.misc.Unsafe");
          Field declaredFiel = uClass.getDeclaredField("theUnsafe");
          declaredFiel.setAccessible(i);
          uClassArray = new Class[i];
          uClassArray[0] = Class.class;
          uoc = new c(uClass.getMethod("allocateInstance", uClassArray), declaredFiel.get(null));
       }catch(java.lang.Exception e0){
          int i1 = 2;
          try{
             uClassArray = new Class[e0];
             uClassArray[0] = Class.class;
             Method declaredMeth = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", uClassArray);
             declaredMeth.setAccessible(e0);
             Object[] objArray = new Object[e0];
             objArray[0] = Object.class;
             Class[] uClassArray1 = new Class[i1];
             uClassArray1[0] = Class.class;
             uClassArray1[e0] = Integer.TYPE;
             declaredMeth = ObjectStreamClass.class.getDeclaredMethod("newInstance", uClassArray1);
             declaredMeth.setAccessible(e0);
             uoc = new d(declaredMeth, declaredMeth.invoke(null, objArray).intValue());
          }catch(java.lang.Exception e0){
             try{
                Class[] uClassArray2 = new Class[i1];
                uClassArray2[0] = Class.class;
                uClassArray2[e0] = Class.class;
                Method declaredMeth1 = ObjectInputStream.class.getDeclaredMethod("newInstance", uClassArray2);
                declaredMeth1.setAccessible(e0);
                uoc = new e(declaredMeth1);
             }catch(java.lang.Exception e0){
                uoc = new s();
             }
          }
       }
       this.a = uoc;
       return;
    }
    public Object a(){
       try{
          return this.a.b(this.b);
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Unable to invoke no-args constructor for "+this.c+". Registering an InstanceCreator with Gson for this type may fix this problem.", e0);
       }
    }
}
