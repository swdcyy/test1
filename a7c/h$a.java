package a7c.h$a;
import ok.x;
import brd.t;
import com.yxcorp.gifshow.pymk.f;
import java.lang.Object;
import a7c.d;
import a7c.e$a;
import a7c.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.e0;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.util.Objects;
import androidx.collection.SparseArrayCompat;
import g7c.a;
import a7c.b$a;
import f7c.a;
import f7c.d;
import i7c.f;
import java.lang.Boolean;
import a7c.g;

public class h$a	// class@000096
{
    public final d a;
    public final e$a b;
    public f c;
    public x d;
    public x e;
    public x f;
    public boolean g;
    public int h;
    public a i;
    public t j;
    public x k;
    public int l;
    public d m;
    public a n;
    public x o;
    public f p;
    public h q;
    public boolean r;
    public b$a s;
    public x t;
    public boolean u;
    public boolean v;

    public void h$a(x p0,int p1,t p2){
       super(p0, new f(p1), p2);
    }
    public void h$a(x p0,f p1,t p2){
       super();
       this.a = new d();
       this.g = false;
       this.h = 0x7f0d06af;
       this.l = 85;
       this.r = false;
       this.u = false;
       this.v = false;
       this.o = p0;
       this.p = p1;
       this.j = p2;
       this.b = new e$a(false);
    }
    public void h$a(x p0,f p1,boolean p2,t p3){
       super();
       this.a = new d();
       this.g = false;
       this.h = 0x7f0d06af;
       this.l = 85;
       this.r = false;
       this.u = false;
       this.v = false;
       this.o = null;
       this.p = p1;
       this.b = new e$a(p2);
       this.g = p2;
       this.j = p3;
    }
    public h$a a(x p0){
       this.k = p0;
       return this;
    }
    public h b(){
       Object obj = PatchProxy.apply(null, this, h$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this);
    }
    public h$a c(boolean p0){
       this.u = p0;
       return this;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       if (this.g == null || !e0.a) {
          return;
       }
       throw new IllegalArgumentException(" current is HorList");
    }
    public h$a e(int p0,Class p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       e$a uoa1 = e$a.class;
       if (PatchProxy.isSupport(uoa1) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uoa, uoa1, "3") && p1 != null)) {
          uoa.a.put(p0, p1);
       }
       return this;
    }
    public h$a f(a p0){
       this.n = p0;
       return this;
    }
    public h$a g(b$a p0){
       this.s = p0;
       return this;
    }
    public h$a h(boolean p0){
       this.r = p0;
       return this;
    }
    public h$a i(int p0){
       this.l = p0;
       return this;
    }
    public h$a j(int p0,a p1,x p2){
       h$a obj;
       if (PatchProxy.isSupport(h$a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, h$a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a;
       obj.f = p0;
       obj.g = p1;
       this.d = p2;
       return this;
    }
    public h$a k(int p0,a p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d();
       if (!p0) {
          this.b.a(null);
       }else {
          uoa = this.a;
          uoa.c = p0;
          uoa.d = p1;
       }
       return this;
    }
    public h$a l(Class p0){
       p0 = PatchProxy.applyOneRefs(null, this, h$a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.d();
       this.b.a(null);
       return this;
    }
    public h$a m(d p0){
       this.m = p0;
       return this;
    }
    public h$a n(int p0,a p1){
       this.h = p0;
       this.i = null;
       return this;
    }
    public h$a o(x p0){
       this.e = p0;
       return this;
    }
    public h$a p(f p0){
       this.c = p0;
       return this;
    }
    public h$a q(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.f = new g(p0);
       return this;
    }
    public h$a r(x p0){
       this.t = p0;
       return this;
    }
}
