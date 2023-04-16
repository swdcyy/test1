package j5.f;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import android.graphics.RectF;
import b5.a;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Matrix;
import java.lang.Object;
import n5.c;
import a5.j;
import d5.p;
import android.graphics.Canvas;
import android.graphics.Color;
import d5.a;
import d5.o;
import java.lang.Integer;
import android.graphics.ColorFilter;

public class f extends a	// class@00222b
{
    public final Layer A;
    public a B;
    public final RectF w;
    public final Paint x;
    public final float[] y;
    public final Path z;

    public void f(f p0,Layer p1){
       super(p0, p1);
       this.w = new RectF();
       a uoa = new a();
       this.x = uoa;
       float[] uofloatArray = new float[8];
       this.y = uofloatArray;
       this.z = new Path();
       this.A = p1;
       uoa.setAlpha(0);
       uoa.setStyle(Paint$Style.FILL);
       uoa.setColor(p1.j());
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       super.c(p0, p1, p2);
       this.w.set(0, 0, (float)this.A.l(), (float)this.A.k());
       this.m.mapRect(this.w);
       p0.set(this.w);
    }
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.B) {
          this.B = (p1 == null)? null: new p(p1);
       }
    label_0014 :
       return;
    }
    public void j(Canvas p0,Matrix p1,int p2){
       int i = Color.alpha(this.A.j());
       if (!i) {
          return;
       }
       int i1 = (this.u.g() == null)? 100: this.u.g().h().intValue();
       float f = 0x437f0000;
       p2 = (int)((((float)p2 / f) * ((((float)i / f) * (float)i1) / 100.00f)) * f);
       this.x.setAlpha(p2);
       f tB = this.B;
       if (tB != null) {
          this.x.setColorFilter(tB.h());
       }
       if (p2 > 0) {
          f ty = this.y;
          ty[0] = 0;
          ty[1] = 0;
          ty[2] = (float)this.A.l();
          ty = this.y;
          ty[3] = 0;
          ty[4] = (float)this.A.l();
          ty[5] = (float)this.A.k();
          ty = this.y;
          ty[6] = 0;
          ty[7] = (float)this.A.k();
          p1.mapPoints(this.y);
          this.z.reset();
          ty = this.y;
          this.z.moveTo(ty[0], ty[1]);
          ty = this.y;
          this.z.lineTo(ty[2], ty[3]);
          ty = this.y;
          this.z.lineTo(ty[4], ty[5]);
          ty = this.y;
          this.z.lineTo(ty[6], ty[7]);
          ty = this.y;
          this.z.lineTo(ty[0], ty[1]);
          this.z.close();
          p0.drawPath(this.z, this.x);
       }
       return;
    }
}
