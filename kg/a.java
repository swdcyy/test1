package kg.a;
import android.text.style.ReplacementSpan;
import android.graphics.drawable.Drawable;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;

public class a extends ReplacementSpan	// class@0024b0
{
    public int b;
    public int c;
    public Rect d;
    public final int e;
    public final Paint$FontMetricsInt f;
    public final Drawable g;

    public void a(Drawable p0){
       super(p0, 1);
    }
    public void a(Drawable p0,int p1){
       super();
       this.f = new Paint$FontMetricsInt();
       this.g = p0;
       this.e = p1;
       this.b();
    }
    public final int a(Paint$FontMetricsInt p0){
       a te = this.e;
       if (te == null) {
          return (p0.descent - this.c);
       }
       if (te != 2) {
          return (- this.c);
       }
       p0 = p0.ascent;
       return (p0 + (((p0.descent - p0) - this.c) / 2));
    }
    public void b(){
       Rect bounds = this.g.getBounds();
       this.d = bounds;
       this.b = bounds.width();
       this.c = this.d.height();
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       p8.getFontMetricsInt(this.f);
       p6 = p6 + this.a(this.f);
       p0.translate(p4, (float)p6);
       this.g.draw(p0);
       p0.translate((- p4), (float)(- p6));
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       this.b();
       if (p4 == null) {
          return this.b;
       }
       int i = this.a(p4);
       int i1 = this.c + i;
       if (i < p4.ascent) {
          p4.ascent = i;
       }
       if (i < p4.top) {
          p4.top = i;
       }
       if (i1 > p4.descent) {
          p4.descent = i1;
       }
       if (i1 > p4.bottom) {
          p4.bottom = i1;
       }
       return this.b;
    }
}
