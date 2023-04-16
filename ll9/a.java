package ll9.a;
import android.text.style.DynamicDrawableSpan;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.graphics.Paint$FontMetricsInt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a extends DynamicDrawableSpan	// class@002e02
{
    public float b;
    public Drawable c;
    public Rect d;

    public void a(Rect p0){
       super(2);
       this.b = 0;
       this.d = p0;
    }
    public void a(Drawable p0){
       super(2);
       this.b = 0;
       this.c = p0;
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
          if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
             return;
          }
       }
       Drawable drawable = this.getDrawable();
       if (drawable == null) {
          return;
       }else {
          p0.save();
          p2 = p7 - drawable.getBounds().bottom;
          DynamicDrawableSpan tmVerticalAl = this.mVerticalAlignment;
          if (tmVerticalAl == 1) {
             p2 = p2 - p8.getFontMetricsInt().descent;
          }else if(tmVerticalAl == 2){
             p2 = (p5 + ((p7 - p5) / 2)) - (drawable.getBounds().height() / 2);
          }
          float f = (this.b * 0.30f) + 0x3f800000;
          p0.translate(p4, (float)p2);
          float f1 = 0x3fa66666 - f;
          p0.translate((((float)drawable.getIntrinsicWidth() * f1) / 2.00f), (((float)drawable.getIntrinsicHeight() * f1) / 2.00f));
          p0.scale(f, f);
          drawable.draw(p0);
          p0.restore();
          return;
       }
    }
    public Drawable getDrawable(){
       return this.c;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       Rect bounds;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       Drawable drawable = this.getDrawable();
       if (drawable != null) {
          bounds = drawable.getBounds();
       }else {
          bounds = this.d;
          if (bounds == null) {
             bounds = new Rect(0, 0, 0, 0);
          }
       }
       if (p4 != null) {
          p2 = (int)((float)(- bounds.bottom) * 0x3fa66666);
          p4.ascent = p2;
          p4.descent = 0;
          p4.top = p2;
          p4.bottom = 0;
       }
       return (int)((float)bounds.right * 0x3fa66666);
    }
}
