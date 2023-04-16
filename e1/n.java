package e1.n;
import e1.e;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import e1.n$a;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Math;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.Objects;
import e1.c;
import android.graphics.Matrix;

public class n extends e	// class@001e9f
{
    public int g;
    public String h;
    public int i;
    public String j;
    public String k;
    public int l;
    public int m;
    public View n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public float s;
    public Method t;
    public Method u;
    public Method v;
    public float w;
    public boolean x;
    public RectF y;
    public RectF z;

    public void n(){
       super();
       this.g = -1;
       this.h = null;
       int f = e.f;
       this.i = f;
       this.j = null;
       this.k = null;
       this.l = f;
       this.m = f;
       this.n = null;
       this.o = 0.10f;
       this.p = true;
       this.q = true;
       this.r = true;
       this.s = Float.NaN;
       this.x = false;
       this.y = new RectF();
       this.z = new RectF();
       this.d = 5;
       this.e = new HashMap();
    }
    public void a(HashMap p0){
    }
    public void b(HashSet p0){
    }
    public void c(Context p0,AttributeSet p1){
       n$a.a(this, p0.obtainStyledAttributes(p1, c$b.z1), p0);
    }
    public void f(String p0,Object p1){
    }
    public void j(float p0,View p1){
       n on;
       boolean b1;
       Class[] uClassArray;
       Object[] objArray;
       Class[] uClassArray1;
       Object[] objArray1;
       Class[] uClassArray2;
       Object[] objArray2;
       boolean b = true;
       if (this.m != e.f) {
          if (this.n == null) {
             this.n = p1.getParent().findViewById(this.m);
          }
          this.k(this.y, this.n, this.x);
          this.k(this.z, p1, this.x);
          if (this.y.intersect(this.z)) {
             if (this.p != null) {
                this.p = false;
                on = 1;
             }else {
                on = null;
             }
             if (this.r != null) {
                this.r = false;
                b1 = true;
             }else {
                b1 = false;
             }
             this.q = b;
             uClassArray = null;
          }else if(this.p == null){
             this.p = b;
             on = 1;
          }else {
             on = null;
          }
          if (this.q != null) {
             this.q = false;
             uClassArray2 = 1;
          }else {
             uClassArray2 = 0;
          }
          this.r = b;
       label_00de :
          uClassArray = uClassArray2;
          b1 = false;
       }else {
          b1 = false;
          if (this.p != null) {
             on = this.s;
             if (((p0 - on) * (this.w - on)) - b1 < 0) {
                this.p = false;
                on = 1;
             label_0088 :
                if (this.q != null) {
                   n ts = this.s;
                   float f = p0 - ts;
                   if (((this.w - ts) * f) - b1 < 0 && f - b1 < 0) {
                      this.q = false;
                      uClassArray = 1;
                   label_00b2 :
                      if (this.r != null) {
                         n ts1 = this.s;
                         float f1 = p0 - ts1;
                         if (((this.w - ts1) * f1) - b1 < 0 && f1 - b1 > 0) {
                            this.r = false;
                         }else {
                            b = null;
                         }
                         b1 = b;
                      }else if(Math.abs((p0 - this.s)) - this.o > 0){
                         this.r = b;
                      }
                      uClassArray2 = uClassArray;
                      goto label_00de ;
                   }
                }else if(Math.abs((p0 - this.s)) - this.o > 0){
                   this.q = b;
                }
                uClassArray = null;
                goto label_00b2 ;
             }
          }else if(Math.abs((p0 - this.s)) - this.o > 0){
             this.p = b;
          }
          on = null;
          goto label_0088 ;
       }
       this.w = p0;
       if (uClassArray == null && (on || b1)) {
          p1.getParent().U(this.l, b1, p0);
       }
       if (this.i != e.f) {
          p1 = p1.getParent().findViewById(this.i);
       }
       if (uClassArray != null && this.j != null) {
          if (this.u == null) {
             try{
                uClassArray = new Class[false];
                this.u = p1.getClass().getMethod(this.j, uClassArray);
             }catch(java.lang.NoSuchMethodException e0){
                Objects.requireNonNull(p1);
                c.c(p1);
             }
          }
       }
    }
    public final void k(RectF p0,View p1,boolean p2){
       p0.top = (float)p1.getTop();
       p0.bottom = (float)p1.getBottom();
       p0.left = (float)p1.getLeft();
       p0.right = (float)p1.getRight();
       if (p2) {
          p1.getMatrix().mapRect(p0);
       }
       return;
    }
}
