package ho2.f;
import android.graphics.drawable.Drawable;
import ho2.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import com.kuaishou.live.core.voiceparty.background.multiimage.Point;
import android.graphics.Color;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Integer;
import android.graphics.ColorFilter;

public final class f extends Drawable	// class@002de2
{
    public final Paint a;
    public final int[] b;
    public final b c;

    public void f(b p0){
       a.p(p0, "background");
       super();
       this.c = p0;
       this.a = new Paint();
       int[] ointArray = new int[]{Color.parseColor(p0.c().a()),Color.parseColor(p0.b().a())};
       this.b = ointArray;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       p0.drawPaint(this.a);
       return;
    }
    public int getOpacity(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int alpha = this.a.getAlpha();
       if (!alpha) {
          return -2;
       }
       if (alpha != 255) {
          return -3;
       }
       return -1;
    }
    public void onBoundsChange(Rect p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "bounds");
       f = (float)p0.width();
       float f1 = this.c.c().b() * f;
       float f2 = (float)p0.height();
       float f3 = this.c.b().b() * f;
       LinearGradient linearGradie = new LinearGradient(f1, (this.c.c().c() * f2), f3, (this.c.b().c() * f2), this.b, new float[2]{0,0x3f800000}, Shader$TileMode.CLAMP);
       this.a.setShader(v10);
       return;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "2")) {
          return;
       }
       this.a.setAlpha(p0);
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       this.a.setColorFilter(p0);
       return;
    }
}
