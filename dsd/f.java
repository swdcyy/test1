package dsd.f;
import dsd.f$a;
import java.lang.reflect.Method;
import java.lang.Object;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import java.lang.Class;
import java.lang.String;
import java.lang.ClassLoader;
import kotlin.jvm.internal.a;

public final class f	// class@0014ec
{
    public static final f$a a;
    public static f$a b;
    public static final f c;

    static {
       f.c = new f();
       f.a = new f$a(null, null, null);
    }
    public void f(){
       super();
    }
    public final f$a a(BaseContinuationImpl p0){
       try{
          Class[] uClassArray = new Class[0];
          Class[] uClassArray1 = new Class[0];
          Class[] uClassArray2 = new Class[0];
          f$a uoa = new f$a(Class.class.getDeclaredMethod("getModule", uClassArray), p0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", uClassArray1), p0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", uClassArray2));
          f.b = uoa;
          return uoa;
       }catch(java.lang.Exception e0){
          f$a a = f.a;
          f.b = a;
          return a;
       }
    }
    public final String b(BaseContinuationImpl p0){
       f$a a;
       String str1;
       a.p(p0, "continuation");
       f$a b = f.b;
       if (b != null) {
       }else {
          b = this.a(p0);
       }
       String str = null;
       if (b == f.a) {
          return str;
       }else {
          a = b.a;
          if (a != null) {
             Object[] objArray = new Object[0];
             p0 = a.invoke(p0.getClass(), objArray);
             if (p0 != null) {
                a = b.b;
                if (a != null) {
                   objArray = new Object[0];
                   p0 = a.invoke(p0, objArray);
                   if (p0 != null) {
                      b = b.c;
                      if (b != null) {
                         Object[] objArray1 = new Object[0];
                         str1 = b.invoke(p0, objArray1);
                      }else {
                         str1 = str;
                      }
                      if (str1 instanceof String) {
                         str = str1;
                      }
                   }
                }
             }
          }
          return str;
       }
    }
}
