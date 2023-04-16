package fsd.k$a;
import java.lang.Throwable;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;

public final class k$a	// class@000e66
{
    public static final Method a;
    public static final Method b;
    public static final k$a c;

    static {
       object oobject;
       String str;
       k$a.c = new k$a();
       Throwable throwable = Throwable.class;
       Method[] methods = throwable.getMethods();
       a.o(methods, "throwableMethods");
       int len = methods.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          Method method = null;
          if (i1 < len) {
             oobject = methods[i1];
             a.o(oobject, "it");
             if (a.g(oobject.getName(), "addSuppressed")) {
                Class[] parameterTyp = oobject.getParameterTypes();
                a.o(parameterTyp, "it.parameterTypes");
                if (a.g(ArraysKt___ArraysKt.mt(parameterTyp), throwable)) {
                   str = 1;
                label_0043 :
                   if (str) {
                   label_004a :
                      k$a.a = oobject;
                      int len1 = methods.length;
                      while (i < len1) {
                         object oobject1 = methods[i];
                         a.o(oobject1, "it");
                         if (a.g(oobject1.getName(), "getSuppressed")) {
                            method = oobject1;
                            break ;
                         }
                         i = i + 1;
                      }
                      k$a.b = method;
                   }else {
                      i1 = i1 + 1;
                   }
                }
             }
             str = null;
             goto label_0043 ;
          }else {
             oobject = method;
             goto label_004a ;
          }
       }
    }
    public void k$a(){
       super();
    }
}
