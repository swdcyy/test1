package be8.b;
import android.text.style.LineHeightSpan;
import java.lang.Object;
import java.lang.Math;
import java.lang.CharSequence;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class b implements LineHeightSpan	// class@00032f
{
    public final int b;

    public void b(float p0){
       super();
       this.b = (int)Math.ceil((double)p0);
    }
    public void chooseHeight(CharSequence p0,int p1,int p2,int p3,int p4,Paint$FontMetricsInt p5){
       int i;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
             return;
          }
       }
       Paint$FontMetricsInt descent = p5.descent;
       b tb = this.b;
       if (descent > tb) {
          i = Math.min(tb, descent);
          p5.descent = i;
          p5.bottom = i;
          p5.ascent = 0;
          p5.top = 0;
       }else {
          Paint$FontMetricsInt ascent = p5.ascent;
          if (((- ascent) + descent) > tb) {
             p5.bottom = descent;
             tb = (- tb) + descent;
             p5.ascent = tb;
             p5.top = tb;
          }else {
             Paint$FontMetricsInt bottom = p5.bottom;
             if (((- ascent) + bottom) > tb) {
                p5.top = ascent;
                p5.bottom = ascent + tb;
             }else {
                descent = p5.top;
                if (((- descent) + bottom) > tb) {
                   p5.top = bottom - tb;
                }else {
                   double d = (double)((float)(tb - ((- descent) + bottom)) / 2.00f);
                   p5.top = (int)((double)descent - Math.ceil(d));
                   i = (int)((double)p5.bottom + Math.floor(d));
                   p5.bottom = i;
                   p5.ascent = p5.top;
                   p5.descent = i;
                }
             }
          }
       }
       return;
    }
}
