package bfa.e;
import bfa.e$a;
import nsd.u;
import java.lang.String;
import java.io.Serializable;
import java.lang.Class;
import java.lang.Object;
import kotlin.jvm.internal.a;
import dfa.a;
import cfa.a;
import com.kwai.robust.PatchProxy;
import bfa.f;
import hfa.b;
import dfa.b;
import cfa.b;
import hfa.c;
import com.kwai.robust.PatchProxyResult;

public final class e	// class@0003a7
{
    public b a;
    public b b;
    public long c;
    public long d;
    public final String e;
    public final Serializable f;
    public final Class g;
    public static final e$a h;

    static {
       e.h = new e$a(null);
    }
    public void e(String p0,Serializable p1,Class p2){
       a.p(p0, "key");
       a.p(p1, "data");
       a.p(p2, "clazz");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.a = new a();
       this.b = new a();
       this.c = 0x757b12c00;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       b uob = new b(this.e, this.f, this.g, this.c, this.a, this.b);
       f.b.a(v9, this.d);
       return;
    }
    public final e b(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "corrector");
       this.b = p0;
       return this;
    }
    public final e c(long p0){
       this.d = p0;
       return this;
    }
    public final e d(long p0){
       this.c = p0;
       return this;
    }
    public final e e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "filter");
       this.a = p0;
       return this;
    }
}
