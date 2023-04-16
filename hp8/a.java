package hp8.a;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import java.lang.String;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import android.graphics.Rect;
import java.lang.Integer;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.Float;
import android.text.TextPaint;
import java.lang.Number;

public class a extends ImageSpan	// class@0025c6
{
    public boolean b;
    public Rect c;
    public Paint$FontMetricsInt d;
    public Object e;
    public float f;
    public float g;
    public float h;
    public float i;
    public TextPaint j;
    public WeakReference k;

    public void a(Drawable p0,String p1){
       super(p0, p1, 1);
       this.b = true;
       this.i = 0;
       this.d = new Paint$FontMetricsInt();
    }
    public Drawable a(Paint p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       Paint$FontMetricsInt uFontMetrics = null;
       Drawable uDrawable = (obj != null)? obj.get(): uFontMetrics;
       if (uDrawable == null) {
          uDrawable = this.getDrawable();
          if (this.b != null) {
             uDrawable.setBounds(0, 0, p0.getFontMetricsInt(uFontMetrics), p0.getFontMetricsInt(uFontMetrics));
          }else {
             a tc = this.c;
             if (tc != null) {
                uDrawable.setBounds(tc);
             }
          }
          this.k = new WeakReference(uDrawable);
       }
       return uDrawable;
    }
    public a b(int p0,int p1){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = false;
       this.c = new Rect(false, false, p0, p1);
       return this;
    }
    public a c(float p0){
       this.g = p0;
       return this;
    }
    public a d(float p0){
       this.h = p0;
       return this;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
             return;
          }
       }
       Drawable uDrawable = this.a(p8);
       if (uDrawable == null) {
          return;
       }else if(p8 instanceof TextPaint){
          uDrawable.setState(p8.drawableState);
       }
       if (this.i - null > 0) {
          if (this.j == null) {
             this.j = new TextPaint(p8);
          }
          this.j.setTextSize(this.i);
          p2 = this.j.getFontMetricsInt(this.d);
       }else {
          p2 = p8.getFontMetricsInt(this.d);
       }
       p0.save();
       p0.translate((p4 + this.g), ((float)((p6 + this.d.ascent) + ((p2 - (uDrawable.getBounds().bottom - uDrawable.getBounds().top)) / 2)) + this.f));
       uDrawable.draw(p0);
       p0.restore();
       return;
    }
    public a e(float p0){
       this.f = p0;
       return this;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p1 = PatchProxy.apply(objArray, this, a.class, "2");
          if (p1 != PatchProxyResult.class) {
             return p1.intValue();
          }
       }
       Drawable uDrawable = this.a(p0);
       if (uDrawable == null) {
          return 0;
       }else {
          Rect bounds = uDrawable.getBounds();
          if (p4 != null) {
             Paint$FontMetricsInt fontMetricsI = p0.getFontMetricsInt();
             int i = (bounds.bottom - bounds.top) / 2;
             p2 = (fontMetricsI.bottom - fontMetricsI.top) / 4;
             p3 = i - p2;
             i = - (i + p2);
             p4.ascent = i;
             p4.top = i;
             p4.bottom = p3;
             p4.descent = p3;
          }
          return (int)(((float)bounds.right + this.h) + this.g);
       }
    }
}
