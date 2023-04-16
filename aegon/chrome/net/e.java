package aegon.chrome.net.e;
import android.content.Context;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Constructor;
import aegon.chrome.net.d$a;
import java.lang.StringBuilder;

public abstract class e	// class@0001b1
{
    public final Context a;
    public static final String b = "e";

    public void e(Context p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Context must not be null");
       }
       this.a = p0;
       return;
    }
    public static boolean a(Context p0,String p1,Set p2,boolean p3){
       ClassLoader classLoader = p0.getClassLoader();
       try{
          int i = 0;
          Class[] uClassArray = new Class[1];
          uClassArray[i] = Context.class;
          Object[] objArray = new Object[1];
          objArray[i] = p0;
          p2.add(classLoader.loadClass(p1).asSubclass(e.class).getConstructor(uClassArray).newInstance(objArray));
          return 1;
       }catch(java.lang.InstantiationException e0){
       label_0028 :
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public abstract d$a b();
    public abstract String c();
    public abstract String d();
    public abstract boolean e();
    public String toString(){
       return "[class="+this.getClass().getName()+", name="+this.c()+", version="+this.d()+", enabled="+this.e()+"]";
    }
}
