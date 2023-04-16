package l71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.a$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import gq1.l;
import l71.b;
import lp3.c;
import hq1.b;
import gq1.h$b;
import csd.b;
import dsd.e;
import lp3.e;

public final class a extends AbstractLiveJsCommand	// class@002e8e
{
    public h$b e;

    public void a(){
       super();
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof a$a) {
          return m.g.c("invalid params");
       }
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       l ol = l.class;
       if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, a.class, "2")) {
          this.m();
          this.e = new b(this, oh);
          this.g(ol).uf().Fb(this.e);
          this.g(ol).uf().g8(p0.userId);
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (!this.h().b()) {
          a te = this.e;
          if (te != null) {
             this.g(l.class).uf().s9(te);
          }
       }
       return;
    }
}
