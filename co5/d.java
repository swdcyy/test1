package co5.d;
import zq6.e;
import java.lang.Object;
import gsa.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import zq6.f;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gsa.e0$a;
import java.lang.Boolean;
import pua.a;
import zq6.d;

public class d implements e	// class@00070d
{

    public void d(){
       super();
    }
    public Object a(Object p0,Object p1,float p2){
       e0 uoe02;
       float this;
       float f2;
       float f5;
       float f6;
       float f7;
       float f = p2;
       e0 uoe0 = p0;
       e0 uoe01 = p1;
       if (PatchProxy.isSupport(d.class)) {
          uoe02 = PatchProxy.applyThreeRefs(uoe0, uoe01, Float.valueOf(p2), this, d.class, "1");
          if (uoe02 != PatchProxyResult.class) {
          label_04cc :
             return uoe02;
          }
       }
       float f1 = 0.00f;
       this = 0x3f800000;
       if (uoe0.E == f1) {
          uoe02 = uoe01.k;
          f2 = this - f;
       }else if(uoe01.E == f1){
          f1 = this - f;
          uoe02 = uoe0.k;
          f2 = 0;
       label_0061 :
          float f3 = 2.00f;
          float f4 = (f - 0x3f000000 < 0)? this - (f * f3): (f * f3) - this;
          if (uoe0.E != uoe01.E) {
             this = f4;
             f3 = this;
             f5 = f3;
             f6 = f5;
             f7 = f6;
          }else {
             f3 = 0x3f800000;
             f5 = 0x3f800000;
             f6 = 0x3f800000;
             f7 = 0x3f800000;
          }
          if (!TextUtils.n(uoe0.T, uoe01.T)) {
             f5 = f4;
          }
          if (!TextUtils.n(uoe0.V, uoe01.V)) {
             f6 = f4;
          }
          if (!TextUtils.n(uoe0.X, uoe01.X)) {
             f7 = f4;
          }
          if (TextUtils.n(uoe0.Z, uoe01.Z)) {
             f4 = this;
          }
          super();
          this.Q(f.c().a(Integer.valueOf(uoe0.b), Integer.valueOf(uoe01.b), f).intValue(), f.c().a(Integer.valueOf(uoe0.a), Integer.valueOf(uoe01.a), f).intValue());
          this.o(f.c().a(Integer.valueOf(uoe0.a), Integer.valueOf(uoe01.b), f).intValue());
          this.q(f.c().a(Integer.valueOf(uoe0.b), Integer.valueOf(uoe01.a), f).intValue());
          this.n(f.d().a(Float.valueOf(uoe0.e), Float.valueOf(uoe01.f), f).floatValue());
          this.p(f.d().a(Float.valueOf(uoe0.f), Float.valueOf(uoe01.e), f).floatValue());
          this.H(f.c().a(Integer.valueOf(uoe0.i), Integer.valueOf(uoe01.i), f).intValue());
          this.G(f.c().a(Integer.valueOf(uoe0.j), Integer.valueOf(uoe01.j), f).intValue());
          this.L(uoe02);
          this.M(f2, f1);
          this.P(f.c().a(Integer.valueOf(uoe0.o), Integer.valueOf(uoe01.o), f).intValue());
          this.E(f.b().a(Boolean.valueOf(uoe0.p), Boolean.valueOf(uoe01.p), f).booleanValue());
          this.r(f.a().a(Integer.valueOf(uoe0.q), Integer.valueOf(uoe01.q), f).intValue(), f.a().a(Integer.valueOf(uoe0.r), Integer.valueOf(uoe01.r), f).intValue(), f.a().a(Integer.valueOf(uoe0.s), Integer.valueOf(uoe01.s), f).intValue(), f.a().a(Integer.valueOf(uoe0.t), Integer.valueOf(uoe01.t), f).intValue());
          this.D(f.b().a(Boolean.valueOf(uoe0.u), Boolean.valueOf(uoe01.u), f).booleanValue());
          this.k(f.a().a(Integer.valueOf(uoe0.v), Integer.valueOf(uoe01.v), f).intValue(), f.a().a(Integer.valueOf(uoe0.w), Integer.valueOf(uoe01.w), f).intValue(), f.a().a(Integer.valueOf(uoe0.x), Integer.valueOf(uoe01.x), f).intValue(), f.a().a(Integer.valueOf(uoe0.y), Integer.valueOf(uoe01.y), f).intValue());
          this.O(f.d().a(Float.valueOf(uoe0.A), Float.valueOf(uoe01.A), f).floatValue());
          this.N(f.c().a(Integer.valueOf(uoe0.D), Integer.valueOf(uoe01.D), f).intValue(), f.d().a(Float.valueOf(uoe0.A), Float.valueOf(uoe01.A), f).floatValue(), f.d().a(Float.valueOf(uoe0.B), Float.valueOf(uoe0.B), f).floatValue(), f.d().a(Float.valueOf(uoe0.C), Float.valueOf(uoe0.C), f).floatValue());
          this.a(f.a().a(Integer.valueOf(uoe0.E), Integer.valueOf(uoe01.E), f).intValue());
          this.b(uoe0.E);
          this.c(uoe01.E);
          this.g(f3);
          this.C(f.d().a(Float.valueOf(uoe0.I), Float.valueOf(uoe01.I), f).floatValue());
          this.t(f.d().a(Float.valueOf((float)uoe0.K), Float.valueOf((float)uoe01.K), f).intValue());
          this.u(f.c().a(Integer.valueOf(uoe0.L), Integer.valueOf(uoe01.L), f).intValue());
          this.v(f.d().a(Float.valueOf(uoe0.N), Float.valueOf(uoe01.N), f).floatValue());
          this.m(f.a().a(Integer.valueOf(uoe0.Q), Integer.valueOf(uoe01.Q), f).intValue());
          this.l(f.c().a(Integer.valueOf(uoe0.P), Integer.valueOf(uoe01.P), f).intValue());
          this.j(f.c().a(Integer.valueOf(uoe0.R), Integer.valueOf(uoe01.R), f).intValue());
          this.i(f.a().a(Integer.valueOf(uoe0.S), Integer.valueOf(uoe01.S), f).intValue());
          this.A(f.a().a(uoe0.T, uoe01.T, f));
          this.B(f5);
          this.J(f.a().a(uoe0.V, uoe01.V, f));
          this.K(f6);
          this.w(f.a().a(uoe0.X, uoe01.X, f));
          this.x(f7);
          this.y(f.a().a(uoe0.Z, uoe01.Z, f));
          this.z(f4);
          this.s(uoe0.b0);
          this.I(uoe01.b0);
          this.F(f);
          uoe02 = this.d();
          goto label_04cc ;
       }else {
          int i = f.c().a(Integer.valueOf(uoe0.k), Integer.valueOf(uoe01.k), f).intValue();
          f2 = 0;
       }
       f1 = 0x3f800000;
       goto label_0061 ;
    }
    public Object b(Object p0,Object p1,float p2,Object p3){
       return d.a(this, p0, p1, p2, p3);
    }
}
