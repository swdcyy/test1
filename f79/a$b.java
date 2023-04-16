package f79.a$b;
import java.lang.Runnable;
import f79.a;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.view.View;

public class a$b implements Runnable	// class@0022d2
{
    public final float b;
    public final float c;
    public final long d;
    public final float e;
    public final float f;
    public final a g;

    public void a$b(a p0,float p1,float p2,float p3,float p4){
       this.g = p0;
       super();
       this.b = p3;
       this.c = p4;
       this.d = System.currentTimeMillis();
       this.e = p1;
       this.f = p2;
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       DraweeView uDraweeView = this.g.p();
       if (uDraweeView == null) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, a$b.class, "2");
       float f = (obj != PatchProxyResult.class)? obj.floatValue(): this.g.e.getInterpolation(Math.min(0x3f800000, (((float)(System.currentTimeMillis() - this.d) * 0x3f800000) / (float)this.g.i)));
       a$b te = this.e;
       this.g.h(((te + ((this.f - te) * f)) / this.g.getScale()), this.b, this.c);
       if (f - 0x3f800000 < 0) {
          this.g.t(uDraweeView, this);
       }
       return;
    }
}
