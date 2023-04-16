package c42.d$b;
import kp3.a;
import c42.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import t02.a0;
import hb2.g$b;
import joc.z;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Boolean;
import zj2.b;

public class d$b implements a	// class@0004b2
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       uob.H = null;
       if (!p0 - 0x3f800000) {
          a0 l1 = uob.u.l1;
          if (l1 != null) {
             l1.g(true);
          }
          this.a.v.a(10);
       }else {
          uob.v.g(10);
       }
       return;
    }
    public void b(float p0){
    }
    public float d(float p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uob = this.a;
       if (uob.H == null) {
          uob.H = Float.valueOf(uob.y.getTranslationX());
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (!this.a.H.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)d.K));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)d.K)));
       }
       return f;
    }
    public void e(float p0){
    }
    public void f(float p0,int p1,boolean p2){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, d$b.class, "2")) {
          return;
       }
       b.a(this.a.y, p0);
       b.c(this.a.z, p0);
       return;
    }
}
