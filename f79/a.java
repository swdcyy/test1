package f79.a;
import f79.c;
import android.view.View$OnTouchListener;
import f79.f;
import com.facebook.drawee.view.DraweeView;
import java.lang.Object;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.graphics.Matrix;
import java.lang.ref.WeakReference;
import ac.b;
import yb.a;
import xb.t$b;
import android.widget.ImageView;
import f79.h;
import android.content.Context;
import a2.f;
import f79.a$a;
import android.view.GestureDetector$OnGestureListener;
import f79.b;
import android.view.GestureDetector$OnDoubleTapListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.IllegalArgumentException;
import f79.a$b;
import java.lang.Runnable;
import android.view.ViewParent;
import f79.a$c;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Math;
import e2.g;
import java.lang.Boolean;
import f79.d;
import f79.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import f79.e;
import f79.c$a;
import android.view.View;
import android.view.MotionEvent;
import a2.q;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View$OnLongClickListener;

public class a implements c, View$OnTouchListener, f	// class@0022d4
{
    public int b;
    public final float[] c;
    public final RectF d;
    public final Interpolator e;
    public float f;
    public float g;
    public float h;
    public long i;
    public h j;
    public f k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public final Matrix p;
    public int q;
    public int r;
    public a$c s;
    public WeakReference t;
    public d u;
    public g v;
    public View$OnLongClickListener w;
    public e x;
    public c$a y;

    public void a(DraweeView p0){
       super();
       this.b = 0;
       float[] uofloatArray = new float[9];
       this.c = uofloatArray;
       this.d = new RectF();
       this.e = new AccelerateDecelerateInterpolator();
       this.f = 0x3f800000;
       this.g = 0x3fe00000;
       this.h = 3.00f;
       this.i = 200;
       this.l = false;
       this.m = true;
       this.n = 2;
       this.o = 2;
       this.p = new Matrix();
       this.q = -1;
       this.r = -1;
       this.t = new WeakReference(p0);
       p0.getHierarchy().u(t$b.h);
       p0.setOnTouchListener(this);
       this.j = new h(p0.getContext(), this);
       f uof = new f(p0.getContext(), new a$a(this));
       this.k = uof;
       uof.b(new b(this));
    }
    public static void k(float p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), null, a.class, "12")) {
          return;
       }
       if (p0 - p1 >= 0) {
          throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
       }
       if (p1 - p2 < 0) {
          return;
       }
       throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "26")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "24")) {
          DraweeView uDraweeView = this.p();
          if (uDraweeView != null && this.getScale() - this.f < 0) {
             RectF rectF = this.m();
             if (rectF != null) {
                a$b uob = new a$b(this, this.getScale(), this.f, rectF.centerX(), rectF.centerY());
                uDraweeView.post(v8);
             }
          }
       }
       return;
    }
    public void b(float p0,float p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, a.class, "27")) {
          return;
       }
       DraweeView uDraweeView = this.p();
       if (uDraweeView != null && !this.j.d()) {
          this.p.postTranslate(p0, p1);
          this.i();
          ViewParent parent = uDraweeView.getParent();
          if (parent == null) {
             return;
          }else if(this.m != null && (!this.j.d() && this.l == null)){
             a tb = this.b;
             if (tb == null) {
                a tn = this.n;
                if (tn != 2 && (tn != null || (p0 - 0x3f800000 >= 0 || (tn == true && p0 - 0xbf800000 <= 0)))) {
                   parent.requestDisallowInterceptTouchEvent(false);
                }
             }
             if (tb == true) {
                a to = this.o;
                if (to != 2 && (to != null || (p1 - 0x3f800000 >= 0 || (to == true && p1 - 0xbf800000 <= 0)))) {
                   parent.requestDisallowInterceptTouchEvent(false);
                }
             }
          }else {
             parent.requestDisallowInterceptTouchEvent(true);
          }
       }
       return;
    }
    public void c(float p0,float p1,float p2,float p3){
       int rectF2;
       a$c uoc1;
       int i4;
       int i5;
       int i6;
       int i7;
       int i8;
       a uoa = this;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "28")) {
          return;
       }
       DraweeView uDraweeView = this.p();
       if (uDraweeView == null) {
          return;
       }
       a$c uoc = new a$c(uoa, uDraweeView.getContext());
       uoa.s = uoc;
       int i = this.s();
       int i1 = this.r();
       int i2 = (int)p2;
       int i3 = (int)p3;
       RectF rectF = this.l();
       Objects.requireNonNull(uoc);
       if (PatchProxy.isSupport(a$c.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(i3),rectF};
          if (!PatchProxy.applyVoid(objArray, uoc, a$c.class, "2")) {
          label_0084 :
             RectF rectF1 = uoc.e.m();
             if (rectF1 != null) {
                if (rectF == null) {
                   rectF2 = Math.round((- rectF1.left));
                   float f = (float)i;
                   if (f - rectF1.width() < 0) {
                      i = Math.round((rectF1.width() - f));
                      uoc1 = null;
                   }else {
                      i = rectF2;
                      uoc1 = i;
                   }
                   i4 = Math.round((- rectF1.top));
                   float f1 = (float)i1;
                   if (f1 - rectF1.height() < 0) {
                      i1 = Math.round((rectF1.height() - f1));
                   label_0115 :
                      i5 = i;
                      i6 = uoc1;
                      i7 = i4;
                      i8 = 0;
                   label_0121 :
                      i4 = rectF2;
                      uoc.c = i4;
                      uoc.d = i7;
                      if (i4 != i5 || i7 != i1) {
                         uoc.b.e(i4, i7, i2, i3, i6, i5, i8, i1, 0, 0);
                      }
                   }
                }else {
                   i = Math.round((rectF.left - rectF1.left));
                   if (rectF.width() - rectF1.width() < 0) {
                      i1 = Math.round((rectF1.width() - rectF.width()));
                      uoc1 = null;
                   }else {
                      i1 = i;
                      uoc1 = i1;
                   }
                   i4 = Math.round((rectF.top - rectF1.top));
                   if (rectF.height() - rectF1.height() < 0) {
                      rectF2 = i;
                      i = i1;
                      i1 = Math.round((rectF1.height() - rectF.height()));
                      goto label_0115 ;
                   }else {
                      rectF2 = i;
                      i = i1;
                   }
                }
                i5 = i;
                i6 = uoc1;
                i1 = i4;
                i7 = i1;
                i8 = i7;
                goto label_0121 ;
             }
          }
       }else {
          goto label_0084 ;
       }
       uDraweeView.post(uoa.s);
       return;
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "11")) {
          return;
       }
       this.r = p0;
       this.q = p1;
       this.u();
       return;
    }
    public void e(float p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, a.class, "9")) {
          return;
       }
       DraweeView uDraweeView = this.p();
       if (uDraweeView != null) {
          this.g(p0, (float)(uDraweeView.getRight() / 2), (float)(uDraweeView.getBottom() / 2), p1);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "30")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoid(null, ts, a$c.class, "1")) {
             ts.b.a();
          }
          this.s = null;
       }
       return;
    }
    public void g(float p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, a.class, "10")) {
          return;
       }
       DraweeView uDraweeView = this.p();
       if (uDraweeView == null || (p0 - this.f >= 0 && p0 - this.h <= 0)) {
          if (p3) {
             a$b uob = new a$b(this, this.getScale(), p0, p1, p2);
             uDraweeView.post(p3);
          }else {
             this.p.setScale(p0, p0, p1, p2);
             this.i();
          }
       }
       return;
    }
    public float getMaximumScale(){
       return this.h;
    }
    public float getMediumScale(){
       return this.g;
    }
    public float getMinimumScale(){
       return this.f;
    }
    public d getOnPhotoTapListener(){
       return this.u;
    }
    public g getOnViewTapListener(){
       return this.v;
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)((float)Math.pow((double)this.q(this.p, 0), 2.00f) + (float)Math.pow((double)this.q(this.p, 3), 2.00f)));
    }
    public void h(float p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "25")) {
          return;
       }
       if (this.getScale() - this.h < 0 || p0 - 0x3f800000 < 0) {
          a tx = this.x;
          if (tx != null) {
             tx.b(p0, p1, p2);
          }
          this.p.postScale(p0, p0, p1, p2);
          this.i();
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       DraweeView uDraweeView = this.p();
       if (uDraweeView == null) {
          return;
       }
       if (this.j()) {
          uDraweeView.invalidate();
       }
       return;
    }
    public boolean j(){
       float f4;
       RectF left;
       RectF obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n(this.o());
       boolean b = false;
       if (obj == null) {
          return b;
       }
       RectF rectF = this.l();
       int i = -1;
       int i1 = 2;
       float f = 2.00f;
       float f1 = 0;
       if (rectF == null) {
          float f2 = obj.height();
          float f3 = obj.width();
          f4 = (float)this.r();
          if (f2 - f4 <= 0) {
             f4 = ((f4 - f2) / f) - obj.top;
             this.o = i1;
          }else {
             rectF = obj.top;
             if (rectF - f1 > 0) {
                f4 = - rectF;
                this.o = b;
             }else {
                rectF = obj.bottom;
                if (rectF - f4 < 0) {
                   f4 = f4 - rectF;
                   this.o = 1;
                }else {
                   this.o = i;
                   f4 = 0;
                }
             }
          }
          f2 = (float)this.s();
          if (f3 - f2 <= 0) {
             f2 = ((f2 - f3) / f) - obj.left;
             this.n = i1;
          }else {
             left = obj.left;
             if (left - f1 > 0) {
                this.n = b;
                f1 = - left;
             }else {
                obj = obj.right;
                if (obj - f2 < 0) {
                   f2 = f2 - obj;
                   this.n = 1;
                }else {
                   this.n = i;
                }
             }
          }
          f1 = f2;
       }else if(obj.height() - rectF.height() <= 0){
          this.o = i1;
          f4 = (((rectF.height() - obj.height()) / f) - obj.top) + rectF.top;
       }else {
          RectF top = obj.top;
          RectF top1 = rectF.top;
          if (top - top1 > 0) {
             f4 = top1 - top;
             this.o = b;
          }else {
             top = obj.bottom;
             top1 = rectF.bottom;
             if (top - top1 < 0) {
                f4 = top1 - top;
                this.o = 1;
             }else {
                this.o = i;
                f4 = 0;
             }
          }
       }
       if (obj.width() - rectF.width() <= 0) {
          f1 = (((rectF.width() - obj.width()) / f) - obj.left) + rectF.left;
          this.n = i1;
       }else {
          left = obj.left;
          RectF left1 = rectF.left;
          if (left - left1 > 0) {
             f1 = left1 - left;
             this.n = b;
          }else {
             obj = obj.right;
             RectF right = rectF.right;
             if (obj - right < 0) {
                f1 = right - obj;
                this.n = 1;
             }else {
                this.n = i;
             }
          }
       }
       this.p.postTranslate(f1, f4);
       return true;
    }
    public final RectF l(){
       a obj = PatchProxy.apply(null, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return null;
       }
       return obj.a();
    }
    public RectF m(){
       Object obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n(this.o());
    }
    public final RectF n(Matrix p0){
       DraweeView obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p();
       if (obj != null) {
          a tr = this.r;
          a uoa = -1;
          if (tr != uoa || this.q != uoa) {
             this.d.set(0, 0, (float)tr, (float)this.q);
             obj.getHierarchy().k(this.d);
             p0.mapRect(this.d);
             return this.d;
          }
       }
       return null;
    }
    public Matrix o(){
       return this.p;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       int b3;
       h e;
       float f1;
       ViewParent parent;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "29");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean i = q.c(p1);
       float f = 0.00f;
       boolean b = false;
       boolean b1 = true;
       if (i) {
          if (i == b1 || i == f) {
             parent = p0.getParent();
             if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(b);
             }
          }
       }else {
          parent = p0.getParent();
          if (parent != null) {
             parent.requestDisallowInterceptTouchEvent(b1);
          }
          this.f();
       }
       boolean b2 = this.j.d();
       i = this.j.c();
       a tj = this.j;
       Objects.requireNonNull(tj);
       VelocityTracker obj1 = PatchProxy.applyOneRefs(p1, tj, h.class, "6");
       if (obj1 != patchProxyRe) {
          b3 = obj1.booleanValue();
       }else {
          tj.c.onTouchEvent(p1);
          b3 = q.c(p1);
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(b3), p1, tj, h.class, "7")) {
             int i1 = -1;
             if (b3) {
                if (b3 != b1 && b3 != f) {
                   if (b3 == 6) {
                      int i3 = q.b(p1);
                      if (q.e(p1, i3) == tj.i) {
                         i3 = (!i3)? 1: 0;
                         tj.i = q.e(p1, i3);
                         tj.g = q.f(p1, i3);
                         tj.h = q.g(p1, i3);
                      }
                   }
                }else {
                   tj.i = i1;
                }
             }else {
                tj.i = p1.getPointerId(b);
             }
             h i2 = tj.i;
             if (i2 == i1) {
                i2 = 0;
             }
             tj.j = q.a(p1, i2);
          }
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(b3), p1, tj, h.class, "8")) {
             if (b3) {
                obj1 = null;
                if (b3 != b1) {
                   if (b3 != 2) {
                      if (b3 == f) {
                         e = tj.e;
                         if (e != null) {
                            e.recycle();
                            tj.e = obj1;
                         }
                      }
                   }else {
                      f1 = tj.a(p1);
                      f = tj.b(p1);
                      float f2 = f1 - tj.g;
                      float f3 = f - tj.h;
                      if (tj.f == null) {
                         boolean b4 = (Math.sqrt((double)((f2 * f2) + (f3 * f3))) - (double)tj.a >= 0)? true: false;
                         tj.f = b4;
                      }
                      if (tj.f != null) {
                         tj.d.b(f2, f3);
                         tj.g = f1;
                         tj.h = f;
                         e = tj.e;
                         if (e != null) {
                            e.addMovement(p1);
                         }
                      }
                   }
                }else if(tj.f != null && tj.e != null){
                   tj.g = tj.a(p1);
                   tj.h = tj.b(p1);
                   tj.e.addMovement(p1);
                   tj.e.computeCurrentVelocity(1000);
                   f1 = tj.e.getXVelocity();
                   f = tj.e.getYVelocity();
                   if (Math.max(Math.abs(f1), Math.abs(f)) - tj.b >= 0) {
                      tj.d.c(tj.g, tj.h, (- f1), (- f));
                   }
                }
                e = tj.e;
                if (e != null) {
                   e.recycle();
                   tj.e = obj1;
                }
             }else {
                VelocityTracker velocityTrac = VelocityTracker.obtain();
                tj.e = velocityTrac;
                if (velocityTrac != null) {
                   velocityTrac.addMovement(p1);
                }
                tj.g = tj.a(p1);
                tj.h = tj.b(p1);
                tj.f = b;
             }
          }
       label_0198 :
          b3 = 1;
       }
       a uoa = (!b2 && !this.j.d())? 1: null;
       i = (!i && !this.j.c())? 1: 0;
       if (uoa && i) {
          b = true;
       }
       this.l = b;
       if (!this.k.a(p1)) {
          b1 = b3;
       }
       return b1;
    }
    public DraweeView p(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.get();
    }
    public final float q(Matrix p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, a.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p0.getValues(this.c);
       return this.c[p1];
    }
    public final int r(){
       DraweeView obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p();
       if (obj != null) {
          return ((obj.getHeight() - obj.getPaddingTop()) - obj.getPaddingBottom());
       }
       return 0;
    }
    public final int s(){
       DraweeView obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p();
       if (obj != null) {
          return ((obj.getWidth() - obj.getPaddingLeft()) - obj.getPaddingRight());
       }
       return 0;
    }
    public void setAllowParentInterceptOnEdge(boolean p0){
       this.m = p0;
    }
    public void setBoundsProvider(c$a p0){
       this.y = p0;
    }
    public void setMaximumScale(float p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "4")) {
          return;
       }
       a.k(this.f, this.g, p0);
       this.h = p0;
       return;
    }
    public void setMediumScale(float p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "5")) {
          return;
       }
       a.k(this.f, p0, this.h);
       this.g = p0;
       return;
    }
    public void setMinimumScale(float p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "6")) {
          return;
       }
       a.k(p0, this.g, this.h);
       this.f = p0;
       return;
    }
    public void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.k.b(p0);
       }else {
          this.k.b(new b(this));
       }
       return;
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       this.w = p0;
    }
    public void setOnPhotoTapListener(d p0){
       this.u = p0;
    }
    public void setOnScaleChangeListener(e p0){
       this.x = p0;
    }
    public void setOnViewTapListener(g p0){
       this.v = p0;
    }
    public void setOrientation(int p0){
       this.b = p0;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, a.class, "8")) {
          return;
       }
       this.e(p0, false);
       return;
    }
    public void setZoomTransitionDuration(long p0){
       if (p0 < 0) {
          p0 = 200;
       }
       this.i = p0;
       return;
    }
    public void t(View p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "31")) {
          return;
       }
       p0.postOnAnimation(p1);
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "20")) {
          return;
       }
       String str = -1;
       if (this.r == str && this.q == str) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, a.class, "21")) {
          this.p.reset();
          if (!PatchProxy.applyVoid(objArray, this, a.class, "22")) {
             RectF rectF = new RectF();
             DraweeView uDraweeView1 = this.p();
             if (uDraweeView1 != null) {
                uDraweeView1.getHierarchy().k(rectF);
                RectF rectF1 = this.l();
                if (rectF1 != null) {
                   float f = Math.max((rectF1.width() / rectF.width()), (rectF1.height() / rectF.height()));
                   if (f - 0x3f800000) {
                      this.p.postScale(f, f, rectF.centerX(), rectF.centerY());
                   }
                }
             }
          }
          this.j();
          DraweeView uDraweeView = this.p();
          if (uDraweeView != null) {
             uDraweeView.invalidate();
          }
       }
       return;
    }
}
