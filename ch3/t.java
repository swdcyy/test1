package ch3.t;
import ch3.d;
import oh3.a;
import hf3.a;
import lh3.b;
import ih3.b;
import oh3.f;
import java.lang.String;
import crd.a;
import dh3.f;
import ch3.n;
import ch3.t$a;
import ch3.t$b;
import ch3.t$c;
import jh3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lf3.g;
import lh3.i0;
import dh3.b;
import zg3.c$b;
import zg3.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import ch3.h;
import z1.a;
import java.util.UUID;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatMatched;
import ch3.a;
import brd.t;
import ch3.a$a;
import oh3.i;
import cjd.e;
import erd.o;
import ch3.f;
import ch3.p;
import erd.g;
import crd.b;
import ch3.e;
import java.lang.Boolean;
import ch3.o;
import ch3.g;

public class t extends a implements d	// class@000560
{
    public final a b;
    public b c;
    public final f d;
    public final a e;
    public final f f;
    public a g;
    public c h;
    public int i;
    public boolean j;
    public String k;
    public String l;
    public int m;
    public final g n;
    public final i0 o;
    public final c$b p;
    public final b q;

    public void t(a p0,b p1,b p2){
       super();
       this.d = new f("LiveInteractMatchProcessor");
       this.e = new a();
       this.f = new f();
       this.n = new n(this);
       this.o = new t$a(this);
       this.p = new t$b(this);
       this.q = new t$c(this);
       this.b = p0;
       this.c = p1;
       this.g = new a(p2);
    }
    public void S(){
       t ot = t.class;
       if (PatchProxy.applyVoid(null, this, ot, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ot, "4")) {
          this.b.o(872, this.n);
          this.c.h(this.o);
       }
       this.T();
       this.U();
       this.e.d();
       this.i = 0;
       this.k = null;
       this.l = null;
       this.m = 0;
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, t.class, "11")) {
          return;
       }
       this.f.a(null);
       this.f.c();
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, t.class, "9")) {
          return;
       }
       t th = this.h;
       if (th == null) {
          return;
       }
       th.b(this.p);
       this.h.d();
       return;
    }
    public void V(boolean p0){
       this.j = p0;
    }
    public boolean b1(){
       return this.j;
    }
    public String c1(int p0,String p1,int p2,String p3){
       f obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, t.class, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       String str = null;
       if (this.j != null) {
          this.Q(new h(p0));
          this.g.i(p0, 3);
          return str;
       }else {
          this.k = UUID.randomUUID().toString();
          this.m = p2;
          this.V(true);
          if (!PatchProxy.applyVoid(str, this, ot, "3")) {
             this.b.u0(872, SCInteractiveChatMatched.class, this.n);
             this.c.m(this.o);
          }
          this.i = p0;
          if (PatchProxy.isSupport(a.class)) {
             ot = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p3, Integer.valueOf(p2), null, a.class, "2");
             if (ot != patchProxyRe) {
             label_0095 :
                obj = new f(this, p0, p1, p3, p2);
                this.e.c(this.d.f(ot.map(new e()), "match").subscribe(v8, new p(this, p0)));
                this.Q(new e(p0));
                return this.k;
             }
          }
          ot = a.a().a(i.a("n/live/interactiveChat/match", p0), p0, p1, p3, p2);
          goto label_0095 ;
       }
    }
    public void f1(String p0,String p1,boolean p2){
       t ot;
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, t.class, "7")) {
          return;
       }
       t ti = this.i;
       t tl = this.l;
       t tm = this.m;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(ti),p0,p1,tl,Integer.valueOf(tm)};
          ot = PatchProxy.apply(objArray, null, uoa, "3");
          if (ot != PatchProxyResult.class) {
          label_0060 :
             this.e.c(this.d.f(ot.map(new e()), "cancelMatch").subscribe(new o(this), new g(this, p2)));
             return;
          }
       }
       ot = a.a().b(i.a("n/live/interactiveChat/cancelMatch", ti), ti, p0, p1, tl, tm);
       goto label_0060 ;
    }
    public String g1(String p0,int p1,String p2){
       if (PatchProxy.isSupport(t.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, t.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c1(0, p0, p1, p2);
    }
}
