package a2.u0$g;
import a2.u0$l;
import a2.u0;
import android.view.WindowInsets;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.ReflectiveOperationException;
import p1.b;
import java.lang.Object;
import java.util.Objects;
import a2.u0$b;
import a2.d;
import a2.u0$m;
import java.lang.Math;
import android.os.Build$VERSION;
import android.graphics.Rect;
import java.lang.UnsupportedOperationException;

public class u0$g extends u0$l	// class@0000b1
{
    public final WindowInsets c;
    public b[] d;
    public b e;
    public u0 f;
    public b g;
    public static boolean h;
    public static Method i;
    public static Class j;
    public static Class k;
    public static Field l;
    public static Field m;

    public void u0$g(u0 p0,u0$g p1){
       super(p0, new WindowInsets(p1.c));
    }
    public void u0$g(u0 p0,WindowInsets p1){
       super(p0);
       this.e = null;
       this.c = p1;
    }
    public static void z(){
       boolean b = true;
       try{
          Class[] uClassArray = new Class[0];
          u0$g.i = View.class.getDeclaredMethod("getViewRootImpl", uClassArray);
          u0$g.j = Class.forName("android.view.ViewRootImpl");
          Class uClass = Class.forName("android.view.View$AttachInfo");
          u0$g.k = uClass;
          u0$g.l = uClass.getDeclaredField("mVisibleInsets");
          u0$g.m = u0$g.j.getDeclaredField("mAttachInfo");
          u0$g.l.setAccessible(b);
          u0$g.m.setAccessible(b);
       }catch(java.lang.ReflectiveOperationException e1){
          e1.getMessage();
       }
       u0$g.h = b;
       return;
    }
    public void d(View p0){
       b uob = this.x(p0);
       if (uob == null) {
          uob = b.e;
       }
       this.r(uob);
       return;
    }
    public void e(u0 p0){
       p0.t(this.f);
       p0.s(this.g);
    }
    public boolean equals(Object p0){
       if (!super.equals(p0)) {
          return false;
       }
       return Objects.equals(this.g, p0.g);
    }
    public b g(int p0){
       return this.u(p0, false);
    }
    public final b k(){
       if (this.e == null) {
          this.e = b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
       }
       return this.e;
    }
    public u0 m(int p0,int p1,int p2,int p3){
       u0$b uob = new u0$b(u0.w(this.c));
       uob.d(u0.n(this.k(), p0, p1, p2, p3));
       uob.c(u0.n(this.i(), p0, p1, p2, p3));
       return uob.a();
    }
    public boolean o(){
       return this.c.isRound();
    }
    public boolean p(int p0){
       int i = 1;
       while (true) {
          if (i > 256) {
             return true;
          }
          int i1 = p0 & i;
          if (i1 && !this.y(i)) {
             break ;
          }else {
             i = i << 1;
          }
       }
       return false;
    }
    public void q(b[] p0){
       this.d = p0;
    }
    public void r(b p0){
       this.g = p0;
    }
    public void s(u0 p0){
       this.f = p0;
    }
    public final b u(int p0,boolean p1){
       b e = b.e;
       int i = 1;
       while (i <= 256) {
          int i1 = p0 & i;
          if (i1) {
             e = b.a(e, this.v(i, p1));
          }
          i = i << 1;
       }
       return e;
    }
    public b v(int p0,boolean p1){
       int i1;
       u0$g tf;
       b uob;
       b d;
       int i = 0;
       if (p0 != 1) {
          object oobject = null;
          if (p0 != 2) {
             i1 = 8;
             if (p0 != i1) {
                if (p0 != 16) {
                   if (p0 != 32) {
                      if (p0 != 64) {
                         if (p0 != 128) {
                            return b.e;
                         }else {
                            tf = this.f;
                            d uod = (tf != null)? tf.e(): this.f();
                            if (uod != null) {
                               return b.b(uod.b(), uod.d(), uod.c(), uod.a());
                            }else {
                               return b.e;
                            }
                         }
                      }else {
                         return this.l();
                      }
                   }else {
                      return this.h();
                   }
                }else {
                   return this.j();
                }
             }else {
                tf = this.d;
                if (tf != null) {
                   oobject = tf[u0$m.a(i1)];
                }
                if (oobject != null) {
                   return oobject;
                }else {
                   uob = this.w();
                   d = this.k().d;
                   if (d > uob.d) {
                      return b.b(i, i, i, d);
                   }else {
                      tf = this.g;
                      if (tf != null && !tf.equals(b.e)) {
                         d = this.g.d;
                         if (d > uob.d) {
                            return b.b(i, i, i, d);
                         }
                      }
                      return b.e;
                   }
                }
             }
          }else if(p1){
             d = this.w();
             uob = this.i();
             return b.b(Math.max(d.a, uob.a), i, Math.max(d.c, uob.c), Math.max(d.d, uob.d));
          }else {
             d = this.k();
             u0$g tf1 = this.f;
             if (tf1 != null) {
                oobject = tf1.g();
             }
             uob = d.d;
             if (oobject != null) {
                i1 = Math.min(uob, oobject.d);
             }
             return b.b(d.a, i, d.c, i1);
          }
       }else if(p1){
          return b.b(i, Math.max(this.w().b, this.k().b), i, i);
       }else {
          return b.b(i, this.k().b, i, i);
       }
    }
    public final b w(){
       u0$g tf = this.f;
       if (tf != null) {
          return tf.g();
       }
       return b.e;
    }
    public final b x(View p0){
       if (Build$VERSION.SDK_INT >= 30) {
          throw new UnsupportedOperationException("getVisibleInsets\(\) should not be called on API >= 30. Use WindowInsets.isVisible\(\) instead.");
       }
       if (!u0$g.h) {
          u0$g.z();
       }
       Method i = u0$g.i;
       b uob = null;
       if (i != null && (u0$g.k == null || u0$g.l == null)) {
       }else {
          int i1 = 0;
          try{
             Object[] objArray = new Object[i1];
             p0 = i.invoke(p0, objArray);
             if (p0 == null) {
                return uob;
             }else {
                Rect rect = u0$g.l.get(u0$g.m.get(p0));
                if (rect != null) {
                   uob = b.c(rect);
                }
                return uob;
             }
          }catch(java.lang.ReflectiveOperationException e4){
             e4.getMessage();
          }
       label_003e :
          return uob;
       }
    }
    public boolean y(int p0){
       boolean b = false;
       if (p0 != 1 && p0 != 2) {
          if (p0 != 4) {
             if (p0 != 8 && p0 != 128) {
                return 1;
             }
          }else {
             return b;
          }
       }
       return (this.v(p0, b).equals(b.e) ^ 1);
    }
}
