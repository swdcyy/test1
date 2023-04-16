package a0.o;
import h0.a;
import a0.o$a;
import aegon.chrome.base.JniException;
import java.lang.String;

public class o	// class@00000d
{
    public static o$a a;

    public static void a(boolean p0){
       o$a a;
       if (!a.b) {
          return;
       }
       a = o.a;
       if (a == null) {
          return;
       }
       p0 = (p0)? a.a(): a.b();
       if (p0) {
          return;
       }else {
          throw new JniException("Native method called before the native library was ready.");
       }
    }
}
