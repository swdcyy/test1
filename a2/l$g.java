package a2.l$g;
import a2.l$l;
import a2.l;
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
import a2.d;
import a2.l$m;
import java.lang.Math;
import android.os.Build$VERSION;
import android.graphics.Rect;
import java.lang.UnsupportedOperationException;

public class l$g extends l$l	// class@000080
{
    public final WindowInsets c;
    public b[] d;
    public b e;
    public l f;
    public b g;
    public static boolean h;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;

    public void l$g(l p0,l$g p1){
       super(p0, new WindowInsets(p1.c));
    }
    public void l$g(l p0,WindowInsets p1){
       super(p0);
       this.e = null;
       this.c = p1;
    }
    public static void w(){
       boolean b = true;
       try{
          Class[] uClassArray = new Class[0];
          l$g.i = View.class.getDeclaredMethod("getViewRootImpl", uClassArray);
          Class uClass = Class.forName("android.view.View$AttachInfo");
          l$g.j = uClass;
          l$g.k = uClass.getDeclaredField("mVisibleInsets");
          l$g.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
          l$g.k.setAccessible(b);
          l$g.l.setAccessible(b);
       }catch(java.lang.ReflectiveOperationException e1){
          e1.getMessage();
       }
       l$g.h = b;
       return;
    }
    public void d(View p0){
       b uob = this.v(p0);
       if (uob == null) {
          uob = b.e;
       }
       this.p(uob);
       return;
    }
    public void e(l p0){
       p0.k(this.f);
       p0.j(this.g);
    }
    public boolean equals(Object p0){
       if (!super.equals(p0)) {
          return false;
       }
       return Objects.equals(this.g, p0.g);
    }
    public b g(int p0){
       return this.s(p0, false);
    }
    public final b k(){
       if (this.e == null) {
          this.e = b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
       }
       return this.e;
    }
    public boolean n(){
       return this.c.isRound();
    }
    public void o(b[] p0){
       this.d = p0;
    }
    public void p(b p0){
       this.g = p0;
    }
    public void q(l p0){
       this.f = p0;
    }
    public final b s(int p0,boolean p1){
       b e = b.e;
       int i = 1;
       while (i <= 256) {
          int i1 = p0 & i;
          if (i1) {
             e = l.h(e, this.t(i, p1));
          }
          i = i << 1;
       }
       return e;
    }
    public b t(int p0,boolean p1){
       int i1;
       l$g tf;
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
                   oobject = tf[l$m.a(i1)];
                }
                if (oobject != null) {
                   return oobject;
                }else {
                   uob = this.u();
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
             d = this.u();
             uob = this.i();
             return b.b(Math.max(d.a, uob.a), i, Math.max(d.c, uob.c), Math.max(d.d, uob.d));
          }else {
             d = this.k();
             l$g tf1 = this.f;
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
          return b.b(i, Math.max(this.u().b, this.k().b), i, i);
       }else {
          return b.b(i, this.k().b, i, i);
       }
    }
    public final b u(){
       l$g tf = this.f;
       if (tf != null) {
          return tf.g();
       }
       return b.e;
    }
    public final b v(View p0){
       if (Build$VERSION.SDK_INT >= 30) {
          throw new UnsupportedOperationException("getVisibleInsets\(\) should not be called on API >= 30. Use WindowInsets.isVisible\(\) instead.");
       }
       if (!l$g.h) {
          l$g.w();
       }
       Method i = l$g.i;
       b uob = null;
       if (i != null && (l$g.j == null || l$g.k == null)) {
       }else {
          int i1 = 0;
          try{
             Object[] objArray = new Object[i1];
             p0 = i.invoke(p0, objArray);
             if (p0 == null) {
                return uob;
             }else {
                Rect rect = l$g.k.get(l$g.l.get(p0));
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
}
