package a2.l$c;
import a2.l$f;
import android.view.WindowInsets;
import a2.l;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.reflect.Constructor;
import p1.b;

public class l$c extends l$f	// class@00007c
{
    public WindowInsets c;
    public b d;
    public static Field e;
    public static boolean f;
    public static Constructor g;
    public static boolean h;

    public void l$c(){
       super();
       this.c = l$c.h();
    }
    public void l$c(l p0){
       super(p0);
       this.c = p0.m();
    }
    public static WindowInsets h(){
       Field e;
       WindowInsets windowInsets;
       Class[] uClassArray;
       Constructor g;
       Object[] objArray;
       boolean b = true;
       if (!l$c.f) {
          try{
             l$c.e = WindowInsets.class.getDeclaredField("CONSUMED");
             l$c.f = b;
          }catch(java.lang.ReflectiveOperationException e0){
          }
       }
    }
    public l b(){
       this.a();
       l ol = l.n(this.c);
       ol.i(this.b);
       ol.l(this.d);
       return ol;
    }
    public void d(b p0){
       this.d = p0;
    }
    public void f(b p0){
       l$c tc = this.c;
       if (tc != null) {
          this.c = tc.replaceSystemWindowInsets(p0.a, p0.b, p0.c, p0.d);
       }
       return;
    }
}
