package jl9.a$b;
import il9.f;
import java.lang.Object;
import android.graphics.Paint;
import jl9.b;
import jl9.a$c;
import jl9.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.Boolean;
import lnc.a1;

public class a$b implements f	// class@002b05
{
    public final Paint a;
    public final b b;
    public final a$c c;
    public final a$c d;
    public int e;
    public Bitmap f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public int p;
    public boolean q;

    public void a$b(){
       super();
       this.a = new Paint(3);
       this.b = new b();
       this.c = new a$c(null);
       this.d = new a$c(null);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "10")) {
          return;
       }
       this.q = false;
       this.a.reset();
       this.o = 255;
       this.p = 0;
       this.m = 0;
       return;
    }
    public void b(long p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "8")) {
          return;
       }
       this.b.c(p0);
       if (this.b.b()) {
          this.q = false;
          return;
       }else {
          uob = this.m;
          if (uob != 1 && uob != 2) {
             if (uob == 3) {
                this.o = this.c.b(p0);
                this.p = this.d.b(p0);
             }
          }else {
             this.o = this.c.b(p0);
          }
          return;
       }
    }
    public int c(){
       a$b obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       if (obj == null) {
          return 0;
       }
       return obj.getHeight();
    }
    public int d(){
       return this.g;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "9")) {
          return;
       }
       a$b tf = this.f;
       if (tf != null && !tf.isRecycled()) {
          p0.save();
          p0.translate((float)this.i, (float)(this.j + this.p));
          p0.scale(this.n, this.n);
          this.a.setAlpha(this.o);
          p0.drawBitmap(this.f, 0, 0, this.a);
          p0.restore();
       }
       return;
    }
    public void e(Bitmap p0,long p1,boolean p2){
       int i1;
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), this, a$b.class, "1")) {
          return;
       }
       this.m = 0;
       this.f = p0;
       Object[] objArray = null;
       float f = 0x3f800000;
       if (!p2 && this.c() > 0) {
          Object obj = PatchProxy.apply(objArray, this, a$b.class, "4");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): a1.e(((float)this.c() / 3.00f));
          this.n = ((float)i * f) / (float)this.c();
       }else {
          this.n = f;
       }
       objArray = PatchProxy.apply(objArray, this, a$b.class, "2");
       if (objArray != PatchProxyResult.class) {
          i1 = objArray.intValue();
       }else {
          a$b tf = this.f;
          i1 = (tf == null)? 0: tf.getWidth();
       }
       this.g = (int)((float)i1 * this.n);
       this.h = (int)((float)this.c() * this.n);
       this.o = 255;
       this.q = true;
       this.p = 0;
       this.b.d(p1);
       return;
    }
    public boolean isValid(){
       return this.q;
    }
}
