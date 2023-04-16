package ip8.c;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.ColorFilter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class c extends Drawable	// class@002706
{
    public int a;
    public ColorFilter b;
    public final Drawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public void c(Drawable p0,Drawable p1,int p2,int p3,int p4,int p5){
       super();
       this.a = 255;
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       p0.save();
       this.c.draw(p0);
       p0.restore();
       c tg = this.g;
       if (tg > null || this.h > null) {
          p0.translate((float)tg, (float)this.h);
       }
       this.d.draw(p0);
       return;
    }
    public int getAlpha(){
       return this.a;
    }
    public ColorFilter getColorFilter(){
       return this.b;
    }
    public int getIntrinsicHeight(){
       return this.f;
    }
    public int getIntrinsicWidth(){
       return this.e;
    }
    public int getOpacity(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -3;
       if (((this.c.getOpacity() & i) & this.d.getOpacity()) != i) {
          i = -1;
       }
       return i;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c.class, "2")) {
          return;
       }
       this.a = p0;
       this.c.setAlpha(p0);
       this.d.setAlpha(p0);
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.b = p0;
       this.c.setColorFilter(p0);
       this.d.setColorFilter(p0);
       return;
    }
}
