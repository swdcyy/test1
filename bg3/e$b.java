package bg3.e$b;
import kp3.a;
import bg3.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import joc.q;
import t02.a0;
import hb2.g$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f12.d;
import qvb.n0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;
import cg3.b;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class e$b implements a	// class@0003a1
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       e y;
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "4")) {
          return;
       }
       uob = this.a;
       uob.P = null;
       if (!p0 - 0x3f800000) {
          y = uob.y;
          if (y != null) {
             y.f(false);
          }
          y = this.a.z;
          if (y != null) {
             y.f(false);
          }
          a0 l1 = this.a.p.l1;
          if (l1 != null) {
             l1.g(true);
          }
          if (this.a.getActivity() != null && !this.a.getActivity().isDestroyed()) {
             this.a.L.d(true, 14);
          }
       }else {
          y = uob.L;
          if (y != null) {
             y.d(false, 14);
          }
       }
       return;
    }
    public void b(float p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       e y = this.a.y;
       if (y != null) {
          y.f(true);
       }
       y = this.a.z;
       if (y != null) {
          y.f(true);
       }
       this.a.q.a();
       return;
    }
    public float d(float p0){
       e obj;
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uob = this.a;
       if (uob.P == null) {
          uob.P = Float.valueOf(uob.C.getTranslationX());
       }
       obj = this.a.P;
       float f = 0x3f800000;
       float f1 = 0;
       if (obj == null || !obj.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)e.V));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)e.V)));
       }
       return f;
    }
    public void e(float p0){
    }
    public void f(float p0,int p1,boolean p2){
       int a;
       b uob = b.class;
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, e$b.class, "2")) {
          return;
       }
       e c = this.a.C;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(c, Float.valueOf(p0), null, uob, "1")) {
          a = b.a;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(c, Float.valueOf(p0), Integer.valueOf(a), null, b.class, "2")) {
             c.setTranslationX(((float)a * p0));
          }
       }
       c = this.a.D;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(c, Float.valueOf(p0), null, uob, "3")) {
          a = b.a;
          if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidThreeRefs(c, Float.valueOf(p0), Integer.valueOf(a), null, b.class, "4") && c != null)) {
             float f = 0x3f800000;
             if (!p0 - f) {
                c.setVisibility(8);
             }else {
                c.setVisibility(0);
             }
             ViewGroup$MarginLayoutParams layoutParams = c.getLayoutParams();
             layoutParams.rightMargin = (int)((float)a * (f - p0));
             c.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
