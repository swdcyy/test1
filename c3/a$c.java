package c3.a$c;
import java.lang.Object;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.Path;
import android.graphics.Path$FillType;
import android.graphics.ColorFilter;

public class a$c	// class@000cc7
{
    public final RectF a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public void a$c(){
       super();
       this.a = new RectF();
       Paint paint = new Paint();
       this.b = paint;
       Paint paint1 = new Paint();
       this.c = paint1;
       Paint paint2 = new Paint();
       this.d = paint2;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 5.00f;
       this.p = 0x3f800000;
       this.t = 255;
       paint.setStrokeCap(Paint$Cap.SQUARE);
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.STROKE);
       paint1.setStyle(Paint$Style.FILL);
       paint1.setAntiAlias(true);
       paint2.setColor(0);
    }
    public void A(){
       this.k = this.e;
       this.l = this.f;
       this.m = this.g;
    }
    public void a(Canvas p0,Rect p1){
       a$c ta = this.a;
       a$c tq = this.q;
       float f = 2.00f;
       float f1 = (this.h / f) + tq;
       if (tq - null <= 0) {
          f1 = ((float)Math.min(p1.width(), p1.height()) / f) - Math.max((((float)this.r * this.p) / f), (this.h / f));
       }
       ta.set(((float)p1.centerX() - f1), ((float)p1.centerY() - f1), ((float)p1.centerX() + f1), ((float)p1.centerY() + f1));
       tq = this.g;
       float f2 = (this.e + tq) * 360.00f;
       float f3 = ((this.f + tq) * 360.00f) - f2;
       this.b.setColor(this.u);
       this.b.setAlpha(this.t);
       float f4 = this.h / f;
       ta.inset(f4, f4);
       p0.drawCircle(ta.centerX(), ta.centerY(), (ta.width() / f), this.d);
       ta.inset((- f4), (- f4));
       p0.drawArc(ta, f2, f3, false, this.b);
       this.b(p0, f2, f3, ta);
       return;
    }
    public void b(Canvas p0,float p1,float p2,RectF p3){
       if (this.n != null) {
          a$c to = this.o;
          if (to == null) {
             Path path = new Path();
             this.o = path;
             path.setFillType(Path$FillType.EVEN_ODD);
          }else {
             to.reset();
          }
          this.o.moveTo(0, 0);
          this.o.lineTo(((float)this.r * this.p), 0);
          a$c tp = this.p;
          this.o.lineTo((((float)this.r * tp) / 2.00f), ((float)this.s * tp));
          this.o.offset((((Math.min(p3.width(), p3.height()) / 2.00f) + p3.centerX()) - (((float)this.r * this.p) / 2.00f)), (p3.centerY() + (this.h / 2.00f)));
          this.o.close();
          this.c.setColor(this.u);
          this.c.setAlpha(this.t);
          p0.save();
          p0.rotate((p1 + p2), p3.centerX(), p3.centerY());
          p0.drawPath(this.o, this.c);
          p0.restore();
       }
       return;
    }
    public int c(){
       return this.t;
    }
    public float d(){
       return this.f;
    }
    public int e(){
       return this.i[this.f()];
    }
    public int f(){
       return ((this.j + 1) % this.i.length);
    }
    public float g(){
       return this.e;
    }
    public int h(){
       return this.i[this.j];
    }
    public float i(){
       return this.l;
    }
    public float j(){
       return this.m;
    }
    public float k(){
       return this.k;
    }
    public void l(){
       this.t(this.f());
    }
    public void m(){
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.y(0);
       this.v(0);
       this.w(0);
    }
    public void n(int p0){
       this.t = p0;
    }
    public void o(float p0,float p1){
       this.r = (int)p0;
       this.s = (int)p1;
    }
    public void p(float p0){
       if (p0 - this.p) {
          this.p = p0;
       }
       return;
    }
    public void q(float p0){
       this.q = p0;
    }
    public void r(int p0){
       this.u = p0;
    }
    public void s(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
    public void t(int p0){
       this.j = p0;
       this.u = this.i[p0];
    }
    public void u(int[] p0){
       this.i = p0;
       this.t(0);
    }
    public void v(float p0){
       this.f = p0;
    }
    public void w(float p0){
       this.g = p0;
    }
    public void x(boolean p0){
       if (this.n != p0) {
          this.n = p0;
       }
       return;
    }
    public void y(float p0){
       this.e = p0;
    }
    public void z(float p0){
       this.h = p0;
       this.b.setStrokeWidth(p0);
    }
}
