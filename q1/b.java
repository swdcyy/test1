package q1.b;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import java.lang.UnsupportedOperationException;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.ColorFilter;
import java.lang.Math;

public abstract class b extends Drawable	// class@00294a
{
    public final Bitmap a;
    public int b;
    public int c;
    public final Paint d;
    public final BitmapShader e;
    public final Matrix f;
    public float g;
    public final Rect h;
    public final RectF i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;

    public void b(Resources p0,Bitmap p1){
       super();
       this.b = 160;
       this.c = 119;
       this.d = new Paint(3);
       this.f = new Matrix();
       this.h = new Rect();
       this.i = new RectF();
       this.j = true;
       if (p0 != null) {
          this.b = c.c(p0).densityDpi;
       }
       this.a = p1;
       if (p1 != null) {
          this.a();
          this.e = new BitmapShader(p1, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       }else {
          this.m = -1;
          this.l = -1;
          this.e = null;
       }
       return;
    }
    public static boolean d(float p0){
       boolean b = (p0 - 0x3d4ccccd > 0)? true: false;
       return b;
    }
    public final void a(){
       this.l = this.a.getScaledWidth(this.b);
       this.m = this.a.getScaledHeight(this.b);
    }
    public float b(){
       return this.g;
    }
    public void c(int p0,int p1,int p2,Rect p3,Rect p4){
       throw new UnsupportedOperationException();
    }
    public void draw(Canvas p0){
       b ta = this.a;
       if (ta == null) {
          return;
       }
       this.i();
       if (this.d.getShader() == null) {
          p0.drawBitmap(ta, null, this.h, this.d);
       }else {
          p0.drawRoundRect(this.i, this.g, this.g, this.d);
       }
       return;
    }
    public void e(boolean p0){
       this.d.setAntiAlias(p0);
       this.invalidateSelf();
    }
    public void f(boolean p0){
       this.k = p0;
       this.j = true;
       if (p0) {
          this.h();
          this.d.setShader(this.e);
          this.invalidateSelf();
       }else {
          this.g(0);
       }
       return;
    }
    public void g(float p0){
       if (!this.g - p0) {
          return;
       }
       this.k = false;
       if (b.d(p0)) {
          this.d.setShader(this.e);
       }else {
          this.d.setShader(null);
       }
       this.g = p0;
       this.invalidateSelf();
       return;
    }
    public int getAlpha(){
       return this.d.getAlpha();
    }
    public ColorFilter getColorFilter(){
       return this.d.getColorFilter();
    }
    public int getIntrinsicHeight(){
       return this.m;
    }
    public int getIntrinsicWidth(){
       return this.l;
    }
    public int getOpacity(){
       int i = -3;
       if (this.c == 119 && this.k == null) {
          b ta = this.a;
          if (ta == null || (ta.hasAlpha() || (this.d.getAlpha() >= 255 && !b.d(this.g)))) {
             i = -1;
          }
       }
    label_002a :
       return i;
    }
    public final void h(){
       this.g = (float)(Math.min(this.m, this.l) / 2);
    }
    public void i(){
       if (this.j != null) {
          if (this.k != null) {
             int i = Math.min(this.l, this.m);
             this.c(this.c, i, i, this.getBounds(), this.h);
             int i1 = Math.min(this.h.width(), this.h.height());
             this.h.inset(Math.max(0, ((this.h.width() - i1) / 2)), Math.max(0, ((this.h.height() - i1) / 2)));
             this.g = (float)i1 * 0x3f000000;
          }else {
             this.c(this.c, this.l, this.m, this.getBounds(), this.h);
          }
          this.i.set(this.h);
          if (this.e != null) {
             b ti = this.i;
             this.f.setTranslate(ti.left, ti.top);
             this.f.preScale((this.i.width() / (float)this.a.getWidth()), (this.i.height() / (float)this.a.getHeight()));
             this.e.setLocalMatrix(this.f);
             this.d.setShader(this.e);
          }
          this.j = false;
       }
       return;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       if (this.k != null) {
          this.h();
       }
       this.j = true;
       return;
    }
    public void setAlpha(int p0){
       if (p0 != this.d.getAlpha()) {
          this.d.setAlpha(p0);
          this.invalidateSelf();
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       this.d.setColorFilter(p0);
       this.invalidateSelf();
    }
    public void setDither(boolean p0){
       this.d.setDither(p0);
       this.invalidateSelf();
    }
    public void setFilterBitmap(boolean p0){
       this.d.setFilterBitmap(p0);
       this.invalidateSelf();
    }
}
