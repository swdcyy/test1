package b77.i;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.graphics.Color;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Math;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import android.graphics.ColorFilter;

public class i extends Drawable	// class@0003db
{
    public final Paint a;
    public Path b;
    public Paint c;
    public static final float d;
    public static final float e;

    static {
       i.d = (float)a1.e(8.00f);
       i.e = (float)a1.e(0x3f800000);
    }
    public void i(){
       super();
       this.a = new Paint();
       this.b = new Path();
       this.c = new Paint(1);
    }
    public void draw(Canvas p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, i.class, "1")) {
          return;
       }
       Rect bounds = this.getBounds();
       int[] ointArray = new int[]{Color.parseColor("#2046A7"),Color.parseColor("#222D81"),Color.parseColor("#232B80"),Color.parseColor("#193092")};
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getBounds().width(), (float)this.getBounds().height(), ointArray, new float[4]{0,0x3f000000,0x3f400000,0x3f800000}, Shader$TileMode.CLAMP);
       int[] ointArray1 = new int[]{Color.parseColor("#769DF1"),Color.parseColor("#A175EF"),Color.parseColor("#769DF1")};
       LinearGradient linearGradie1 = new LinearGradient(0, 0, (float)this.getBounds().width(), (float)this.getBounds().height(), ointArray1, null, Shader$TileMode.CLAMP);
       obj.a.setShader(v11);
       float f = Math.min(i.d, ((float)Math.min(bounds.width(), bounds.height()) * 0x3f000000));
       obj.c.setStyle(Paint$Style.STROKE);
       obj.c.setStrokeWidth(3.00f);
       obj.c.setShader(linearGradie);
       obj.b.reset();
       float e = i.e;
       float f1 = e / 2.00f;
       float f2 = e / 2.00f;
       RectF rectF = new RectF(f1, f2, (((- e) / 2.00f) + (float)bounds.width()), (((- e) / 2.00f) + (float)bounds.height()));
       obj.b.addRoundRect(rectF, f, f, Path$Direction.CCW);
       obj1.drawRoundRect(rectF, f, f, obj.a);
       obj1.drawPath(obj.b, obj.c);
       return;
    }
    public int getOpacity(){
       return 0;
    }
    public void setAlpha(int p0){
    }
    public void setColorFilter(ColorFilter p0){
    }
}
