package e3.w;
import android.os.Build$VERSION;
import e3.z;
import e3.y;
import e3.w$a;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import e3.w$b;
import android.graphics.Rect;
import android.view.View;
import e3.a0;
import java.lang.reflect.Field;
import e3.v;
import e3.u;
import e3.d0;
import e3.c0;
import android.graphics.Matrix;
import java.lang.Object;

public class w	// class@001ef7
{
    public static final a0 a;
    public static Field b;
    public static boolean c;
    public static final Property d;
    public static final Property e;

    static {
       w.a = (Build$VERSION.SDK_INT >= 22)? new z(): new y();
       w.d = new w$a(Float.class, "translationAlpha");
       w.e = new w$b(Rect.class, "clipBounds");
    }
    public static void a(View p0){
       w.a.a(p0);
    }
    public static void b(){
       if (!w.c) {
          boolean b = true;
          try{
             Field declaredFiel = View.class.getDeclaredField("mViewFlags");
             w.b = declaredFiel;
             declaredFiel.setAccessible(b);
             w.c = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public static v c(View p0){
       return new u(p0);
    }
    public static float d(View p0){
       return w.a.c(p0);
    }
    public static d0 e(View p0){
       return new c0(p0);
    }
    public static void f(View p0){
       w.a.d(p0);
    }
    public static void g(View p0,Matrix p1){
       w.a.e(p0, p1);
    }
    public static void h(View p0,int p1,int p2,int p3,int p4){
       w.a.f(p0, p1, p2, p3, p4);
    }
    public static void i(View p0,float p1){
       w.a.g(p0, p1);
    }
    public static void j(View p0,int p1){
       try{
          w.b();
          Field b = w.b;
          if (b != null) {
             w.b.setInt(p0, (p1 | (b.getInt(p0) & 0xf3)));
          }
          return;
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public static void k(View p0,Matrix p1){
       w.a.h(p0, p1);
    }
    public static void l(View p0,Matrix p1){
       w.a.i(p0, p1);
    }
}
