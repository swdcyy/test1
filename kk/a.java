package kk.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public class a extends GradientDrawable	// class@0024b2
{
    public final Paint a;
    public final RectF b;
    public int c;

    public void a(){
       super();
       this.a = new Paint(1);
       this.h();
       this.b = new RectF();
    }
    public boolean a(){
       return (this.b.isEmpty() ^ 0x01);
    }
    public final void b(Canvas p0){
       if (!this.i(this.getCallback())) {
          p0.restoreToCount(this.c);
       }
       return;
    }
    public final void c(Canvas p0){
       Drawable$Callback callback = this.getCallback();
       if (this.i(callback)) {
          callback.setLayerType(2, null);
       }else {
          this.e(p0);
       }
       return;
    }
    public void d(){
       this.f(0, 0, 0, 0);
    }
    public void draw(Canvas p0){
       this.c(p0);
       super.draw(p0);
       p0.drawRect(this.b, this.a);
       this.b(p0);
    }
    public final void e(Canvas p0){
       this.c = p0.saveLayer(0, 0, (float)p0.getWidth(), (float)p0.getHeight(), null);
    }
    public void f(float p0,float p1,float p2,float p3){
       a tb = this.b;
       if (!p0 - tb.left && (!p1 - tb.top && (p2 - tb.right || p3 - tb.bottom))) {
          tb.set(p0, p1, p2, p3);
          this.invalidateSelf();
       }
       return;
    }
    public void g(RectF p0){
       this.f(p0.left, p0.top, p0.right, p0.bottom);
    }
    public final void h(){
       this.a.setStyle(Paint$Style.FILL_AND_STROKE);
       this.a.setColor(-1);
       this.a.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }
    public final boolean i(Drawable$Callback p0){
       return p0 instanceof View;
    }
}
