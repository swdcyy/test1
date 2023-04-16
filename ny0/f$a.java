package ny0.f$a;
import gq5.f;
import ny0.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ok2.h;
import lk2.b;
import java.util.Objects;
import ng1.a;
import android.animation.AnimatorSet;
import android.view.View;
import java.lang.Float;
import android.animation.Animator;
import qc2.a;
import gq5.c;
import java.util.HashSet;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class f$a implements f	// class@003422
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "16")) {
          return;
       }
       f a = this.a.A;
       if (a != null) {
          a.a(p0);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "15")) {
          return;
       }
       f a = this.a.A;
       if (a != null) {
          a.b(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "19")) {
          return;
       }
       f z = this.a.z;
       if (z != null) {
          z.c();
       }
       return;
    }
    public void d(){
       float f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "9")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.applyVoid(objArray, ta, uof, "22")) {
          a p = ta.p;
          if (p != null) {
             p.cancel();
          }
          if (!ta.n9()) {
             ta.W8();
          }
          f v = ta.v;
          if (v != null && (!v.getVisibility() && ta.v.getTranslationY() <= 0)) {
             f = (float)((- ta.v.getTop()) - ta.v.getHeight());
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(0), ta, uof, "8")) {
                f v1 = ta.v;
                if (v1 != null) {
                   ta.l9(v1, f, 0).start();
                }
             }
          }
          if (!ta.x.getVisibility() && ta.x.getTranslationY() <= 0) {
             f = (float)((- ta.x.getTop()) - ta.x.getHeight());
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(0), ta, uof, "12")) {
                ta.l9(ta.x, f, 0).start();
             }
          }
          p = ta.r;
          if (p != null) {
             p.cancel();
          }
          p = ta.t;
          if (p != null && p.getVisibility()) {
             ta.X8();
          }
       }
    label_00c9 :
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "20")) {
          return;
       }
       f z = this.a.z;
       if (z != null) {
          z.e();
       }
       return;
    }
    public void f(){
       float translationY;
       float f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "10")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.applyVoid(objArray, ta, uof, "23")) {
          a p = ta.p;
          if (p != null) {
             p.cancel();
          }
          if (ta.n9()) {
             ta.R8();
          }
          f v = ta.v;
          f uof1 = null;
          if (v != null && (!v.getVisibility() && ta.v.getTranslationY() - uof1 >= 0)) {
             translationY = ta.v.getTranslationY();
             f = (float)((- ta.v.getTop()) - ta.v.getHeight());
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(translationY), Float.valueOf(f), ta, uof, "7")) {
                f v1 = ta.v;
                if (v1 != null) {
                   ta.k9(v1, translationY, f).start();
                }
             }
          }
          if (ta.D != null && (!ta.x.getVisibility() && ta.x.getTranslationY() - uof1 >= 0)) {
             translationY = ta.x.getTranslationY();
             float f1 = (float)((- ta.x.getTop()) - ta.x.getHeight());
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(translationY), Float.valueOf(f1), ta, uof, "9")) {
                ta.k9(ta.x, translationY, f1).start();
             }
          }
          p = ta.r;
          if (p != null) {
             p.cancel();
          }
          p = ta.t;
          if (p != null && !p.getVisibility()) {
             ta.S8();
          }
       }
    label_00d9 :
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "17")) {
          return;
       }
       f y = this.a.y;
       if (y != null) {
          y.g();
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "18")) {
          return;
       }
       f y = this.a.y;
       if (y != null) {
          y.h();
       }
       return;
    }
    public void i(View p0,float p1,float p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, f$a.class, "4")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), ta, f.class, "10")) {
          ta.l9(p0, p1, p2).start();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "7")) {
          return;
       }
       this.a.j9();
       return;
    }
    public void k(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "11")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "25") && p0 != null) {
          if (ta.C == null) {
             ta.C = new HashSet();
          }
          ta.C.add(p0);
       }
       return;
    }
    public void l(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "12")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "26")) {
          f c = ta.C;
          if (c != null && p0 != null) {
             c.remove(p0);
          }
       }
       return;
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.n9();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "8")) {
          return;
       }
       this.a.m9();
       return;
    }
    public void o(View p0,float p1,float p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, f$a.class, "5")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), ta, f.class, "11")) {
          ta.k9(p0, p1, p2).start();
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "6")) {
          return;
       }
       this.a.e9();
       return;
    }
    public void q(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.q9(p0);
       return;
    }
    public void r(boolean p0){
       this.a.D = p0;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "13")) {
          return;
       }
       f$a ta = this.a;
       ta.d9(ta.t);
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       this.a.o9();
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "14")) {
          return;
       }
       f$a ta = this.a;
       ta.b9(ta.t);
       return;
    }
}
