package gra.b$a;
import io.reactivex.g;
import gra.b;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import yma.a;
import yma.b;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import gra.b$a$a;
import erd.a;
import gra.b$a$b;
import gra.b$a$c;
import erd.g;
import crd.b;

public final class b$a implements g	// class@002ba4
{
    public final b b;
    public final String c;
    public final String d;

    public void b$a(b p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object obj = b.a(-1257347683);
       a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
       obj.b().o(this.c, this.d).observeOn(d.b).map(new e()).subscribeOn(d.a).doFinally(new b$a$a(this, p0)).subscribe(new b$a$b(this), b$a$c.b);
       return;
    }
}
