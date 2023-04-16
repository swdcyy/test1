package a2.u0$c;
import a2.u0$f;
import android.view.WindowInsets;
import a2.u0;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.reflect.Constructor;
import p1.b;

public class u0$c extends u0$f	// class@0000ad
{
    public WindowInsets c;
    public b d;
    public static Field e;
    public static boolean f;
    public static Constructor g;
    public static boolean h;

    public void u0$c(){
       super();
       this.c = u0$c.i();
    }
    public void u0$c(u0 p0){
       super();
       this.c = p0.v();
    }
    public static WindowInsets i(){
       Field e;
       WindowInsets windowInsets;
       Class[] uClassArray;
       Constructor g;
       Object[] objArray;
       boolean b = true;
       if (!u0$c.f) {
          try{
             u0$c.e = WindowInsets.class.getDeclaredField("CONSUMED");
             u0$c.f = b;
          }catch(java.lang.ReflectiveOperationException e0){
          }
       }
    }
    public u0 b(){
       this.a();
       u0 ou0 = u0.w(this.c);
       ou0.r(this.b);
       ou0.u(this.d);
       return ou0;
    }
    public void e(b p0){
       this.d = p0;
    }
    public void g(b p0){
       u0$c tc = this.c;
       if (tc != null) {
          this.c = tc.replaceSystemWindowInsets(p0.a, p0.b, p0.c, p0.d);
       }
       return;
    }
}
