package b77.h;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import java.lang.Math;
import lnc.a1;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.ColorFilter;

public class h extends Drawable	// class@0003da
{
    public final Paint a;
    public RectF b;

    public void h(){
       super();
       this.a = new Paint();
       this.b = new RectF();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       int[] ointArray = new int[]{a1.a(0x7f060297),a1.a(0x7f060298),a1.a(0x7f060299)};
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)((double)this.getBounds().height() * Math.sin(0x3fc657184ae74487)), (float)this.getBounds().height(), ointArray, new float[3]{0xbf07ae14,0x3ecc63f1,0x3f56a162}, Shader$TileMode.CLAMP);
       this.a.setShader(v9);
       this.b.set(this.getBounds());
       p0.drawRect(this.b, this.a);
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
