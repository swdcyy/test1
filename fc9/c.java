package fc9.c;
import android.text.style.ReplacementSpan;
import fc9.c$a;
import nsd.u;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Typeface;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import java.lang.Float;
import kotlin.jvm.internal.a;
import android.graphics.Paint$FontMetricsInt;

public final class c extends ReplacementSpan	// class@0022fb
{
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final int e;
    public static final int f;
    public static final int g;
    public static final c$a h;

    static {
       c.h = new c$a(null);
       c.f = a1.e(4.00f);
       c.g = a1.e(8.00f);
    }
    public void c(int p0,int p1,int p2){
       super();
       this.e = p2;
       Paint paint = new Paint(7);
       this.b = paint;
       Paint paint1 = new Paint(7);
       this.c = paint1;
       this.d = new RectF();
       paint.setTextSize((float)p0);
       paint.setColor(0xffffff);
       paint.setAlpha(255);
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       paint.setTypeface(Typeface.DEFAULT_BOLD);
       paint1.setColor(p1);
    }
    public final float a(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p0 != null) {
          String str = p0.subSequence(p1, p2).toString();
          if (str != null) {
             return this.b.measureText(str);
          }
       }
       return 0;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       Paint$FontMetricsInt obj1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p5;
       int i1 = p7;
       object oobject2 = p8;
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, c.class, "2")) {
             return;
          }
       }
       a.p(oobject, "canvas");
       a.p(oobject2, "paint");
       if (oobject1 == null) {
          return;
       }else {
          int f = c.f;
          int g = c.g;
          obj.d.set((p4 + (float)f), (float)i, (((p4 + (float)f) + obj.a(oobject1, p2, p3)) + (float)(g * 2)), (float)i1);
          int i2 = p0.saveLayer(0, 0, (float)p0.getWidth(), (float)p0.getHeight(), null, 31);
          c e = obj.e;
          float f1 = (float)e;
          oobject.drawRoundRect(obj.d, f1, (float)e, obj.c);
          float f2 = (p4 + (float)f) + (float)g;
          float f3 = (float)(i + i1) / 2.00f;
          if (PatchProxy.isSupport(c.class)) {
             obj1 = PatchProxy.applyOneRefs(Float.valueOf(f3), obj, c.class, "4");
             if (obj1 != PatchProxyResult.class) {
                f3 = obj1.floatValue();
             label_00df :
                p0.drawText(p1, p2, p3, f2, f3, obj.b);
                oobject.restoreToCount(i2);
                return;
             }
          }
          obj1 = obj.b.getFontMetricsInt();
          f3 = (float)((double)f3 - ((double)(obj1.bottom + obj1.top) / 2.00f));
          goto label_00df ;
       }
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, c.class, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.intValue();
          }
       }
       a.p(p0, "paint");
       return (int)((float)((c.f * 2) + (c.g * 2)) + this.a(p1, p2, p3));
    }
}
