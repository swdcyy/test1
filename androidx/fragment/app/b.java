package androidx.fragment.app.b;
import androidx.collection.SimpleArrayMap;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.reflect.Constructor;

public class b	// class@0007a2
{
    public static final SimpleArrayMap a;

    static {
       b.a = new SimpleArrayMap();
    }
    public void b(){
       super();
    }
    public static boolean b(ClassLoader p0,String p1){
       try{
          return Fragment.class.isAssignableFrom(b.c(p0, p1));
       }catch(java.lang.ClassNotFoundException e0){
          return false;
       }
    }
    public static Class c(ClassLoader p0,String p1){
       SimpleArrayMap a = b.a;
       Class uClass = a.get(p1);
       if (uClass == null) {
          uClass = Class.forName(p1, false, p0);
          a.put(p1, uClass);
       }
       return uClass;
    }
    public static Class d(ClassLoader p0,String p1){
       String str = "Unable to instantiate fragment ";
       try{
          return b.c(p0, p1);
       }catch(java.lang.ClassNotFoundException e3){
          throw new Fragment$InstantiationException(str+p1+": make sure class name exists", e3);
       }catch(java.lang.ClassCastException e3){
          throw new Fragment$InstantiationException(str+p1+": make sure class is a valid subclass of Fragment", e3);
       }
    }
    public Fragment a(ClassLoader p0,String p1){
       String str = "Unable to instantiate fragment ";
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return b.d(p0, p1).getConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.InstantiationException e5){
          throw new Fragment$InstantiationException(str+p1+v0, e5);
       }catch(java.lang.IllegalAccessException e5){
          throw new Fragment$InstantiationException(str+p1+v0, e5);
       }catch(java.lang.NoSuchMethodException e5){
          throw new Fragment$InstantiationException(str+p1+": could not find Fragment constructor", e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new Fragment$InstantiationException(str+p1+": calling Fragment constructor caused an exception", e5);
       }
    }
}
