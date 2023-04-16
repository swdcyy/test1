package fn8.d;
import android.graphics.PointF;
import android.graphics.Matrix;
import fn8.d$a;
import android.view.ViewGroup;
import fn8.e;
import fn8.o;
import java.lang.Object;
import fn8.b;
import android.view.View;
import java.util.Objects;
import fn8.c;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import android.view.MotionEvent;
import android.view.ViewParent;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import com.swmansion.gesturehandler.PointerEventsConfig;
import java.lang.StringBuilder;
import java.lang.Enum;

public class d	// class@002323
{
    public final ViewGroup a;
    public final e b;
    public final o c;
    public final b[] d;
    public final b[] e;
    public final b[] f;
    public final b[] g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public static final PointF o;
    public static final float[] p;
    public static final Matrix q;
    public static final float[] r;
    public static final Comparator s;

    static {
       d.o = new PointF();
       float[] uofloatArray = new float[2];
       d.p = uofloatArray;
       d.q = new Matrix();
       float[] uofloatArray1 = new float[2];
       d.r = uofloatArray1;
       d.s = new d$a();
    }
    public void d(ViewGroup p0,e p1,o p2){
       super();
       b[] uobArray = new b[20];
       this.d = uobArray;
       uobArray = new b[20];
       this.e = uobArray;
       uobArray = new b[20];
       this.f = uobArray;
       b[] uobArray1 = new b[20];
       this.g = uobArray1;
       this.h = 0;
       this.i = 0;
       this.j = false;
       this.k = 0;
       this.l = false;
       this.m = 0;
       this.n = 0;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static boolean e(int p0){
       int i = 1;
       if (p0 == 3 || (p0 != i && p0 != 5)) {
          i = false;
       }
    label_000b :
       return i;
    }
    public static boolean f(float p0,float p1,View p2){
       boolean b = (p0 >= 0 && (p0 - (float)p2.getWidth() <= 0 && (p1 >= 0 && p1 - (float)p2.getHeight() < 0)))? true: false;
       return b;
    }
    public static boolean h(b p0,b p1){
       boolean b = false;
       boolean i = 0;
       while (true) {
          b a = p0.a;
          if (i < a.length) {
             int i1 = -1;
             if (a[i] != i1 && p1.a[i] != i1) {
                i = true;
             label_0019 :
                if (!i) {
                   break ;
                }else if(p0 != p1 && (p0.y(p1) || p1.y(p0))){
                   i = 1;
                }else {
                   i = 0;
                }
                if (i) {
                   return b;
                }else if(p0 != p1 && (p0.w != null || p0.k() == 4)){
                   return p0.x(p1);
                }else {
                   return true;
                }
             }else {
                i = i + 1;
             }
          }else {
             i = false;
             goto label_0019 ;
          }
       }
       return b;
    }
    public static boolean i(b p0,b p1){
       boolean b1;
       boolean b = false;
       if (p0 != p1) {
          Objects.requireNonNull(p0);
          if (p1 != p0) {
             b t = p0.t;
             if (t != null) {
                b1 = t.a(p0, p1);
             label_0012 :
                if (b1 || p1.z(p0)) {
                   b = true;
                }
             }
          }
          b1 = false;
          goto label_0012 ;
       }
       return b;
    }
    public static boolean j(View p0,float[] p1){
       int i = 0;
       int i1 = (!p0 instanceof ViewGroup || p0.getBackground() != null)? 1: 0;
       if (i1 && d.f(p1[i], p1[1], p0)) {
          i = true;
       }
       return i;
    }
    public static void k(float p0,float p1,ViewGroup p2,View p3,PointF p4){
       int i;
       int i1;
       p0 = (p0 + (float)p2.getScrollX()) - (float)p3.getLeft();
       p1 = (p1 + (float)p2.getScrollY()) - (float)p3.getTop();
       Matrix matrix = p3.getMatrix();
       if (!matrix.isIdentity()) {
          float[] p = d.p;
          p[0] = p0;
          p[1] = p1;
          Matrix q = d.q;
          matrix.invert(q);
          q.mapPoints(p);
          i = p[1];
          i1 = p[0];
       }
       p4.set(i1, i);
       return;
    }
    public final void a(){
       int i = 0;
       int i1 = 0;
       while (i < this.i) {
          d te = this.e;
          if (te[i].w != null) {
             int i2 = i1 + 1;
             te[i1] = te[i];
             i1 = i2;
          }
          i = i + 1;
       }
       this.i = i1;
       return;
    }
    public final void b(){
       int i = this.h - 1;
       d uod = null;
       while (i >= 0) {
          object oobject = this.d[i];
          if (d.e(oobject.k()) && oobject.w == null) {
             this.d[i] = null;
             oobject.d = null;
             oobject.r = null;
             Arrays.fill(oobject.a, -1);
             oobject.b = 0;
             oobject.s();
             oobject.v = false;
             oobject.w = false;
             oobject.u = Integer.MAX_VALUE;
             uod = 1;
          }
          i = i - 1;
       }
       if (uod != null) {
          i = 0;
          int i1 = 0;
          while (i < this.h) {
             uod = this.d;
             if (uod[i] != null) {
                int i2 = i1 + 1;
                uod[i1] = uod[i];
                i1 = i2;
             }
             i = i + 1;
          }
          this.h = i1;
       }
       this.l = false;
       return;
    }
    public final void c(View p0,MotionEvent p1,float[] p2){
       if (p0 == this.a) {
          p2[0] = p1.getX();
          p2[1] = p1.getY();
          return;
       }else if(p0 != null && p0.getParent() instanceof ViewGroup){
          ViewGroup parent = p0.getParent();
          this.c(parent, p1, p2);
          PointF o = d.o;
          d.k(p2[0], p2[1], parent, p0, o);
          p2[0] = o.x;
          p2[1] = o.y;
          return;
       }else {
          throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
       }
    }
    public final boolean d(ViewGroup p0,float[] p1,int p2){
       int i = p0.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return 0;
          }
          View view = this.c.b(p0, i);
          PointF pointF = (!view.getVisibility() && view.getAlpha() - this.n >= 0)? 1: null;
          if (pointF) {
             pointF = d.o;
             d.k(p1[0], p1[1], p0, view, pointF);
             int i1 = p1[0];
             int i2 = p1[1];
             p1[0] = pointF.x;
             p1[1] = pointF.y;
             int i3 = (!view instanceof ViewGroup || this.c.a(view))? 1: 0;
             boolean b = (!i3 || d.f(p1[0], p1[1], view))? this.l(view, p1, p2): null;
             p1[0] = i1;
             p1[1] = i2;
             if (b) {
                break ;
             }
          }
          i = i - 1;
       }
       return 1;
    }
    public final boolean g(View p0,float[] p1,int p2){
       ArrayList uArrayList = this.b.a(p0);
       int i = 0;
       if (uArrayList != null) {
          int i1 = uArrayList.size();
          int i2 = 0;
          int i3 = 0;
          while (true) {
             if (i2 < i1) {
                b uob = uArrayList.get(i2);
                if (uob.i != null && uob.o(p0, p1[i], p1[1])) {
                   i3 = 0;
                   while (true) {
                      d th = this.h;
                      b uob1 = -1;
                      if (i3 < th) {
                         if (this.d[i3] == uob) {
                         label_005f :
                            b a = uob.a;
                            if (a[p2] == uob1) {
                               int i4 = 0;
                               while (i4 < uob.b) {
                                  int i5 = 0;
                                  b a1 = uob.a;
                                  while (i5 < a1.length && a1[i5] != i4) {
                                     i5 = i5 + 1;
                                  }
                                  if (i5 == a1.length) {
                                  }
                                  i4 = i4 + 1;
                               }
                               a[p2] = i4;
                               i3 = uob.b + 1;
                               uob.b = i3;
                            }
                            i3 = 1;
                         }else {
                            i3 = i3 + 1;
                         }
                      }else {
                         d td = this.d;
                         if (th < td.length) {
                            int i6 = th + 1;
                            this.h = i6;
                            td[th] = uob;
                            uob.v = i;
                            uob.w = i;
                            uob.u = Integer.MAX_VALUE;
                            if (uob.d == null && uob.r == null) {
                               Arrays.fill(uob.a, uob1);
                               uob.b = i;
                               uob.e = i;
                               uob.d = p0;
                               uob.r = this;
                               goto label_005f ;
                            }else {
                               throw new IllegalStateException("Already prepared or hasn\'t been reset");
                            }
                         }else {
                            throw new IllegalStateException("Too many recognizers");
                         }
                      }
                   }
                }
                i2 = i2 + 1;
             }else {
                i = i3;
                break ;
             }
          }
       }
       return i;
    }
    public final boolean l(View p0,float[] p1,int p2){
       PointerEventsConfig pointerEvent = this.c.c(p0);
       boolean b = false;
       if (pointerEvent == PointerEventsConfig.NONE) {
          return b;
       }
       if (pointerEvent == PointerEventsConfig.BOX_ONLY) {
          if (this.g(p0, p1, p2) || d.j(p0, p1)) {
             b = true;
          }
          return b;
       }else if(pointerEvent == PointerEventsConfig.BOX_NONE){
          if (p0 instanceof ViewGroup) {
             return this.d(p0, p1, p2);
          }else {
             return b;
          }
       }else if(pointerEvent == PointerEventsConfig.AUTO){
          boolean b1 = (p0 instanceof ViewGroup)? this.d(p0, p1, p2): false;
          if (!this.g(p0, p1, p2) && (b1 || d.j(p0, p1))) {
             b = true;
          }
          return b;
       }else {
          throw new IllegalArgumentException("Unknown pointer event type: "+pointerEvent.toString());
       }
    }
    public final void m(b p0){
       d uod;
       int i = 0;
       int i1 = 0;
       while (true) {
          boolean b = true;
          if (i1 < this.h) {
             object oobject = this.d[i1];
             if (!d.e(oobject.k()) && d.i(p0, oobject)) {
                uod = 1;
             label_0021 :
                if (uod) {
                   while (true) {
                      uod = this.i;
                      if (i < uod) {
                         if (this.e[i] != p0) {
                            i = i + 1;
                         }
                      }else {
                         d te = this.e;
                         if (uod < te.length) {
                            this.i = uod + 1;
                            te[uod] = p0;
                            p0.w = b;
                            te = this.m;
                            this.m = te + 1;
                            p0.u = te;
                            break ;
                         }else {
                            throw new IllegalStateException("Too many recognizers");
                         }
                      }
                   }
                }else {
                   i1 = p0.k();
                   p0.w = i;
                   p0.v = b;
                   d tm = this.m;
                   this.m = tm + 1;
                   p0.u = tm;
                   int i2 = 0;
                   int i3 = 0;
                   while (i2 < this.h) {
                      object oobject1 = this.d[i2];
                      if (d.h(oobject1, p0)) {
                         int i4 = i3 + 1;
                         this.g[i3] = oobject1;
                         i3 = i4;
                      }
                      i2 = i2 + 1;
                   }
                   for (i3 = i3 - b; i3 >= 0; i3 = i3 - 1) {
                      this.g[i3].c();
                   }
                   i2 = this.i - b;
                   while (i2 >= 0) {
                      object oobject2 = this.e[i2];
                      if (d.h(oobject2, p0)) {
                         oobject2.c();
                         oobject2.w = i;
                      }
                      i2 = i2 - 1;
                   }
                   this.a();
                   p0.d(4, 2);
                   if (i1 != 4) {
                      p0.d(5, 4);
                      if (i1 != 5) {
                         p0.d(i, 5);
                      }
                   }
                   p0.w = i;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             uod = null;
             goto label_0021 ;
          }
       }
       return;
    }
}
