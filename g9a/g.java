package g9a.g;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.ColorFilter;

public class g extends Drawable	// class@002419
{
    public Paint a;
    public Path b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final boolean i;
    public boolean j;

    public void g(boolean p0){
       super();
       this.j = false;
       this.i = p0;
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
       }else {
          this.c = a1.a(0x7f06060d);
          this.d = a1.a(0x7f061be1);
          this.e = a1.d(0x7f070283);
          this.f = - a1.d(0x7f070329);
          this.h = this.e;
          Paint paint = new Paint();
          this.a = paint;
          paint.setStyle(Paint$Style.FILL);
          this.a.setAntiAlias(true);
          this.a.setDither(true);
          this.b = new Path();
       }
       return;
    }
    public void draw(Canvas p0){
       LinearGradient linearGradie;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       int i = this.getBounds().width();
       int i1 = this.getBounds().height();
       if (!PatchProxy.isSupport(g.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, g.class, "2") && this.j == null)) {
          this.j = true;
          this.e = this.e;
          this.f = this.f;
          this.g = i1 / 2;
          this.h = this.h;
          this.b.reset();
          if (this.i != null) {
             linearGradie = new LinearGradient(0, 0, (float)i, 0, this.d, this.c, Shader$TileMode.CLAMP);
             this.a.setShader(v12);
             this.b.moveTo((float)(i - this.e), 0);
             f = (float)i1;
             this.b.quadTo((float)(i - this.f), (float)this.g, (float)(i - this.h), f);
             this.b.lineTo(0, f);
             this.b.lineTo(0, 0);
          }else {
             float f1 = (float)i;
             linearGradie = new LinearGradient(0, 0, f1, 0, this.c, this.d, Shader$TileMode.CLAMP);
             this.a.setShader(v12);
             this.b.moveTo((float)this.e, 0);
             f = (float)i1;
             this.b.quadTo((float)this.f, (float)this.g, (float)this.h, f);
             this.b.lineTo(f1, f);
             this.b.lineTo(f1, 0);
          }
          this.b.close();
       }
       p0.drawPath(this.b, this.a);
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g.class, "4")) {
          return;
       }
       this.a.setAlpha(p0);
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       this.a.setColorFilter(p0);
       return;
    }
}
