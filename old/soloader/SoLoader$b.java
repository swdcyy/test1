package old.soloader.SoLoader$b;
import java.lang.String;
import old.soloader.SoLoader;
import java.lang.ClassLoader;
import java.lang.Class;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class SoLoader$b	// class@002006
{

    public static String a(){
       ClassLoader classLoader = SoLoader.class.getClassLoader();
       if (!classLoader instanceof BaseDexClassLoader) {
          throw new IllegalStateException("ClassLoader "+classLoader.getClass().getName()+" should be of type BaseDexClassLoader");
       }
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return BaseDexClassLoader.class.getMethod("getLdLibraryPath", uClassArray).invoke(classLoader, objArray);
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Cannot call getLdLibraryPath", e0);
       }
    }
}
