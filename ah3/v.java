package ah3.v;
import ah3.e;
import oh3.a;
import hf3.a;
import lh3.b;
import ih3.b;
import crd.a;
import oh3.f;
import java.lang.String;
import ah3.q;
import ah3.p;
import ah3.v$a;
import ah3.v$b;
import jh3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import ah3.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ah3.b$a;
import oh3.i;
import cjd.e;
import erd.o;
import ah3.h;
import ah3.i;
import erd.g;
import crd.b;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import ah3.j;
import z1.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatApplyAccept;
import lf3.g;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatApplyReject;
import lh3.i0;
import ah3.g;
import ah3.r;
import ah3.f;
import zg3.c$b;
import zg3.c;

public class v extends a implements e	// class@0000dd
{
    public final a b;
    public final a c;
    public final f d;
    public b e;
    public c f;
    public a g;
    public int h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public final g m;
    public final g n;
    public final i0 o;
    public final c$b p;

    public void v(a p0,b p1,b p2){
       super();
       this.c = new a();
       this.d = new f("LiveInteractApplyProcessor");
       this.m = new q(this);
       this.n = new p(this);
       this.o = new v$a(this);
       this.p = new v$b(this);
       this.b = p0;
       this.e = p1;
       this.g = new a(p2);
    }
    public void C(String p0,String p1,boolean p2){
       t ot;
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, v.class, "6")) {
          return;
       }
       v th = this.h;
       v tj = this.j;
       if (PatchProxy.isSupport(b.class)) {
          ot = PatchProxy.applyFourRefs(Integer.valueOf(th), tj, p0, p1, null, b.class, "3");
          if (ot != PatchProxyResult.class) {
          label_004e :
             this.c.c(this.d.f(ot.map(new e()), "cancelApply").subscribe(new h(this, p0, p2), new i(this, p0, p2)));
             if (p2) {
                this.T(false);
                this.S();
             }
             return;
          }
       }
       ot = b.a().b(i.a("n/live/interactiveChat/apply/cancel", th), th, tj, p0, p1);
       goto label_004e ;
    }
    public void I(int p0,String p1,String p2){
       t ot;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, v.class, "5")) {
          return;
       }
       if (this.l != null) {
          this.d.b("apply biz occupy", c.k("bizType", Integer.valueOf(p0), "targetUserId", p1));
          this.Q(new j(p0));
          this.g.a(p0, 4, this.i);
          return;
       }else {
          this.T(true);
          if (!PatchProxy.applyVoid(null, this, ov, "3")) {
             this.b.u0(870, SCInteractiveChatApplyAccept.class, this.m);
             this.b.u0(871, SCInteractiveChatApplyReject.class, this.n);
             this.e.m(this.o);
          }
          this.h = p0;
          this.i = p1;
          if (PatchProxy.isSupport(b.class)) {
             ot = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, b.class, "2");
             if (ot != PatchProxyResult.class) {
             label_009d :
                this.c.c(this.d.f(ot.map(new e()), "apply").subscribe(new g(this, p1), new r(this, p1)));
                this.Q(new f(p0));
                return;
             }
          }
          ot = b.a().a(i.a("n/live/interactiveChat/apply", p0), p0, p1, p2);
          goto label_009d ;
       }
    }
    public void S(){
       v ov = v.class;
       if (PatchProxy.applyVoid(null, this, ov, "2")) {
          return;
       }
       this.d.a("reset");
       if (!PatchProxy.applyVoid(null, this, ov, "4")) {
          this.b.o(870, this.m);
          this.b.o(871, this.n);
          this.e.h(this.o);
       }
       if (!PatchProxy.applyVoid(null, this, ov, "8")) {
          ov = this.f;
          if (ov != null) {
             ov.b(this.p);
             this.f.d();
          }
       }
       this.c.d();
       this.h = 0;
       this.i = null;
       this.j = null;
       this.k = null;
       return;
    }
    public void T(boolean p0){
       this.l = p0;
    }
    public boolean c(){
       return this.l;
    }
}
