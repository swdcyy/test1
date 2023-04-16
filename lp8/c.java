package lp8.c;
import java.lang.Object;
import lp8.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import no8.e;
import java.lang.reflect.Method;
import java.lang.Throwable;
import zp8.a;
import lp8.a;

public class c	// class@002d85
{
    public static b a;

    public void c(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.a == null) {
          if (!e.b().e() || e.b().f()) {
             c.a = new a();
          }else {
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             c.a = Class.forName("com.tachikoma.debug.preference.TKDebugPreferenceImpl").getDeclaredMethod("get", uClassArray).invoke(null, objArray);
          }
       }
       return c.a;
    }
}
