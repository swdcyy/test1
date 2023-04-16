package bh3.s;
import ih3.b;
import bh3.s$d;
import hf3.a;
import lh3.b;
import bh3.s$c;
import java.lang.Object;
import bh3.n;
import bh3.s$a;
import bh3.s$b;
import crd.a;
import oh3.f;
import java.lang.StringBuilder;
import java.lang.String;
import jh3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatGuestRejected;
import lf3.g;
import lh3.i0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import zg3.c$b;
import zg3.c;

public class s	// class@0003cf
{
    public final a a;
    public final b b;
    public final a c;
    public s$d d;
    public f e;
    public s$c f;
    public c g;
    public a h;
    public String i;
    public String j;
    public int k;
    public final g l;
    public final i0 m;
    public final c$b n;

    public void s(b p0,s$d p1,a p2,b p3,s$c p4){
       super();
       this.k = 0;
       n on = new n(this);
       this.l = on;
       s$a uoa = new s$a(this);
       this.m = uoa;
       this.n = new s$b(this);
       this.d = p1;
       this.a = p2;
       this.b = p3;
       this.c = new a();
       this.i = p1.c;
       this.f = p4;
       this.e = new f("LiveInteractInviteProcessor->"+p1.c);
       this.h = new a(p0);
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
       }else {
          p2.u0(773, SCInteractiveChatGuestRejected.class, on);
          p3.m(uoa);
       }
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, s.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.b() != null)? true: false;
       return b;
    }
    public void b(){
       s os = s.class;
       if (PatchProxy.applyVoid(null, this, os, "2")) {
          return;
       }
       this.e.a("stop");
       this.a.o(773, this.l);
       this.b.h(this.m);
       if (!PatchProxy.applyVoid(null, this, os, "6")) {
          os = this.g;
          if (os != null) {
             os.b(this.n);
             this.g.d();
          }
       }
       this.c.d();
       this.f = null;
       return;
    }
}
