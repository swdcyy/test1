package j.b;
import i.a;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.util.LinkedList;
import a.a.a.a.b.e.b$b;
import java.lang.StringBuilder;
import a.a.a.a.b.e.b;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.util.Arrays;

public final class b extends a	// class@002204
{

    public void b(){
       super();
    }
    public List a(String p0){
       Class[] uClassArray = new Class[]{String.class};
       Object[] objArray = new Object[]{p0};
       List list = Class.forName("com.yxcorp.gifshow.init.module.DFPInitModule").getDeclaredMethod("bbxwe_xx", uClassArray).invoke(null, objArray);
       if (list == null) {
          return new LinkedList();
       }
       if (list.isEmpty()) {
          b.a(b$b.a, "resolvedIPList "+p0+" is empty", 215);
          list = new LinkedList();
       }
       return list;
    }
}
