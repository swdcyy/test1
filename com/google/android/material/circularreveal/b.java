package com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.b$a;
import java.lang.Object;
import android.view.View;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.android.material.circularreveal.c$e;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import dk.a;
import android.graphics.Path$Direction;
import android.graphics.Color;

public class b	// class@001680
{
    public final b$a a;
    public final View b;
    public final Path c;
    public final Paint d;
    public final Paint e;
    public c$e f;
    public Drawable g;
    public Paint h;
    public boolean i;
    public boolean j;
    public static final int k;

    static {
       b.k = 2;
    }
    public void b(b$a p0){
       super();
       this.a = p0;
       this.b = p0;
       p0.setWillNotDraw(false);
       this.c = new Path();
       this.d = new Paint(7);
       Paint paint = new Paint(1);
       this.e = paint;
       paint.setColor(false);
    }
    public void a(){
       if (!b.k) {
          this.i = true;
          this.j = false;
          this.b.buildDrawingCache();
          Bitmap drawingCache = this.b.getDrawingCache();
          if (drawingCache == null && (this.b.getWidth() && this.b.getHeight())) {
             drawingCache = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap$Config.ARGB_8888);
             this.b.draw(new Canvas(drawingCache));
          }
       label_0043 :
          if (drawingCache != null) {
             this.d.setShader(new BitmapShader(drawingCache, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
          }
          this.i = false;
          this.j = true;
       }
       return;
    }
    public void b(){
       if (!b.k) {
          this.j = false;
          this.b.destroyDrawingCache();
          this.d.setShader(null);
          this.b.invalidate();
       }
       return;
    }
    public void c(Canvas p0){
       if (this.n()) {
          int k = b.k;
          if (k) {
             if (k != 1) {
                if (k == 2) {
                   this.a.b(p0);
                   if (this.p()) {
                      p0.drawRect(0, 0, (float)this.b.getWidth(), (float)this.b.getHeight(), this.e);
                   }
                }else {
                   throw new IllegalStateException("Unsupported strategy "+k);
                }
             }else {
                k = p0.save();
                p0.clipPath(this.c);
                this.a.b(p0);
                if (this.p()) {
                   p0.drawRect(0, 0, (float)this.b.getWidth(), (float)this.b.getHeight(), this.e);
                }
                p0.restoreToCount(k);
             }
          }else {
             b tf = this.f;
             p0.drawCircle(tf.a, tf.b, tf.c, this.d);
             if (this.p()) {
                tf = this.f;
                p0.drawCircle(tf.a, tf.b, tf.c, this.e);
             }
          }
       }else {
          this.a.b(p0);
          if (this.p()) {
             p0.drawRect(0, 0, (float)this.b.getWidth(), (float)this.b.getHeight(), this.e);
          }
       }
       this.d(p0);
       return;
    }
    public final void d(Canvas p0){
       if (this.o()) {
          Rect bounds = this.g.getBounds();
          float f = this.f.a - ((float)bounds.width() / 2.00f);
          float f1 = this.f.b - ((float)bounds.height() / 2.00f);
          p0.translate(f, f1);
          this.g.draw(p0);
          float f2 = - f;
          p0.translate(f2, (- f1));
       }
       return;
    }
    public Drawable e(){
       return this.g;
    }
    public int f(){
       return this.e.getColor();
    }
    public final float g(c$e p0){
       return a.b(p0.a, p0.b, 0, 0, (float)this.b.getWidth(), (float)this.b.getHeight());
    }
    public c$e h(){
       b tf = this.f;
       if (tf == null) {
          return null;
       }
       c$e uoe = new c$e(tf);
       if (uoe.a()) {
          uoe.c = this.g(uoe);
       }
       return uoe;
    }
    public final void i(){
       if (b.k == 1) {
          this.c.rewind();
          b tf = this.f;
          if (tf != null) {
             this.c.addCircle(tf.a, tf.b, tf.c, Path$Direction.CW);
          }
       }
       this.b.invalidate();
       return;
    }
    public boolean j(){
       boolean b = (this.a.f() && !this.n())? true: false;
       return b;
    }
    public void k(Drawable p0){
       this.g = p0;
       this.b.invalidate();
    }
    public void l(int p0){
       this.e.setColor(p0);
       this.b.invalidate();
    }
    public void m(c$e p0){
       if (p0 == null) {
          this.f = null;
       }else {
          b tf = this.f;
          if (tf == null) {
             this.f = new c$e(p0);
          }else {
             tf.c(p0);
          }
          if (a.c(p0.c, this.g(p0), 0.00f)) {
             p0.c = Float.MAX_VALUE;
          }
       }
       this.i();
       return;
    }
    public final boolean n(){
       b tf = this.f;
       boolean b = false;
       tf = (tf == null || tf.a())? 1: null;
       if (!b.k) {
          if (!tf && this.j != null) {
             b = true;
          }
          return b;
       }else {
          return (tf ^ 1);
       }
    }
    public final boolean o(){
       boolean b = (this.i == null && (this.g != null && this.f != null))? true: false;
       return b;
    }
    public final boolean p(){
       boolean b = (this.i == null && Color.alpha(this.e.getColor()))? true: false;
       return b;
    }
}
