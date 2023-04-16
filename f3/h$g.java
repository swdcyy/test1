package f3.h$g;
import android.graphics.Matrix;
import java.lang.Object;
import androidx.collection.ArrayMap;
import f3.h$d;
import android.graphics.Path;
import androidx.collection.SimpleArrayMap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import java.util.ArrayList;
import f3.h$e;
import f3.h$f;
import java.lang.Math;
import android.graphics.Path$FillType;
import f3.h$c;
import android.graphics.PathMeasure;
import o1.b;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import f3.h;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.lang.Boolean;

public class h$g	// class@001fcb
{
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public int g;
    public final h$d h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public String n;
    public Boolean o;
    public final ArrayMap p;
    public static final Matrix q;

    static {
       h$g.q = new Matrix();
    }
    public void h$g(){
       super();
       this.c = new Matrix();
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 255;
       this.n = null;
       this.o = null;
       this.p = new ArrayMap();
       this.h = new h$d();
       this.a = new Path();
       this.b = new Path();
    }
    public void h$g(h$g p0){
       super();
       this.c = new Matrix();
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 255;
       this.n = null;
       this.o = null;
       ArrayMap uArrayMap = new ArrayMap();
       this.p = uArrayMap;
       this.h = new h$d(p0.h, uArrayMap);
       this.a = new Path(p0.a);
       this.b = new Path(p0.b);
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.g = p0.g;
       this.m = p0.m;
       this.n = p0.n;
       h$g n = p0.n;
       if (n != null) {
          uArrayMap.put(n, this);
       }
       this.o = p0.o;
       return;
    }
    public static float a(float p0,float p1,float p2,float p3){
       return ((p0 * p3) - (p1 * p2));
    }
    public void b(Canvas p0,int p1,int p2,ColorFilter p3){
       this.c(this.h, h$g.q, p0, p1, p2, null);
    }
    public final void c(h$d p0,Matrix p1,Canvas p2,int p3,int p4,ColorFilter p5){
       p0.a.set(p1);
       p0.a.preConcat(p0.j);
       p2.save();
       int i = 0;
       while (i < p0.b.size()) {
          h$e uoe = p0.b.get(i);
          if (uoe instanceof h$d) {
             this.c(uoe, p0.a, p2, p3, p4, p5);
          }else if(uoe instanceof h$f){
             this.d(p0, uoe, p2, p3, p4, p5);
          }
          i++;
       }
       p2.restore();
       return;
    }
    public final void d(h$d p0,h$f p1,Canvas p2,int p3,int p4,ColorFilter p5){
       h$c m;
       h$c h;
       Paint paint;
       Shader shader;
       float f = (float)p3 / this.k;
       float f1 = (float)p4 / this.l;
       float f2 = Math.min(f, f1);
       p0 = p0.a;
       this.c.set(p0);
       this.c.postScale(f, f1);
       float f3 = this.e(p0);
       f = 0;
       if (!f3 - f) {
          return;
       }
       p1.d(this.a);
       h$g ta = this.a;
       this.b.reset();
       if (p1.c()) {
          h$g tb = this.b;
          Path$FillType wINDING = (p1.c == null)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
          tb.setFillType(wINDING);
          this.b.addPath(ta, this.c);
          p2.clipPath(this.b);
       }else {
          h$c k = p1.k;
          float f4 = 0x3f800000;
          boolean b = true;
          if (k - f || p1.l - f4) {
             m = p1.m;
             float f5 = (k + m) % f4;
             float f6 = (p1.l + m) % f4;
             if (this.f == null) {
                this.f = new PathMeasure();
             }
             this.f.setPath(this.a, false);
             f4 = this.f.getLength();
             f5 = f5 * f4;
             f6 = f6 * f4;
             ta.reset();
             if (f5 - f6 > 0) {
                this.f.getSegment(f5, f4, ta, b);
                this.f.getSegment(f, f6, ta, b);
             }else {
                this.f.getSegment(f5, f6, ta, b);
             }
             ta.rLineTo(f, f);
          }
          this.b.addPath(ta, this.c);
          f1 = 0x437f0000;
          h$g og = 255;
          if (p1.h.l()) {
             h = p1.h;
             if (this.e == null) {
                paint = new Paint(b);
                this.e = paint;
                paint.setStyle(Paint$Style.FILL);
             }
             h$g te = this.e;
             if (h.h()) {
                shader = h.f();
                shader.setLocalMatrix(this.c);
                te.setShader(shader);
                te.setAlpha(Math.round((p1.j * f1)));
             }else {
                te.setShader(null);
                te.setAlpha(og);
                te.setColor(h.a(h.e(), p1.j));
             }
             te.setColorFilter(p5);
             h$g tb1 = this.b;
             Path$FillType wINDING1 = (p1.c == null)? Path$FillType.WINDING: Path$FillType.EVEN_ODD;
             tb1.setFillType(wINDING1);
             p2.drawPath(this.b, te);
          }
          if (p1.f.l()) {
             h = p1.f;
             if (this.d == null) {
                paint = new Paint(b);
                this.d = paint;
                paint.setStyle(Paint$Style.STROKE);
             }
             h$g td = this.d;
             m = p1.o;
             if (m != null) {
                td.setStrokeJoin(m);
             }
             m = p1.n;
             if (m != null) {
                td.setStrokeCap(m);
             }
             td.setStrokeMiter(p1.p);
             if (h.h()) {
                shader = h.f();
                shader.setLocalMatrix(this.c);
                td.setShader(shader);
                td.setAlpha(Math.round((p1.i * f1)));
             }else {
                td.setShader(null);
                td.setAlpha(og);
                td.setColor(h.a(h.e(), p1.i));
             }
             td.setColorFilter(p5);
             td.setStrokeWidth((p1.g * (f2 * f3)));
             p2.drawPath(this.b, td);
          }
       }
       return;
    }
    public final float e(Matrix p0){
       float[] uofloatArray = new float[4]{0,0x3f800000,0x3f800000,0};
       p0.mapVectors(uofloatArray);
       float f = h$g.a(uofloatArray[0], uofloatArray[1], uofloatArray[2], uofloatArray[3]);
       float f1 = Math.max((float)Math.hypot((double)uofloatArray[0], (double)uofloatArray[1]), (float)Math.hypot((double)uofloatArray[2], (double)uofloatArray[3]));
       float f2 = 0;
       if (f1 - f2 > 0) {
          f2 = Math.abs(f) / f1;
       }
       return f2;
    }
    public boolean f(){
       if (this.o == null) {
          this.o = Boolean.valueOf(this.h.a());
       }
       return this.o.booleanValue();
    }
    public boolean g(int[] p0){
       return this.h.b(p0);
    }
    public float getAlpha(){
       return ((float)this.getRootAlpha() / 0x437f0000);
    }
    public int getRootAlpha(){
       return this.m;
    }
    public void setAlpha(float p0){
       this.setRootAlpha((int)(p0 * 0x437f0000));
    }
    public void setRootAlpha(int p0){
       this.m = p0;
    }
}
