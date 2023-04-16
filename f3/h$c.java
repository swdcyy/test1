package f3.h$c;
import f3.h$f;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import o1.b;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import f3.a;
import android.content.res.TypedArray;
import o1.g;
import java.lang.String;
import p1.d$b;
import p1.d;

public class h$c extends h$f	// class@001fc7
{
    public int[] e;
    public b f;
    public float g;
    public b h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public Paint$Cap n;
    public Paint$Join o;
    public float p;

    public void h$c(){
       super();
       this.g = 0;
       this.i = 0x3f800000;
       this.j = 0x3f800000;
       this.k = 0;
       this.l = 0x3f800000;
       this.m = 0;
       this.n = Paint$Cap.BUTT;
       this.o = Paint$Join.MITER;
       this.p = 4.00f;
    }
    public void h$c(h$c p0){
       super(p0);
       this.g = 0;
       this.i = 0x3f800000;
       this.j = 0x3f800000;
       this.k = 0;
       this.l = 0x3f800000;
       this.m = 0;
       this.n = Paint$Cap.BUTT;
       this.o = Paint$Join.MITER;
       this.p = 4.00f;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.i = p0.i;
       this.h = p0.h;
       this.c = p0.c;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       this.n = p0.n;
       this.o = p0.o;
       this.p = p0.p;
    }
    public boolean a(){
       boolean b = (this.h.i() || this.f.i())? true: false;
       return b;
    }
    public boolean b(int[] p0){
       return (this.f.j(p0) | this.h.j(p0));
    }
    public final Paint$Cap e(int p0,Paint$Cap p1){
       if (!p0) {
          return Paint$Cap.BUTT;
       }
       if (p0 == 1) {
          return Paint$Cap.ROUND;
       }
       if (p0 != 2) {
          return p1;
       }
       return Paint$Cap.SQUARE;
    }
    public final Paint$Join f(int p0,Paint$Join p1){
       if (!p0) {
          return Paint$Join.MITER;
       }
       if (p0 == 1) {
          return Paint$Join.ROUND;
       }
       if (p0 != 2) {
          return p1;
       }
       return Paint$Join.BEVEL;
    }
    public void g(Resources p0,AttributeSet p1,Resources$Theme p2,XmlPullParser p3){
       TypedArray typedArray = g.k(p0, p2, p1, a.c);
       this.h(typedArray, p3, p2);
       typedArray.recycle();
    }
    public float getFillAlpha(){
       return this.j;
    }
    public int getFillColor(){
       return this.h.e();
    }
    public float getStrokeAlpha(){
       return this.i;
    }
    public int getStrokeColor(){
       return this.f.e();
    }
    public float getStrokeWidth(){
       return this.g;
    }
    public float getTrimPathEnd(){
       return this.l;
    }
    public float getTrimPathOffset(){
       return this.m;
    }
    public float getTrimPathStart(){
       return this.k;
    }
    public final void h(TypedArray p0,XmlPullParser p1,Resources$Theme p2){
       this.e = null;
       if (!g.j(p1, "pathData")) {
          return;
       }
       String str = p0.getString(0);
       if (str != null) {
          this.b = str;
       }
       str = p0.getString(2);
       if (str != null) {
          this.a = d.d(str);
       }
       Resources$Theme theme = p2;
       this.h = g.e(p0, p1, theme, "fillColor", 1, 0);
       this.j = g.f(p0, p1, "fillAlpha", 12, this.j);
       this.n = this.e(g.g(p0, p1, "strokeLineCap", 8, -1), this.n);
       this.o = this.f(g.g(p0, p1, "strokeLineJoin", 9, -1), this.o);
       this.p = g.f(p0, p1, "strokeMiterLimit", 10, this.p);
       this.f = g.e(p0, p1, theme, "strokeColor", 3, 0);
       this.i = g.f(p0, p1, "strokeAlpha", 11, this.i);
       this.g = g.f(p0, p1, "strokeWidth", 4, this.g);
       this.l = g.f(p0, p1, "trimPathEnd", 6, this.l);
       this.m = g.f(p0, p1, "trimPathOffset", 7, this.m);
       this.k = g.f(p0, p1, "trimPathStart", 5, this.k);
       this.c = g.g(p0, p1, "fillType", 13, this.c);
       return;
    }
    public void setFillAlpha(float p0){
       this.j = p0;
    }
    public void setFillColor(int p0){
       this.h.k(p0);
    }
    public void setStrokeAlpha(float p0){
       this.i = p0;
    }
    public void setStrokeColor(int p0){
       this.f.k(p0);
    }
    public void setStrokeWidth(float p0){
       this.g = p0;
    }
    public void setTrimPathEnd(float p0){
       this.l = p0;
    }
    public void setTrimPathOffset(float p0){
       this.m = p0;
    }
    public void setTrimPathStart(float p0){
       this.k = p0;
    }
}
