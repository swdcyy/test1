package jl9.e$a;
import il9.f;
import android.view.animation.DecelerateInterpolator;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Paint;
import jl9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import jl9.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class e$a implements f	// class@002b0c
{
    public final Matrix a;
    public final Paint b;
    public final b c;
    public final DecelerateInterpolator d;
    public Bitmap e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public d q;

    public void e$a(DecelerateInterpolator p0){
       super();
       this.a = new Matrix();
       this.b = new Paint(3);
       this.c = new b();
       this.d = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "6")) {
          return;
       }
       this.a.reset();
       this.b.reset();
       return;
    }
    public void b(long p0){
       float f1;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.c.c(p0);
       if (this.c.b()) {
          this.p = false;
          return;
       }else {
          float interpolatio = this.d.getInterpolation(this.c.a());
          e$a tq = this.q;
          if (tq != null) {
             this.f = tq.c(interpolatio);
             this.g = this.q.b(interpolatio);
          }
          float f = 0.05f;
          if (interpolatio - f < 0) {
             uoa = this.o;
             f1 = (float)uoa;
             f1 = f1 + ((interpolatio / f) * (float)(this.n - uoa));
          }else {
             f1 = (float)this.n;
          }
          int i = this.c();
          if (i > 0) {
             this.h = f1 / (float)i;
          }
          f = 0x3f333333;
          if (interpolatio - f >= 0) {
             this.i = (int)((0x3f800000 - ((interpolatio - f) / 0.30f)) * 0x437f0000);
          }
          return;
       }
    }
    public int c(){
       e$a obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj == null) {
          return 0;
       }
       return obj.getWidth();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "5")) {
          return;
       }
       if (this.p != null) {
          e$a te = this.e;
          if (te != null && !te.isRecycled()) {
             this.a.reset();
             this.a.postScale(this.h, this.h, (float)this.l, (float)this.m);
             this.a.postTranslate(this.f, this.g);
             this.b.setAlpha(this.i);
             p0.drawBitmap(this.e, this.a, this.b);
          }
       }
       return;
    }
    public boolean isValid(){
       return this.p;
    }
}
