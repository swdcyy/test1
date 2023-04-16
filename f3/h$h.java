package f3.h$h;
import android.graphics.drawable.Drawable$ConstantState;
import f3.h;
import f3.h$g;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;

public class h$h extends Drawable$ConstantState	// class@001fcc
{
    public int a;
    public h$g b;
    public ColorStateList c;
    public PorterDuff$Mode d;
    public boolean e;
    public Bitmap f;
    public int[] g;
    public ColorStateList h;
    public PorterDuff$Mode i;
    public int j;
    public boolean k;
    public boolean l;
    public Paint m;

    public void h$h(){
       super();
       this.c = null;
       this.d = h.l;
       this.b = new h$g();
    }
    public void h$h(h$h p0){
       super();
       this.c = null;
       this.d = h.l;
       if (p0 != null) {
          this.a = p0.a;
          h$g og = new h$g(p0.b);
          this.b = og;
          if (p0.b.e != null) {
             og.e = new Paint(p0.b.e);
          }
          if (p0.b.d != null) {
             this.b.d = new Paint(p0.b.d);
          }
          this.c = p0.c;
          this.d = p0.d;
          this.e = p0.e;
       }
       return;
    }
    public boolean a(int p0,int p1){
       if (p0 == this.f.getWidth() && p1 == this.f.getHeight()) {
          return true;
       }
       return false;
    }
    public boolean b(){
       if (this.l == null && (this.h == this.c && (this.i == this.d && (this.k == this.e && this.j == this.b.getRootAlpha())))) {
          return true;
       }
       return false;
    }
    public void c(int p0,int p1){
       if (this.f == null || !this.a(p0, p1)) {
          this.f = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
          this.l = true;
       }
       return;
    }
    public void d(Canvas p0,ColorFilter p1,Rect p2){
       p0.drawBitmap(this.f, null, p2, this.e(p1));
    }
    public Paint e(ColorFilter p0){
       if (!this.f() && p0 == null) {
          return null;
       }
       if (this.m == null) {
          Paint paint = new Paint();
          this.m = paint;
          paint.setFilterBitmap(true);
       }
       this.m.setAlpha(this.b.getRootAlpha());
       this.m.setColorFilter(p0);
       return this.m;
    }
    public boolean f(){
       boolean b = (this.b.getRootAlpha() < 255)? true: false;
       return b;
    }
    public boolean g(){
       return this.b.f();
    }
    public int getChangingConfigurations(){
       return this.a;
    }
    public boolean h(int[] p0){
       boolean b = this.b.g(p0);
       this.l = this.l | b;
       return b;
    }
    public void i(){
       this.h = this.c;
       this.i = this.d;
       this.j = this.b.getRootAlpha();
       this.k = this.e;
       this.l = false;
    }
    public void j(int p0,int p1){
       this.f.eraseColor(0);
       this.b.b(new Canvas(this.f), p0, p1, null);
    }
    public Drawable newDrawable(){
       return new h(this);
    }
    public Drawable newDrawable(Resources p0){
       return new h(this);
    }
}
