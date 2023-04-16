package c42.m$b;
import kp3.a;
import c42.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import joc.q;
import t02.a0;
import hb2.g$b;
import f12.d;
import joc.z;
import dt5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Boolean;
import zj2.b;

public class m$b implements a	// class@0004be
{
    public final m a;

    public void m$b(m p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "4")) {
          return;
       }
       uob = this.a;
       uob.R = null;
       if (!p0 - 0x3f800000) {
          m d = uob.D;
          boolean b = false;
          if (d != null) {
             d.f(b);
          }
          d = this.a.E;
          if (d != null) {
             d.f(b);
          }
          a0 l1 = this.a.t.l1;
          b = true;
          if (l1 != null) {
             l1.g(b);
          }
          this.a.S8().d(b, 14);
          this.a.w.a(10);
          m$b ta = this.a;
          if (ta.q != null) {
             d = ta.r;
             if (d != null) {
                d.i();
             }
          }
       }else {
          uob.w.g(10);
       }
       return;
    }
    public void b(float p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       m d = this.a.D;
       boolean b = true;
       if (d != null) {
          d.f(b);
       }
       d = this.a.E;
       if (d != null) {
          d.f(b);
       }
       m$b ta = this.a;
       if (ta.q != null) {
          d = ta.r;
          if (d != null) {
             d.f();
          }
       }
       return;
    }
    public float d(float p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uob = this.a;
       if (uob.R == null) {
          uob.R = Float.valueOf(uob.H.getTranslationX());
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (!this.a.R.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)m.V));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)m.V)));
       }
       return f;
    }
    public void e(float p0){
    }
    public void f(float p0,int p1,boolean p2){
       if (PatchProxy.isSupport(m$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, m$b.class, "2")) {
          return;
       }
       b.a(this.a.H, p0);
       b.c(this.a.I, p0);
       return;
    }
}
