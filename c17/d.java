package c17.d;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.ColorFilter;

public class d extends Drawable	// class@0004c5
{
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public RectF h;

    public void d(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       super();
       this.d = p0;
       this.e = p1;
       this.c = p5;
       this.f = p6;
       this.g = p7;
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.b.setShadowLayer((float)p5, (float)p6, (float)p7, p3);
       this.b.setAlpha(p4);
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_ATOP));
       paint = new Paint();
       this.a = paint;
       paint.setAntiAlias(true);
       this.a.setColor(p2);
    }
    public void draw(Canvas p0){
       int i = 2;
       if (this.d == i) {
          this.e = (int)this.h.height() / i;
       }
       d te = this.e;
       float f = (float)te;
       p0.drawRoundRect(this.h, f, (float)te, this.b);
       te = this.e;
       f = (float)te;
       p0.drawRoundRect(this.h, f, (float)te, this.a);
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public void setAlpha(int p0){
       this.b.setAlpha(p0);
    }
    public void setBounds(int p0,int p1,int p2,int p3){
       super.setBounds(p0, p1, p2, p3);
       d tc = this.c;
       d tf = this.f;
       d tg = this.g;
       this.h = new RectF((float)((p0 + tc) - tf), (float)((p1 + tc) - tg), (float)((p2 - tc) - tf), (float)((p3 - tc) - tg));
    }
    public void setColorFilter(ColorFilter p0){
       this.b.setColorFilter(p0);
    }
}
