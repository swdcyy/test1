package ip8.a;
import hp8.a;
import android.graphics.drawable.Drawable;
import java.lang.String;
import android.graphics.Paint;
import java.lang.CharSequence;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import android.text.TextPaint;

public class a extends a	// class@002704
{

    public void a(Drawable p0,String p1){
       super(p0, p1);
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       Paint$FontMetricsInt fontMetricsI;
       int i = 4;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p1 = PatchProxy.apply(objArray, this, a.class, "1");
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
             p3 = 0;
             if (this.i - p3 > 0) {
                if (this.j == null) {
                   this.j = new TextPaint(p0);
                }
                this.j.setTextSize(this.i);
                fontMetricsI = this.j.getFontMetricsInt();
             }else {
                fontMetricsI = p0.getFontMetricsInt();
             }
             int i1 = (bounds.bottom - bounds.top) / 2;
             p2 = (fontMetricsI.bottom - fontMetricsI.top) / i;
             int i2 = i1 - p2;
             i1 = i1 + p2;
             a tf = this.f;
             if (tf - p3 > 0) {
                i1 = i1 - (int)tf;
             }else if(tf - p3 < 0){
                i2 = i2 + (int)tf;
             }
             i1 = - i1;
             p4.ascent = i1;
             p4.top = i1;
             p4.bottom = i2;
             p4.descent = i2;
          }
          return (int)(((float)bounds.right + this.h) + this.g);
       }
    }
}
