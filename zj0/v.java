package zj0.v;
import zj0.x;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import java.lang.Object;
import com.kuaishou.krn.utils.Weak;
import java.lang.Throwable;
import zj0.w;
import lj0.c;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import rj0.c;
import rj0.a;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;

public abstract class v implements x	// class@004a5b
{
    public final Weak a;
    public static final n[] b;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(v.class, "mKrnContext", "getMKrnContext\(\)Lcom/kuaishou/krn/context/KrnContext;", 0))};
       v.b = onArray;
    }
    public void v(){
       super();
       this.a = new Weak();
    }
    public void A(Throwable p0){
       w.a(this, p0);
    }
    public void B(){
       w.k(this);
    }
    public void C(c p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "3")) {
          return;
       }
       a.p(p0, "krnContext");
       if (!PatchProxy.applyVoidOneRefs(p0, this, ov, "2")) {
          this.a.b(this, v.b[0], p0);
       }
       return;
    }
    public final c D(){
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(this, v.b[0]);
    }
    public void H(){
       w.s(this);
    }
    public void J(){
       w.v(this);
    }
    public void a(c p0,a p1,long p2){
       w.w(this, p0, p1, p2);
    }
    public void b(long p0){
       w.n(this, p0);
    }
    public void c(){
       w.l(this);
    }
    public void d(long p0){
       w.m(this, p0);
    }
    public void e(long p0,Throwable p1){
       w.i(this, p0, p1);
    }
    public void f(long p0){
       w.f(this, p0);
    }
    public void g(long p0,Throwable p1){
       w.e(this, p0, p1);
    }
    public void i(){
       w.b(this);
    }
    public void j(){
       w.p(this);
    }
    public void m(){
       w.t(this);
    }
    public void o(l p0){
       w.u(this, p0);
    }
    public void p(b p0){
       w.d(this, p0);
    }
    public void r(){
       w.c(this);
    }
    public void s(LaunchModel p0){
       w.r(this, p0);
    }
    public void t(long p0,long p1){
       w.h(this, p0, p1);
    }
    public void u(long p0){
       w.o(this, p0);
    }
    public void v(Throwable p0){
       w.j(this, p0);
    }
    public void w(){
       w.g(this);
    }
    public void y(LaunchModel p0,long p1,long p2){
       w.q(this, p0, p1, p2);
    }
}
