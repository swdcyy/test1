package jq8.a;
import lg.i;
import com.facebook.yoga.YogaUnit;
import lg.g;
import java.lang.Object;
import com.facebook.yoga.YogaEdge;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;

public final class a	// class@00299c
{
    public final g a;
    public boolean b;
    public i c;
    public i d;
    public static final i e;

    static {
       a.e = new i(0, YogaUnit.AUTO);
    }
    public void a(g p0){
       super(p0, false);
    }
    public void a(g p0,boolean p1){
       super();
       i e = a.e;
       this.c = e;
       this.d = e;
       this.a = p0;
       this.b = p1;
    }
    public void A(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "54")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.K0(p0, p1);
       }
       return;
    }
    public void B(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "58")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.L0(p0, p1);
       }
       return;
    }
    public void C(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "59")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.M0(p0, p1);
       }
       return;
    }
    public void D(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "61")) {
          return;
       }
       if (this.a != null) {
          if (this.b != null) {
             this.c = new i(p0, YogaUnit.POINT);
          }
          this.a.O0(p0);
       }
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "63")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          if (this.b != null) {
             this.c = a.e;
          }
          ta.P0();
       }
       return;
    }
    public void a(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "11")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.e();
       }
       return;
    }
    public float c(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.j(p0);
       }
       return 0;
    }
    public i d(){
       a obj = PatchProxy.apply(null, this, a.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.t();
       }
       return null;
    }
    public float e(){
       a obj = PatchProxy.apply(null, this, a.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.x();
       }
       return 0;
    }
    public float f(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.y(p0);
       }
       return 0;
    }
    public float g(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.z(p0);
       }
       return 0;
    }
    public float h(){
       a obj = PatchProxy.apply(null, this, a.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.A();
       }
       return 0;
    }
    public i i(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.D(p0);
       }
       return null;
    }
    public i j(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.K(p0);
       }
       return null;
    }
    public i k(YogaEdge p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.M(p0);
       }
       return null;
    }
    public i l(){
       a obj = PatchProxy.apply(null, this, a.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.P();
       }
       return null;
    }
    public g m(){
       return this.a;
    }
    public void n(YogaAlign p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "25")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.c0(p0);
       }
       return;
    }
    public void o(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "56")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.g0(p0, p1);
       }
       return;
    }
    public void p(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "94")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.h0(p0);
       }
       return;
    }
    public void q(YogaDirection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.i0(p0);
       }
       return;
    }
    public void r(YogaFlexDirection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.o0(p0);
       }
       return;
    }
    public void s(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "65")) {
          return;
       }
       if (this.a != null) {
          if (this.b != null) {
             this.d = new i(p0, YogaUnit.POINT);
          }
          this.a.r0(p0);
       }
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, a.class, "67")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          if (this.b != null) {
             this.d = a.e;
          }
          ta.s0();
       }
       return;
    }
    public void u(YogaJustify p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.v0(p0);
       }
       return;
    }
    public void v(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "49")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.w0(p0, p1);
       }
       return;
    }
    public void w(YogaEdge p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "51")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.x0(p0);
       }
       return;
    }
    public void x(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "50")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.y0(p0, p1);
       }
       return;
    }
    public void y(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "72")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.E0(p0);
       }
       return;
    }
    public void z(YogaEdge p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "53")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.J0(p0, p1);
       }
       return;
    }
}
