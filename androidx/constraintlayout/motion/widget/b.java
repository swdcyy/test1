package androidx.constraintlayout.motion.widget.b;
import android.content.Context;
import androidx.constraintlayout.motion.widget.MotionLayout;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import android.util.AttributeSet;
import android.util.Xml;
import android.content.res.TypedArray;
import ll8.c$b;
import android.view.ViewGroup;
import android.graphics.RectF;
import android.view.View;
import android.view.MotionEvent;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import androidx.constraintlayout.motion.widget.a;
import java.lang.Math;
import java.lang.Float;
import androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import java.lang.String;
import e1.c;
import androidx.core.widget.NestedScrollView;
import androidx.constraintlayout.motion.widget.b$a;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.b$b;
import androidx.core.widget.NestedScrollView$b;
import java.lang.StringBuilder;

public class b	// class@000678
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public float[] l;
    public float m;
    public float n;
    public final MotionLayout o;
    public float p;
    public float q;
    public boolean r;
    public float s;
    public int t;
    public float u;
    public static final float[][] v;
    public static final float[][] w;

    static {
       float[][] uofloatArray = new float[][7]{new float[2]{0x3f000000,0},new float[2]{0,0x3f000000},new float[2]{0x3f800000,0x3f000000},new float[2]{0x3f000000,0x3f800000},new float[2]{0x3f000000,0x3f000000},new float[2]{0,0x3f000000},new float[2]{0x3f800000,0x3f000000}};
       b.v = uofloatArray;
       uofloatArray = new float[][6]{new float[2]{0,0xbf800000},new float[2]{0,0x3f800000},new float[2]{0xbf800000,0},new float[2]{0x3f800000,0},new float[2]{0xbf800000,0},new float[2]{0x3f800000,0}};
       b.w = uofloatArray;
    }
    public void b(Context p0,MotionLayout p1,XmlPullParser p2){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = 0x3f000000;
       this.h = 0x3f000000;
       this.i = 0;
       this.j = 0x3f800000;
       this.k = false;
       float[] uofloatArray = new float[2];
       this.l = uofloatArray;
       this.p = 4.00f;
       this.q = 0x3f99999a;
       this.r = true;
       this.s = 0x3f800000;
       this.t = 0;
       this.u = 10.00f;
       this.o = p1;
       this.c(p0, Xml.asAttributeSet(p2));
    }
    public float a(float p0,float p1){
       return ((p0 * this.i) + (p1 * this.j));
    }
    public final void b(TypedArray p0){
       float[][] v;
       int indexCount = p0.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p0.getIndex(i);
          if (index == 9) {
             this.d = p0.getResourceId(index, this.d);
          }else if(index == 10){
             index = p0.getInt(index, this.a);
             this.a = index;
             v = b.v;
             this.h = v[index][0];
             this.g = v[index][1];
          }else if(!index){
             index = p0.getInt(index, this.b);
             this.b = index;
             v = b.w;
             this.i = v[index][0];
             this.j = v[index][1];
          }else if(index == 5){
             this.p = p0.getFloat(index, this.p);
          }else if(index == 4){
             this.q = p0.getFloat(index, this.q);
          }else if(index == 6){
             this.r = p0.getBoolean(index, this.r);
          }else if(index == 1){
             this.s = p0.getFloat(index, this.s);
          }else if(index == 2){
             this.u = p0.getFloat(index, this.u);
          }else if(index == 11){
             this.e = p0.getResourceId(index, this.e);
          }else if(index == 8){
             this.c = p0.getInt(index, this.c);
          }else if(index == 7){
             this.t = p0.getInteger(index, 0);
          }else if(index == 3){
             this.f = p0.getResourceId(index, 0);
          }
          i = i + 1;
       }
       return;
    }
    public final void c(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J3);
       this.b(typedArray);
       typedArray.recycle();
    }
    public int d(){
       return this.t;
    }
    public RectF e(ViewGroup p0,RectF p1){
       b tf = this.f;
       RectF rectF = null;
       if (tf == -1) {
          return rectF;
       }
       View view = p0.findViewById(tf);
       if (view == null) {
          return rectF;
       }
       p1.set((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
       return p1;
    }
    public float f(){
       return this.q;
    }
    public float g(){
       return this.p;
    }
    public boolean h(){
       return this.r;
    }
    public float i(float p0,float p1){
       this.o.V(this.d, this.o.getProgress(), this.h, this.g, this.l);
       b ti = this.i;
       int i = 0x33d6bf95;
       int i1 = 0;
       if (ti - i1) {
          b tl = this.l;
          if (!tl[0] - i1) {
             tl[0] = i;
          }
          p0 = (p0 * ti) / tl[0];
       }else {
          b tl1 = this.l;
          if (!tl1[1] - i1) {
             tl1[1] = i;
          }
          tl1 = (p1 * this.j) / tl1[1];
       }
       return p0;
    }
    public RectF j(ViewGroup p0,RectF p1){
       b te = this.e;
       RectF rectF = null;
       if (te == -1) {
          return rectF;
       }
       View view = p0.findViewById(te);
       if (view == null) {
          return rectF;
       }
       p1.set((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
       return p1;
    }
    public int k(){
       return this.e;
    }
    public void l(MotionEvent p0,MotionLayout$f p1,int p2,a p3){
       float f;
       b l;
       float f2;
       float f3;
       b l1;
       b uob = this;
       MotionLayout$f uof = p1;
       uof.d(p0);
       int action = p0.getAction();
       int i = 0;
       if (action) {
          b uob1 = -1;
          int i1 = 1000;
          if (action != 1) {
             if (action == 2) {
                f = p0.getRawY() - uob.n;
                float f1 = p0.getRawX() - uob.m;
                if (Math.abs(((uob.i * f1) + (uob.j * f))) - uob.u > 0 || uob.k != null) {
                   float progress = uob.o.getProgress();
                   if (uob.k == null) {
                      uob.k = true;
                      uob.o.setProgress(progress);
                   }
                   b d = uob.d;
                   if (d != uob1) {
                      uob.o.V(d, progress, uob.h, uob.g, uob.l);
                   }else {
                      f3 = (float)Math.min(uob.o.getWidth(), uob.o.getHeight());
                      l = uob.l;
                      l[1] = uob.j * f3;
                      l[i] = f3 * uob.i;
                   }
                   l = uob.l;
                   if ((double)Math.abs((((uob.i * l[i]) + (uob.j * l[1])) * uob.s)) - 0x3f847ae147ae147b < 0) {
                      uob1 = uob.l;
                      uob1[i] = 0x3c23d70a;
                      uob1[1] = 0x3c23d70a;
                   }
                   f1 = (uob.i)? f1 / uob.l[i]: f / uob.l[1];
                   f = Math.max(Math.min((progress + f1), 0x3f800000), 0);
                   if (f - uob.o.getProgress()) {
                      uob.o.setProgress(f);
                      uof.c(i1);
                      f = p1.f();
                      f2 = p1.b();
                      f = (uob.i)? f / uob.l[i]: f2 / uob.l[1];
                      uob.o.D = f;
                   }else {
                      uob.o.D = 0;
                   }
                   uob.m = p0.getRawX();
                   uob.n = p0.getRawY();
                }
             }
          }else {
             uob.k = i;
             uof.c(i1);
             float f4 = p1.f();
             f2 = p1.b();
             f = uob.o.getProgress();
             b d1 = uob.d;
             if (d1 != uob1) {
                uob.o.V(d1, f, uob.h, uob.g, uob.l);
             }else {
                f3 = (float)Math.min(uob.o.getWidth(), uob.o.getHeight());
                l1 = uob.l;
                l1[1] = uob.j * f3;
                l1[i] = f3 * uob.i;
             }
             l1 = uob.l;
             f4 = (uob.i)? f4 / l1[i]: f2 / l1[1];
             f2 = (!Float.isNaN(f4))? (f4 / 3.00f) + f: f;
             if (f2 && f2 - 0x3f800000) {
                b c = uob.c;
                if (c != 3) {
                   uob1 = uob.o;
                   f2 = ((double)f2 - 0x3fe0000000000000 < 0)? 0: 0x3f800000;
                   uob1.k0(c, f2, f4);
                   if (0 - f >= 0 || 0x3f800000 - f <= 0) {
                      uob.o.setState(MotionLayout$TransitionState.FINISHED);
                   }
                }
             }
             if (0 - f2 >= 0 || 0x3f800000 - f2 <= 0) {
                uob.o.setState(MotionLayout$TransitionState.FINISHED);
             }
          }
       }else {
          uob.m = p0.getRawX();
          uob.n = p0.getRawY();
          uob.k = i;
       }
       return;
    }
    public void m(float p0,float p1){
       b tl1;
       float progress = this.o.getProgress();
       if (this.k == null) {
          this.k = true;
          this.o.setProgress(progress);
       }
       this.o.V(this.d, progress, this.h, this.g, this.l);
       b tl = this.l;
       if ((double)Math.abs(((this.i * tl[0]) + (this.j * tl[1]))) - 0x3f847ae147ae147b < 0) {
          tl1 = this.l;
          int i = 0x3c23d70a;
          tl1[0] = i;
          tl1[1] = i;
       }
       tl1 = this.i;
       p0 = (tl1)? (p0 * tl1) / this.l[0]: (p1 * this.j) / this.l[1];
       p0 = Math.max(Math.min((progress + p0), 0x3f800000), 0);
       if (p0 - this.o.getProgress()) {
          this.o.setProgress(p0);
       }
       return;
    }
    public void n(float p0,float p1){
       boolean b = false;
       this.k = b;
       float progress = this.o.getProgress();
       this.o.V(this.d, progress, this.h, this.g, this.l);
       b ti = this.i;
       b tl = this.l;
       b tj = this.j;
       float f = 0;
       p0 = (ti - f)? (p0 * ti) / tl[b]: (p1 * tj) / tl[1];
       if (!Float.isNaN(p0)) {
          progress = progress + (p0 / 3.00f);
       }
       if (progress - f) {
          int i = (progress - 0x3f800000)? 1: 0;
          tl = this.c;
          if (tl != 3) {
             b = 1;
          }
          if (b & i) {
             b to = this.o;
             if ((double)progress - 0x3fe0000000000000 >= 0) {
                f = 0x3f800000;
             }
             to.k0(tl, f, p0);
          }
       }
       return;
    }
    public void o(float p0,float p1){
       this.m = p0;
       this.n = p1;
    }
    public void p(boolean p0){
       float[][] w;
       int i = 6;
       int i1 = 3;
       int i2 = 4;
       if (p0) {
          w = b.w;
          w[i2] = w[i1];
          w[5] = w[2];
          w = b.v;
          w[5] = w[2];
          w[i] = w[1];
       }else {
          w = b.w;
          w[i2] = w[2];
          w[5] = w[i1];
          w = b.v;
          w[5] = w[1];
          w[i] = w[2];
       }
       w = b.v;
       b ta = this.a;
       this.h = w[ta][0];
       this.g = w[ta][1];
       w = b.w;
       ta = this.b;
       this.i = w[ta][0];
       this.j = w[ta][1];
       return;
    }
    public void q(float p0,float p1){
       this.m = p0;
       this.n = p1;
       this.k = false;
    }
    public void r(){
       View view;
       b td = this.d;
       if (td != -1) {
          view = this.o.findViewById(td);
          if (view == null) {
             c.b(this.o.getContext(), this.d);
          }
       }else {
          view = null;
       }
       if (view instanceof NestedScrollView) {
          view.setOnTouchListener(new b$a(this));
          view.setOnScrollChangeListener(new b$b(this));
       }
       return;
    }
    public String toString(){
       return this.i+" , "+this.j;
    }
}
